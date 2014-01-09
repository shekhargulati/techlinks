class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }
        "/api/v1/stories"(resources:'Story')
        "/api/v1/timeline"(resources: 'Story',action: 'timeline',controller: 'StoryController')

        "/"(view:"/index")
        "500"(view:'/error')


	}
}
