package com.tencent.tinker.loader.app;

/* loaded from: classes13.dex */
public abstract class TinkerApplication extends android.app.Application {
    private static final java.lang.String INTENT_PATCH_EXCEPTION = "intent_patch_exception";
    private static final com.tencent.tinker.loader.app.TinkerApplication[] SELF_HOLDER = {null};
    private static final java.lang.String TINKER_LOADER_METHOD = "tryLoad";
    private final java.lang.String delegateClassName;
    private final java.lang.String loaderClassName;
    protected java.lang.ClassLoader mCurrentClassLoader;
    private android.os.Handler mInlineFence;
    private final int tinkerFlags;
    private final boolean tinkerLoadVerifyFlag;
    protected android.content.Intent tinkerResultIntent;
    private final boolean useDelegateLastClassLoader;
    private final boolean useInterpretModeOnSupported32BitSystem;
    private boolean useSafeMode;

    public TinkerApplication(int i17) {
        this(i17, "com.tencent.tinker.entry.DefaultApplicationLike");
    }

    private android.os.Handler createInlineFence(android.app.Application application, int i17, java.lang.String str, boolean z17, long j17, long j18, android.content.Intent intent) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str, false, this.mCurrentClassLoader);
            java.lang.Class<?> cls2 = java.lang.Long.TYPE;
            java.lang.Object newInstance = cls.getConstructor(android.app.Application.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, cls2, cls2, android.content.Intent.class).newInstance(application, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), intent);
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("com.tencent.tinker.entry.TinkerApplicationInlineFence", false, this.mCurrentClassLoader).getConstructor(java.lang.Class.forName("com.tencent.tinker.entry.ApplicationLike", false, this.mCurrentClassLoader));
            constructor.setAccessible(true);
            return (android.os.Handler) constructor.newInstance(newInstance);
        } catch (java.lang.Throwable th6) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("createInlineFence failed", th6);
        }
    }

    public static com.tencent.tinker.loader.app.TinkerApplication getInstance() {
        com.tencent.tinker.loader.app.TinkerApplication tinkerApplication;
        com.tencent.tinker.loader.app.TinkerApplication[] tinkerApplicationArr = SELF_HOLDER;
        synchronized (tinkerApplicationArr) {
            tinkerApplication = tinkerApplicationArr[0];
            if (tinkerApplication == null) {
                throw new java.lang.IllegalStateException("TinkerApplication is not initialized.");
            }
        }
        return tinkerApplication;
    }

    private void loadTinker() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(this.loaderClassName, false, com.tencent.tinker.loader.app.TinkerApplication.class.getClassLoader());
            this.tinkerResultIntent = (android.content.Intent) cls.getMethod(TINKER_LOADER_METHOD, com.tencent.tinker.loader.app.TinkerApplication.class).invoke(cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), this);
        } catch (java.lang.Throwable th6) {
            android.content.Intent intent = new android.content.Intent();
            this.tinkerResultIntent = intent;
            com.tencent.tinker.loader.shareutil.ShareIntentUtil.setIntentReturnCode(intent, -20);
            this.tinkerResultIntent.putExtra("intent_patch_exception", th6);
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new com.tencent.tinker.loader.TinkerUncaughtHandler(this));
        onBaseContextAttached(context, elapsedRealtime, currentTimeMillis);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        android.content.res.AssetManager assets = super.getAssets();
        android.os.Handler handler = this.mInlineFence;
        return handler == null ? assets : com.tencent.tinker.loader.app.TinkerInlineFenceAction.callGetAssets(handler, assets);
    }

    @Override // android.content.ContextWrapper
    public android.content.Context getBaseContext() {
        android.content.Context baseContext = super.getBaseContext();
        android.os.Handler handler = this.mInlineFence;
        return handler == null ? baseContext : com.tencent.tinker.loader.app.TinkerInlineFenceAction.callGetBaseContext(handler, baseContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        java.lang.ClassLoader classLoader = super.getClassLoader();
        android.os.Handler handler = this.mInlineFence;
        return handler == null ? classLoader : com.tencent.tinker.loader.app.TinkerInlineFenceAction.callGetClassLoader(handler, classLoader);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = super.getResources();
        android.os.Handler handler = this.mInlineFence;
        return handler == null ? resources : com.tencent.tinker.loader.app.TinkerInlineFenceAction.callGetResources(handler, resources);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        android.os.Handler handler = this.mInlineFence;
        return handler == null ? systemService : com.tencent.tinker.loader.app.TinkerInlineFenceAction.callGetSystemService(handler, str, systemService);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = super.getTheme();
        android.os.Handler handler = this.mInlineFence;
        return handler == null ? theme : com.tencent.tinker.loader.app.TinkerInlineFenceAction.callGetTheme(handler, theme);
    }

    public int getTinkerFlags() {
        return this.tinkerFlags;
    }

    public boolean isTinkerLoadVerifyFlag() {
        return this.tinkerLoadVerifyFlag;
    }

    public boolean isUseDelegateLastClassLoader() {
        return this.useDelegateLastClassLoader;
    }

    public boolean isUseInterpretModeOnSupported32BitSystem() {
        return this.useInterpretModeOnSupported32BitSystem;
    }

    public int mzNightModeUseOf() {
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return 1;
        }
        return com.tencent.tinker.loader.app.TinkerInlineFenceAction.callMZNightModeUseOf(handler);
    }

    public void onBaseContextAttached(android.content.Context context, long j17, long j18) {
        try {
            loadTinker();
            this.mCurrentClassLoader = context.getClassLoader();
            android.os.Handler createInlineFence = createInlineFence(this, this.tinkerFlags, this.delegateClassName, this.tinkerLoadVerifyFlag, j17, j18, this.tinkerResultIntent);
            this.mInlineFence = createInlineFence;
            com.tencent.tinker.loader.app.TinkerInlineFenceAction.callOnBaseContextAttached(createInlineFence, context);
            if (this.useSafeMode) {
                com.tencent.tinker.loader.shareutil.ShareTinkerInternals.setSafeModeCount(this, 0);
            }
        } catch (com.tencent.tinker.loader.TinkerRuntimeException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException(th6.getMessage(), th6);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return;
        }
        com.tencent.tinker.loader.app.TinkerInlineFenceAction.callOnConfigurationChanged(handler, configuration);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return;
        }
        com.tencent.tinker.loader.app.TinkerInlineFenceAction.callOnCreate(handler);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return;
        }
        com.tencent.tinker.loader.app.TinkerInlineFenceAction.callOnLowMemory(handler);
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return;
        }
        com.tencent.tinker.loader.app.TinkerInlineFenceAction.callOnTerminate(handler);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        android.os.Handler handler = this.mInlineFence;
        if (handler == null) {
            return;
        }
        com.tencent.tinker.loader.app.TinkerInlineFenceAction.callOnTrimMemory(handler, i17);
    }

    public void setUseSafeMode(boolean z17) {
        this.useSafeMode = z17;
    }

    public TinkerApplication(int i17, java.lang.String str) {
        this(i17, str, com.tencent.tinker.loader.TinkerLoader.class.getName(), false);
    }

    public TinkerApplication(int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        this(i17, str, str2, z17, true, false);
    }

    public TinkerApplication(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this(i17, str, str2, z17, z18, false);
    }

    public TinkerApplication(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19) {
        this.mCurrentClassLoader = null;
        this.mInlineFence = null;
        com.tencent.tinker.loader.app.TinkerApplication[] tinkerApplicationArr = SELF_HOLDER;
        synchronized (tinkerApplicationArr) {
            tinkerApplicationArr[0] = this;
        }
        this.tinkerFlags = i17;
        this.delegateClassName = str;
        this.loaderClassName = str2;
        this.tinkerLoadVerifyFlag = z17;
        this.useDelegateLastClassLoader = z18;
        this.useInterpretModeOnSupported32BitSystem = z19;
    }
}
