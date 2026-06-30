package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class j0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152653d;

    public j0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152653d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) this.f152653d.f152578b).j7(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "do changeBankcard");
    }
}
