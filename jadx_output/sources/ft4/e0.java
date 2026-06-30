package ft4;

/* loaded from: classes14.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.j f266607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f266608f;

    public e0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI, ft4.j jVar, int i17) {
        this.f266606d = walletLedgerMainUI;
        this.f266607e = jVar;
        this.f266608f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List m17;
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266606d;
        dt4.p pVar = walletLedgerMainUI.f180444w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        java.util.List n17 = pVar.n("", walletLedgerMainUI.f180437p, this.f266607e.f266632b.f266637b, 1, false);
        if (!((java.util.ArrayList) n17).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "loadBottomMore pos:" + this.f266608f + ", more < " + this.f266607e.f266632b.f266637b + " tradeData:" + ((dt4.u) kz5.n0.X(n17)).f243292a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            dt4.t tVar = new dt4.t();
            int i17 = (((dt4.u) kz5.n0.X(n17)).f243292a / 100) * 100;
            tVar.f243287a = i17 + 1;
            tVar.f243288b = i17 + 31;
            arrayList.add(tVar);
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI2 = this.f266606d;
            if (walletLedgerMainUI2.f180436o == 1) {
                dt4.p pVar2 = walletLedgerMainUI2.f180444w;
                if (pVar2 == null) {
                    kotlin.jvm.internal.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar2.l(walletLedgerMainUI2.f180437p, arrayList);
            } else {
                dt4.p pVar3 = walletLedgerMainUI2.f180444w;
                if (pVar3 == null) {
                    kotlin.jvm.internal.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar3.m(walletLedgerMainUI2.f180437p, arrayList);
            }
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI3 = this.f266606d;
            int V6 = walletLedgerMainUI3.V6(m17, walletLedgerMainUI3.f180441t);
            if (V6 == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerMainUI", "loadBottomMore pos:" + this.f266608f + ", getSectionData count is 0");
                ft4.i iVar = this.f266606d.f180442u;
                if (iVar != null) {
                    iVar.f266626h = 0;
                }
                if (iVar != null) {
                    iVar.notifyItemRemoved(this.f266608f);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f266606d.A;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("listView");
                    throw null;
                }
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                int i18 = this.f266608f - 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(linearLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                linearLayoutManager.scrollToPosition(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            } else {
                com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI4 = this.f266606d;
                ft4.i iVar2 = walletLedgerMainUI4.f180442u;
                if (iVar2 != null) {
                    java.util.List list = walletLedgerMainUI4.f180441t;
                    kotlin.jvm.internal.o.g(list, "<set-?>");
                    iVar2.f266623e = list;
                }
                ft4.i iVar3 = this.f266606d.f180442u;
                if (iVar3 != null) {
                    iVar3.notifyItemRangeInserted(this.f266608f, V6);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "loadBottomMore pos:" + this.f266608f + ", more < " + this.f266607e.f266632b.f266637b);
            ft4.i iVar4 = this.f266606d.f180442u;
            if (iVar4 != null) {
                iVar4.f266626h = 0;
            }
            if (iVar4 != null) {
                iVar4.notifyItemRemoved(this.f266608f);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f266606d.A;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("listView");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2;
            int i19 = this.f266608f - 1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(linearLayoutManager2, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            linearLayoutManager2.scrollToPosition(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(linearLayoutManager2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI$loadBottomMore$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ft4.d0 d0Var = new ft4.d0(this.f266606d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(d0Var, 20L, false);
    }
}
