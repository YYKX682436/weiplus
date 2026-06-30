package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo3.z f152703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152704e;

    public s0(com.tencent.mm.plugin.offline.ui.a1 a1Var, wo3.z zVar) {
        this.f152704e = a1Var;
        this.f152703d = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.offline.ui.e eVar = this.f152704e.f152578b;
        if (eVar != null) {
            wo3.z zVar = this.f152703d;
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) eVar).Y6(1, zVar.f448238f, "", zVar.f448240h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog do pay");
    }
}
