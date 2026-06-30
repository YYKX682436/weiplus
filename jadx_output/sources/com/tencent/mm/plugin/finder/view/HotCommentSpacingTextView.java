package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/HotCommentSpacingTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxPixels", "Ljz5/f0;", "setMaxWidth", "setExtraEllipsizeWidth", "getExtraEllipsizeWidth", "", "getText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HotCommentSpacingTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f131523g;

    /* renamed from: h, reason: collision with root package name */
    public int f131524h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f131525i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView.BufferType f131526m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f131527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotCommentSpacingTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131523g = "…";
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r6 < (r1 != null ? r1.length() : 0)) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r5, int r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            if (r5 < 0) goto L4
            goto L5
        L4:
            r5 = r0
        L5:
            if (r6 <= r5) goto L14
            java.lang.CharSequence r1 = r4.f131525i
            if (r1 == 0) goto L10
            int r1 = r1.length()
            goto L11
        L10:
            r1 = r0
        L11:
            if (r6 >= r1) goto L14
            goto L15
        L14:
            r6 = r0
        L15:
            java.lang.CharSequence r0 = r4.f131525i
            boolean r1 = r0 instanceof android.text.SpannableString
            java.lang.String r2 = r4.f131523g
            r3 = 0
            if (r1 == 0) goto L3d
            boolean r1 = r0 instanceof android.text.SpannableString
            if (r1 == 0) goto L25
            r3 = r0
            android.text.SpannableString r3 = (android.text.SpannableString) r3
        L25:
            if (r3 == 0) goto L59
            java.lang.CharSequence r5 = r3.subSequence(r5, r6)
            if (r5 == 0) goto L59
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r5)
            if (r7 == 0) goto L37
            r6.append(r2)
        L37:
            android.widget.TextView$BufferType r5 = r4.f131526m
            super.setText(r6, r5)
            goto L59
        L3d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.CharSequence r0 = r4.f131525i
            if (r0 == 0) goto L4a
            java.lang.CharSequence r3 = r0.subSequence(r5, r6)
        L4a:
            r7.append(r3)
            r7.append(r2)
            java.lang.String r5 = r7.toString()
            android.widget.TextView$BufferType r6 = r4.f131526m
            super.setText(r5, r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.HotCommentSpacingTextView.b(int, int, boolean):void");
    }

    /* renamed from: getExtraEllipsizeWidth, reason: from getter */
    public final int getF131524h() {
        return this.f131524h;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public java.lang.CharSequence getText() {
        return this.f131525i;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        super.onMeasure(i17, i18);
        float measureText = getPaint().measureText(this.f131523g) * 1.2f;
        if (getEllipsize() != android.text.TextUtils.TruncateAt.END || (i19 = this.f131524h) <= 0 || i19 > getMeasuredWidth() || (getLayout().getEllipsisCount(getLayout().getLineCount() - 1) <= 0 && !this.f131527n)) {
            super.setText(this.f131525i, this.f131526m);
            super.onMeasure(i17, i18);
            return;
        }
        android.text.Layout layout = getLayout();
        kotlin.jvm.internal.o.f(layout, "getLayout(...)");
        float measuredWidth = (getMeasuredWidth() - measureText) - this.f131524h;
        int offsetForHorizontal = layout.getOffsetForHorizontal(getLayout().getLineCount() - 1, measuredWidth);
        if (layout.getPrimaryHorizontal(offsetForHorizontal) > measuredWidth) {
            offsetForHorizontal = layout.getOffsetToLeftOf(offsetForHorizontal);
        }
        java.lang.CharSequence charSequence = this.f131525i;
        int length = charSequence != null ? charSequence.length() : 0;
        if (offsetForHorizontal >= length || super.getText().length() != length) {
            if (offsetForHorizontal < length || super.getText().length() == length) {
                return;
            }
            super.setText(this.f131525i, this.f131526m);
            super.onMeasure(i17, i18);
            this.f131527n = false;
            return;
        }
        if (this.f131526m == android.widget.TextView.BufferType.NORMAL) {
            b(0, offsetForHorizontal, true);
            this.f131527n = true;
        } else {
            b(0, offsetForHorizontal, false);
            this.f131527n = true;
        }
        super.onMeasure(i17, i18);
    }

    public final void setExtraEllipsizeWidth(int i17) {
        this.f131524h = i17;
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
        this.f131525i = charSequence;
        this.f131526m = bufferType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotCommentSpacingTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131523g = "…";
    }
}
