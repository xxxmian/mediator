package org.fmgroup.mediator.language.entity;

import org.fmgroup.mediator.language.Template;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.Templated;
import org.fmgroup.mediator.language.scope.Scope;

public interface Entity extends RawElement, Scope, Templated {
    EntityInterface getInterface();
}
