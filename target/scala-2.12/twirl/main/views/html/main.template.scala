
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>
	"""),_display_(/*17.3*/if(flash.containsKey("success"))/*17.35*/ {_display_(Seq[Any](format.raw/*17.37*/("""
        """),format.raw/*18.9*/("""<div class="alert alert-success">
            """),_display_(/*19.14*/flash/*19.19*/.get("success")),format.raw/*19.34*/("""
        """),format.raw/*20.9*/("""</div>
  """)))}),format.raw/*21.4*/("""  
    """),_display_(/*22.6*/if(flash.containsKey("error"))/*22.36*/ {_display_(Seq[Any](format.raw/*22.38*/("""
      """),format.raw/*23.7*/("""<div class="alert alert-success">
        """),_display_(/*24.10*/flash/*24.15*/.get("error")),format.raw/*24.28*/("""
      """),format.raw/*25.7*/("""</div>
    """)))}),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""<nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*30.48*/routes/*30.54*/.ProductCtrl.listProducts(0)),format.raw/*30.82*/("""">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*35.22*/if(title=="Products" )/*35.44*/{_display_(Seq[Any](format.raw/*35.45*/("""class="active"""")))}),format.raw/*35.60*/(""">
                    <a href="#">About</a>
                </li>

                <li """),_display_(/*39.22*/if(title=="Orders" )/*39.42*/{_display_(Seq[Any](format.raw/*39.43*/("""class="active"""")))}),format.raw/*39.58*/(""">
                    <a href=""""),_display_(/*40.31*/routes/*40.37*/.ShoppingCtrl.viewOrders()),format.raw/*40.63*/("""">Orders</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*49.22*/if(title=="Login")/*49.40*/{_display_(Seq[Any](format.raw/*49.41*/("""class="active"""")))}),format.raw/*49.56*/(""">
                    """),_display_(/*50.22*/if(user != null)/*50.38*/ {_display_(Seq[Any](format.raw/*50.40*/("""
                        """),format.raw/*51.25*/("""<a href=""""),_display_(/*51.35*/controllers/*51.46*/.security.routes.LoginCtrl.logout()),format.raw/*51.81*/("""">Logout """),_display_(/*51.91*/user/*51.95*/.getName()),format.raw/*51.105*/("""</a>
                    """)))}/*52.23*/else/*52.28*/{_display_(Seq[Any](format.raw/*52.29*/("""
                        """),format.raw/*53.25*/("""<a href=""""),_display_(/*53.35*/controllers/*53.46*/.security.routes.LoginCtrl.login()),format.raw/*53.80*/("""">Login</a>
                    """)))}),format.raw/*54.22*/("""

                """),format.raw/*56.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*66.18*/content),format.raw/*66.25*/("""
            """),format.raw/*67.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("javascripts/main.js")),format.raw/*81.65*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 16 11:39:31 GMT 2018
                  SOURCE: /home/wdd/webapps/lab6/app/views/main.scala.html
                  HASH: e7f18a54c7b9a8102d2bd1704b9f7e3e68c1dc72
                  MATRIX: 970->1|1121->57|1149->59|1270->154|1295->159|1507->344|1522->350|1584->391|1650->431|1691->463|1731->465|1767->474|1841->521|1855->526|1891->541|1927->550|1967->560|2001->568|2040->598|2080->600|2114->607|2184->650|2198->655|2232->668|2266->675|2308->687|2340->692|2528->853|2543->859|2592->887|2719->987|2750->1009|2789->1010|2835->1025|2950->1113|2979->1133|3018->1134|3064->1149|3123->1181|3138->1187|3185->1213|3444->1445|3471->1463|3510->1464|3556->1479|3606->1502|3631->1518|3671->1520|3724->1545|3761->1555|3781->1566|3837->1601|3874->1611|3887->1615|3919->1625|3964->1652|3977->1657|4016->1658|4069->1683|4106->1693|4126->1704|4181->1738|4245->1771|4291->1789|4454->1925|4482->1932|4523->1945|4831->2226|4846->2232|4907->2272
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|54->22|54->22|54->22|55->23|56->24|56->24|56->24|57->25|58->26|59->27|62->30|62->30|62->30|67->35|67->35|67->35|67->35|71->39|71->39|71->39|71->39|72->40|72->40|72->40|81->49|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|83->51|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|86->54|88->56|98->66|98->66|99->67|113->81|113->81|113->81
                  -- GENERATED --
              */
          