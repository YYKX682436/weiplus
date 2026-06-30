package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f178494a;

    public q(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f178494a = walletBalanceFetchUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f178494a;
        walletBalanceFetchUI.M = null;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            walletBalanceFetchUI.f177795t.removeAllViews();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            java.util.LinkedList linkedList = ((r45.dw) fVar.f70618d).f372775d;
            if (linkedList != null && !linkedList.isEmpty()) {
                java.util.Iterator it = ((r45.dw) fVar.f70618d).f372775d.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    r45.rl6 rl6Var = (r45.rl6) it.next();
                    android.widget.TextView textView = new android.widget.TextView(walletBalanceFetchUI.getContext());
                    com.tencent.mm.plugin.wallet_core.utils.z1.j(textView, rl6Var);
                    if (i17 != 0) {
                        layoutParams.topMargin = i65.a.h(walletBalanceFetchUI.getContext(), com.tencent.mm.R.dimen.f479563f);
                    }
                    walletBalanceFetchUI.f177795t.addView(textView, layoutParams);
                    i17++;
                }
            }
        }
        return null;
    }
}
