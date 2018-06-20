<html>
<body>
<h2>Hello World!</h2>
<button onclick="ss();"></button>
</body>
</html>
<script src="js/jquery-2.1.1.min.js"></script>
<script>
function ss(){
	$.ajax({
	    url: "users",
	    async: true,   //是否为异步请求
	    type: "get", //请求方式为POST
	    processData: false,
	    contentType: false,
	    success: function(data){ 
	        console.log(data);
	    },
	    error: function(data) {
	    	//无信息
	    }
	});
}

</script>
