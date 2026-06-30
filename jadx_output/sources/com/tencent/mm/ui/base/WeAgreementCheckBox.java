package com.tencent.mm.ui.base;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0002\u0014B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/ui/base/WeAgreementCheckBox;", "Landroid/widget/FrameLayout;", "Ldb5/t9;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setAgreementCheckBoxListener", "Lem/t1;", "d", "Ljz5/g;", "getBinding", "()Lem/t1;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "db5/u9", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class WeAgreementCheckBox extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final int f197731o = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 36);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g binding;

    /* renamed from: e, reason: collision with root package name */
    public db5.t9 f197733e;

    /* renamed from: f, reason: collision with root package name */
    public int f197734f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f197735g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f197736h;

    /* renamed from: i, reason: collision with root package name */
    public db5.u9 f197737i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197738m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197739n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WeAgreementCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final em.t1 getBinding() {
        return (em.t1) ((jz5.n) this.binding).getValue();
    }

    public final boolean b() {
        return getBinding().a().isChecked();
    }

    public final boolean c(android.widget.TextView textView, android.view.MotionEvent motionEvent) {
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(textView.getText());
        float x17 = motionEvent.getX() - textView.getLeft();
        float paddingLeft = (x17 - textView.getPaddingLeft()) + textView.getScrollX();
        float y17 = ((motionEvent.getY() - textView.getTop()) - textView.getPaddingTop()) + textView.getScrollY();
        android.text.Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        int lineForVertical = layout.getLineForVertical((int) y17);
        if (paddingLeft > layout.getLineRight(lineForVertical) || paddingLeft < layout.getLineLeft(lineForVertical)) {
            return false;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, paddingLeft);
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) valueOf.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
        kotlin.jvm.internal.o.d(clickableSpanArr);
        return !(clickableSpanArr.length == 0);
    }

    public final void d() {
        int color = b() ? this.f197734f : getContext().getColor(com.tencent.mm.R.color.aiq);
        if (getBinding().b().getCurrentTextColor() != color) {
            getBinding().b().setTextColor(color);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (!z17) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        kotlin.jvm.internal.o.f(getBinding().b(), "getTvText(...)");
        return !c(r1, motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.text.Layout layout = getBinding().b().getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            return;
        }
        getBinding().a().setY(((layout.getLineTop(0) + layout.getLineBottom(0)) / 2.0f) - (getBinding().a().getHeight() / 2));
    }

    public final void setAgreementCheckBoxListener(db5.t9 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f197733e = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0148, code lost:
    
        if ((r15.length() > 0) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WeAgreementCheckBox(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.base.WeAgreementCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
