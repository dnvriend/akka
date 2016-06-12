import akka.{ AkkaBuild, Dependencies, Formatting, OSGi }

AkkaBuild.defaultSettings
Formatting.formatSettings
Dependencies.persistenceQueryTck

fork in Test := true

disablePlugins(MimaPlugin)
