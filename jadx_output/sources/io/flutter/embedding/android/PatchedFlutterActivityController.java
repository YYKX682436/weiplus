package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public abstract class PatchedFlutterActivityController implements io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, androidx.lifecycle.y, hq4.a {
    public static final int FLUTTER_VIEW_ID = android.view.View.generateViewId();
    private static final java.lang.String TAG = "PatchedFlutterActivityController";
    protected io.flutter.embedding.android.FlutterActivityAndFragmentDelegate delegate;
    private androidx.lifecycle.b0 lifecycle;
    protected com.tencent.mm.plugin.voip.ui.VideoActivity vActivity;

    /* loaded from: classes11.dex */
    public static class CachedEngineIntentBuilder {
        private final java.lang.Class<? extends android.app.Activity> activityClass;
        private final java.lang.String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public CachedEngineIntentBuilder(java.lang.Class<? extends android.app.Activity> cls, java.lang.String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        public io.flutter.embedding.android.PatchedFlutterActivityController.CachedEngineIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            return new android.content.Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
        }

        public io.flutter.embedding.android.PatchedFlutterActivityController.CachedEngineIntentBuilder destroyEngineWithActivity(boolean z17) {
            this.destroyEngineWithActivity = z17;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public static class NewEngineIntentBuilder {
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> activityClass;
        private java.lang.String initialRoute = "/";
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineIntentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterActivity> cls) {
            this.activityClass = cls;
        }

        public io.flutter.embedding.android.PatchedFlutterActivityController.NewEngineIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            return new android.content.Intent(context, this.activityClass).putExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
        }

        public io.flutter.embedding.android.PatchedFlutterActivityController.NewEngineIntentBuilder initialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }
    }

    public PatchedFlutterActivityController(com.tencent.mm.plugin.voip.ui.VideoActivity videoActivity) {
        this();
        this.vActivity = videoActivity;
    }

    private void configureStatusBarForFullscreenFlutterExperience() {
        android.view.Window window = this.vActivity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            this.vActivity.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
    }

    public static android.content.Intent createDefaultIntent(android.content.Context context) {
        return withNewEngine().build(context);
    }

    private android.view.View createFlutterView() {
        return this.delegate.onCreateView(null, null, null, FLUTTER_VIEW_ID, getRenderMode() == io.flutter.embedding.android.RenderMode.surface);
    }

    private boolean isDebuggable() {
        return (this.vActivity.getApplicationInfo().flags & 2) != 0;
    }

    private void release() {
        this.delegate.onDestroyView();
        this.delegate.onDetach();
        this.delegate.release();
        this.delegate = null;
    }

    private boolean stillAttachedForEvent(java.lang.String str) {
        if (this.delegate != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(TAG, "FlutterActivity " + hashCode() + " " + str + " called after release.");
        return false;
    }

    private void switchLaunchThemeForNormalTheme() {
        try {
            android.os.Bundle metaData = getMetaData();
            if (metaData != null) {
                int i17 = metaData.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    this.vActivity.setTheme(i17);
                }
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "Using the launch theme as normal theme.");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.tencent.mars.xlog.Log.e(TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public static io.flutter.embedding.android.PatchedFlutterActivityController.NewEngineIntentBuilder withNewEngine() {
        return new io.flutter.embedding.android.PatchedFlutterActivityController.NewEngineIntentBuilder(io.flutter.embedding.android.FlutterActivity.class);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
    }

    @Override // hq4.a
    public abstract /* synthetic */ void dealContentView(android.view.View view);

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void detachFromFlutterEngine() {
        com.tencent.mars.xlog.Log.i(TAG, "FlutterActivity " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        release();
    }

    @Override // hq4.a
    public abstract /* synthetic */ void finish();

    public void fixResources(android.content.res.Resources resources) {
        setupConfiguration(resources.getConfiguration());
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public android.app.Activity getActivity() {
        return this.vActivity;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getAppBundlePath() {
        java.lang.String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(this.vActivity.getIntent().getAction()) && (dataString = this.vActivity.getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    public io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return this.vActivity.getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(this.vActivity.getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getCachedEngineGroupId() {
        return this.vActivity.getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getCachedEngineId() {
        return this.vActivity.getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public android.content.Context getContext() {
        return this.vActivity;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.util.List<java.lang.String> getDartEntrypointArgs() {
        return (java.util.List) this.vActivity.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getDartEntrypointFunctionName() {
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
        return io.flutter.embedding.engine.FlutterShellArgs.fromIntent(this.vActivity.getIntent());
    }

    @Override // hq4.a
    public abstract /* synthetic */ int getForceOrientation();

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getInitialRoute() {
        if (this.vActivity.getIntent().hasExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE)) {
            return this.vActivity.getIntent().getStringExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE);
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

    @Override // hq4.a
    public abstract /* synthetic */ int getLayoutId();

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.lifecycle;
    }

    public android.os.Bundle getMetaData() {
        return this.vActivity.getPackageManager().getActivityInfo(this.vActivity.getComponentName(), 128).metaData;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.android.TransparencyMode getTransparencyMode() {
        return getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.TransparencyMode.opaque : io.flutter.embedding.android.TransparencyMode.transparent;
    }

    @Override // hq4.a
    public abstract /* synthetic */ void importUIComponents(java.util.HashSet hashSet);

    @Override // hq4.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i17, i18, intent);
        }
    }

    @Override // hq4.a
    public boolean onBackPressed() {
        if (!stillAttachedForEvent("onBackPressed")) {
            return true;
        }
        this.delegate.onBackPressed();
        return true;
    }

    @Override // hq4.a
    public abstract /* synthetic */ void onConfigurationChanged(android.content.res.Configuration configuration);

    @Override // hq4.a
    public void onCreate(android.os.Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        this.vActivity.setTheme(com.tencent.mm.R.style.f494370l9);
        this.vActivity.V6(bundle);
        setupConfiguration(this.vActivity.getResources().getConfiguration());
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = new io.flutter.embedding.android.FlutterActivityAndFragmentDelegate(this);
        this.delegate = flutterActivityAndFragmentDelegate;
        flutterActivityAndFragmentDelegate.onAttach(this.vActivity);
        this.delegate.onRestoreInstanceState(bundle);
        this.lifecycle.f(androidx.lifecycle.m.ON_CREATE);
        configureWindowForTransparency();
        this.vActivity.setContentView(createFlutterView());
        configureStatusBarForFullscreenFlutterExperience();
    }

    @Override // hq4.a
    public void onDestroy() {
        if (stillAttachedForEvent("onDestroy")) {
            release();
        }
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
            this.vActivity.reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiNoLongerDisplayed() {
    }

    @Override // hq4.a
    public abstract /* synthetic */ boolean onKeyDown(int i17, android.view.KeyEvent keyEvent);

    @Override // hq4.a
    public void onNewIntent(android.content.Intent intent) {
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // hq4.a
    public void onPause() {
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
        this.lifecycle.f(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // hq4.a
    public void onPostResume() {
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // hq4.a
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }

    @Override // hq4.a
    public void onResume() {
        this.lifecycle.f(androidx.lifecycle.m.ON_RESUME);
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // hq4.a
    public void onStart() {
        this.lifecycle.f(androidx.lifecycle.m.ON_START);
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // hq4.a
    public void onStop() {
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
        this.lifecycle.f(androidx.lifecycle.m.ON_STOP);
    }

    @Override // hq4.a
    public /* bridge */ /* synthetic */ void onSwipeBackFinish() {
    }

    @Override // hq4.a
    public void onTrimMemory(int i17) {
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i17);
        }
    }

    @Override // hq4.a
    public boolean onUserLeaveHint() {
        if (!stillAttachedForEvent("onUserLeaveHint")) {
            return true;
        }
        this.delegate.onUserLeaveHint();
        return true;
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public boolean popSystemNavigator() {
        return false;
    }

    @Override // hq4.a
    public abstract /* synthetic */ android.view.View provideCustomActivityContentView();

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    public io.flutter.embedding.engine.FlutterEngine provideFlutterEngine(android.content.Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        return new io.flutter.plugin.platform.PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
    }

    public void setDelegate(io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        this.delegate = flutterActivityAndFragmentDelegate;
    }

    public abstract void setupConfiguration(android.content.res.Configuration configuration);

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDestroyEngineWithHost() {
        boolean booleanExtra = this.vActivity.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? booleanExtra : this.vActivity.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldHandleDeeplinking() {
        try {
            android.os.Bundle metaData = getMetaData();
            if (metaData != null) {
                return metaData.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldRestoreAndSaveState() {
        return this.vActivity.getIntent().hasExtra("enable_state_restoration") ? this.vActivity.getIntent().getBooleanExtra("enable_state_restoration", false) : getCachedEngineId() == null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void updateSystemUiOverlays() {
        if (stillAttachedForEvent("updateSystemUiOverlays")) {
            this.delegate.updateSystemUiOverlays();
        }
    }

    private PatchedFlutterActivityController() {
        this.lifecycle = new androidx.lifecycle.b0(this, true);
    }
}
