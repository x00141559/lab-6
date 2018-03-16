
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab6/conf/routes
// @DATE:Fri Mar 16 11:48:18 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
