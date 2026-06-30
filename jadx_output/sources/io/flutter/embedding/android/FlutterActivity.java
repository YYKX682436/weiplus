package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class FlutterActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity implements io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, androidx.lifecycle.y {
    public static final int FLUTTER_VIEW_ID = android.view.View.generateViewId();
    private static final java.lang.String TAG = "FlutterActivity";
    protected io.flutter.embedding.android.FlutterActivityAndFragmentDelegate delegate;
    boolean hasRegisteredBackCallback = false;
    private androidx.lifecycle.b0 lifecycle;
    private final android.window.OnBackInvokedCallback onBackInvokedCallback;

    /* loaded from: classes11.dex */
    public static class CachedEngineIntentBuilder {
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> activityClass;
        private final java.lang.String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
        private boolean enableSwitchSurface = false;

        public CachedEngineIntentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> cls, java.lang.String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        public io.flutter.embedding.android.FlutterActivity.CachedEngineIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            return new android.content.Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode).putExtra("enable_switch_surface", this.enableSwitchSurface);
        }

        public io.flutter.embedding.android.FlutterActivity.CachedEngineIntentBuilder destroyEngineWithActivity(boolean z17) {
            this.destroyEngineWithActivity = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterActivity.CachedEngineIntentBuilder enableSwitchSurface(boolean z17) {
            this.enableSwitchSurface = z17;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public static class NewEngineInGroupIntentBuilder {
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> activityClass;
        private final java.lang.String cachedEngineGroupId;
        private java.lang.String dartEntrypoint = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        private java.lang.String initialRoute = "/";
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineInGroupIntentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> cls, java.lang.String str) {
            this.activityClass = cls;
            this.cachedEngineGroupId = str;
        }

        public io.flutter.embedding.android.FlutterActivity.NewEngineInGroupIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            return new android.content.Intent(context, this.activityClass).putExtra("dart_entrypoint", this.dartEntrypoint).putExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, this.initialRoute).putExtra("cached_engine_group_id", this.cachedEngineGroupId).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
        }

        public io.flutter.embedding.android.FlutterActivity.NewEngineInGroupIntentBuilder dartEntrypoint(java.lang.String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public io.flutter.embedding.android.FlutterActivity.NewEngineInGroupIntentBuilder initialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public static class NewEngineIntentBuilder {
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> activityClass;
        private java.util.List<java.lang.String> dartEntrypointArgs;
        private java.lang.String initialRoute = "/";
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
        private boolean enableSwitchSurface = false;

        public NewEngineIntentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> cls) {
            this.activityClass = cls;
        }

        public io.flutter.embedding.android.FlutterActivity.NewEngineIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            android.content.Intent putExtra = new android.content.Intent(context, this.activityClass).putExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true).putExtra("enable_switch_surface", true);
            if (this.dartEntrypointArgs != null) {
                putExtra.putExtra("dart_entrypoint_args", new java.util.ArrayList(this.dartEntrypointArgs));
            }
            return putExtra;
        }

        public io.flutter.embedding.android.FlutterActivity.NewEngineIntentBuilder dartEntrypointArgs(java.util.List<java.lang.String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public io.flutter.embedding.android.FlutterActivity.NewEngineIntentBuilder enableSwitchSurface(boolean z17) {
            this.enableSwitchSurface = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterActivity.NewEngineIntentBuilder initialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }
    }

    public FlutterActivity() {
        this.onBackInvokedCallback = android.os.Build.VERSION.SDK_INT < 33 ? null : createOnBackInvokedCallback();
        this.lifecycle = new androidx.lifecycle.b0(this, true);
    }

    @java.lang.Deprecated
    private void configureStatusBarForFullscreenFlutterExperience() {
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
    }

    public static android.content.Intent createDefaultIntent(android.content.Context context) {
        return withNewEngine().build(context);
    }

    private android.view.View createFlutterView() {
        return this.delegate.onCreateView(null, null, null, FLUTTER_VIEW_ID, getRenderMode() == io.flutter.embedding.android.RenderMode.surface);
    }

    private android.window.OnBackInvokedCallback createOnBackInvokedCallback() {
        return android.os.Build.VERSION.SDK_INT >= 34 ? new android.window.OnBackAnimationCallback() { // from class: io.flutter.embedding.android.FlutterActivity.1
            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                io.flutter.embedding.android.FlutterActivity.this.cancelBackGesture();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                io.flutter.embedding.android.FlutterActivity.this.commitBackGesture();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(android.window.BackEvent backEvent) {
                io.flutter.embedding.android.FlutterActivity.this.updateBackGestureProgress(backEvent);
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(android.window.BackEvent backEvent) {
                io.flutter.embedding.android.FlutterActivity.this.startBackGesture(backEvent);
            }
        } : new android.window.OnBackInvokedCallback() { // from class: io.flutter.embedding.android.FlutterActivity$$a
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                io.flutter.embedding.android.FlutterActivity.this.onBackPressed();
            }
        };
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean stillAttachedForEvent(java.lang.String str) {
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate == null) {
            io.flutter.Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (flutterActivityAndFragmentDelegate.isAttached()) {
            return true;
        }
        io.flutter.Log.w(TAG, "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    private void switchLaunchThemeForNormalTheme() {
        try {
            android.os.Bundle metaData = getMetaData();
            if (metaData != null) {
                int i17 = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    setTheme(i17);
                }
            } else {
                io.flutter.Log.v(TAG, "Using the launch theme as normal theme.");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            io.flutter.Log.e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public static io.flutter.embedding.android.FlutterActivity.CachedEngineIntentBuilder withCachedEngine(java.lang.String str) {
        return new io.flutter.embedding.android.FlutterActivity.CachedEngineIntentBuilder(io.flutter.embedding.android.FlutterActivity.class, str);
    }

    public static io.flutter.embedding.android.FlutterActivity.NewEngineIntentBuilder withNewEngine() {
        return new io.flutter.embedding.android.FlutterActivity.NewEngineIntentBuilder(io.flutter.embedding.android.FlutterActivity.class);
    }

    public static io.flutter.embedding.android.FlutterActivity.NewEngineInGroupIntentBuilder withNewEngineInGroup(java.lang.String str) {
        return new io.flutter.embedding.android.FlutterActivity.NewEngineInGroupIntentBuilder(io.flutter.embedding.android.FlutterActivity.class, str);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean attachToEngineAutomatically() {
        return true;
    }

    public void cancelBackGesture() {
        if (stillAttachedForEvent("cancelBackGesture")) {
            this.delegate.cancelBackGesture();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    public void commitBackGesture() {
        if (stillAttachedForEvent("commitBackGesture")) {
            this.delegate.commitBackGesture();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (this.delegate.isFlutterEngineFromHost()) {
            return;
        }
        io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void detachFromFlutterEngine() {
        io.flutter.Log.w(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDestroyView();
            this.delegate.onDetach();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getAppBundlePath() {
        java.lang.String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean getBackCallbackState() {
        return this.hasRegisteredBackCallback;
    }

    public io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public android.content.Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.util.List<java.lang.String> getDartEntrypointArgs() {
        return (java.util.List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getDartEntrypointFunctionName() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle metaData = getMetaData();
            java.lang.String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getDartEntrypointLibraryUri() {
        try {
            android.os.Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> getExclusiveAppComponent() {
        return this.delegate;
    }

    public io.flutter.embedding.engine.FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.engine.FlutterShellArgs getFlutterShellArgs() {
        return io.flutter.embedding.engine.FlutterShellArgs.fromIntent(getIntent());
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getInitialRoute() {
        if (getIntent().hasExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE)) {
            return getIntent().getStringExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE);
        }
        try {
            android.os.Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.lifecycle;
    }

    public android.os.Bundle getMetaData() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public android.window.OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.android.TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.TransparencyMode.opaque : io.flutter.embedding.android.TransparencyMode.transparent;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean isEnableSwitchSurface() {
        return getIntent().getBooleanExtra("enable_switch_surface", false);
    }

    public boolean isInSwapSurface() {
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            return flutterActivityAndFragmentDelegate.isInSwapSurface();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i17, i18, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        super.onCreate(bundle);
        if (bundle != null) {
            setFrameworkHandlesBack(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = new io.flutter.embedding.android.FlutterActivityAndFragmentDelegate(this);
        this.delegate = flutterActivityAndFragmentDelegate;
        flutterActivityAndFragmentDelegate.onAttach(this);
        this.delegate.onRestoreInstanceState(bundle);
        this.lifecycle.f(androidx.lifecycle.m.ON_CREATE);
        configureWindowForTransparency();
        setContentView(createFlutterView());
        configureStatusBarForFullscreenFlutterExperience();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (stillAttachedForEvent("onDestroy")) {
            this.delegate.onDestroyView();
            this.delegate.onDetach();
        }
        release();
        this.lifecycle.f(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterSurfaceViewCreated(io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterTextureViewCreated(io.flutter.embedding.android.FlutterTextureView flutterTextureView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiDisplayed() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiNoLongerDisplayed() {
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
        this.delegate.onMultiWindowModeChanged(z17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
        this.lifecycle.f(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.lifecycle.f(androidx.lifecycle.m.ON_RESUME);
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.lifecycle.f(androidx.lifecycle.m.ON_START);
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
        this.lifecycle.f(androidx.lifecycle.m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i17);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (stillAttachedForEvent("onWindowFocusChanged")) {
            this.delegate.onWindowFocusChanged(z17);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public boolean popSystemNavigator() {
        return false;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    public io.flutter.embedding.engine.FlutterEngine provideFlutterEngine(android.content.Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        return new io.flutter.plugin.platform.PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.plugin.view.SensitiveContentPlugin provideSensitiveContentPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        return new io.flutter.plugin.view.SensitiveContentPlugin(FLUTTER_VIEW_ID, activity, flutterEngine.getSensitiveContentChannel());
    }

    public void registerOnBackInvokedCallback() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = true;
        }
    }

    public void release() {
        unregisterOnBackInvokedCallback();
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.release();
            this.delegate = null;
        }
    }

    public void setDelegate(io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        this.delegate = flutterActivityAndFragmentDelegate;
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public void setFrameworkHandlesBack(boolean z17) {
        if (z17 && !this.hasRegisteredBackCallback) {
            registerOnBackInvokedCallback();
        } else {
            if (z17 || !this.hasRegisteredBackCallback) {
                return;
            }
            unregisterOnBackInvokedCallback();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDestroyEngineWithHost() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldHandleDeeplinking() {
        try {
            return io.flutter.embedding.android.FlutterActivityLaunchConfigs.deepLinkEnabled(getMetaData());
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldRestoreAndSaveState() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : getCachedEngineId() == null;
    }

    public void startBackGesture(android.window.BackEvent backEvent) {
        if (stillAttachedForEvent("startBackGesture")) {
            this.delegate.startBackGesture(backEvent);
        }
    }

    public void switchSurface(boolean z17) {
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.switchSurface(z17);
        }
    }

    public void unregisterOnBackInvokedCallback() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.hasRegisteredBackCallback = false;
        }
    }

    public void updateBackGestureProgress(android.window.BackEvent backEvent) {
        if (stillAttachedForEvent("updateBackGestureProgress")) {
            this.delegate.updateBackGestureProgress(backEvent);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void updateSystemUiOverlays() {
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
        }
    }
}
