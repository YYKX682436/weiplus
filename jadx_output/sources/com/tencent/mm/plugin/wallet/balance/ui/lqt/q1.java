package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class q1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 f178332d;

    public q1(com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 t1Var) {
        this.f178332d = t1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 t1Var = this.f178332d;
        java.util.LinkedList linkedList = t1Var.f178371d.f177952f.U;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = t1Var.f178371d.f177952f.U.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                r45.du4 du4Var = (r45.du4) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372748d)) {
                    g4Var.f(i17, du4Var.f372748d);
                }
                i17++;
            }
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = t1Var.f178371d;
        if (walletLqtDetailUI.f177952f.B) {
            return;
        }
        g4Var.d(-1, walletLqtDetailUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), t1Var.f178371d.getString(com.tencent.mm.R.string.kox));
    }
}
