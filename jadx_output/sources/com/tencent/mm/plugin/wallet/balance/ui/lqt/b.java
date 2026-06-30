package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final r45.de4 f178096d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f178097e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet.balance.ui.lqt.c f178098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.d f178099g;

    public b(com.tencent.mm.plugin.wallet.balance.ui.lqt.d dVar, android.content.Context context, r45.de4 de4Var, com.tencent.mm.plugin.wallet.balance.ui.lqt.c cVar) {
        this.f178099g = dVar;
        this.f178097e = context;
        this.f178096d = de4Var;
        this.f178098f = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context;
        this.f178099g.f178128b = null;
        r45.de4 de4Var = this.f178096d;
        if (de4Var == null || (context = this.f178097e) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LqtDialogHelper", "LqtDialogBtn or context is null");
            return;
        }
        int i18 = de4Var.f372350e;
        if (i18 == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(context, de4Var.f372351f, true);
        } else if (i18 == 3) {
            com.tencent.mm.wallet_core.ui.r1.b0(de4Var.f372352g, de4Var.f372353h, 0, 1061);
        } else if (i18 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtDialogHelper", "continue action");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtDialogHelper", "jump type not support native or none");
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.c cVar = this.f178098f;
        if (cVar != null) {
            int i19 = de4Var.f372350e;
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass42 anonymousClass42 = ((com.tencent.mm.plugin.wallet.balance.ui.lqt.g7) cVar).f178187a;
            if (i19 == 2 || i19 == 3) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.this.f178058l1 = true;
            } else if (i19 == 4) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.this.f178053e.a();
            }
        }
    }
}
