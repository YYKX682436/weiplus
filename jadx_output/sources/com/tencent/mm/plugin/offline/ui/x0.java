package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class x0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152758d;

    public x0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152758d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        h45.a0.c(this.f152758d.f152577a, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineLogicMgr", "do startBindBankcard");
    }
}
