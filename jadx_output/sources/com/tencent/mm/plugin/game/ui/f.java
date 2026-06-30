package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f141378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.j f141379e;

    public f(com.tencent.mm.plugin.game.ui.j jVar, boolean z17) {
        this.f141379e = jVar;
        this.f141378d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.game.ui.j jVar = this.f141379e;
        g0Var.d(14217, jVar.f141427f.field_appId, 5, "", jVar.f141427f.f238368J, 2);
        jVar.a(this.f141378d);
        dialogInterface.dismiss();
    }
}
