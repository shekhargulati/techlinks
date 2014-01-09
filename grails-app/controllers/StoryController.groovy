import grails.rest.RestfulController
import techlinks.Story

/**
 * Created with IntelliJ IDEA.
 * User: shekhargulati
 * Date: 10/01/14
 * Time: 12:27 AM
 * To change this template use File | Settings | File Templates.
 */


class StoryController extends RestfulController{

    static responseFormats = ['json','xml']

    StoryController() {
        super(Story)
    }
}
