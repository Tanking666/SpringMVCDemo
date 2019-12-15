<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<c:set var="webRoot" value="<%=basePath%>"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        .item_td {

            white-space: nowrap;
        }

        .item_index, .table_head {
            font-weight: bold;
            text-align: center;
        }

        td {
            padding: 3px;
            border-bottom: #dbdbdb solid 1px;
            border-right: #dbdbdb solid 1px;
        }

        a {
            text-decoration-line: none;
        }

        .abc {
            overflow: hidden;
            text-overflow: ellipsis;
        }

        table {
            border-collapse: collapse;
            table-layout: fixed;
            margin: 2%;
            width: 96%;
            border-top: #dbdbdb solid 1px;
            border-left: #dbdbdb solid 1px;
        }

        .grep_tr {
            background-color: #ccedfa;
        }

        .tool_bar {
            margin: 2%;
        }
    </style>
    <%--    <script src="../plug-in/easyui/jquery.min.js"></script>--%>
    <%--    <script src="${webRoot}/plug-in/easyui/jquery.min.js"></script>--%>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script>
        let pageNum = ${pageNum};
        let itemsCnt = ${itemsCnt};
        let pageSize = ${pageSize};
        let s_name = "${searchName}";
        goNextPage = () => {
            pageSize = $("#pageSize").val();
            window.location.href = "http://127.0.0.1:8080/list.action?pageNum=" + (pageNum + 1) + "&pageSize=" + pageSize + "&searchName=" + s_name
        };

        goPrevPage = () => {
            pageSize = $("#pageSize").val();
            window.location.href = "http://127.0.0.1:8080/list.action?pageNum=" + (pageNum - 1) + "&pageSize=" + pageSize + "&searchName=" + s_name
        };
        goSearch = () => {
            s_name = $("#s_name").val();
            pageSize = $("#pageSize").val();
            pageNum = 1;
            window.location.href = "http://127.0.0.1:8080/list.action?pageNum=" + (pageNum) + "&pageSize=" + pageSize + "&searchName=" + s_name

        };
        window.onload = () => {
            if (pageNum > (itemsCnt / pageSize)) {
                $("#nextButton").css("border");

            }
            if (pageNum < 2) {
                document.getElementById("prevButton").remove();
            }
        };
        //回车事件绑定
        // $().bind('keyup', function (event) {
        //     if (event.keyCode == "13") {
        //         //回车执行查询
        //         goSearch();
        //     }
        // });

        $('#s_name').keyup(function (event) {
            if (event.keyCode == 13) {
                goSearch();
            }
        });
    </script>
</head>
<body style="width: 100%">
<div>
    <div class="tool_bar">
        <div style="text-align: center">
            <input id="s_name" type="text" placeholder="请输入片名" value="${searchName}"
                   style="font-size: 20px;border-top: none;border-left: none;border-right: none;width: 30%;padding: 5px"/>
            <a href="#" onclick="goSearch()"
               style="color: #ffffff;background-color: rgb(255,129,0);font-weight: bold;padding: 5px;padding-left: 20px;padding-right: 20px;font-size: 20px;margin: 5px;border-radius: 10px">搜索</a>
        </div>
        <div>
            共${itemsCnt}个 第${pageNum}页
            <a id="prevButton" href="#" onclick="goPrevPage()">上一页</a>
            <a id="nextButton" href="#" onclick="goNextPage()">下一页</a>
            显示<input type="text" id="pageSize" value="${pageSize}">个

        </div>
    </div>
    <table>
        <tr>
            <td class="table_head item_index" style="width: 5%">No</td>
            <td class="table_head" style="width: 30%">Name</td>
            <td class="table_head" style="width: 30%">PName</td>
            <td class="table_head" style="width: 10%">Time</td>
            <td class="table_head" style="width: 20%">Size</td>
        </tr>
        <c:forEach items="${items}" var="item" varStatus="status">
            <c:if test="${(status.index+1)%2==1}">
                <tr>
            </c:if>
            <c:if test="${(status.index+1)%2==0}">
                <tr class="grep_tr">
            </c:if>
            <td class="item_td item_index ">${status.index+1}</td>
            <td class="item_td">
                <div class="abc"><a href="${item.path}">${item.name}</a></div>
            </td>
            <td class="item_td">
                <div class="abc">${item.pName}</div>
            </td>
            <td class="item_td">
                <fmt:formatNumber value="${item.len/60}" pattern="##"/> :
                <fmt:formatNumber value="${item.len%60}" pattern="##"/>
            </td>
            <td class="item_td">${item.size}KB</td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
