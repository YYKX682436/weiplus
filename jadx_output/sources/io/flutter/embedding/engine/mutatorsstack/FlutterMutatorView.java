package io.flutter.embedding.engine.mutatorsstack;

/* loaded from: classes14.dex */
public class FlutterMutatorView extends android.widget.FrameLayout {
    android.view.ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
    private final io.flutter.embedding.android.AndroidTouchProcessor androidTouchProcessor;
    private int left;
    private io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack mutatorsStack;
    private android.graphics.Paint paint;
    private int prevLeft;
    private int prevTop;
    private float screenDensity;
    private int top;

    public FlutterMutatorView(android.content.Context context, float f17, io.flutter.embedding.android.AndroidTouchProcessor androidTouchProcessor) {
        super(context, null);
        this.screenDensity = f17;
        this.androidTouchProcessor = androidTouchProcessor;
        this.paint = new android.graphics.Paint();
    }

    private android.graphics.Matrix getPlatformViewMatrix() {
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.mutatorsStack.getFinalMatrix());
        float f17 = this.screenDensity;
        matrix.preScale(1.0f / f17, 1.0f / f17);
        matrix.postTranslate(-this.left, -this.top);
        return matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.save();
        java.util.Iterator<android.graphics.Path> it = this.mutatorsStack.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            android.graphics.Path path = new android.graphics.Path(it.next());
            path.offset(-this.left, -this.top);
            canvas.clipPath(path);
        }
        if (this.paint.getAlpha() != ((int) (this.mutatorsStack.getFinalOpacity() * 255.0f))) {
            this.paint.setAlpha((int) (this.mutatorsStack.getFinalOpacity() * 255.0f));
            setLayerType(2, this.paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.androidTouchProcessor == null) {
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
        return this.androidTouchProcessor.onTouchEvent(motionEvent, matrix);
    }

    public void readyToDisplay(io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack, int i17, int i18, int i19, int i27) {
        this.mutatorsStack = flutterMutatorsStack;
        this.left = i17;
        this.top = i18;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i27);
        layoutParams.leftMargin = i17;
        layoutParams.topMargin = i18;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(final android.view.View.OnFocusChangeListener onFocusChangeListener) {
        unsetOnDescendantFocusChangeListener();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.activeFocusListener == null) {
            android.view.ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new android.view.ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView.1
                @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
                public void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                    android.view.View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    android.view.View view3 = this;
                    onFocusChangeListener2.onFocusChange(view3, io.flutter.util.ViewUtils.childHasFocus(view3));
                }
            };
            this.activeFocusListener = onGlobalFocusChangeListener;
            viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
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

    public FlutterMutatorView(android.content.Context context) {
        this(context, 1.0f, null);
    }
}
