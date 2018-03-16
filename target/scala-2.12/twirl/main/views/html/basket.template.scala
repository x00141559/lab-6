
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/("""  
         """),_display_(/*20.11*/if(flash.containsKey("error"))/*20.41*/ {_display_(Seq[Any](format.raw/*20.43*/("""
            """),format.raw/*21.13*/("""<div class="alert alert-success">
              """),_display_(/*22.16*/flash/*22.21*/.get("error")),format.raw/*22.34*/("""
            """),format.raw/*23.13*/("""</div>
          """)))}),format.raw/*24.12*/("""
      
		"""),format.raw/*26.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*40.18*/if(customer.getBasket() != null)/*40.50*/ {_display_(Seq[Any](format.raw/*40.52*/("""
                    """),format.raw/*41.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*42.22*/for(i <- customer.getBasket().getBasketItems()) yield /*42.69*/ {_display_(Seq[Any](format.raw/*42.71*/("""
                    """),format.raw/*43.21*/("""<tr>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getProduct.getName),format.raw/*44.50*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getProduct.getDescription()),format.raw/*45.59*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getPrice))),format.raw/*46.64*/("""</td>
                        <td>&euro; """),_display_(/*47.37*/("%.2f".format(i.getItemTotal))),format.raw/*47.68*/("""</td>
                        <td>"""),_display_(/*48.30*/i/*48.31*/.getQuantity()),format.raw/*48.45*/("""</td>
                        <td><a href=""""),_display_(/*49.39*/routes/*49.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*49.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*50.39*/routes/*50.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*50.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*52.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*53.16*/("""
			"""),format.raw/*54.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*58.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*58.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.ShoppingCtrl.emptyBasket()),format.raw/*64.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.ShoppingCtrl.placeOrder()),format.raw/*70.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*80.24*/("""{"""),format.raw/*80.25*/("""
		"""),format.raw/*81.3*/("""return confirm('Are you sure?');
	"""),format.raw/*82.2*/("""}"""),format.raw/*82.3*/("""
"""),format.raw/*83.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 16 10:42:07 GMT 2018
                  SOURCE: /home/wdd/webapps/lab6/app/views/basket.scala.html
                  HASH: 799ac6e34d66c89df7b7de0272fc506b907622e5
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1192->34|1221->119|1248->120|1319->166|1360->199|1399->201|1429->204|1502->251|1543->283|1583->285|1616->291|1687->335|1701->340|1737->355|1770->361|1810->371|1850->384|1889->414|1929->416|1970->429|2046->478|2060->483|2094->496|2135->509|2184->527|2221->537|2575->864|2616->896|2656->898|2705->919|2815->1002|2878->1049|2918->1051|2967->1072|3028->1106|3038->1107|3078->1126|3140->1161|3150->1162|3199->1190|3268->1232|3316->1259|3385->1301|3437->1332|3499->1367|3509->1368|3544->1382|3615->1426|3630->1432|3683->1464|3812->1566|3827->1572|3898->1622|4039->1732|4110->1772|4141->1776|4318->1926|4390->1976|4597->2156|4612->2162|4660->2189|4982->2484|4997->2490|5044->2516|5371->2815|5400->2816|5430->2819|5491->2853|5519->2854|5547->2855
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|58->26|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|85->53|86->54|90->58|90->58|96->64|96->64|96->64|102->70|102->70|102->70|112->80|112->80|113->81|114->82|114->82|115->83
                  -- GENERATED --
              */
          