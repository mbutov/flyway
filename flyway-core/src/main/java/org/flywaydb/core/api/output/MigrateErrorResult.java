/*-
 * ========================LICENSE_START=================================
 * flyway-core
 * ========================================================================
 * Copyright (C) 2010 - 2025 Red Gate Software Ltd
 * ========================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package org.flywaydb.core.api.output;

import org.flywaydb.core.api.output.errors.ErrorOutputItem;

public class MigrateErrorResult extends MigrateResult {
    public ErrorOutputItem error;

    public MigrateErrorResult(final MigrateResult migrateResult, final Exception e) {
        super(migrateResult);
        this.success = false;
        this.error = ErrorOutput.fromException(e).error();
    }
}
