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
package org.eclipse.che.ide.menu;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import org.eclipse.che.ide.api.action.ActionManager;
import org.eclipse.che.ide.api.action.IdeActions;
import org.eclipse.che.ide.api.keybinding.KeyBindingAgent;
import org.eclipse.che.ide.api.parts.PerspectiveManager;

/**
 * Manages part menu based on context menu.
 *
 * @author Vitaliy Guliy
 */
@Singleton
public class PartMenu extends ContextMenu {

  @Inject
  public PartMenu(
      ActionManager actionManager,
      KeyBindingAgent keyBindingAgent,
      Provider<PerspectiveManager> managerProvider) {
    super(actionManager, keyBindingAgent, managerProvider);
  }

  @Override
  protected String getGroupMenu() {
    return IdeActions.GROUP_PART_MENU;
  }
}
