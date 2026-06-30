package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class MMScrollView extends android.widget.ScrollView implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.p f214090d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.o f214091e;

    public MMScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(android.view.ViewGroup viewGroup, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if ((childAt instanceof com.tencent.mm.wallet_core.ui.formview.WalletFormView) || (childAt instanceof com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView)) {
                childAt.setOnFocusChangeListener(onFocusChangeListener);
            } else if (childAt instanceof android.view.ViewGroup) {
                a((android.view.ViewGroup) childAt, onFocusChangeListener);
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            postDelayed(new com.tencent.mm.wallet_core.ui.n(this, view), 200L);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        com.tencent.mm.wallet_core.ui.o oVar = this.f214091e;
        if (oVar != null) {
            oVar.onScrollChange(this, i17, i18, i19, i27);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.wallet_core.ui.p pVar = this.f214090d;
        if (pVar != null && i18 != i27) {
            boolean z17 = i18 < i27;
            com.tencent.mm.plugin.wallet_core.ui.u2 u2Var = (com.tencent.mm.plugin.wallet_core.ui.u2) pVar;
            u2Var.getClass();
            u2Var.f180633a.f179959y.post(new com.tencent.mm.plugin.wallet_core.ui.t2(u2Var, z17 ? 8 : 0));
        }
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public void setOnScrollListener(com.tencent.mm.wallet_core.ui.o oVar) {
        this.f214091e = oVar;
    }

    public void setOnSizeChangeListener(com.tencent.mm.wallet_core.ui.p pVar) {
        if (pVar != null) {
            this.f214090d = pVar;
        }
    }

    public MMScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
