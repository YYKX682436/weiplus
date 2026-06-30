package ft4;

/* loaded from: classes14.dex */
public final class i0 implements gt4.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266630a;

    public i0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI) {
        this.f266630a = walletLedgerMainUI;
    }

    @Override // gt4.y
    public java.util.Map a(int i17, int i18) {
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266630a;
        dt4.p pVar = walletLedgerMainUI.f180444w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        dt4.s k17 = pVar.k(walletLedgerMainUI.f180437p, "", i17, i18);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = k17.f243286e.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(java.lang.Integer.valueOf(((dt4.u) it.next()).f243292a), java.lang.Boolean.TRUE);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "getDotMap result size " + linkedHashMap.size());
        return linkedHashMap;
    }

    @Override // gt4.y
    public void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "onSelectMonth month:" + i17);
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266630a;
        walletLedgerMainUI.f180433i = -1;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, 8, java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f));
        gt4.s0 s0Var = walletLedgerMainUI.f180440s;
        if (s0Var != null) {
            s0Var.e();
        }
        walletLedgerMainUI.f180429e = (i17 * 100) + 1;
        walletLedgerMainUI.f180430f = walletLedgerMainUI.f180432h;
        walletLedgerMainUI.f180438q = 1;
        ft4.i iVar = walletLedgerMainUI.f180442u;
        if (iVar != null) {
            iVar.f266627i = true;
        }
        walletLedgerMainUI.X6(i17);
        ft4.i iVar2 = walletLedgerMainUI.f180442u;
        if (iVar2 != null && iVar2.f266625g == 1) {
            androidx.recyclerview.widget.RecyclerView recyclerView = walletLedgerMainUI.A;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectMonth", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            linearLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectMonth", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // gt4.y
    public void c(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "onSelectSection start:" + i17 + " end:" + i18 + " quickDatePickBtnState:" + i19);
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266630a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 1, 9, java.lang.Integer.valueOf(walletLedgerMainUI.f180429e), java.lang.Integer.valueOf(walletLedgerMainUI.f180430f), java.lang.Integer.valueOf(i19));
        gt4.s0 s0Var = walletLedgerMainUI.f180440s;
        if (s0Var != null) {
            s0Var.e();
        }
        walletLedgerMainUI.f180429e = i17;
        walletLedgerMainUI.f180430f = i18;
        if (i17 == i18) {
            walletLedgerMainUI.f180438q = 2;
            ft4.i iVar = walletLedgerMainUI.f180442u;
            if (iVar != null) {
                iVar.f266627i = false;
            }
        } else {
            walletLedgerMainUI.f180438q = 3;
            ft4.i iVar2 = walletLedgerMainUI.f180442u;
            if (iVar2 != null) {
                iVar2.f266627i = true;
            }
        }
        walletLedgerMainUI.X6(0);
        ft4.i iVar3 = walletLedgerMainUI.f180442u;
        if (iVar3 != null && iVar3.f266625g == 1) {
            androidx.recyclerview.widget.RecyclerView recyclerView = walletLedgerMainUI.A;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectSection", "(III)V", "Undefined", "scrollToPosition", "(I)V");
            linearLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$showDateDialog$1", "onSelectSection", "(III)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
