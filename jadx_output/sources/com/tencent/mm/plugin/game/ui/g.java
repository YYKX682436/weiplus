package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.j f141389d;

    public g(com.tencent.mm.plugin.game.ui.j jVar) {
        this.f141389d = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.game.ui.j jVar = this.f141389d;
        g0Var.d(14217, jVar.f141427f.field_appId, 6, "", jVar.f141427f.f238368J, 2);
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonGameClickLinstener", "addDownloadTask not wifi, user cancel");
    }
}
