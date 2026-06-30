package ma;

/* loaded from: classes14.dex */
public abstract class e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f325124d;

    /* renamed from: e, reason: collision with root package name */
    public final o3.d f325125e;

    public e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434129s);
        if (obtainStyledAttributes.hasValue(1)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.s(this, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.f325124d = accessibilityManager;
        ma.d dVar = new ma.d(this);
        this.f325125e = dVar;
        o3.c.a(accessibilityManager, dVar);
        setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z17) {
        setClickable(!z17);
        setFocusable(z17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.y0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o3.c.b(this.f325124d, this.f325125e);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    public void setOnAttachStateChangeListener(ma.b bVar) {
    }

    public void setOnLayoutChangeListener(ma.c cVar) {
    }
}
