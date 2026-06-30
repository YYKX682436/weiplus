package com.tencent.mm.ui.base;

/* loaded from: classes3.dex */
public class MMSmoothHorizontalScrollView extends android.widget.HorizontalScrollView implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f197574d;

    /* renamed from: e, reason: collision with root package name */
    public float f197575e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f197576f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.TranslateAnimation f197577g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Interpolator f197578h;

    public MMSmoothHorizontalScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197576f = new android.graphics.Rect();
        this.f197578h = new android.view.animation.DecelerateInterpolator();
        setFadingEdgeLength(a());
    }

    public int a() {
        return 0;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        if (getChildCount() > 0) {
            this.f197574d = getChildAt(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r0 != 3) goto L32;
     */
    @Override // android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.MMSmoothHorizontalScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
