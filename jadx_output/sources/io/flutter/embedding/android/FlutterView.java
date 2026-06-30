package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class FlutterView extends android.widget.FrameLayout implements io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate, io.flutter.embedding.android.KeyboardManager.ViewDelegate {
    private static final java.lang.String GBOARD_PACKAGE_NAME = "com.google.android.inputmethod.latin";
    private static final java.lang.String TAG = "FlutterView";
    private io.flutter.view.AccessibilityBridge accessibilityBridge;
    private io.flutter.embedding.android.AndroidTouchProcessor androidTouchProcessor;
    private io.flutter.embedding.android.FlutterViewDelegate delegate;
    private boolean enableSwitchSurface;
    private io.flutter.embedding.engine.FlutterEngine flutterEngine;
    private final java.util.Set<io.flutter.embedding.android.FlutterView.FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;
    private io.flutter.embedding.android.FlutterImageView flutterImageView;
    private io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView;
    private io.flutter.embedding.android.FlutterTextureView flutterTextureView;
    private final io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener;
    private final java.util.Set<io.flutter.embedding.engine.renderer.FlutterUiDisplayListener> flutterUiDisplayListeners;
    io.flutter.embedding.android.FlutterView.FontScaleDelegate fontScaleDelegate;
    private boolean insetsByNative;
    private boolean isFlutterUiDisplayed;
    private boolean isInSwapSurface;
    private io.flutter.embedding.android.KeyboardManager keyboardManager;
    private io.flutter.plugin.localization.LocalizationPlugin localizationPlugin;
    private io.flutter.embedding.android.FlutterDrawInfoView mFlutterDrawInfoView;
    private io.flutter.plugin.editing.WxKeyboardAction mWxKeyboardAction;
    private io.flutter.plugin.mouse.MouseCursorPlugin mouseCursorPlugin;
    private final io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private io.flutter.embedding.engine.renderer.RenderSurface previousRenderSurface;
    io.flutter.embedding.engine.renderer.RenderSurface renderSurface;
    private io.flutter.plugin.editing.ScribePlugin scribePlugin;
    private io.flutter.plugin.editing.SpellCheckPlugin spellCheckPlugin;
    private io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface;
    private final android.database.ContentObserver systemSettingsObserver;
    private io.flutter.plugin.editing.TextInputPlugin textInputPlugin;
    private android.view.textservice.TextServicesManager textServicesManager;
    private final io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics;
    private m3.a windowInfoListener;
    private io.flutter.embedding.android.WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;

    /* loaded from: classes15.dex */
    public interface FlutterEngineAttachmentListener {
        void onFlutterEngineAttachedToFlutterView(io.flutter.embedding.engine.FlutterEngine flutterEngine);

        void onFlutterEngineDetachedFromFlutterView();
    }

    /* loaded from: classes11.dex */
    public interface FontScaleDelegate {
        float getFontScale();
    }

    /* loaded from: classes15.dex */
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(android.content.Context context) {
        this(context, (android.util.AttributeSet) null, new io.flutter.embedding.android.FlutterSurfaceView(context));
    }

    private android.view.View findViewByAccessibilityIdRootedAtCurrentView(int i17, android.view.View view) {
        int i18;
        java.lang.reflect.Method declaredMethod;
        try {
            i18 = 0;
            declaredMethod = android.view.View.class.getDeclaredMethod("getAccessibilityViewId", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, new java.lang.Object[0]).equals(java.lang.Integer.valueOf(i17))) {
            return view;
        }
        if (view instanceof android.view.ViewGroup) {
            while (true) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                if (i18 >= viewGroup.getChildCount()) {
                    break;
                }
                android.view.View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i17, viewGroup.getChildAt(i18));
                if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                    return findViewByAccessibilityIdRootedAtCurrentView;
                }
                i18++;
            }
        }
        return null;
    }

    private int guessBottomKeyboardInset(android.view.WindowInsets windowInsets) {
        int height = getRootView().getHeight();
        if (height == 0 || windowInsets.getSystemWindowInsetBottom() < height * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        io.flutter.Log.v(TAG, "Initializing FlutterView");
        io.flutter.embedding.android.FlutterDrawInfoView flutterDrawInfoView = new io.flutter.embedding.android.FlutterDrawInfoView(getContext());
        this.mFlutterDrawInfoView = flutterDrawInfoView;
        addView(flutterDrawInfoView);
        if (this.flutterSurfaceView != null) {
            io.flutter.Log.v(TAG, "Internally using a FlutterSurfaceView.");
            addView(this.flutterSurfaceView);
        } else if (this.flutterTextureView != null) {
            io.flutter.Log.v(TAG, "Internally using a FlutterTextureView.");
            addView(this.flutterTextureView);
        } else {
            io.flutter.Log.v(TAG, "Internally using a FlutterImageView.");
            addView(this.flutterImageView);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseImageView() {
        io.flutter.embedding.android.FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWillNotDraw(boolean z17, boolean z18) {
        boolean z19 = false;
        if (this.flutterEngine.getRenderer().isSoftwareRenderingEnabled()) {
            setWillNotDraw(false);
            return;
        }
        if (!z17 && !z18) {
            z19 = true;
        }
        setWillNotDraw(z19);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            io.flutter.Log.w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.devicePixelRatio = getResources().getDisplayMetrics().density;
        this.viewportMetrics.physicalTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
    }

    private final void updateViewInsets(android.graphics.Insets insets) {
        io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        int i17 = viewportMetrics.viewInsetTop;
        int i18 = insets.top;
        if (i17 < i18) {
            viewportMetrics.viewInsetTop = i18;
        }
        int i19 = viewportMetrics.viewInsetLeft;
        int i27 = insets.left;
        if (i19 < i27) {
            viewportMetrics.viewInsetLeft = i27;
        }
        int i28 = viewportMetrics.viewInsetBottom;
        int i29 = insets.bottom;
        if (i28 < i29) {
            viewportMetrics.viewInsetBottom = i29;
        }
        int i37 = viewportMetrics.viewInsetRight;
        int i38 = insets.right;
        if (i37 < i38) {
            viewportMetrics.viewInsetRight = i38;
        }
    }

    public boolean acquireLatestImageViewFrame() {
        io.flutter.embedding.android.FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            return flutterImageView.acquireLatestImage();
        }
        return false;
    }

    public void addFlutterEngineAttachmentListener(io.flutter.embedding.android.FlutterView.FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.add(flutterEngineAttachmentListener);
    }

    public void addOnFirstFrameRenderedListener(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void attachOverlaySurfaceToRender(io.flutter.embedding.android.FlutterImageView flutterImageView) {
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public void attachToFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        io.flutter.Log.i(TAG, "Attaching to a FlutterEngine: " + flutterEngine);
        if (isAttachedToFlutterEngine()) {
            if (flutterEngine == this.flutterEngine) {
                io.flutter.Log.i(TAG, "Already attached to this engine. Doing nothing.");
                return;
            } else {
                io.flutter.Log.v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = flutterEngine;
        io.flutter.embedding.android.FlutterDrawInfoView flutterDrawInfoView = this.mFlutterDrawInfoView;
        if (flutterDrawInfoView != null) {
            flutterDrawInfoView.bindFlutterEngine(flutterEngine);
        }
        io.flutter.embedding.engine.renderer.FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = renderer.isDisplayingFlutterUi();
        this.renderSurface.attachToRenderer(renderer);
        renderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        this.mouseCursorPlugin = new io.flutter.plugin.mouse.MouseCursorPlugin(this, this.flutterEngine.getMouseCursorChannel());
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = new io.flutter.plugin.editing.TextInputPlugin(this, this.flutterEngine.getTextInputChannel(), this.flutterEngine.getScribeChannel(), this.flutterEngine.getPlatformViewsController(), this.flutterEngine.getPlatformViewsController2());
        this.textInputPlugin = textInputPlugin;
        textInputPlugin.setWxKeyboardAction(new io.flutter.plugin.editing.WxKeyboardAction() { // from class: io.flutter.embedding.android.FlutterView.4
            @Override // io.flutter.plugin.editing.WxKeyboardAction
            public boolean hideKeyboard() {
                if (io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction != null) {
                    return io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction.hideKeyboard();
                }
                return false;
            }

            @Override // io.flutter.plugin.editing.WxKeyboardAction
            public boolean showKeyboard(android.view.View view, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration wxInputConfiguration) {
                if (io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction != null) {
                    return io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction.showKeyboard(view, wxInputConfiguration);
                }
                return false;
            }
        });
        try {
            android.view.textservice.TextServicesManager textServicesManager = (android.view.textservice.TextServicesManager) getContext().getSystemService("textservices");
            this.textServicesManager = textServicesManager;
            this.spellCheckPlugin = new io.flutter.plugin.editing.SpellCheckPlugin(textServicesManager, this.flutterEngine.getSpellCheckChannel());
        } catch (java.lang.Exception unused) {
            io.flutter.Log.e(TAG, "TextServicesManager not supported by device, spell check disabled.");
        }
        this.scribePlugin = new io.flutter.plugin.editing.ScribePlugin(this, this.textInputPlugin.getInputMethodManager(), this.flutterEngine.getScribeChannel());
        this.localizationPlugin = this.flutterEngine.getLocalizationPlugin();
        this.textInputPlugin.setWxKeyboardAction(new io.flutter.plugin.editing.WxKeyboardAction() { // from class: io.flutter.embedding.android.FlutterView.5
            @Override // io.flutter.plugin.editing.WxKeyboardAction
            public boolean hideKeyboard() {
                if (io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction != null) {
                    return io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction.hideKeyboard();
                }
                return false;
            }

            @Override // io.flutter.plugin.editing.WxKeyboardAction
            public boolean showKeyboard(android.view.View view, io.flutter.embedding.engine.systemchannels.TextInputChannel.WxInputConfiguration wxInputConfiguration) {
                if (io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction != null) {
                    return io.flutter.embedding.android.FlutterView.this.mWxKeyboardAction.showKeyboard(view, wxInputConfiguration);
                }
                return false;
            }
        });
        this.keyboardManager = new io.flutter.embedding.android.KeyboardManager(this);
        this.androidTouchProcessor = new io.flutter.embedding.android.AndroidTouchProcessor(this.flutterEngine.getRenderer(), false);
        io.flutter.view.AccessibilityBridge accessibilityBridge = new io.flutter.view.AccessibilityBridge(this, flutterEngine.getAccessibilityChannel(), (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), new io.flutter.plugin.platform.PlatformViewsControllerDelegator(this.flutterEngine.getPlatformViewsController(), this.flutterEngine.getPlatformViewsController2()));
        this.accessibilityBridge = accessibilityBridge;
        accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
        this.flutterEngine.getPlatformViewsController().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.flutterEngine.getPlatformViewsController2().attachAccessibilityBridge(this.accessibilityBridge);
        this.flutterEngine.getPlatformViewsController2().attachToFlutterRenderer(this.flutterEngine.getRenderer());
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        sendUserSettingsToFlutter();
        getContext().getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("show_password"), false, this.systemSettingsObserver);
        sendViewportMetricsToFlutter();
        flutterEngine.getPlatformViewsController().attachToView(this);
        flutterEngine.getPlatformViewsController2().attachToView(this);
        java.util.Iterator<io.flutter.embedding.android.FlutterView.FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineAttachedToFlutterView(flutterEngine);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @Override // android.view.View
    public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> sparseArray) {
        this.textInputPlugin.autofill(sparseArray);
    }

    public io.flutter.embedding.android.FlutterView.ZeroSides calculateShouldZeroSides() {
        android.content.Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((android.hardware.display.DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return io.flutter.embedding.android.FlutterView.ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return io.flutter.embedding.android.FlutterView.ZeroSides.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return io.flutter.embedding.android.FlutterView.ZeroSides.BOTH;
            }
        }
        return io.flutter.embedding.android.FlutterView.ZeroSides.NONE;
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        io.flutter.embedding.android.FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView == null) {
            io.flutter.embedding.android.FlutterImageView createImageView = createImageView();
            this.flutterImageView = createImageView;
            addView(createImageView);
        } else {
            flutterImageView.resizeIfNeeded(getWidth(), getHeight());
        }
        this.previousRenderSurface = this.renderSurface;
        io.flutter.embedding.android.FlutterImageView flutterImageView2 = this.flutterImageView;
        this.renderSurface = flutterImageView2;
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView2.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public io.flutter.embedding.android.FlutterImageView createImageView() {
        return new io.flutter.embedding.android.FlutterImageView(getContext(), getWidth(), getHeight(), io.flutter.embedding.android.FlutterImageView.SurfaceKind.background);
    }

    public io.flutter.embedding.android.WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo() {
        try {
            return new io.flutter.embedding.android.WindowInfoRepositoryCallbackAdapterWrapper(new androidx.window.java.layout.WindowInfoTrackerCallbackAdapter(androidx.window.layout.WindowInfoTracker.INSTANCE.getOrCreate(getContext())));
        } catch (java.lang.NoClassDefFoundError unused) {
            return null;
        }
    }

    public void detachFromFlutterEngine() {
        io.flutter.Log.i(TAG, "Detaching from a FlutterEngine: " + this.flutterEngine);
        if (!isAttachedToFlutterEngine()) {
            io.flutter.Log.v(TAG, "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        java.util.Iterator<io.flutter.embedding.android.FlutterView.FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineDetachedFromFlutterView();
        }
        getContext().getContentResolver().unregisterContentObserver(this.systemSettingsObserver);
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController2().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
        this.flutterEngine.getPlatformViewsController2().detachAccessibilityBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        io.flutter.plugin.editing.ScribePlugin scribePlugin = this.scribePlugin;
        if (scribePlugin != null) {
            scribePlugin.destroy();
            this.scribePlugin = null;
        }
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        this.textInputPlugin.destroy();
        this.keyboardManager.destroy();
        io.flutter.plugin.editing.SpellCheckPlugin spellCheckPlugin = this.spellCheckPlugin;
        if (spellCheckPlugin != null) {
            spellCheckPlugin.destroy();
        }
        io.flutter.plugin.mouse.MouseCursorPlugin mouseCursorPlugin = this.mouseCursorPlugin;
        if (mouseCursorPlugin != null) {
            mouseCursorPlugin.destroy();
        }
        io.flutter.embedding.engine.renderer.FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        renderer.stopRenderingToSurface(this.renderSurface.getRenderSurface());
        renderer.setSemanticsEnabled(false);
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface != null && this.renderSurface == this.flutterImageView) {
            this.renderSurface = renderSurface;
        }
        this.renderSurface.detachFromRenderer();
        releaseImageView();
        this.previousRenderSurface = null;
        this.flutterEngine = null;
        io.flutter.embedding.android.FlutterDrawInfoView flutterDrawInfoView = this.mFlutterDrawInfoView;
        if (flutterDrawInfoView != null) {
            flutterDrawInfoView.bindFlutterEngine(null);
        }
        this.keyboardManager = null;
    }

    public void detachPlatformBridges() {
        io.flutter.Log.i(TAG, "Detaching all platform bridges from FlutterEngine: " + this.flutterEngine);
        java.util.Iterator<io.flutter.embedding.android.FlutterView.FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineDetachedFromFlutterView();
        }
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        this.textInputPlugin.getInputMethodManager().restartInput(this);
        this.textInputPlugin.destroy();
        this.keyboardManager.destroy();
        io.flutter.plugin.mouse.MouseCursorPlugin mouseCursorPlugin = this.mouseCursorPlugin;
        if (mouseCursorPlugin != null) {
            mouseCursorPlugin.destroy();
        }
        io.flutter.embedding.engine.renderer.FlutterRenderer renderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        renderer.setSemanticsEnabled(false);
        io.flutter.embedding.android.FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
        this.previousRenderSurface = null;
        this.flutterEngine = null;
        this.keyboardManager = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttachedToFlutterEngine() && this.keyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public android.view.View findViewByAccessibilityIdTraversal(int i17) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return findViewByAccessibilityIdRootedAtCurrentView(i17, this);
        }
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (android.view.View) declaredMethod.invoke(this, java.lang.Integer.valueOf(i17));
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge == null || !accessibilityBridge.isAccessibilityEnabled()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    public io.flutter.embedding.engine.FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    public io.flutter.embedding.engine.renderer.RenderSurface getAttachedRenderSurface() {
        return this.renderSurface;
    }

    public io.flutter.embedding.engine.renderer.FlutterRenderer getAttachedRenderer() {
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.renderSurface;
        if (renderSurface != null) {
            return renderSurface.getAttachedRenderer();
        }
        return null;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public io.flutter.plugin.common.BinaryMessenger getBinaryMessenger() {
        return this.flutterEngine.getDartExecutor();
    }

    public io.flutter.embedding.android.FlutterImageView getCurrentImageSurface() {
        return this.flutterImageView;
    }

    @Override // io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate
    public android.view.PointerIcon getSystemPointerIcon(int i17) {
        return android.view.PointerIcon.getSystemIcon(getContext(), i17);
    }

    public io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics getViewportMetrics() {
        return this.viewportMetrics;
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public boolean isAttachedToFlutterEngine() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null && flutterEngine.getRenderer() == this.renderSurface.getAttachedRenderer();
    }

    public boolean isInSwapSurface() {
        return this.isInSwapSurface;
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        android.view.DisplayCutout displayCutout;
        android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 == 29) {
            android.graphics.Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
            viewportMetrics.systemGestureInsetTop = systemGestureInsets.top;
            viewportMetrics.systemGestureInsetRight = systemGestureInsets.right;
            viewportMetrics.systemGestureInsetBottom = systemGestureInsets.bottom;
            viewportMetrics.systemGestureInsetLeft = systemGestureInsets.left;
        }
        boolean z17 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z18 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i17 >= 30) {
            android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars());
            io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
            viewportMetrics2.viewPaddingTop = insets.top;
            viewportMetrics2.viewPaddingRight = insets.right;
            viewportMetrics2.viewPaddingBottom = insets.bottom;
            viewportMetrics2.viewPaddingLeft = insets.left;
            android.graphics.Insets insets2 = windowInsets.getInsets(android.view.WindowInsets.Type.ime());
            if (this.insetsByNative) {
                updateViewInsets(insets2);
            } else {
                io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
                viewportMetrics3.viewInsetTop = insets2.top;
                viewportMetrics3.viewInsetRight = insets2.right;
                viewportMetrics3.viewInsetBottom = insets2.bottom;
                viewportMetrics3.viewInsetLeft = insets2.left;
            }
            android.graphics.Insets insets3 = windowInsets.getInsets(android.view.WindowInsets.Type.systemGestures());
            io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
            viewportMetrics4.systemGestureInsetTop = insets3.top;
            viewportMetrics4.systemGestureInsetRight = insets3.right;
            viewportMetrics4.systemGestureInsetBottom = insets3.bottom;
            viewportMetrics4.systemGestureInsetLeft = insets3.left;
            android.view.DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                android.graphics.Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics5 = this.viewportMetrics;
                viewportMetrics5.viewPaddingTop = java.lang.Math.max(java.lang.Math.max(viewportMetrics5.viewPaddingTop, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics6 = this.viewportMetrics;
                viewportMetrics6.viewPaddingRight = java.lang.Math.max(java.lang.Math.max(viewportMetrics6.viewPaddingRight, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics7 = this.viewportMetrics;
                viewportMetrics7.viewPaddingBottom = java.lang.Math.max(java.lang.Math.max(viewportMetrics7.viewPaddingBottom, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics8 = this.viewportMetrics;
                viewportMetrics8.viewPaddingLeft = java.lang.Math.max(java.lang.Math.max(viewportMetrics8.viewPaddingLeft, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
        } else {
            io.flutter.embedding.android.FlutterView.ZeroSides zeroSides = io.flutter.embedding.android.FlutterView.ZeroSides.NONE;
            if (!z18) {
                zeroSides = calculateShouldZeroSides();
            }
            this.viewportMetrics.viewPaddingTop = z17 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.viewportMetrics.viewPaddingRight = (zeroSides == io.flutter.embedding.android.FlutterView.ZeroSides.RIGHT || zeroSides == io.flutter.embedding.android.FlutterView.ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.viewportMetrics.viewPaddingBottom = (z18 && guessBottomKeyboardInset(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.viewportMetrics.viewPaddingLeft = (zeroSides == io.flutter.embedding.android.FlutterView.ZeroSides.LEFT || zeroSides == io.flutter.embedding.android.FlutterView.ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            if (this.insetsByNative) {
                updateViewInsets(android.graphics.Insets.of(0, 0, 0, guessBottomKeyboardInset(windowInsets)));
            } else {
                io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics9 = this.viewportMetrics;
                viewportMetrics9.viewInsetTop = 0;
                viewportMetrics9.viewInsetRight = 0;
                viewportMetrics9.viewInsetBottom = guessBottomKeyboardInset(windowInsets);
                this.viewportMetrics.viewInsetLeft = 0;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i17 >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (android.graphics.Rect rect : displayCutout.getBoundingRects()) {
                io.flutter.Log.v(TAG, "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature(rect, io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.CUTOUT, io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        this.viewportMetrics.setDisplayCutouts(arrayList);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.delegate.growViewportMetricsToCaptionBar(getContext(), this.viewportMetrics);
        }
        io.flutter.Log.v(TAG, "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.viewportMetrics.viewPaddingTop + ", Left: " + this.viewportMetrics.viewPaddingLeft + ", Right: " + this.viewportMetrics.viewPaddingRight + "\nKeyboard insets: Bottom: " + this.viewportMetrics.viewInsetBottom + ", Left: " + this.viewportMetrics.viewInsetLeft + ", Right: " + this.viewportMetrics.viewInsetRight + "System Gesture Insets - Left: " + this.viewportMetrics.systemGestureInsetLeft + ", Top: " + this.viewportMetrics.systemGestureInsetTop + ", Right: " + this.viewportMetrics.systemGestureInsetRight + ", Bottom: " + this.viewportMetrics.viewInsetBottom);
        sendViewportMetricsToFlutter();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.windowInfoRepo = createWindowInfoRepo();
        android.app.Activity activity = io.flutter.util.ViewUtils.getActivity(getContext());
        io.flutter.embedding.android.WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper == null || activity == null) {
            return;
        }
        this.windowInfoListener = new m3.a() { // from class: io.flutter.embedding.android.FlutterView$$a
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                io.flutter.embedding.android.FlutterView.this.setWindowInfoListenerDisplayFeatures((androidx.window.layout.WindowLayoutInfo) obj);
            }
        };
        windowInfoRepositoryCallbackAdapterWrapper.addWindowLayoutInfoListener(activity, b3.l.getMainExecutor(getContext()), this.windowInfoListener);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            io.flutter.Log.v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            this.localizationPlugin.sendLocalesToFlutter(configuration);
            sendUserSettingsToFlutter();
            io.flutter.util.ViewUtils.calculateMaximumDisplayMetrics(getContext(), this.flutterEngine);
        }
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return !isAttachedToFlutterEngine() ? super.onCreateInputConnection(editorInfo) : this.textInputPlugin.createInputConnection(this, this.keyboardManager, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m3.a aVar;
        io.flutter.embedding.android.WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper != null && (aVar = this.windowInfoListener) != null) {
            windowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(aVar);
        }
        this.windowInfoListener = null;
        this.windowInfoRepo = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i17) {
        super.onProvideAutofillVirtualStructure(viewStructure, i17);
        this.textInputPlugin.onProvideAutofillVirtualStructure(viewStructure, i17);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        io.flutter.Log.v(TAG, "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i19 + " x " + i27 + ", it is now " + i17 + " x " + i18);
        io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.width = i17;
        viewportMetrics.height = i18;
        sendViewportMetricsToFlutter();
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public boolean onTextInputKeyEvent(android.view.KeyEvent keyEvent) {
        return this.textInputPlugin.handleKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public void redispatch(android.view.KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void removeFlutterEngineAttachmentListener(io.flutter.embedding.android.FlutterView.FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.remove(flutterEngineAttachmentListener);
    }

    public void removeOnFirstFrameRenderedListener(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void revertImageView(final java.lang.Runnable runnable) {
        if (this.flutterImageView == null) {
            io.flutter.Log.v(TAG, "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.previousRenderSurface;
        if (renderSurface == null) {
            io.flutter.Log.v(TAG, "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.renderSurface = renderSurface;
        this.previousRenderSurface = null;
        final io.flutter.embedding.engine.renderer.FlutterRenderer renderer = this.flutterEngine.getRenderer();
        if (this.flutterEngine == null || renderer == null) {
            this.flutterImageView.detachFromRenderer();
            releaseImageView();
            runnable.run();
        } else {
            this.renderSurface.resume();
            final boolean isDisplayingFlutterUi = renderer.isDisplayingFlutterUi();
            renderer.addIsDisplayingFlutterUiListener(new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.6
                private boolean isFirstCallDisplayed = true;

                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiDisplayed() {
                    if (isDisplayingFlutterUi && this.isFirstCallDisplayed) {
                        this.isFirstCallDisplayed = false;
                        return;
                    }
                    renderer.removeIsDisplayingFlutterUiListener(this);
                    runnable.run();
                    io.flutter.embedding.android.FlutterView flutterView = io.flutter.embedding.android.FlutterView.this;
                    if ((flutterView.renderSurface instanceof io.flutter.embedding.android.FlutterImageView) || flutterView.flutterImageView == null) {
                        return;
                    }
                    io.flutter.embedding.android.FlutterView.this.flutterImageView.detachFromRenderer();
                    io.flutter.embedding.android.FlutterView.this.releaseImageView();
                }

                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiNoLongerDisplayed() {
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r1 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendUserSettingsToFlutter() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L14
            r0 = r3
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L1a
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.dark
            goto L1c
        L1a:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.light
        L1c:
            android.view.textservice.TextServicesManager r1 = r6.textServicesManager
            if (r1 == 0) goto L55
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L53
            java.util.List r1 = r1.getEnabledSpellCheckerInfos()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r1.next()
            android.view.textservice.SpellCheckerInfo r4 = (android.view.textservice.SpellCheckerInfo) r4
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.google.android.inputmethod.latin"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2e
            r1 = r3
            goto L49
        L48:
            r1 = r2
        L49:
            android.view.textservice.TextServicesManager r4 = r6.textServicesManager
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L55
            if (r1 == 0) goto L55
        L53:
            r1 = r3
            goto L56
        L55:
            r1 = r2
        L56:
            io.flutter.embedding.android.FlutterView$FontScaleDelegate r4 = r6.fontScaleDelegate
            if (r4 == 0) goto L5f
            float r4 = r4.getFontScale()
            goto L69
        L5f:
            android.content.res.Resources r4 = r6.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            float r4 = r4.fontScale
        L69:
            io.flutter.embedding.engine.FlutterEngine r5 = r6.flutterEngine
            io.flutter.embedding.engine.systemchannels.SettingsChannel r5 = r5.getSettingsChannel()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r5 = r5.startMessage()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r5.setTextScaleFactor(r4)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.setDisplayMetrics(r5)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r4.setNativeSpellCheckServiceDefined(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L98
            r2 = r3
        L98:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.setBrieflyShowPassword(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.setUse24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r0 = r1.setPlatformBrightness(r0)
            r0.send()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterView.sendUserSettingsToFlutter():void");
    }

    public void setDelegate(io.flutter.embedding.android.FlutterViewDelegate flutterViewDelegate) {
        this.delegate = flutterViewDelegate;
    }

    public void setEnableSwitchSurface(boolean z17) {
        this.enableSwitchSurface = z17;
        if (this.swapRenderSurface == null) {
            if (this.flutterSurfaceView != null) {
                io.flutter.embedding.android.SwapTextureViewRenderSurface swapTextureViewRenderSurface = new io.flutter.embedding.android.SwapTextureViewRenderSurface(getContext());
                this.swapRenderSurface = swapTextureViewRenderSurface;
                swapTextureViewRenderSurface.attachToFlutterView(this);
            } else if (this.flutterTextureView != null || this.flutterImageView != null) {
                io.flutter.embedding.android.SwapSurfaceViewRenderSurface swapSurfaceViewRenderSurface = new io.flutter.embedding.android.SwapSurfaceViewRenderSurface(getContext());
                this.swapRenderSurface = swapSurfaceViewRenderSurface;
                swapSurfaceViewRenderSurface.attachToFlutterView(this);
            }
            this.isInSwapSurface = false;
        }
    }

    public void setFontScaleDelegate(io.flutter.embedding.android.FlutterView.FontScaleDelegate fontScaleDelegate) {
        this.fontScaleDelegate = fontScaleDelegate;
    }

    public void setInMultiWindowMode(boolean z17) {
        this.viewportMetrics.windowStatus = z17 ? io.flutter.embedding.engine.renderer.FlutterRenderer.WindowStatus.SPLIT_SCREEN : io.flutter.embedding.engine.renderer.FlutterRenderer.WindowStatus.NORMAL;
        sendViewportMetricsToFlutter();
    }

    public final void setInsetsToFlutterDirect(android.graphics.Rect rect) {
        this.insetsByNative = true;
        io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.viewInsetTop = rect.top;
        viewportMetrics.viewInsetLeft = rect.left;
        int i17 = rect.bottom;
        int i18 = viewportMetrics.height;
        viewportMetrics.viewInsetBottom = i17 > i18 ? 0 : i18 - i17;
        int i19 = rect.right;
        int i27 = viewportMetrics.width;
        viewportMetrics.viewInsetRight = i19 <= i27 ? i27 - i19 : 0;
        sendViewportMetricsToFlutter();
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.renderSurface;
        if (renderSurface instanceof io.flutter.embedding.android.FlutterSurfaceView) {
            ((io.flutter.embedding.android.FlutterSurfaceView) renderSurface).setVisibility(i17);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        java.util.List<androidx.window.layout.DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.window.layout.DisplayFeature displayFeature : displayFeatures) {
            io.flutter.Log.v(TAG, "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof androidx.window.layout.FoldingFeature) {
                androidx.window.layout.FoldingFeature foldingFeature = (androidx.window.layout.FoldingFeature) displayFeature;
                arrayList.add(new io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature(displayFeature.getBounds(), foldingFeature.getOcclusionType() == androidx.window.layout.FoldingFeature.OcclusionType.FULL ? io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.HINGE : io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.FOLD, foldingFeature.getState() == androidx.window.layout.FoldingFeature.State.FLAT ? io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.POSTURE_FLAT : foldingFeature.getState() == androidx.window.layout.FoldingFeature.State.HALF_OPENED ? io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED : io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.UNKNOWN));
            } else {
                arrayList.add(new io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature(displayFeature.getBounds(), io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType.UNKNOWN, io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        this.viewportMetrics.setDisplayFeatures(arrayList);
        sendViewportMetricsToFlutter();
    }

    public void setWxKeyboardAction(io.flutter.plugin.editing.WxKeyboardAction wxKeyboardAction) {
        this.mWxKeyboardAction = wxKeyboardAction;
    }

    public void switchSurface(boolean z17) {
        io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface;
        boolean z18;
        if (!this.enableSwitchSurface || (swapRenderSurface = this.swapRenderSurface) == null || (z18 = this.isInSwapSurface) == z17) {
            return;
        }
        if (z18) {
            swapRenderSurface.resumeSurface();
        } else {
            swapRenderSurface.swapSurface();
        }
        this.isInSwapSurface = !this.isInSwapSurface;
    }

    public void toggleHideCurrentRenderSurface(boolean z17) {
        io.flutter.embedding.android.FlutterImageView flutterImageView;
        io.flutter.embedding.android.FlutterTextureView flutterTextureView;
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.renderSurface;
        if (renderSurface == null) {
            return;
        }
        int i17 = z17 ? 4 : 0;
        if ((renderSurface instanceof io.flutter.embedding.android.FlutterSurfaceView) && this.flutterSurfaceView != null) {
            io.flutter.Log.i(TAG, "not change surfaceView visibility");
        } else if (!(renderSurface instanceof io.flutter.embedding.android.FlutterTextureView) || (flutterTextureView = this.flutterTextureView) == null) {
            if ((renderSurface instanceof io.flutter.embedding.android.FlutterImageView) && (flutterImageView = this.flutterImageView) != null) {
                flutterImageView.setVisibility(i17);
            }
        } else if (z17) {
            flutterTextureView.setAlpha(0.0f);
        } else {
            flutterTextureView.setAlpha(1.0f);
        }
        if (z17) {
            return;
        }
        ((android.view.View) this.renderSurface).bringToFront();
    }

    public void tryRefreshViewportMetrics() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        sendViewportMetricsToFlutter();
    }

    @java.lang.Deprecated
    public FlutterView(android.content.Context context, io.flutter.embedding.android.RenderMode renderMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new java.util.HashSet();
        this.flutterEngineAttachmentListeners = new java.util.HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z17, boolean z18) {
                io.flutter.embedding.android.FlutterView.this.resetWillNotDraw(z17, z18);
            }
        };
        this.systemSettingsObserver = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.flutter.embedding.android.FlutterView.this.flutterEngine == null) {
                    return;
                }
                io.flutter.Log.v(io.flutter.embedding.android.FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                io.flutter.embedding.android.FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = true;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = false;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new io.flutter.embedding.android.FlutterViewDelegate();
        if (renderMode == io.flutter.embedding.android.RenderMode.surface) {
            io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView = new io.flutter.embedding.android.FlutterSurfaceView(context);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else if (renderMode == io.flutter.embedding.android.RenderMode.texture) {
            io.flutter.embedding.android.FlutterTextureView flutterTextureView = new io.flutter.embedding.android.FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        } else {
            throw new java.lang.IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
        }
        init();
    }

    @java.lang.Deprecated
    public FlutterView(android.content.Context context, io.flutter.embedding.android.TransparencyMode transparencyMode) {
        this(context, (android.util.AttributeSet) null, new io.flutter.embedding.android.FlutterSurfaceView(context, transparencyMode == io.flutter.embedding.android.TransparencyMode.transparent));
    }

    public FlutterView(android.content.Context context, io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView) {
        this(context, (android.util.AttributeSet) null, flutterSurfaceView);
    }

    public FlutterView(android.content.Context context, io.flutter.embedding.android.FlutterTextureView flutterTextureView) {
        this(context, (android.util.AttributeSet) null, flutterTextureView);
    }

    public FlutterView(android.content.Context context, io.flutter.embedding.android.FlutterImageView flutterImageView) {
        this(context, (android.util.AttributeSet) null, flutterImageView);
    }

    public FlutterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, new io.flutter.embedding.android.FlutterSurfaceView(context));
    }

    @java.lang.Deprecated
    public FlutterView(android.content.Context context, io.flutter.embedding.android.RenderMode renderMode, io.flutter.embedding.android.TransparencyMode transparencyMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new java.util.HashSet();
        this.flutterEngineAttachmentListeners = new java.util.HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z17, boolean z18) {
                io.flutter.embedding.android.FlutterView.this.resetWillNotDraw(z17, z18);
            }
        };
        this.systemSettingsObserver = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.flutter.embedding.android.FlutterView.this.flutterEngine == null) {
                    return;
                }
                io.flutter.Log.v(io.flutter.embedding.android.FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                io.flutter.embedding.android.FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = true;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = false;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new io.flutter.embedding.android.FlutterViewDelegate();
        if (renderMode == io.flutter.embedding.android.RenderMode.surface) {
            io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView = new io.flutter.embedding.android.FlutterSurfaceView(context, transparencyMode == io.flutter.embedding.android.TransparencyMode.transparent);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else if (renderMode == io.flutter.embedding.android.RenderMode.texture) {
            io.flutter.embedding.android.FlutterTextureView flutterTextureView = new io.flutter.embedding.android.FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        } else {
            throw new java.lang.IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
        }
        init();
    }

    private FlutterView(android.content.Context context, android.util.AttributeSet attributeSet, io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new java.util.HashSet();
        this.flutterEngineAttachmentListeners = new java.util.HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z17, boolean z18) {
                io.flutter.embedding.android.FlutterView.this.resetWillNotDraw(z17, z18);
            }
        };
        this.systemSettingsObserver = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.flutter.embedding.android.FlutterView.this.flutterEngine == null) {
                    return;
                }
                io.flutter.Log.v(io.flutter.embedding.android.FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                io.flutter.embedding.android.FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = true;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = false;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new io.flutter.embedding.android.FlutterViewDelegate();
        this.flutterSurfaceView = flutterSurfaceView;
        this.renderSurface = flutterSurfaceView;
        init();
    }

    private FlutterView(android.content.Context context, android.util.AttributeSet attributeSet, io.flutter.embedding.android.FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new java.util.HashSet();
        this.flutterEngineAttachmentListeners = new java.util.HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z17, boolean z18) {
                io.flutter.embedding.android.FlutterView.this.resetWillNotDraw(z17, z18);
            }
        };
        this.systemSettingsObserver = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.flutter.embedding.android.FlutterView.this.flutterEngine == null) {
                    return;
                }
                io.flutter.Log.v(io.flutter.embedding.android.FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                io.flutter.embedding.android.FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = true;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = false;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new io.flutter.embedding.android.FlutterViewDelegate();
        this.flutterTextureView = flutterTextureView;
        this.renderSurface = flutterTextureView;
        init();
    }

    private FlutterView(android.content.Context context, android.util.AttributeSet attributeSet, io.flutter.embedding.android.FlutterImageView flutterImageView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new java.util.HashSet();
        this.flutterEngineAttachmentListeners = new java.util.HashSet();
        this.insetsByNative = false;
        this.enableSwitchSurface = false;
        this.swapRenderSurface = null;
        this.isInSwapSurface = false;
        this.viewportMetrics = new io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener
            public void onAccessibilityChanged(boolean z17, boolean z18) {
                io.flutter.embedding.android.FlutterView.this.resetWillNotDraw(z17, z18);
            }
        };
        this.systemSettingsObserver = new android.database.ContentObserver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z17) {
                super.onChange(z17);
                if (io.flutter.embedding.android.FlutterView.this.flutterEngine == null) {
                    return;
                }
                io.flutter.Log.v(io.flutter.embedding.android.FlutterView.TAG, "System settings changed. Sending user settings to Flutter.");
                io.flutter.embedding.android.FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = true;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                io.flutter.embedding.android.FlutterView.this.isFlutterUiDisplayed = false;
                java.util.Iterator it = io.flutter.embedding.android.FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new io.flutter.embedding.android.FlutterViewDelegate();
        this.flutterImageView = flutterImageView;
        this.renderSurface = flutterImageView;
        init();
    }
}
