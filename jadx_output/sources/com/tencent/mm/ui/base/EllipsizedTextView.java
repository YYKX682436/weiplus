package com.tencent.mm.ui.base;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/ui/base/EllipsizedTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxPixels", "Ljz5/f0;", "setMaxWidth", "setExtraEllipsizeWidth", "getExtraEllipsizeWidth", "", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class EllipsizedTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f197249g;

    /* renamed from: h, reason: collision with root package name */
    public int f197250h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f197251i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView.BufferType f197252m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197253n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f197249g = "…";
    }

    public final void b(int i17, int i18, boolean z17) {
        java.lang.CharSequence subSequence;
        java.lang.CharSequence charSequence = this.f197251i;
        boolean z18 = charSequence instanceof android.text.SpannableString;
        java.lang.String str = this.f197249g;
        if (!z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.CharSequence charSequence2 = this.f197251i;
            sb6.append((java.lang.Object) (charSequence2 != null ? charSequence2.subSequence(i17, i18) : null));
            sb6.append(str);
            super.setText(sb6.toString(), this.f197252m);
            return;
        }
        android.text.SpannableString spannableString = charSequence instanceof android.text.SpannableString ? (android.text.SpannableString) charSequence : null;
        if (spannableString == null || (subSequence = spannableString.subSequence(i17, i18)) == null) {
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(subSequence);
        if (z17) {
            spannableStringBuilder.append((java.lang.CharSequence) str);
        }
        super.setText(spannableStringBuilder, this.f197252m);
    }

    /* renamed from: getExtraEllipsizeWidth, reason: from getter */
    public final int getF197250h() {
        return this.f197250h;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public java.lang.CharSequence getText() {
        return this.f197251i;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        super.onMeasure(i17, i18);
        float measureText = getPaint().measureText(this.f197249g) * 1.2f;
        if (getEllipsize() != android.text.TextUtils.TruncateAt.END || (i19 = this.f197250h) <= 0 || i19 > getMeasuredWidth() || (getLayout().getEllipsisCount(getLayout().getLineCount() - 1) <= 0 && !this.f197253n)) {
            super.setText(this.f197251i, this.f197252m);
            super.onMeasure(i17, i18);
            return;
        }
        this.f197253n = false;
        int offsetForHorizontal = getLayout().getOffsetForHorizontal(getLayout().getLineCount() - 1, (getMeasuredWidth() - measureText) - this.f197250h);
        java.lang.CharSequence charSequence = this.f197251i;
        int length = charSequence != null ? charSequence.length() : 0;
        if (offsetForHorizontal >= length || super.getText().length() != length) {
            if (offsetForHorizontal < length || super.getText().length() == length) {
                return;
            }
            super.setText(this.f197251i, this.f197252m);
            super.onMeasure(i17, i18);
            return;
        }
        if (this.f197252m == android.widget.TextView.BufferType.NORMAL) {
            b(0, offsetForHorizontal, true);
            this.f197253n = true;
        } else {
            b(0, offsetForHorizontal, false);
        }
        super.onMeasure(i17, i18);
    }

    public final void setExtraEllipsizeWidth(int i17) {
        this.f197250h = i17;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i17) {
        super.setMaxWidth(i17);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.f197251i = charSequence;
        this.f197252m = bufferType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsizedTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f197249g = "…";
    }
}
