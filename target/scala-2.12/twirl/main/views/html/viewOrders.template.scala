
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

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
"""),_display_(/*9.2*/main("order", customer)/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""

  

  """),format.raw/*13.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*15.8*/if(flash.containsKey("success"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
        """),format.raw/*16.9*/("""<div class="alert alert-success">
          """),_display_(/*17.12*/flash/*17.17*/.get("success")),format.raw/*17.32*/("""
        """),format.raw/*18.9*/("""</div>
      """)))}),format.raw/*19.8*/("""
      """),format.raw/*20.7*/("""<thead>
        <tr>
          <th>Image</th> 
          <th>ID</th> 
          <th>Quantity</th>  
          <th>Price</th> 
          <th>Total</th> 
        </tr>
      </thead>

      <tbody>

        """),_display_(/*32.10*/for(i <- customer.getBasket().getBasketItems()) yield /*32.57*/ {_display_(Seq[Any](format.raw/*32.59*/("""
          """),format.raw/*33.11*/("""<tr>
              <td>"""),_display_(/*34.20*/i/*34.21*/.getProduct.getName),format.raw/*34.40*/("""</td>
              <td>"""),_display_(/*35.20*/i/*35.21*/.getProduct.getDescription()),format.raw/*35.49*/("""</td>
              <td>&euro; """),_display_(/*36.27*/("%.2f".format(i.getPrice))),format.raw/*36.54*/("""</td>
              <td>&euro; """),_display_(/*37.27*/("%.2f".format(i.getItemTotal))),format.raw/*37.58*/("""</td>
              <td>"""),_display_(/*38.20*/i/*38.21*/.getQuantity()),format.raw/*38.35*/("""</td>
              <td><a href=""""),_display_(/*39.29*/routes/*39.35*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*39.67*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
              <td><a href=""""),_display_(/*40.29*/routes/*40.35*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*40.85*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
          </tr>
          """)))}),format.raw/*42.12*/("""<!-- End of For loop -->
    
</tbody>
</table>
<div class="row">
  <div class="col-md-12">
      <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*48.59*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*48.109*/("""</strong></p>
  </div>  
</div>
<div class="row">
  <div class="col-md-6">
      <p class="text-right">
          <a href=""""),_display_(/*54.21*/routes/*54.27*/.ShoppingCtrl.emptyBasket()),format.raw/*54.54*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
          <span class="glyphicon glyphicon-trash"></span> CancelOrder</a>
      </p>
  </div>  
  <div class="col-md-6">
      <p class="text-right">
          <a href=""""),_display_(/*60.21*/routes/*60.27*/.ShoppingCtrl.placeOrder()),format.raw/*60.53*/("""" class="btn btn-success btn-sm">
          <span class="glyphicon glyphicon-euro"></span> Place Order</a>
      </p>
  </div>  
</div>
</div>
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
                  DATE: Fri Mar 16 11:48:18 GMT 2018
                  SOURCE: /home/wdd/webapps/lab6/app/views/viewOrders.scala.html
                  HASH: 3e8206bdc7df14cc1db486ebfe1bf0843c6906a3
                  MATRIX: 968->1|1074->38|1110->68|1142->94|1196->34|1225->119|1252->120|1323->166|1354->189|1393->191|1428->199|1554->299|1595->331|1635->333|1671->342|1743->387|1757->392|1793->407|1829->416|1873->430|1907->437|2140->643|2203->690|2243->692|2282->703|2333->727|2343->728|2383->747|2435->772|2445->773|2494->801|2553->833|2601->860|2660->892|2712->923|2764->948|2774->949|2809->963|2870->997|2885->1003|2938->1035|3057->1127|3072->1133|3143->1183|3264->1273|3441->1423|3513->1473|3664->1597|3679->1603|3727->1630|3988->1864|4003->1870|4050->1896
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|45->13|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|52->20|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|74->42|80->48|80->48|86->54|86->54|86->54|92->60|92->60|92->60
                  -- GENERATED --
              */
          