rootProject.name = "notice"

include("application:api-app")

include(":domain:member")
include("domain:member")
findProject(":domain:member")?.name = "member"
