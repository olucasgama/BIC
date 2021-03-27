<%-- 
    Document   : SensibilidadeInsulina
    Created on : 26/03/2021, 06:50:39
    Author     : lucas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BIC - Bolus de Insulina de Correção</title>
        <script type="text/javascript">
            function validarFormulario(form) {
                var mensagem;
                mensagem = "";
                if (form.txtPeso.value == "") {
                    mensagem = mensagem + "Informe o Peso\n";
                }
                if (form.numGlicemia.value == "") {
                    mensagem = mensagem + "Informe a Glicemia\n";
                }
                if (mensagem == "") {
                    return true;
                } else {
                    alert(mensagem);
                    return false;
                }
            }
        </script>

    </head>
    <body>
        <h1>BIC - Bolus de Insulina de Correção</h1>

        <form action="SensibilidadeController?acao=confirmarOperacao&operacao=Enviar" method="post" name="frmSensibilidade" onsubmit="return validarFormulario(this)">
            <table>
                <tr>
                    <td>
                        <h3> Peso </h3>

                        <input type="radio" id="magro" name="txtPeso" value="magro">
                        <label for="magro">Magro</label><br>
                        <input type="radio" id="normal" name="txtPeso" value="normal">
                        <label for="normal">Normal</label><br>
                        <input type="radio" id="obeso" name="txtPeso" value="obeso">
                        <label for="obeso">Obeso</label><br>
                    </td>
                </tr>
                <tr>
                    <td>
                        <h3> Glicemia </h3>
                        <input type="number" name="numGlicemia" value="${sensibilidade.glicemia}">
                    </td>
                </tr> 
                <tr>
                    <td>
                        <input type="submit" name="btnEnviar" value="Calcular">       
                    </td>
                </tr>
            </table>
        </form>
        <form>
            <table>
                <h3>
                    Resultado:
                </h3>
                <c:if test="${resultado != null}">
                    <tr>
                        <td>
                            <c:out value="${resultado}" />
                        </td>
                    </tr>
                </c:if>

            </table>
        </form>






    </body>
</html>
