<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="container" style="margin-top: 100px;">
	<!-- <div class="row"> -->
		<form:form modelAttribute="apartment" method="POST"
			action="addApartment" enctype="multipart/form-data">

			<div class="form-group">

				<div>
					<span><form:label path="apartmentId">Apartment ID</form:label></span>
					<span><form:input class="form-control" path="apartmentId"
							name="apartmentId" type="number" required="true" /></span> <span><form:errors
							path="apartmentId" cssStyle="color:red;" /></span> <span><span
						class="colorRed">${errorMessage}</span></span>
				</div>

				<div>
					<span><form:label path="ownerId">Owner ID</form:label></span> <span><form:input
							class="form-control" path="ownerId" type="number" value="" /></span> <span><form:errors
							path="ownerId" cssStyle="color:red;" /></span>
				</div>

				<div>
					<span><form:label path="price">Price</form:label></span> <span><form:input
							class="form-control" path="price" type="number" value=""
							required="true" /></span> <span><form:errors path="price"
							cssStyle="color:red;" /></span>
				</div>


				<div>
					<span>Availability</span> <span> <form:radiobutton
							path="availability" value="1" />Yes <form:radiobutton
							path="availability" value="0" />No
					</span> <span><form:errors path="availability"
							cssStyle="color:red;" /></span>
				</div>

				<div>
					<span><form:label path="availableDate">Available From</form:label></span>
					<span><form:input class="form-control" path="availableDate"
							type="text" value="" required="true" /></span> <span><form:errors
							path="availableDate" cssStyle="color:red;" /></span>
				</div>


				<div>
					<span>Apartment Type</span> <span><form:select
							class="form-control" path="apartmentType" required="true">
							<form:option value="" label="--- Select ---" />
							<form:options items="${apartmentType}" />
						</form:select></span> <span><form:errors path="apartmentType"
							cssStyle="color:red;" /></span>
				</div>

				<div>
					<span><form:label path="description">Description</form:label></span>
					<span><form:textarea class="form-control" path="description"
							type="text" value="" required="true" /></span> <span><form:errors
							path="description" cssStyle="color:red;" /></span>
				</div>


				<div>
					<span><form:label path="image">Image</form:label></span> <span><form:input
							class="form-control" type="file" multiple="multiple" path="image"
							accept=".jpg, .png, .jpeg"/></span> <span><span
						class="colorRed">${image}</span></span>
				</div>

				<div>
					<span><form:label path="location">Location</form:label></span> <span><form:input
							class="form-control" path="location" type="text" value=""
							required="true" /></span> <span><form:errors path="location"
							cssStyle="color:red;" /></span>
				</div>



				<div>
					<span><input class="form-control btn btn-success"
						type="submit" value="Submit" /></span>
				</div>
			</div>
		</form:form>
	<!-- </div> -->
</div>

