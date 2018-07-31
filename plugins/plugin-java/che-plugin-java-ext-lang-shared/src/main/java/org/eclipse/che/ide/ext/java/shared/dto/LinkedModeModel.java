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
package org.eclipse.che.ide.ext.java.shared.dto;

import java.util.List;
import org.eclipse.che.dto.shared.DTO;

/** @author Evgen Vidolob */
@DTO
public interface LinkedModeModel {

  void setGroups(List<LinkedPositionGroup> groups);

  List<LinkedPositionGroup> getGroups();

  void setEscapePosition(int offset);

  int getEscapePosition();
}
