/*
 * Copyright (c) pakoito 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pacoworks.dereference.features.global;

import com.pacoworks.dereference.architecture.reactive.buddies.ActivityReactiveBuddy;

import rx.android.schedulers.AndroidSchedulers;

/**
 * Starts any business logic that is not dependent on the current screen.
 */
public class MainOrchestrator {
    private MainOrchestrator() {
        // No instances
    }

    public static void start(AppState state, NavigatorView navigatorView, ActivityReactiveBuddy activityReactiveBuddy) {
        NavigationInteractorKt.subscribeNavigation(state, navigatorView, activityReactiveBuddy, AndroidSchedulers.mainThread());
    }
}
