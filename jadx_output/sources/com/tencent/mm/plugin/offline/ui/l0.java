package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class l0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152664d;

    public l0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152664d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        android.app.Activity activity = this.f152664d.f152577a;
        yo3.m.y(activity, "freeze", activity.getString(com.tencent.mm.R.string.l1r), 0, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "doFreezeOffline");
    }
}
