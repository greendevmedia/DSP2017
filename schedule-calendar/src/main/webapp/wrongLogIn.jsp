<%@ include file="../jspf/head.jsp"%>
<body>
	<h2>Log In Invalid - wrong email or password</h2>
	<div class="col-sm-4">
		<form data-toggle="validator" role="form" method="post"
			action="LogInServlet">
			<div class="form-group">
				<label for="email" class="control-label">Email</label> <input
					type="email" class="form-control" name="email" placeholder="Email"
					data-error="Bruh, that email address is invalid" required>
				<div class="help-block with-errors"></div>
			</div>
			<div class="form-group">
				<label for="password" class="control-label">Password</label>
					<input type="password" data-minlength="6" class="form-control"
						name="password" id="password" placeholder="Password" required>
					<div class="help-block">Minimum of 6 characters</div>
				
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>

	</div>
</body>
</html>