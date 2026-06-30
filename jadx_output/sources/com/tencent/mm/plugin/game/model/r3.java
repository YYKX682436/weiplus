package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.s3 f140432d;

    public r3(com.tencent.mm.plugin.game.model.s3 s3Var) {
        this.f140432d = s3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.model.s3 s3Var = this.f140432d;
        sd.o0 c17 = com.tencent.mm.plugin.game.luggage.p1.c(s3Var.f140438a);
        if (c17 != null) {
            ((com.tencent.mm.plugin.game.luggage.page.b0) c17.h()).setBlockNetworkImage(true);
            ((com.tencent.mm.plugin.game.luggage.page.b0) c17.h()).onPause();
        }
        s3Var.f140439b.f68191x = java.lang.System.currentTimeMillis();
        java.lang.String str = com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.f140182h;
        com.tencent.mm.ipcinvoker.r rVar = s3Var.f140440c;
        if (rVar != null) {
            rVar.a(s3Var.f140441d);
        }
    }
}
