<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xmlHttpRequest ;
	function create(){	//创建Ajax核心处理对象
		if(window.XMLHttpRequest){	//不是IE浏览器
			xmlHttpRequest=new XMLHttpRequest() ;
		}else{
			xmlHttpRequest=new ActiveXObject("Microsoft.XMLHttp") ;
		}
	}
	window.onload=function(){
		document.getElementById("area").addEventListener("change",function(){
			aid=this.value ;
			if(aid!=""){
				create() ;
				xmlHttpRequest.open("get","areaplus?aid="+aid) ;
				xmlHttpRequest.send(null) ;
				xmlHttpRequest.onreadystatechange=function(){
					if(xmlHttpRequest.readyState == 4 && xmlHttpRequest.status ==200){
						cityObj=eval("("+xmlHttpRequest.responseText+")") ;
						cityElement=document.getElementById("city") ;
						cityElement.length=1 ;
						for(x=0 ; x<cityObj.allplus.length ; x++){
							optionElement=document.createElement("option") ;
							optionElement.setAttribute("value",cityObj.allplus[x].apid) ;
							optionElement.appendChild(document.createTextNode(cityObj.allplus[x].title)) ;
							cityElement.appendChild(optionElement) ;
						}
					}
				}
			}else{
				cityElemnet=document.getElementById("city") ;
				cityElement.length=1 ;
			}
		},false) ;	
	}
</script>
</head>
<body>
<form action="" method="get">
	省份：<select id="area">
		<option value="">==========请选择城市===========</option>
		<c:forEach items="${allAreas}" var="area">
				<option value="${area.aid}">${area.title}</option>
		</c:forEach>
	</select>
	城市：<select id="city">
		<option value="">=========请选择您所在的城市==========</option>
	</select>
</form>
</body>
</html>