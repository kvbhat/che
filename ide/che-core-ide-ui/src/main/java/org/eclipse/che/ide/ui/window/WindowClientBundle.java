/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which is available at http://www.eclipse.org/legal/epl-2.0.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ui.window;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.inject.ImplementedBy;
import org.vectomatic.dom.svg.ui.SVGResource;

/**
 * Window resource bundle.
 *
 * @author Vlad Zhukovskyi
 * @since 6.0.0
 */
@ImplementedBy(CompositeWindowView.ResourceClientBundle.class)
public interface WindowClientBundle extends ClientBundle {

  Style getStyle();

  SVGResource closeIcon();

  interface Style extends CssResource {
    String windowFrame();

    String windowFrameTitleBar();

    String windowFrameTitle();

    String windowFrameCloseButton();

    String windowFrameBody();

    String windowFrameButtonBar();

    String windowFrameFooterButtonRight();

    String windowFrameFooterButtonLeft();

    String windowFrameFooterButton();

    String windowFrameFooterButtonPrimary();
  }
}
