class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }
        "/api/v1/stories"(resources:'Story')

        "/"(view:"/index")
        "500"(view:'/error')


	}
}
