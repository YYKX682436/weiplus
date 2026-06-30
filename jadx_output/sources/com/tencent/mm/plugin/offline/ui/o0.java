package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152686d;

    public o0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152686d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        yo3.m.a();
        com.tencent.mm.plugin.offline.ui.a1 a1Var = this.f152686d;
        android.app.Activity activity = a1Var.f152577a;
        db5.e1.T(activity, activity.getResources().getString(com.tencent.mm.R.string.l1k));
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "closeOffline");
        com.tencent.mm.plugin.offline.ui.e eVar = a1Var.f152578b;
        if (eVar != null) {
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) eVar).doSceneProgress(new wo3.j(""), false);
        }
    }
}
