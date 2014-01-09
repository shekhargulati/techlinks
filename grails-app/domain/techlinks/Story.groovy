package techlinks

import grails.rest.Resource

@Resource(uri = "/api/v1/stories", formats = "json")
class Story {

    String url
    String title
    String text
    String submittedBy
    String imgSrc
    Date submittedOn = new Date()

    static constraints = {
        url url: true, unique: true, blank: false
        title maxSize: 140, blank: false
        text maxSize: 400, nullable: true
        submittedBy blank: false
        imgSrc url: true, nullable: true
    }
}
