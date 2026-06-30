package io.flutter.plugin.platform;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class VirtualDisplayController {
    private static java.lang.String TAG = "VirtualDisplayController";
    private static android.hardware.display.VirtualDisplay.Callback callback = new android.hardware.display.VirtualDisplay.Callback() { // from class: io.flutter.plugin.platform.VirtualDisplayController.1
        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
        }
    };
    private final io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate;
    private final android.content.Context context;
    private final int densityDpi;
    private final android.view.View.OnFocusChangeListener focusChangeListener;
    io.flutter.plugin.platform.SingleViewPresentation presentation;
    private final io.flutter.plugin.platform.PlatformViewRenderTarget renderTarget;
    private final int viewId;
    private android.hardware.display.VirtualDisplay virtualDisplay;

    /* loaded from: classes15.dex */
    public static class OneTimeOnDrawListener implements android.view.ViewTreeObserver.OnDrawListener {
        java.lang.Runnable mOnDrawRunnable;
        final android.view.View mView;

        public OneTimeOnDrawListener(android.view.View view, java.lang.Runnable runnable) {
            this.mView = view;
            this.mOnDrawRunnable = runnable;
        }

        public static void schedule(android.view.View view, java.lang.Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            java.lang.Runnable runnable = this.mOnDrawRunnable;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.mOnDrawRunnable = null;
            this.mView.post(new java.lang.Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.1
                @Override // java.lang.Runnable
                public void run() {
                    io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.this.mView.getViewTreeObserver().removeOnDrawListener(io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.this);
                }
            });
        }
    }

    private VirtualDisplayController(android.content.Context context, io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate, android.hardware.display.VirtualDisplay virtualDisplay, io.flutter.plugin.platform.PlatformView platformView, io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget, android.view.View.OnFocusChangeListener onFocusChangeListener, int i17, java.lang.Object obj) {
        this.context = context;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.renderTarget = platformViewRenderTarget;
        this.focusChangeListener = onFocusChangeListener;
        this.viewId = i17;
        this.virtualDisplay = virtualDisplay;
        this.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = new io.flutter.plugin.platform.SingleViewPresentation(context, this.virtualDisplay.getDisplay(), platformView, accessibilityEventsDelegate, i17, onFocusChangeListener);
        this.presentation = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static io.flutter.plugin.platform.VirtualDisplayController create(android.content.Context context, io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate, io.flutter.plugin.platform.PlatformView platformView, io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget, int i17, int i18, int i19, java.lang.Object obj, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        if (i17 == 0 || i18 == 0) {
            return null;
        }
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        platformViewRenderTarget.resize(i17, i18);
        android.hardware.display.VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i19, i17, i18, displayMetrics.densityDpi, platformViewRenderTarget.getSurface(), 0, callback, null);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new io.flutter.plugin.platform.VirtualDisplayController(context, accessibilityEventsDelegate, createVirtualDisplay, platformView, platformViewRenderTarget, onFocusChangeListener, i19, obj);
    }

    private void resize31(android.view.View view, int i17, int i18, java.lang.Runnable runnable) {
        this.renderTarget.resize(i17, i18);
        this.virtualDisplay.resize(i17, i18, this.densityDpi);
        this.virtualDisplay.setSurface(this.renderTarget.getSurface());
        view.postDelayed(runnable, 0L);
    }

    public void clearSurface() {
        this.virtualDisplay.setSurface(null);
    }

    public void dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void dispose() {
        this.presentation.cancel();
        this.presentation.detachState();
        this.virtualDisplay.release();
        this.renderTarget.release();
    }

    public int getRenderTargetHeight() {
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            return platformViewRenderTarget.getWidth();
        }
        return 0;
    }

    public android.view.View getView() {
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    public void onFlutterViewAttached(android.view.View view) {
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onFlutterViewAttached(view);
    }

    public void onFlutterViewDetached() {
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onFlutterViewDetached();
    }

    public void onInputConnectionLocked() {
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onInputConnectionLocked();
    }

    public void onInputConnectionUnlocked() {
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.presentation.getView().onInputConnectionUnlocked();
    }

    public void resetSurface() {
        int renderTargetWidth = getRenderTargetWidth();
        int renderTargetHeight = getRenderTargetHeight();
        boolean isFocused = getView().isFocused();
        io.flutter.plugin.platform.SingleViewPresentation.PresentationState detachState = this.presentation.detachState();
        this.virtualDisplay.setSurface(null);
        this.virtualDisplay.release();
        this.virtualDisplay = ((android.hardware.display.DisplayManager) this.context.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.viewId, renderTargetWidth, renderTargetHeight, this.densityDpi, this.renderTarget.getSurface(), 0, callback, null);
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = new io.flutter.plugin.platform.SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, detachState, this.focusChangeListener, isFocused);
        singleViewPresentation.show();
        this.presentation.cancel();
        this.presentation = singleViewPresentation;
    }

    public void resize(int i17, int i18, final java.lang.Runnable runnable) {
        if (i17 == getRenderTargetWidth() && i18 == getRenderTargetHeight()) {
            getView().postDelayed(runnable, 0L);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            resize31(getView(), i17, i18, runnable);
            return;
        }
        boolean isFocused = getView().isFocused();
        io.flutter.plugin.platform.SingleViewPresentation.PresentationState detachState = this.presentation.detachState();
        this.virtualDisplay.setSurface(null);
        this.virtualDisplay.release();
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.context.getSystemService("display");
        this.renderTarget.resize(i17, i18);
        this.virtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + this.viewId, i17, i18, this.densityDpi, this.renderTarget.getSurface(), 0, callback, null);
        final android.view.View view = getView();
        view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view2) {
                io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.schedule(view, new java.lang.Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        io.flutter.plugin.platform.VirtualDisplayController.AnonymousClass2 anonymousClass2 = io.flutter.plugin.platform.VirtualDisplayController.AnonymousClass2.this;
                        view.postDelayed(runnable, 128L);
                    }
                });
                view.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view2) {
            }
        });
        io.flutter.plugin.platform.SingleViewPresentation singleViewPresentation = new io.flutter.plugin.platform.SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, detachState, this.focusChangeListener, isFocused);
        singleViewPresentation.show();
        this.presentation.cancel();
        this.presentation = singleViewPresentation;
    }
}
