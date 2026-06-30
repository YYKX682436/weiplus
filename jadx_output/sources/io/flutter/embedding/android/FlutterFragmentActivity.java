package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class FlutterFragmentActivity extends androidx.fragment.app.FragmentActivity implements io.flutter.embedding.android.FlutterEngineProvider, io.flutter.embedding.android.FlutterEngineConfigurator {
    public static final int FRAGMENT_CONTAINER_ID = android.view.View.generateViewId();
    private static final java.lang.String TAG = "FlutterFragmentActivity";
    private static final java.lang.String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
    private io.flutter.embedding.android.FlutterFragment flutterFragment;

    /* loaded from: classes11.dex */
    public static class CachedEngineIntentBuilder {
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterFragmentActivity> activityClass;
        private final java.lang.String cachedEngineId;
        private boolean destroyEngineWithActivity = false;
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public CachedEngineIntentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterFragmentActivity> cls, java.lang.String str) {
            this.activityClass = cls;
            this.cachedEngineId = str;
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.CachedEngineIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            return new android.content.Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.CachedEngineIntentBuilder destroyEngineWithActivity(boolean z17) {
            this.destroyEngineWithActivity = z17;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public static class NewEngineInGroupIntentBuilder {
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterFragmentActivity> activityClass;
        private final java.lang.String cachedEngineGroupId;
        private java.lang.String dartEntrypoint = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        private java.lang.String initialRoute = "/";
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineInGroupIntentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterFragmentActivity> cls, java.lang.String str) {
            this.activityClass = cls;
            this.cachedEngineGroupId = str;
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.NewEngineInGroupIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            return new android.content.Intent(context, this.activityClass).putExtra("dart_entrypoint", this.dartEntrypoint).putExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, this.initialRoute).putExtra("cached_engine_group_id", this.cachedEngineGroupId).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.NewEngineInGroupIntentBuilder dartEntrypoint(java.lang.String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.NewEngineInGroupIntentBuilder initialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public static class NewEngineIntentBuilder {
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterFragmentActivity> activityClass;
        private java.util.List<java.lang.String> dartEntrypointArgs;
        private java.lang.String initialRoute = "/";
        private java.lang.String backgroundMode = io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;

        public NewEngineIntentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterFragmentActivity> cls) {
            this.activityClass = cls;
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.NewEngineIntentBuilder backgroundMode(io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
            this.backgroundMode = backgroundMode.name();
            return this;
        }

        public android.content.Intent build(android.content.Context context) {
            android.content.Intent putExtra = new android.content.Intent(context, this.activityClass).putExtra(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
            if (this.dartEntrypointArgs != null) {
                putExtra.putExtra("dart_entrypoint_args", new java.util.ArrayList(this.dartEntrypointArgs));
            }
            return putExtra;
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.NewEngineIntentBuilder dartEntrypointArgs(java.util.List<java.lang.String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragmentActivity.NewEngineIntentBuilder initialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }
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

    private android.view.View createFragmentContainer() {
        android.widget.FrameLayout provideRootLayout = provideRootLayout(this);
        provideRootLayout.setId(FRAGMENT_CONTAINER_ID);
        provideRootLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        return provideRootLayout;
    }

    private void ensureFlutterFragmentCreated() {
        if (this.flutterFragment == null) {
            this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        }
        if (this.flutterFragment == null) {
            this.flutterFragment = createFlutterFragment();
            androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.h(FRAGMENT_CONTAINER_ID, this.flutterFragment, TAG_FLUTTER_FRAGMENT, 1);
            beginTransaction.d();
        }
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
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
            io.flutter.Log.e(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    public static io.flutter.embedding.android.FlutterFragmentActivity.CachedEngineIntentBuilder withCachedEngine(java.lang.String str) {
        return new io.flutter.embedding.android.FlutterFragmentActivity.CachedEngineIntentBuilder(io.flutter.embedding.android.FlutterFragmentActivity.class, str);
    }

    public static io.flutter.embedding.android.FlutterFragmentActivity.NewEngineIntentBuilder withNewEngine() {
        return new io.flutter.embedding.android.FlutterFragmentActivity.NewEngineIntentBuilder(io.flutter.embedding.android.FlutterFragmentActivity.class);
    }

    public static io.flutter.embedding.android.FlutterFragmentActivity.NewEngineInGroupIntentBuilder withNewEngineInGroup(java.lang.String str) {
        return new io.flutter.embedding.android.FlutterFragmentActivity.NewEngineInGroupIntentBuilder(io.flutter.embedding.android.FlutterFragmentActivity.class, str);
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        io.flutter.embedding.android.FlutterFragment flutterFragment = this.flutterFragment;
        if (flutterFragment == null || !flutterFragment.isFlutterEngineInjected()) {
            io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
        }
    }

    public io.flutter.embedding.android.FlutterFragment createFlutterFragment() {
        io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = getBackgroundMode();
        io.flutter.embedding.android.RenderMode renderMode = getRenderMode();
        io.flutter.embedding.android.TransparencyMode transparencyMode = backgroundMode == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.TransparencyMode.opaque : io.flutter.embedding.android.TransparencyMode.transparent;
        boolean z17 = renderMode == io.flutter.embedding.android.RenderMode.surface;
        if (getCachedEngineId() != null) {
            io.flutter.Log.v(TAG, "Creating FlutterFragment with cached engine:\nCached engine ID: " + getCachedEngineId() + "\nWill destroy engine when Activity is destroyed: " + shouldDestroyEngineWithHost() + "\nBackground transparency mode: " + backgroundMode + "\nWill attach FlutterEngine to Activity: " + shouldAttachEngineToActivity());
            return io.flutter.embedding.android.FlutterFragment.withCachedEngine(getCachedEngineId()).renderMode(renderMode).transparencyMode(transparencyMode).handleDeeplinking(java.lang.Boolean.valueOf(shouldHandleDeeplinking())).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).destroyEngineWithFragment(shouldDestroyEngineWithHost()).shouldDelayFirstAndroidViewDraw(z17).shouldAutomaticallyHandleOnBackPressed(true).build();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Creating FlutterFragment with new engine:\nCached engine group ID: ");
        sb6.append(getCachedEngineGroupId());
        sb6.append("\nBackground transparency mode: ");
        sb6.append(backgroundMode);
        sb6.append("\nDart entrypoint: ");
        sb6.append(getDartEntrypointFunctionName());
        sb6.append("\nDart entrypoint library uri: ");
        sb6.append(getDartEntrypointLibraryUri() != null ? getDartEntrypointLibraryUri() : "\"\"");
        sb6.append("\nInitial route: ");
        sb6.append(getInitialRoute());
        sb6.append("\nApp bundle path: ");
        sb6.append(getAppBundlePath());
        sb6.append("\nWill attach FlutterEngine to Activity: ");
        sb6.append(shouldAttachEngineToActivity());
        io.flutter.Log.v(TAG, sb6.toString());
        return getCachedEngineGroupId() != null ? io.flutter.embedding.android.FlutterFragment.withNewEngineInGroup(getCachedEngineGroupId()).dartEntrypoint(getDartEntrypointFunctionName()).initialRoute(getInitialRoute()).handleDeeplinking(shouldHandleDeeplinking()).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z17).shouldAutomaticallyHandleOnBackPressed(true).build() : io.flutter.embedding.android.FlutterFragment.withNewEngine().dartEntrypoint(getDartEntrypointFunctionName()).dartLibraryUri(getDartEntrypointLibraryUri()).dartEntrypointArgs(getDartEntrypointArgs()).initialRoute(getInitialRoute()).appBundlePath(getAppBundlePath()).flutterShellArgs(io.flutter.embedding.engine.FlutterShellArgs.fromIntent(getIntent())).handleDeeplinking(java.lang.Boolean.valueOf(shouldHandleDeeplinking())).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(shouldAttachEngineToActivity()).shouldDelayFirstAndroidViewDraw(z17).shouldAutomaticallyHandleOnBackPressed(true).build();
    }

    public java.lang.String getAppBundlePath() {
        java.lang.String dataString;
        if (isDebuggable() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    public io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        return getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    public java.lang.String getCachedEngineGroupId() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    public java.lang.String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public java.util.List<java.lang.String> getDartEntrypointArgs() {
        return (java.util.List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public java.lang.String getDartEntrypointFunctionName() {
        try {
            android.os.Bundle metaData = getMetaData();
            java.lang.String string = metaData != null ? metaData.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        }
    }

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

    public io.flutter.embedding.engine.FlutterEngine getFlutterEngine() {
        return this.flutterFragment.getFlutterEngine();
    }

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

    public android.os.Bundle getMetaData() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return getBackgroundMode() == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.flutterFragment.onActivityResult(i17, i18, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.flutterFragment.onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        this.flutterFragment = retrieveExistingFlutterFragmentIfPossible();
        super.onCreate(bundle);
        configureWindowForTransparency();
        setContentView(createFragmentContainer());
        configureStatusBarForFullscreenFlutterExperience();
        ensureFlutterFragmentCreated();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        this.flutterFragment.onNewIntent(intent);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.flutterFragment.onPostResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        this.flutterFragment.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        this.flutterFragment.onTrimMemory(i17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        this.flutterFragment.onUserLeaveHint();
    }

    @Override // io.flutter.embedding.android.FlutterEngineProvider
    public io.flutter.embedding.engine.FlutterEngine provideFlutterEngine(android.content.Context context) {
        return null;
    }

    public android.widget.FrameLayout provideRootLayout(android.content.Context context) {
        return new android.widget.FrameLayout(context);
    }

    public io.flutter.embedding.android.FlutterFragment retrieveExistingFlutterFragmentIfPossible() {
        return (io.flutter.embedding.android.FlutterFragment) getSupportFragmentManager().findFragmentByTag(TAG_FLUTTER_FRAGMENT);
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }

    public boolean shouldHandleDeeplinking() {
        try {
            return io.flutter.embedding.android.FlutterActivityLaunchConfigs.deepLinkEnabled(getMetaData());
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
