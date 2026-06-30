package com.tencent.mm.plugin.wallet_core.ui.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletMaxHeightLinearLayout;", "Landroid/widget/LinearLayout;", "", "maxHeightDp", "Ljz5/f0;", "setMaxHeightDp", "maxHeightPx", "setMaxHeightPx", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WalletMaxHeightLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f180715d;

    /* renamed from: e, reason: collision with root package name */
    public int f180716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletMaxHeightLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f180716e = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188586i, 0, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int integer = obtainStyledAttributes.getInteger(0, -1);
            this.f180715d = integer;
            this.f180716e = integer != -1 ? i65.a.b(getContext(), this.f180715d) : -1;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(this.f180716e, Integer.MIN_VALUE));
    }

    public final void setMaxHeightDp(int i17) {
        this.f180715d = i17;
        this.f180716e = i17 != -1 ? i65.a.b(getContext(), this.f180715d) : -1;
        invalidate();
    }

    public final void setMaxHeightPx(int i17) {
        this.f180716e = i17;
        invalidate();
    }

    public WalletMaxHeightLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180716e = -1;
    }
}
