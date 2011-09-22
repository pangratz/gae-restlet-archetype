package ${package}.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RestletApplication extends Application {

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());

		// TODO add resources
		// router.attach("/path", <<Name>>Resource.class);

		return router;
	}
}
