<%@ page import="java.sql.Connection" %>
<%@ page import="com.supmti.database.DatabaseConnection" %>


<%@ include file="auth-header.jsp" %>



<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <form action="loginServlet" method="post" class="login100-form validate-form">
					<span class="login100-form-title p-b-43">
						Identification
					</span>


                <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                    <input class="input100" type="text" name="email">
                    <span class="focus-input100"></span>
                    <span class="label-input100">Email</span>
                </div>


                <div class="wrap-input100 validate-input" data-validate="Password is required">
                    <input class="input100" type="password" name="password">
                    <span class="focus-input100"></span>
                    <span class="label-input100">Mot de passe</span>
                </div>




                <div class="container-login100-form-btn">
                    <button class="login100-form-btn">
                        S'identifier
                    </button>
                </div>




            </form>

            <div class="login100-more" style="background-image: url('assets/images/auth.jpg');">
            </div>
        </div>
    </div>
</div>



<%@ include file="auth-footer.jsp" %>
