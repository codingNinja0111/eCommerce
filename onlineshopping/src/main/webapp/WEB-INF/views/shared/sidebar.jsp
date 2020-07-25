
<div class="col-lg-3">

	<p class="my-4">Categories</p>
	<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name}</a>
		
	</c:forEach>
	</div>
	</div>

