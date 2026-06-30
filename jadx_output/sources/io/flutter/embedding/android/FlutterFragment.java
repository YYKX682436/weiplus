package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class FlutterFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, android.content.ComponentCallbacks2, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.DelegateFactory {
    protected static final java.lang.String ARG_APP_BUNDLE_PATH = "app_bundle_path";
    protected static final java.lang.String ARG_CACHED_ENGINE_GROUP_ID = "cached_engine_group_id";
    protected static final java.lang.String ARG_CACHED_ENGINE_ID = "cached_engine_id";
    protected static final java.lang.String ARG_DART_ENTRYPOINT = "dart_entrypoint";
    protected static final java.lang.String ARG_DART_ENTRYPOINT_ARGS = "dart_entrypoint_args";
    protected static final java.lang.String ARG_DART_ENTRYPOINT_URI = "dart_entrypoint_uri";
    protected static final java.lang.String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
    protected static final java.lang.String ARG_ENABLE_STATE_RESTORATION = "enable_state_restoration";
    protected static final java.lang.String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
    protected static final java.lang.String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
    protected static final java.lang.String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
    protected static final java.lang.String ARG_HANDLE_DEEPLINKING = "handle_deeplinking";
    protected static final java.lang.String ARG_INITIAL_ROUTE = "initial_route";
    protected static final java.lang.String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
    protected static final java.lang.String ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED = "should_automatically_handle_on_back_pressed";
    protected static final java.lang.String ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW = "should_delay_first_android_view_draw";
    public static final int FLUTTER_VIEW_ID = android.view.View.generateViewId();
    private static final java.lang.String TAG = "FlutterFragment";
    io.flutter.embedding.android.FlutterActivityAndFragmentDelegate delegate;
    private final android.view.ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new android.view.ViewTreeObserver.OnWindowFocusChangeListener() { // from class: io.flutter.embedding.android.FlutterFragment.1
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z17) {
            if (io.flutter.embedding.android.FlutterFragment.this.stillAttachedForEvent("onWindowFocusChanged")) {
                io.flutter.embedding.android.FlutterFragment.this.delegate.onWindowFocusChanged(z17);
            }
        }
    };
    private io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory = this;
    final androidx.activity.g onBackPressedCallback = new androidx.activity.g(true) { // from class: io.flutter.embedding.android.FlutterFragment.2
        @Override // androidx.activity.g
        public void handleOnBackPressed() {
            io.flutter.embedding.android.FlutterFragment.this.onBackPressed();
        }
    };

    /* loaded from: classes14.dex */
    public @interface ActivityCallThrough {
    }

    /* loaded from: classes15.dex */
    public static class CachedEngineFragmentBuilder {
        private boolean destroyEngineWithFragment;
        private final java.lang.String engineId;
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private io.flutter.embedding.android.RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private io.flutter.embedding.android.TransparencyMode transparencyMode;

        public <T extends io.flutter.embedding.android.FlutterFragment> T build() {
            try {
                T t17 = (T) this.fragmentClass.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                if (t17 != null) {
                    t17.setArguments(createArgs());
                    return t17;
                }
                throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e17);
            }
        }

        public android.os.Bundle createArgs() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_CACHED_ENGINE_ID, this.engineId);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, this.destroyEngineWithFragment);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            io.flutter.embedding.android.RenderMode renderMode = this.renderMode;
            if (renderMode == null) {
                renderMode = io.flutter.embedding.android.RenderMode.surface;
            }
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
            io.flutter.embedding.android.TransparencyMode transparencyMode = this.transparencyMode;
            if (transparencyMode == null) {
                transparencyMode = io.flutter.embedding.android.TransparencyMode.transparent;
            }
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        public io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder destroyEngineWithFragment(boolean z17) {
            this.destroyEngineWithFragment = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder handleDeeplinking(java.lang.Boolean bool) {
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder renderMode(io.flutter.embedding.android.RenderMode renderMode) {
            this.renderMode = renderMode;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder shouldAttachEngineToActivity(boolean z17) {
            this.shouldAttachEngineToActivity = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z17) {
            this.shouldAutomaticallyHandleOnBackPressed = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z17) {
            this.shouldDelayFirstAndroidViewDraw = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder transparencyMode(io.flutter.embedding.android.TransparencyMode transparencyMode) {
            this.transparencyMode = transparencyMode;
            return this;
        }

        private CachedEngineFragmentBuilder(java.lang.String str) {
            this((java.lang.Class<? extends io.flutter.embedding.android.FlutterFragment>) io.flutter.embedding.android.FlutterFragment.class, str);
        }

        public CachedEngineFragmentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterFragment> cls, java.lang.String str) {
            this.destroyEngineWithFragment = false;
            this.handleDeeplinking = false;
            this.renderMode = io.flutter.embedding.android.RenderMode.surface;
            this.transparencyMode = io.flutter.embedding.android.TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
            this.engineId = str;
        }
    }

    /* loaded from: classes15.dex */
    public static class NewEngineInGroupFragmentBuilder {
        private final java.lang.String cachedEngineGroupId;
        private java.lang.String dartEntrypoint;
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private java.lang.String initialRoute;
        private io.flutter.embedding.android.RenderMode renderMode;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private io.flutter.embedding.android.TransparencyMode transparencyMode;

        public NewEngineInGroupFragmentBuilder(java.lang.String str) {
            this(io.flutter.embedding.android.FlutterFragment.class, str);
        }

        public <T extends io.flutter.embedding.android.FlutterFragment> T build() {
            try {
                T t17 = (T) this.fragmentClass.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                if (t17 != null) {
                    t17.setArguments(createArgs());
                    return t17;
                }
                throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e17);
            }
        }

        public android.os.Bundle createArgs() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_CACHED_ENGINE_GROUP_ID, this.cachedEngineGroupId);
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            io.flutter.embedding.android.RenderMode renderMode = this.renderMode;
            if (renderMode == null) {
                renderMode = io.flutter.embedding.android.RenderMode.surface;
            }
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
            io.flutter.embedding.android.TransparencyMode transparencyMode = this.transparencyMode;
            if (transparencyMode == null) {
                transparencyMode = io.flutter.embedding.android.TransparencyMode.transparent;
            }
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder dartEntrypoint(java.lang.String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder handleDeeplinking(boolean z17) {
            this.handleDeeplinking = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder initialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder renderMode(io.flutter.embedding.android.RenderMode renderMode) {
            this.renderMode = renderMode;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder shouldAttachEngineToActivity(boolean z17) {
            this.shouldAttachEngineToActivity = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z17) {
            this.shouldAutomaticallyHandleOnBackPressed = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z17) {
            this.shouldDelayFirstAndroidViewDraw = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder transparencyMode(io.flutter.embedding.android.TransparencyMode transparencyMode) {
            this.transparencyMode = transparencyMode;
            return this;
        }

        public NewEngineInGroupFragmentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterFragment> cls, java.lang.String str) {
            this.dartEntrypoint = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.renderMode = io.flutter.embedding.android.RenderMode.surface;
            this.transparencyMode = io.flutter.embedding.android.TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
            this.cachedEngineGroupId = str;
        }
    }

    public FlutterFragment() {
        setArguments(new android.os.Bundle());
    }

    public static io.flutter.embedding.android.FlutterFragment createDefault() {
        return new io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean stillAttachedForEvent(java.lang.String str) {
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate == null) {
            io.flutter.Log.w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (flutterActivityAndFragmentDelegate.isAttached()) {
            return true;
        }
        io.flutter.Log.w(TAG, "FlutterFragment " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    public static io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder withCachedEngine(java.lang.String str) {
        return new io.flutter.embedding.android.FlutterFragment.CachedEngineFragmentBuilder(str);
    }

    public static io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder withNewEngine() {
        return new io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder();
    }

    public static io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder withNewEngineInGroup(java.lang.String str) {
        return new io.flutter.embedding.android.FlutterFragment.NewEngineInGroupFragmentBuilder(str);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean attachToEngineAutomatically() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        androidx.activity.k activity = getActivity();
        if (activity instanceof io.flutter.embedding.android.FlutterEngineConfigurator) {
            ((io.flutter.embedding.android.FlutterEngineConfigurator) activity).cleanUpFlutterEngine(flutterEngine);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        androidx.activity.k activity = getActivity();
        if (activity instanceof io.flutter.embedding.android.FlutterEngineConfigurator) {
            ((io.flutter.embedding.android.FlutterEngineConfigurator) activity).configureFlutterEngine(flutterEngine);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.DelegateFactory
    public io.flutter.embedding.android.FlutterActivityAndFragmentDelegate createDelegate(io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host host) {
        return new io.flutter.embedding.android.FlutterActivityAndFragmentDelegate(host);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void detachFromFlutterEngine() {
        io.flutter.Log.w(TAG, "FlutterFragment " + this + " connection to the engine " + getFlutterEngine() + " evicted by another attaching activity");
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDestroyView();
            this.delegate.onDetach();
        }
    }

    @Override // androidx.fragment.app.Fragment, ox5.l
    /* renamed from: getActivity */
    public /* bridge */ /* synthetic */ android.app.Activity m42getActivity() {
        return super.getActivity();
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getAppBundlePath() {
        return getArguments().getString(ARG_APP_BUNDLE_PATH);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean getBackCallbackState() {
        return this.onBackPressedCallback.isEnabled();
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getCachedEngineGroupId() {
        return getArguments().getString(ARG_CACHED_ENGINE_GROUP_ID, null);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getCachedEngineId() {
        return getArguments().getString(ARG_CACHED_ENGINE_ID, null);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.util.List<java.lang.String> getDartEntrypointArgs() {
        return getArguments().getStringArrayList(ARG_DART_ENTRYPOINT_ARGS);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getDartEntrypointFunctionName() {
        return getArguments().getString(ARG_DART_ENTRYPOINT, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getDartEntrypointLibraryUri() {
        return getArguments().getString(ARG_DART_ENTRYPOINT_URI);
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
        java.lang.String[] stringArray = getArguments().getStringArray(ARG_FLUTTER_INITIALIZATION_ARGS);
        if (stringArray == null) {
            stringArray = new java.lang.String[0];
        }
        return new io.flutter.embedding.engine.FlutterShellArgs(stringArray);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getInitialRoute() {
        return getArguments().getString(ARG_INITIAL_ROUTE);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return io.flutter.embedding.android.RenderMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_RENDER_MODE, io.flutter.embedding.android.RenderMode.surface.name()));
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.embedding.android.TransparencyMode getTransparencyMode() {
        return io.flutter.embedding.android.TransparencyMode.valueOf(getArguments().getString(ARG_FLUTTERVIEW_TRANSPARENCY_MODE, io.flutter.embedding.android.TransparencyMode.transparent.name()));
    }

    public boolean isFlutterEngineInjected() {
        return this.delegate.isFlutterEngineFromHost();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (stillAttachedForEvent("onActivityResult")) {
            this.delegate.onActivityResult(i17, i18, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate createDelegate = this.delegateFactory.createDelegate(this);
        this.delegate = createDelegate;
        createDelegate.onAttach(context);
        if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
            requireActivity().getOnBackPressedDispatcher().a(this, this.onBackPressedCallback);
            this.onBackPressedCallback.setEnabled(false);
        }
        context.registerComponentCallbacks(this);
    }

    public void onBackPressed() {
        if (stillAttachedForEvent("onBackPressed")) {
            this.delegate.onBackPressed();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.onBackPressedCallback.setEnabled(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        this.delegate.onRestoreInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return this.delegate.onCreateView(layoutInflater, viewGroup, bundle, FLUTTER_VIEW_ID, shouldDelayFirstAndroidViewDraw());
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        if (stillAttachedForEvent("onDestroyView")) {
            this.delegate.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetach();
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.onDetach();
            this.delegate.release();
            this.delegate = null;
        } else {
            io.flutter.Log.v(TAG, "FlutterFragment " + this + " onDetach called after release.");
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterSurfaceViewCreated(io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterTextureViewCreated(io.flutter.embedding.android.FlutterTextureView flutterTextureView) {
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiDisplayed() {
        androidx.activity.k activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) {
            ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) activity).onFlutterUiDisplayed();
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void onFlutterUiNoLongerDisplayed() {
        androidx.activity.k activity = getActivity();
        if (activity instanceof io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) {
            ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) activity).onFlutterUiNoLongerDisplayed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean z17) {
        if (stillAttachedForEvent("onMultiWindowModeChanged")) {
            this.delegate.onMultiWindowModeChanged(z17);
        }
    }

    public void onNewIntent(android.content.Intent intent) {
        if (stillAttachedForEvent("onNewIntent")) {
            this.delegate.onNewIntent(intent);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (stillAttachedForEvent("onPause")) {
            this.delegate.onPause();
        }
    }

    public void onPostResume() {
        if (stillAttachedForEvent("onPostResume")) {
            this.delegate.onPostResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (stillAttachedForEvent("onRequestPermissionsResult")) {
            this.delegate.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (stillAttachedForEvent("onResume")) {
            this.delegate.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (stillAttachedForEvent("onSaveInstanceState")) {
            this.delegate.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (stillAttachedForEvent("onStart")) {
            this.delegate.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (stillAttachedForEvent("onStop")) {
            this.delegate.onStop();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (stillAttachedForEvent("onTrimMemory")) {
            this.delegate.onTrimMemory(i17);
        }
    }

    public void onUserLeaveHint() {
        if (stillAttachedForEvent("onUserLeaveHint")) {
            this.delegate.onUserLeaveHint();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public boolean popSystemNavigator() {
        androidx.fragment.app.FragmentActivity activity;
        if (!getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false) || (activity = getActivity()) == null) {
            return false;
        }
        boolean isEnabled = this.onBackPressedCallback.isEnabled();
        if (isEnabled) {
            this.onBackPressedCallback.setEnabled(false);
        }
        activity.getOnBackPressedDispatcher().c();
        if (isEnabled) {
            this.onBackPressedCallback.setEnabled(true);
        }
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineProvider
    public io.flutter.embedding.engine.FlutterEngine provideFlutterEngine(android.content.Context context) {
        androidx.activity.k activity = getActivity();
        if (!(activity instanceof io.flutter.embedding.android.FlutterEngineProvider)) {
            return null;
        }
        io.flutter.Log.v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
        return ((io.flutter.embedding.android.FlutterEngineProvider) activity).provideFlutterEngine(getContext());
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (activity != null) {
            return new io.flutter.plugin.platform.PlatformPlugin(getActivity(), flutterEngine.getPlatformChannel(), this);
        }
        return null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.plugin.view.SensitiveContentPlugin provideSensitiveContentPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (activity != null) {
            return new io.flutter.plugin.view.SensitiveContentPlugin(FLUTTER_VIEW_ID, activity, flutterEngine.getSensitiveContentChannel());
        }
        return null;
    }

    public void setDelegateFactory(io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.DelegateFactory delegateFactory) {
        this.delegateFactory = delegateFactory;
        this.delegate = delegateFactory.createDelegate(this);
    }

    @Override // io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate
    public void setFrameworkHandlesBack(boolean z17) {
        if (getArguments().getBoolean(ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, false)) {
            this.onBackPressedCallback.setEnabled(z17);
        }
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldAttachEngineToActivity() {
        return getArguments().getBoolean(ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY);
    }

    public boolean shouldDelayFirstAndroidViewDraw() {
        return getArguments().getBoolean(ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDestroyEngineWithHost() {
        boolean z17 = getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, false);
        return (getCachedEngineId() != null || this.delegate.isFlutterEngineFromHost()) ? z17 : getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDispatchAppLifecycleState() {
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldHandleDeeplinking() {
        return getArguments().getBoolean(ARG_HANDLE_DEEPLINKING);
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldRestoreAndSaveState() {
        return getArguments().containsKey(ARG_ENABLE_STATE_RESTORATION) ? getArguments().getBoolean(ARG_ENABLE_STATE_RESTORATION) : getCachedEngineId() == null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public void updateSystemUiOverlays() {
        io.flutter.embedding.android.FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate = this.delegate;
        if (flutterActivityAndFragmentDelegate != null) {
            flutterActivityAndFragmentDelegate.updateSystemUiOverlays();
        }
    }

    /* loaded from: classes15.dex */
    public static class NewEngineFragmentBuilder {
        private java.lang.String appBundlePath;
        private java.lang.String dartEntrypoint;
        private java.util.List<java.lang.String> dartEntrypointArgs;
        private java.lang.String dartLibraryUri;
        private final java.lang.Class<? extends io.flutter.embedding.android.FlutterFragment> fragmentClass;
        private boolean handleDeeplinking;
        private java.lang.String initialRoute;
        private io.flutter.embedding.android.RenderMode renderMode;
        private io.flutter.embedding.engine.FlutterShellArgs shellArgs;
        private boolean shouldAttachEngineToActivity;
        private boolean shouldAutomaticallyHandleOnBackPressed;
        private boolean shouldDelayFirstAndroidViewDraw;
        private io.flutter.embedding.android.TransparencyMode transparencyMode;

        public NewEngineFragmentBuilder() {
            this.dartEntrypoint = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
            this.dartLibraryUri = null;
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = io.flutter.embedding.android.RenderMode.surface;
            this.transparencyMode = io.flutter.embedding.android.TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = io.flutter.embedding.android.FlutterFragment.class;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder appBundlePath(java.lang.String str) {
            this.appBundlePath = str;
            return this;
        }

        public <T extends io.flutter.embedding.android.FlutterFragment> T build() {
            try {
                T t17 = (T) this.fragmentClass.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                if (t17 != null) {
                    t17.setArguments(createArgs());
                    return t17;
                }
                throw new java.lang.RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.fragmentClass.getCanonicalName() + ") does not match the expected return type.");
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException("Could not instantiate FlutterFragment subclass (" + this.fragmentClass.getName() + ")", e17);
            }
        }

        public android.os.Bundle createArgs() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_HANDLE_DEEPLINKING, this.handleDeeplinking);
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_APP_BUNDLE_PATH, this.appBundlePath);
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_DART_ENTRYPOINT_URI, this.dartLibraryUri);
            bundle.putStringArrayList(io.flutter.embedding.android.FlutterFragment.ARG_DART_ENTRYPOINT_ARGS, this.dartEntrypointArgs != null ? new java.util.ArrayList<>(this.dartEntrypointArgs) : null);
            io.flutter.embedding.engine.FlutterShellArgs flutterShellArgs = this.shellArgs;
            if (flutterShellArgs != null) {
                bundle.putStringArray(io.flutter.embedding.android.FlutterFragment.ARG_FLUTTER_INITIALIZATION_ARGS, flutterShellArgs.toArray());
            }
            io.flutter.embedding.android.RenderMode renderMode = this.renderMode;
            if (renderMode == null) {
                renderMode = io.flutter.embedding.android.RenderMode.surface;
            }
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
            io.flutter.embedding.android.TransparencyMode transparencyMode = this.transparencyMode;
            if (transparencyMode == null) {
                transparencyMode = io.flutter.embedding.android.TransparencyMode.transparent;
            }
            bundle.putString(io.flutter.embedding.android.FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_AUTOMATICALLY_HANDLE_ON_BACK_PRESSED, this.shouldAutomaticallyHandleOnBackPressed);
            bundle.putBoolean(io.flutter.embedding.android.FlutterFragment.ARG_SHOULD_DELAY_FIRST_ANDROID_VIEW_DRAW, this.shouldDelayFirstAndroidViewDraw);
            return bundle;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder dartEntrypoint(java.lang.String str) {
            this.dartEntrypoint = str;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder dartEntrypointArgs(java.util.List<java.lang.String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder dartLibraryUri(java.lang.String str) {
            this.dartLibraryUri = str;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder flutterShellArgs(io.flutter.embedding.engine.FlutterShellArgs flutterShellArgs) {
            this.shellArgs = flutterShellArgs;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder handleDeeplinking(java.lang.Boolean bool) {
            this.handleDeeplinking = bool.booleanValue();
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder initialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder renderMode(io.flutter.embedding.android.RenderMode renderMode) {
            this.renderMode = renderMode;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder shouldAttachEngineToActivity(boolean z17) {
            this.shouldAttachEngineToActivity = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder shouldAutomaticallyHandleOnBackPressed(boolean z17) {
            this.shouldAutomaticallyHandleOnBackPressed = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder shouldDelayFirstAndroidViewDraw(boolean z17) {
            this.shouldDelayFirstAndroidViewDraw = z17;
            return this;
        }

        public io.flutter.embedding.android.FlutterFragment.NewEngineFragmentBuilder transparencyMode(io.flutter.embedding.android.TransparencyMode transparencyMode) {
            this.transparencyMode = transparencyMode;
            return this;
        }

        public NewEngineFragmentBuilder(java.lang.Class<? extends io.flutter.embedding.android.FlutterFragment> cls) {
            this.dartEntrypoint = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
            this.dartLibraryUri = null;
            this.initialRoute = "/";
            this.handleDeeplinking = false;
            this.appBundlePath = null;
            this.shellArgs = null;
            this.renderMode = io.flutter.embedding.android.RenderMode.surface;
            this.transparencyMode = io.flutter.embedding.android.TransparencyMode.transparent;
            this.shouldAttachEngineToActivity = true;
            this.shouldAutomaticallyHandleOnBackPressed = false;
            this.shouldDelayFirstAndroidViewDraw = false;
            this.fragmentClass = cls;
        }
    }
}
