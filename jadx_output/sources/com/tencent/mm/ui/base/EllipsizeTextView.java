package com.tencent.mm.ui.base;

/* loaded from: classes4.dex */
public class EllipsizeTextView extends com.tencent.mm.view.x2c.X2CTextView {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f197244g;

    /* renamed from: h, reason: collision with root package name */
    public int f197245h;

    /* renamed from: i, reason: collision with root package name */
    public int f197246i;

    /* renamed from: m, reason: collision with root package name */
    public db5.n f197247m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f197248n;

    public EllipsizeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void b(java.lang.CharSequence charSequence, java.lang.String str, int i17, int i18) {
        this.f197244g = str;
        this.f197245h = i17;
        this.f197246i = i18;
        this.f197248n = charSequence;
        setText(((java.lang.Object) this.f197248n) + "  " + str);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (getMeasuredWidth() <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.f197244g) || this.f197247m == null || getText() == null || getText().length() <= 0) {
            return;
        }
        java.lang.CharSequence a17 = this.f197247m.a(this, this.f197248n, this.f197244g, this.f197245h, this.f197246i);
        this.f197244g = null;
        setText(a17, android.widget.TextView.BufferType.SPANNABLE);
        requestLayout();
    }

    public void setLayoutCallback(db5.n nVar) {
        this.f197247m = nVar;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public EllipsizeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
