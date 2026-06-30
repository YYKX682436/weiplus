package io.flutter.plugin.platform;

/* loaded from: classes14.dex */
public class PlatformViewWrapper extends android.widget.FrameLayout {
    private static final java.lang.String TAG = "PlatformViewWrapper";
    private android.view.ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private int left;
    private int prevLeft;
    private int prevTop;
    private io.flutter.plugin.platform.PlatformViewRenderTarget renderTarget;
    private int top;
    private io.flutter.embedding.android.AndroidTouchProcessor touchProcessor;

    public PlatformViewWrapper(android.content.Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget == null) {
            super.draw(canvas);
            io.flutter.Log.e(TAG, "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        android.view.Surface surface = platformViewRenderTarget.getSurface();
        if (!surface.isValid()) {
            io.flutter.Log.e(TAG, "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        android.graphics.Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        } finally {
            this.renderTarget.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public android.view.ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.activeFocusListener;
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.touchProcessor == null) {
            return super.onTouchEvent(motionEvent);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i17 = this.left;
            this.prevLeft = i17;
            int i18 = this.top;
            this.prevTop = i18;
            matrix.postTranslate(i17, i18);
        } else if (action != 2) {
            matrix.postTranslate(this.left, this.top);
        } else {
            matrix.postTranslate(this.prevLeft, this.prevTop);
            this.prevLeft = this.left;
            this.prevTop = this.top;
        }
        return this.touchProcessor.onTouchEvent(motionEvent, matrix);
    }

    public void release() {
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.release();
            this.renderTarget = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void resizeRenderTarget(int i17, int i18) {
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = this.renderTarget;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.resize(i17, i18);
        }
    }

    public void setLayoutParams(android.widget.FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((android.view.ViewGroup.LayoutParams) layoutParams);
        this.left = layoutParams.leftMargin;
        this.top = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(final android.view.View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new android.view.ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewWrapper.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                    android.view.View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    io.flutter.plugin.platform.PlatformViewWrapper platformViewWrapper = io.flutter.plugin.platform.PlatformViewWrapper.this;
                    onFocusChangeListener2.onFocusChange(platformViewWrapper, io.flutter.util.ViewUtils.childHasFocus(platformViewWrapper));
                }
            };
            this.activeFocusListener = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    public void setTouchProcessor(io.flutter.embedding.android.AndroidTouchProcessor androidTouchProcessor) {
        this.touchProcessor = androidTouchProcessor;
    }

    public void unsetOnDescendantFocusChangeListener() {
        android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.activeFocusListener) == null) {
            return;
        }
        this.activeFocusListener = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    public PlatformViewWrapper(android.content.Context context, io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget) {
        this(context);
        this.renderTarget = platformViewRenderTarget;
        android.view.Surface surface = platformViewRenderTarget.getSurface();
        if (surface == null || io.flutter.embedding.engine.renderer.FlutterRenderer.debugDisableSurfaceClear) {
            return;
        }
        android.graphics.Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        } finally {
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }
}
