package com.tencent.mm.plugin.wallet.balance.ui.lqt;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0013\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout;", "Landroidx/gridlayout/widget/GridLayout;", "Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/i;", "H", "Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/i;", "getOnSelectAmount", "()Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/i;", "setOnSelectAmount", "(Lcom/tencent/mm/plugin/wallet/balance/ui/lqt/i;)V", "onSelectAmount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/wallet/balance/ui/lqt/h", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LqtSaveKeyboardToolBarLayout extends androidx.gridlayout.widget.GridLayout {
    public r45.nw3 G;

    /* renamed from: H, reason: from kotlin metadata */
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.i onSelectAmount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LqtSaveKeyboardToolBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 23;
        setLayoutParams(layoutParams);
        setRowCount(1);
        setColumnCount(1);
    }

    public final com.tencent.mm.plugin.wallet.balance.ui.lqt.i getOnSelectAmount() {
        return this.onSelectAmount;
    }

    public final void setOnSelectAmount(com.tencent.mm.plugin.wallet.balance.ui.lqt.i iVar) {
        this.onSelectAmount = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LqtSaveKeyboardToolBarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 23;
        setLayoutParams(layoutParams);
        setRowCount(1);
        setColumnCount(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LqtSaveKeyboardToolBarLayout(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 23;
        setLayoutParams(layoutParams);
        setRowCount(1);
        setColumnCount(1);
    }
}
