package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class MMTruncTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f210083d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f210084e;

    public MMTruncTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f210083d = false;
        this.f210084e = false;
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f210083d) {
            java.lang.CharSequence text = getText();
            if (text instanceof android.text.Spanned) {
                this.f210084e = true;
                setText(android.text.TextUtils.ellipsize(text, getPaint(), (getWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft(), android.text.TextUtils.TruncateAt.END));
                this.f210084e = false;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        this.f210083d = !this.f210084e;
    }

    public MMTruncTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210083d = false;
        this.f210084e = false;
    }
}
