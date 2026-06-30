package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class k7 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f157796d;

    public k7(com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage) {
        this.f157796d = remittanceRemarkInputHalfPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f157796d;
        remittanceRemarkInputHalfPage.f157567m = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "[mKeyboardHeight] ：" + i17);
        if (i17 > 0) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = remittanceRemarkInputHalfPage.f157565h;
            if (z2Var == null || !z2Var.h()) {
                return;
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
            ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            android.view.ViewParent parent = z2Var.f212058g.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ofInt.addUpdateListener(new com.tencent.mm.plugin.remittance.ui.p7(remittanceRemarkInputHalfPage, layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null, z2Var));
            ofInt.addListener(new com.tencent.mm.plugin.remittance.ui.q7(z2Var));
            ofInt.setDuration(200L);
            ofInt.start();
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = remittanceRemarkInputHalfPage.f157565h;
        if (z2Var2 == null || !z2Var2.h()) {
            return;
        }
        if (com.tencent.mm.ui.b4.c(remittanceRemarkInputHalfPage.f157561d)) {
            android.view.ViewParent parent2 = z2Var2.f212058g.getParent();
            android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            android.view.ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            android.view.ViewParent parent3 = z2Var2.f212058g.getParent();
            android.view.View view3 = parent3 instanceof android.view.View ? (android.view.View) parent3 : null;
            if (view3 != null) {
                view3.setLayoutParams(marginLayoutParams);
            }
        }
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(z2Var2.f212058g.getPaddingBottom(), 0);
        ofInt2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt2.addUpdateListener(new com.tencent.mm.plugin.remittance.ui.n7(z2Var2));
        ofInt2.addListener(new com.tencent.mm.plugin.remittance.ui.o7(z2Var2));
        ofInt2.setDuration(200L);
        ofInt2.start();
    }
}
