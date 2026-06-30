package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class b7 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ry4 f178108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178109b;

    public b7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, r45.ry4 ry4Var) {
        this.f178109b = walletLqtSaveFetchUI;
        this.f178108a = ry4Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        java.util.LinkedList linkedList;
        java.lang.String str;
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178109b;
        walletLqtSaveFetchUI.getClass();
        r45.ry4 ry4Var = this.f178108a;
        if (ry4Var == null || (linkedList = ry4Var.f385289i) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str2 = "";
        java.lang.String str3 = "";
        while (it.hasNext()) {
            r45.if0 if0Var = (r45.if0) it.next();
            if (if0Var != null && (str = if0Var.f376981d) != null) {
                str3 = if0Var.f376982e;
                str2 = str;
            }
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(walletLqtSaveFetchUI.getContext(), 2, 3);
        z2Var.y(walletLqtSaveFetchUI.getResources().getString(com.tencent.mm.R.string.f490454vi));
        z2Var.x(1);
        z2Var.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.f7(walletLqtSaveFetchUI, z2Var);
        android.view.View inflate = android.view.View.inflate(walletLqtSaveFetchUI.getContext(), com.tencent.mm.R.layout.btb, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gwd);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            textView.setText(str2);
        }
        textView.getPaint().setFakeBoldText(true);
        z2Var.s(inflate);
        android.view.View inflate2 = android.view.View.inflate(walletLqtSaveFetchUI.getContext(), com.tencent.mm.R.layout.bta, null);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.gw8);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            textView2.setText(str3);
        }
        z2Var.j(inflate2);
        z2Var.C();
    }
}
