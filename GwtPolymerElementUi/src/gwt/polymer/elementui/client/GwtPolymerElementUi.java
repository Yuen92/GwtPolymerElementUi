package gwt.polymer.elementui.client;

import gwt.polymer.elementui.client.composite.Main;

import java.util.Arrays;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.element.IronIconElement;
import com.vaadin.polymer.paper.element.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.element.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.element.PaperIconItemElement;
import com.vaadin.polymer.paper.element.PaperRippleElement;
import com.vaadin.polymer.paper.element.PaperToolbarElement;

public class GwtPolymerElementUi implements EntryPoint {
    public void onModuleLoad() {
	// We have to load icon sets before run application
	Polymer.importHref(Arrays.asList(
		"iron-icons/iron-icons.html",
		PaperIconItemElement.SRC,
		IronIconElement.SRC,
		PaperRippleElement.SRC,
		PaperDrawerPanelElement.SRC,
		PaperHeaderPanelElement.SRC,
		PaperToolbarElement.SRC), new Function() {
	    public Object call(Object arg) {
		// The app is executed when all imports succeed.
		startApplication();
		return null;
	    }
	});
    }

    private void startApplication() {
	RootPanel.get().add(new Main());
    }
}
