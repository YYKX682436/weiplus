package ft4;

/* loaded from: classes14.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI f266614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.j f266615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f266616f;

    public g0(com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI, ft4.j jVar, int i17) {
        this.f266614d = walletLedgerMainUI;
        this.f266615e = jVar;
        this.f266616f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.c1 a17;
        java.util.List m17;
        com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI = this.f266614d;
        dt4.p pVar = walletLedgerMainUI.f180444w;
        if (pVar == null) {
            kotlin.jvm.internal.o.o("ledgerDataCenter");
            throw null;
        }
        int i17 = walletLedgerMainUI.f180437p;
        int i18 = this.f266615e.f266632b.f266638c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = "";
        java.lang.String[] strArr = {pVar.f243268a, java.lang.String.valueOf(i18), java.lang.String.valueOf(1)};
        if (i17 > 0) {
            str = "AND tradeType = ?";
            strArr = new java.lang.String[]{pVar.f243268a, java.lang.String.valueOf(i18), java.lang.String.valueOf(i17), java.lang.String.valueOf(1)};
        }
        java.lang.String format = java.lang.String.format("SELECT DISTINCT msgDate FROM WalletLedgerRecord WHERE ((talker = ?) AND msgDate %s ?) AND tradeAmount > 0 %s ORDER BY msgTime DESC LIMIT ? OFFSET 0", java.util.Arrays.copyOf(new java.lang.Object[]{">", str}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(xs4.b.class);
        }
        l75.k0 Q4 = ((xs4.b) a17).Q4();
        android.database.Cursor B = Q4 != null ? Q4.B(format, strArr) : null;
        if (B != null) {
            while (B.moveToNext()) {
                try {
                    dm.ec ecVar = new dm.ec();
                    ecVar.convertFrom(B);
                    dt4.u uVar = new dt4.u();
                    uVar.f243292a = ecVar.t0();
                    arrayList.add(uVar);
                } finally {
                }
            }
            vz5.b.a(B, null);
        }
        if (!arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "loadTopMore pos:" + this.f266616f + ", more > " + this.f266615e.f266632b.f266638c + " tradeData:" + ((dt4.u) kz5.n0.X(arrayList)).f243292a);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            dt4.t tVar = new dt4.t();
            int i19 = (((dt4.u) kz5.n0.X(arrayList)).f243292a / 100) * 100;
            tVar.f243287a = i19 + 1;
            tVar.f243288b = i19 + 31;
            arrayList2.add(tVar);
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI2 = this.f266614d;
            if (walletLedgerMainUI2.f180436o == 1) {
                dt4.p pVar2 = walletLedgerMainUI2.f180444w;
                if (pVar2 == null) {
                    kotlin.jvm.internal.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar2.l(walletLedgerMainUI2.f180437p, arrayList2);
            } else {
                dt4.p pVar3 = walletLedgerMainUI2.f180444w;
                if (pVar3 == null) {
                    kotlin.jvm.internal.o.o("ledgerDataCenter");
                    throw null;
                }
                m17 = pVar3.m(walletLedgerMainUI2.f180437p, arrayList2);
            }
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI3 = this.f266614d;
            int V6 = walletLedgerMainUI3.V6(m17, walletLedgerMainUI3.f180441t);
            if (V6 == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WalletLedgerMainUI", "loadTopMore pos:" + this.f266616f + ", getSectionData count is 0");
                ft4.i iVar = this.f266614d.f180442u;
                if (iVar != null) {
                    iVar.f266625g = 0;
                }
                if (iVar != null) {
                    iVar.notifyItemRemoved(this.f266616f);
                }
            } else {
                com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI walletLedgerMainUI4 = this.f266614d;
                ft4.i iVar2 = walletLedgerMainUI4.f180442u;
                if (iVar2 != null) {
                    java.util.List list = walletLedgerMainUI4.f180441t;
                    kotlin.jvm.internal.o.g(list, "<set-?>");
                    iVar2.f266623e = list;
                }
                ft4.i iVar3 = this.f266614d.f180442u;
                if (iVar3 != null) {
                    iVar3.notifyItemRangeInserted(this.f266616f, V6);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerMainUI", "loadTopMore pos:" + this.f266616f + ", more > " + this.f266615e.f266632b.f266638c);
            ft4.i iVar4 = this.f266614d.f180442u;
            if (iVar4 != null) {
                iVar4.f266625g = 0;
            }
            if (iVar4 != null) {
                iVar4.notifyItemRemoved(this.f266616f);
            }
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ft4.f0 f0Var = new ft4.f0(this.f266614d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(f0Var, 20L, false);
    }
}
