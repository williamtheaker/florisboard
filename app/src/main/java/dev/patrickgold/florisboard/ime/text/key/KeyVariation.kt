/*
 * Copyright (C) 2020 Patrick Goldinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.patrickgold.florisboard.ime.text.key

import android.annotation.SuppressLint
import com.squareup.moshi.FromJson

enum class KeyVariation {
    ALL,
    EMAIL_ADDRESS,
    NORMAL,
    PASSWORD,
    URI;

    companion object {
        @SuppressLint("DefaultLocale")
        fun fromString(string: String): KeyVariation {
            return valueOf(string.toUpperCase())
        }
    }
}

class KeyVariationAdapter {
    @FromJson
    fun fromJson(raw: String): KeyVariation {
        return KeyVariation.fromString(raw)
    }
}
