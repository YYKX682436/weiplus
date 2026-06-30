package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class c implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.d f141067d;

    public c(com.tencent.mm.plugin.game.ui.d dVar) {
        this.f141067d = dVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.game.ui.d dVar = this.f141067d;
        dVar.f141355g.d();
        com.tencent.mm.sdk.platformtools.b4 b4Var = dVar.f141355g;
        int i17 = com.tencent.mm.plugin.game.ui.d.f141351i;
        long j17 = 500;
        b4Var.c(j17, j17);
    }
}
