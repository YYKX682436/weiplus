package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes2.dex */
public final class z2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f115770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.u2 f115771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f115772f;

    public z2(android.widget.TextView textView, com.tencent.mm.plugin.finder.live.util.u2 u2Var, int[] iArr) {
        this.f115770d = textView;
        this.f115771e = u2Var;
        this.f115772f = iArr;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        float width;
        float height;
        float f17;
        float f18;
        android.widget.TextView textView = this.f115770d;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        int ordinal = this.f115771e.ordinal();
        if (ordinal != 0) {
            height = 0.0f;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    f17 = 0.0f;
                    f18 = 0.0f;
                } else {
                    f18 = textView.getHeight();
                    f17 = 0.0f;
                }
                textView.getPaint().setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f17, f18, this.f115772f, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                return true;
            }
            width = textView.getWidth();
        } else {
            width = textView.getWidth();
            height = textView.getHeight();
        }
        f17 = width;
        f18 = height;
        textView.getPaint().setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f17, f18, this.f115772f, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }
}
