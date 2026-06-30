package com.tencent.mm.ui.tools;

/* loaded from: classes2.dex */
public class PressAlphaImageView extends com.tencent.mm.ui.widget.imageview.WeImageView {

    /* renamed from: r, reason: collision with root package name */
    public float f210138r;

    public PressAlphaImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210138r = 0.7f;
        super.setOnTouchListener(new com.tencent.mm.ui.tools.b8(this));
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        iz5.a.g(null, false);
    }

    public void setPressAlpha(float f17) {
        this.f210138r = f17;
    }
}
