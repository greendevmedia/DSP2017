<%@ include file="../jspf/head.jsp"%>
<body>
	<h2>Registration Form</h2>
	<form data-toggle="validator" role="form" method="post" action="RegistrationServlet">
		<div class="form-group">
			<label for="firstName" class="control-label">First Name</label> <input
				type="text" class="form-control" name="firstName"
				placeholder="First Name" minlength="3" maxlength="15"
				data-error="Input is invalid - pleasefill the field with minimum thre and maximum 15 letters"
				required>
			<div class="help-block with-errors"></div>

		</div>

		<div class="form-group">
			<label for="lastName" class="control-label">Last Name</label> <input
				type="text" class="form-control" name="lastName"
				placeholder="Last Name" minlength="3" maxlength="15"
				data-error="Input is invalid - pleasefill the field with minimum thre and maximum 15 letters"
				required>
			<div class="help-block with-errors"></div>

		</div>

		<div class="form-group">
			<label for="email" class="control-label">Email</label> <input
				type="email" class="form-control" name="email" placeholder="Email"
				data-error="Bruh, that email address is invalid" required>
			<div class="help-block with-errors"></div>
		</div>

		<div class="form-group">
			<label for="password" class="control-label">Password</label>
			<div class="form-inline row">
				<div class="form-group col-sm-6">
					<input type="password" data-minlength="6" class="form-control"
						name="password" id="password" placeholder="Password" required>
					<div class="help-block">Minimum of 6 characters</div>
				</div>
				<div class="form-group col-sm-6">
					<input type="password" class="form-control" name="passwordConfirm"
						data-match="#password"
						data-match-error="Whoops, these don't match" placeholder="Confirm"
						required>
					<div class="help-block with-errors"></div>
				</div>
			</div>
		</div>

		<div class="form-group">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>



	</form>
</body>
</html>
