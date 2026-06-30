package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes8.dex */
public class q2 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f180581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.r2 f180582b;

    public q2(com.tencent.mm.plugin.wallet_core.ui.r2 r2Var, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f180582b = r2Var;
        this.f180581a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f180581a;
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.r2 r2Var = this.f180582b;
            java.lang.String str = (java.lang.String) obj;
            r2Var.f180596d.E.setText(str);
            if (str.equalsIgnoreCase(r2Var.f180596d.getString(com.tencent.mm.R.string.j1n))) {
                r2Var.f180596d.f179913l2 = 0;
            } else {
                r2Var.f180596d.f179913l2 = 1;
            }
            c0Var.i(r2Var.f180596d.f179913l2);
        }
        c0Var.d();
    }
}
