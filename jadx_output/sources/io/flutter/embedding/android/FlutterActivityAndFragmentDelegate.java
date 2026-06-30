package io.flutter.embedding.android;

/* loaded from: classes15.dex */
class FlutterActivityAndFragmentDelegate implements io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> {
    private static final int FLUTTER_SPLASH_VIEW_FALLBACK_ID = 486947586;
    private static final java.lang.String FRAMEWORK_RESTORATION_BUNDLE_KEY = "framework";
    static final java.lang.String ON_BACK_CALLBACK_ENABLED_KEY = "enableOnBackInvokedCallbackState";
    private static final java.lang.String PLUGINS_RESTORATION_BUNDLE_KEY = "plugins";
    private static final java.lang.String TAG = "FlutterActivityAndFragmentDelegate";
    android.view.ViewTreeObserver.OnPreDrawListener activePreDrawListener;
    private io.flutter.embedding.engine.FlutterEngineGroup engineGroup;
    private io.flutter.embedding.engine.FlutterEngine flutterEngine;
    private final io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener;
    io.flutter.embedding.android.FlutterView flutterView;
    private io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host host;
    private boolean isAttached;
    private boolean isFirstFrameRendered;
    private boolean isFlutterEngineFromHost;
    private boolean isFlutterUiDisplayed;
    private io.flutter.plugin.platform.PlatformPlugin platformPlugin;
    private java.lang.Integer previousVisibility;
    private io.flutter.plugin.view.SensitiveContentPlugin sensitiveContentPlugin;

    /* loaded from: classes15.dex */
    public interface DelegateFactory {
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate createDelegate(io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host host);
    }

    /* loaded from: classes15.dex */
    public interface Host extends io.flutter.embedding.android.FlutterEngineProvider, io.flutter.embedding.android.FlutterEngineConfigurator, io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate {
        boolean attachToEngineAutomatically();

        void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine);

        void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine);

        void detachFromFlutterEngine();

        android.app.Activity getActivity();

        java.lang.String getAppBundlePath();

        boolean getBackCallbackState();

        java.lang.String getCachedEngineGroupId();

        java.lang.String getCachedEngineId();

        android.content.Context getContext();

        java.util.List<java.lang.String> getDartEntrypointArgs();

        java.lang.String getDartEntrypointFunctionName();

        java.lang.String getDartEntrypointLibraryUri();

        io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> getExclusiveAppComponent();

        io.flutter.embedding.engine.FlutterShellArgs getFlutterShellArgs();

        java.lang.String getInitialRoute();

        /* renamed from: getLifecycle */
        androidx.lifecycle.o mo133getLifecycle();

        io.flutter.embedding.android.RenderMode getRenderMode();

        io.flutter.embedding.android.TransparencyMode getTransparencyMode();

        default boolean isEnableSwitchSurface() {
            return false;
        }

        void onFlutterSurfaceViewCreated(io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView);

        void onFlutterTextureViewCreated(io.flutter.embedding.android.FlutterTextureView flutterTextureView);

        void onFlutterUiDisplayed();

        void onFlutterUiNoLongerDisplayed();

        @Override // io.flutter.embedding.android.FlutterEngineProvider
        io.flutter.embedding.engine.FlutterEngine provideFlutterEngine(android.content.Context context);

        io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine);

        io.flutter.plugin.view.SensitiveContentPlugin provideSensitiveContentPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine);

        boolean shouldAttachEngineToActivity();

        boolean shouldDestroyEngineWithHost();

        boolean shouldDispatchAppLifecycleState();

        boolean shouldHandleDeeplinking();

        boolean shouldRestoreAndSaveState();

        void updateSystemUiOverlays();
    }

    public FlutterActivityAndFragmentDelegate(io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host host) {
        this(host, null);
    }

    private io.flutter.embedding.engine.FlutterEngineGroup.Options addEntrypointOptions(io.flutter.embedding.engine.FlutterEngineGroup.Options options) {
        java.lang.String appBundlePath = this.host.getAppBundlePath();
        if (appBundlePath == null || appBundlePath.isEmpty()) {
            appBundlePath = io.flutter.FlutterInjector.instance().flutterLoader().findAppBundlePath();
        }
        io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint = new io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName());
        java.lang.String initialRoute = this.host.getInitialRoute();
        if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
            initialRoute = "/";
        }
        return options.setDartEntrypoint(dartEntrypoint).setInitialRoute(initialRoute).setDartEntrypointArgs(this.host.getDartEntrypointArgs());
    }

    private void delayFirstAndroidViewDraw(final io.flutter.embedding.android.FlutterView flutterView) {
        if (this.host.getRenderMode() != io.flutter.embedding.android.RenderMode.surface) {
            throw new java.lang.IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.activePreDrawListener != null) {
            flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
        }
        this.activePreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed && io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.activePreDrawListener != null) {
                    flutterView.getViewTreeObserver().removeOnPreDrawListener(this);
                    io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.activePreDrawListener = null;
                }
                return io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed;
            }
        };
        flutterView.getViewTreeObserver().addOnPreDrawListener(this.activePreDrawListener);
    }

    private void doInitialFlutterViewRun() {
        java.lang.String str;
        if (this.host.getCachedEngineId() == null && !this.flutterEngine.getDartExecutor().isExecutingDart()) {
            java.lang.String initialRoute = this.host.getInitialRoute();
            if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
                initialRoute = "/";
            }
            java.lang.String dartEntrypointLibraryUri = this.host.getDartEntrypointLibraryUri();
            if (("Executing Dart entrypoint: " + this.host.getDartEntrypointFunctionName() + ", library uri: " + dartEntrypointLibraryUri) == null) {
                str = "\"\"";
            } else {
                str = dartEntrypointLibraryUri + ", and sending initial route: " + initialRoute;
            }
            io.flutter.Log.v(TAG, str);
            this.flutterEngine.getNavigationChannel().setInitialRoute(initialRoute);
            java.lang.String appBundlePath = this.host.getAppBundlePath();
            if (appBundlePath == null || appBundlePath.isEmpty()) {
                appBundlePath = io.flutter.FlutterInjector.instance().flutterLoader().findAppBundlePath();
            }
            this.flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypointLibraryUri == null ? new io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName()) : new io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint(appBundlePath, dartEntrypointLibraryUri, this.host.getDartEntrypointFunctionName()), this.host.getDartEntrypointArgs());
        }
    }

    private void ensureAlive() {
        if (this.host == null) {
            throw new java.lang.IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private java.lang.String maybeGetInitialRouteFromIntent(android.content.Intent intent) {
        android.net.Uri data;
        if (!this.host.shouldHandleDeeplinking() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void cancelBackGesture() {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            io.flutter.Log.v(TAG, "Forwarding cancelBackGesture() to FlutterEngine.");
            this.flutterEngine.getBackGestureChannel().cancelBackGesture();
        }
    }

    public void commitBackGesture() {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            io.flutter.Log.v(TAG, "Forwarding commitBackGesture() to FlutterEngine.");
            this.flutterEngine.getBackGestureChannel().commitBackGesture();
        }
    }

    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    public void detachFromFlutterEngine() {
        if (!this.host.shouldDestroyEngineWithHost()) {
            this.host.detachFromFlutterEngine();
            return;
        }
        throw new java.lang.AssertionError("The internal FlutterEngine created by " + this.host + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public io.flutter.embedding.engine.FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    public boolean isAttached() {
        return this.isAttached;
    }

    public boolean isFlutterEngineFromHost() {
        return this.isFlutterEngineFromHost;
    }

    public boolean isInSwapSurface() {
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            return flutterView.isInSwapSurface();
        }
        return false;
    }

    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.flutter.Log.v(TAG, "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i17 + "\nresultCode: " + i18 + "\ndata: " + intent);
        this.flutterEngine.getActivityControlSurface().onActivityResult(i17, i18, intent);
    }

    public void onAttach(android.content.Context context) {
        ensureAlive();
        if (this.flutterEngine == null) {
            setUpFlutterEngine();
        }
        if (this.host.shouldAttachEngineToActivity()) {
            io.flutter.Log.v(TAG, "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.flutterEngine.getActivityControlSurface().attachToActivity(this, this.host.mo133getLifecycle());
        }
        android.app.Activity activity = this.host.getActivity();
        this.platformPlugin = this.host.providePlatformPlugin(activity, this.flutterEngine);
        this.sensitiveContentPlugin = this.host.provideSensitiveContentPlugin(activity, this.flutterEngine);
        this.host.configureFlutterEngine(this.flutterEngine);
        this.isAttached = true;
    }

    public void onBackPressed() {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            io.flutter.Log.v(TAG, "Forwarding onBackPressed() to FlutterEngine.");
            this.flutterEngine.getNavigationChannel().popRoute();
        }
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle, int i17, boolean z17) {
        io.flutter.Log.v(TAG, "Creating FlutterView.");
        ensureAlive();
        if (this.host.getRenderMode() == io.flutter.embedding.android.RenderMode.surface) {
            io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView = new io.flutter.embedding.android.FlutterSurfaceView(this.host.getContext(), this.host.getTransparencyMode() == io.flutter.embedding.android.TransparencyMode.transparent);
            this.host.onFlutterSurfaceViewCreated(flutterSurfaceView);
            this.flutterView = new io.flutter.embedding.android.FlutterView(this.host.getContext(), flutterSurfaceView);
        } else {
            io.flutter.embedding.android.FlutterTextureView flutterTextureView = new io.flutter.embedding.android.FlutterTextureView(this.host.getContext());
            flutterTextureView.setOpaque(this.host.getTransparencyMode() == io.flutter.embedding.android.TransparencyMode.opaque);
            this.host.onFlutterTextureViewCreated(flutterTextureView);
            this.flutterView = new io.flutter.embedding.android.FlutterView(this.host.getContext(), flutterTextureView);
        }
        this.flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        if (this.host.attachToEngineAutomatically()) {
            io.flutter.Log.v(TAG, "Attaching FlutterEngine to FlutterView.");
            this.flutterView.attachToFlutterEngine(this.flutterEngine);
        }
        this.flutterView.setId(i17);
        this.flutterView.setEnableSwitchSurface(this.host.isEnableSwitchSurface());
        this.flutterView.setInMultiWindowMode(getAppComponent().isInMultiWindowMode());
        if (z17) {
            delayFirstAndroidViewDraw(this.flutterView);
        }
        return this.flutterView;
    }

    public void onDestroyView() {
        io.flutter.Log.v(TAG, "onDestroyView()");
        ensureAlive();
        if (this.activePreDrawListener != null) {
            this.flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
            this.activePreDrawListener = null;
        }
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.detachFromFlutterEngine();
            this.flutterView.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        }
    }

    public void onDetach() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        if (this.isAttached) {
            io.flutter.Log.v(TAG, "onDetach()");
            ensureAlive();
            this.host.cleanUpFlutterEngine(this.flutterEngine);
            if (this.host.shouldAttachEngineToActivity()) {
                io.flutter.Log.v(TAG, "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.host.getActivity().isChangingConfigurations()) {
                    this.flutterEngine.getActivityControlSurface().detachFromActivityForConfigChanges();
                } else {
                    this.flutterEngine.getActivityControlSurface().detachFromActivity();
                }
            }
            io.flutter.plugin.platform.PlatformPlugin platformPlugin = this.platformPlugin;
            if (platformPlugin != null) {
                platformPlugin.destroy();
                this.platformPlugin = null;
            }
            io.flutter.plugin.view.SensitiveContentPlugin sensitiveContentPlugin = this.sensitiveContentPlugin;
            if (sensitiveContentPlugin != null) {
                sensitiveContentPlugin.destroy();
                this.sensitiveContentPlugin = null;
            }
            if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
                flutterEngine.getLifecycleChannel().appIsDetached();
            }
            if (this.host.shouldDestroyEngineWithHost()) {
                this.flutterEngine.destroy();
                if (this.host.getCachedEngineId() != null) {
                    io.flutter.embedding.engine.FlutterEngineCache.getInstance().remove(this.host.getCachedEngineId());
                }
                this.flutterEngine = null;
            }
            this.isAttached = false;
        }
    }

    public void onMultiWindowModeChanged(boolean z17) {
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.setInMultiWindowMode(z17);
        }
    }

    public void onNewIntent(android.content.Intent intent) {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.flutter.Log.v(TAG, "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.flutterEngine.getActivityControlSurface().onNewIntent(intent);
        java.lang.String maybeGetInitialRouteFromIntent = maybeGetInitialRouteFromIntent(intent);
        if (maybeGetInitialRouteFromIntent == null || maybeGetInitialRouteFromIntent.isEmpty()) {
            return;
        }
        this.flutterEngine.getNavigationChannel().pushRouteInformation(maybeGetInitialRouteFromIntent);
    }

    public void onPause() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.Log.v(TAG, "onPause()");
        ensureAlive();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.getLifecycleChannel().appIsInactive();
    }

    public void onPostResume() {
        io.flutter.Log.v(TAG, "onPostResume()");
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            updateSystemUiOverlays();
            this.flutterEngine.getPlatformViewsController().onResume();
        }
    }

    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        io.flutter.Log.v(TAG, "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i17 + "\npermissions: " + java.util.Arrays.toString(strArr) + "\ngrantResults: " + java.util.Arrays.toString(iArr));
        this.flutterEngine.getActivityControlSurface().onRequestPermissionsResult(i17, strArr, iArr);
    }

    public void onRestoreInstanceState(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        byte[] bArr;
        io.flutter.Log.v(TAG, "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        ensureAlive();
        if (bundle != null) {
            bundle2 = bundle.getBundle(PLUGINS_RESTORATION_BUNDLE_KEY);
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            bArr = null;
        }
        if (this.host.shouldRestoreAndSaveState()) {
            this.flutterEngine.getRestorationChannel().setRestorationData(bArr);
        }
        if (this.host.shouldAttachEngineToActivity()) {
            this.flutterEngine.getActivityControlSurface().onRestoreInstanceState(bundle2);
        }
    }

    public void onResume() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.Log.v(TAG, "onResume()");
        ensureAlive();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.getLifecycleChannel().appIsResumed();
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        io.flutter.Log.v(TAG, "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        ensureAlive();
        if (this.host.shouldRestoreAndSaveState()) {
            bundle.putByteArray("framework", this.flutterEngine.getRestorationChannel().getRestorationData());
        }
        if (this.host.shouldAttachEngineToActivity()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.flutterEngine.getActivityControlSurface().onSaveInstanceState(bundle2);
            bundle.putBundle(PLUGINS_RESTORATION_BUNDLE_KEY, bundle2);
        }
        if (this.host.getCachedEngineId() == null || this.host.shouldDestroyEngineWithHost()) {
            return;
        }
        bundle.putBoolean(ON_BACK_CALLBACK_ENABLED_KEY, this.host.getBackCallbackState());
    }

    public void onStart() {
        io.flutter.Log.v(TAG, "onStart()");
        ensureAlive();
        doInitialFlutterViewRun();
        java.lang.Integer num = this.previousVisibility;
        if (num != null) {
            this.flutterView.setVisibility(num.intValue());
        }
    }

    public void onStop() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.Log.v(TAG, "onStop()");
        ensureAlive();
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
            flutterEngine.getLifecycleChannel().appIsPaused();
        }
        this.previousVisibility = java.lang.Integer.valueOf(this.flutterView.getVisibility());
        this.flutterView.setVisibility(8);
        io.flutter.embedding.engine.FlutterEngine flutterEngine2 = this.flutterEngine;
        if (flutterEngine2 != null) {
            flutterEngine2.getRenderer().onTrimMemory(40);
        }
    }

    public void onTrimMemory(int i17) {
        ensureAlive();
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            if (this.isFirstFrameRendered && i17 >= 10) {
                flutterEngine.getDartExecutor().notifyLowMemoryWarning();
                this.flutterEngine.getSystemChannel().sendMemoryPressureWarning();
            }
            this.flutterEngine.getRenderer().onTrimMemory(i17);
            this.flutterEngine.getPlatformViewsController().onTrimMemory(i17);
        }
    }

    public void onUserLeaveHint() {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            io.flutter.Log.v(TAG, "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.flutterEngine.getActivityControlSurface().onUserLeaveHint();
        }
    }

    public void onWindowFocusChanged(boolean z17) {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        ensureAlive();
        io.flutter.Log.v(TAG, "Received onWindowFocusChanged: ".concat(z17 ? "true" : "false"));
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        if (z17) {
            flutterEngine.getLifecycleChannel().aWindowIsFocused();
        } else {
            flutterEngine.getLifecycleChannel().noWindowsAreFocused();
        }
    }

    public void release() {
        this.host = null;
        this.flutterEngine = null;
        this.flutterView = null;
        this.platformPlugin = null;
        this.sensitiveContentPlugin = null;
    }

    public void setUpFlutterEngine() {
        io.flutter.Log.v(TAG, "Setting up FlutterEngine.");
        java.lang.String cachedEngineId = this.host.getCachedEngineId();
        if (cachedEngineId != null) {
            io.flutter.embedding.engine.FlutterEngine flutterEngine = io.flutter.embedding.engine.FlutterEngineCache.getInstance().get(cachedEngineId);
            this.flutterEngine = flutterEngine;
            this.isFlutterEngineFromHost = true;
            if (flutterEngine != null) {
                return;
            }
            throw new java.lang.IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + cachedEngineId + "'");
        }
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host host = this.host;
        io.flutter.embedding.engine.FlutterEngine provideFlutterEngine = host.provideFlutterEngine(host.getContext());
        this.flutterEngine = provideFlutterEngine;
        if (provideFlutterEngine != null) {
            this.isFlutterEngineFromHost = true;
            return;
        }
        java.lang.String cachedEngineGroupId = this.host.getCachedEngineGroupId();
        if (cachedEngineGroupId == null) {
            io.flutter.Log.v(TAG, "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup = this.engineGroup;
            if (flutterEngineGroup == null) {
                flutterEngineGroup = new io.flutter.embedding.engine.FlutterEngineGroup(this.host.getContext(), this.host.getFlutterShellArgs().toArray());
            }
            this.flutterEngine = flutterEngineGroup.createAndRunEngine(addEntrypointOptions(new io.flutter.embedding.engine.FlutterEngineGroup.Options(this.host.getContext()).setAutomaticallyRegisterPlugins(false).setWaitForRestorationData(this.host.shouldRestoreAndSaveState())));
            this.isFlutterEngineFromHost = false;
            return;
        }
        io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup2 = io.flutter.embedding.engine.FlutterEngineGroupCache.getInstance().get(cachedEngineGroupId);
        if (flutterEngineGroup2 != null) {
            this.flutterEngine = flutterEngineGroup2.createAndRunEngine(addEntrypointOptions(new io.flutter.embedding.engine.FlutterEngineGroup.Options(this.host.getContext())));
            this.isFlutterEngineFromHost = false;
        } else {
            throw new java.lang.IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + cachedEngineGroupId + "'");
        }
    }

    public void startBackGesture(android.window.BackEvent backEvent) {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            io.flutter.Log.v(TAG, "Forwarding startBackGesture() to FlutterEngine.");
            this.flutterEngine.getBackGestureChannel().startBackGesture(backEvent);
        }
    }

    public void switchSurface(boolean z17) {
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.switchSurface(z17);
        }
    }

    public void updateBackGestureProgress(android.window.BackEvent backEvent) {
        ensureAlive();
        if (this.flutterEngine == null) {
            io.flutter.Log.w(TAG, "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        } else {
            io.flutter.Log.v(TAG, "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.flutterEngine.getBackGestureChannel().updateBackGestureProgress(backEvent);
        }
    }

    public void updateSystemUiOverlays() {
        io.flutter.plugin.platform.PlatformPlugin platformPlugin = this.platformPlugin;
        if (platformPlugin != null) {
            platformPlugin.updateSystemUiOverlays();
        }
    }

    public FlutterActivityAndFragmentDelegate(io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host host, io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup) {
        this.flutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.1
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.host.onFlutterUiDisplayed();
                io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = true;
                io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.isFirstFrameRendered = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.host.onFlutterUiNoLongerDisplayed();
                io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = false;
            }
        };
        this.host = host;
        this.isFirstFrameRendered = false;
        this.engineGroup = flutterEngineGroup;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    public android.app.Activity getAppComponent() {
        android.app.Activity activity = this.host.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new java.lang.AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }
}
