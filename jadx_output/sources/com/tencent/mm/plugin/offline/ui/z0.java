package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class z0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152770d;

    public z0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152770d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        h45.a0.c(this.f152770d.f152577a, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "do startBindBankcard");
    }
}
