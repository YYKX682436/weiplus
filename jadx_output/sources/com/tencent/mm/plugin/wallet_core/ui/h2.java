package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h2 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f180299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.i2 f180300b;

    public h2(com.tencent.mm.plugin.wallet_core.ui.i2 i2Var, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f180300b = i2Var;
        this.f180299a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f180299a;
        c0Var.d();
        com.tencent.mm.plugin.wallet_core.ui.i2 i2Var = this.f180300b;
        if (z17) {
            java.lang.String str = (java.lang.String) obj;
            i2Var.f180327d.U1.setText(str);
            com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = i2Var.f180327d;
            boolean z18 = !str.equals(walletCardElementUI.getString(com.tencent.mm.R.string.kki));
            java.util.Iterator it = ((java.util.ArrayList) walletCardElementUI.V1).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) it.next();
                if (!z18 || !elementQuery.b()) {
                    if (!z18) {
                        if (2 == elementQuery.f179658r) {
                        }
                    }
                }
                walletCardElementUI.W = elementQuery;
                walletCardElementUI.c7(false);
            }
        }
        i2Var.f180327d.W1 = c0Var.b();
    }
}
