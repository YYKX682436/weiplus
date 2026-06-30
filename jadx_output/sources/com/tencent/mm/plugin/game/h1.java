package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public final class h1 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.l1 f139455d;

    public h1(com.tencent.mm.plugin.game.l1 l1Var) {
        this.f139455d = l1Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        wu5.c cVar;
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "onAppBackground");
        com.tencent.mm.plugin.game.l1 l1Var = this.f139455d;
        l1Var.f139471g = true;
        wu5.c cVar2 = l1Var.f139470f;
        if (cVar2 != null) {
            kotlin.jvm.internal.o.d(cVar2);
            if (!cVar2.isDone() && (cVar = this.f139455d.f139470f) != null) {
                cVar.cancel(true);
            }
        }
        com.tencent.mm.plugin.game.l1 l1Var2 = this.f139455d;
        l1Var2.f139470f = ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.plugin.game.e1(l1Var2), 500L, "GameLiteAppStoreService.SerialQueue");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "onAppForeground ".concat(this.f139455d.f139472h ? "cool start" : "hot start"));
        com.tencent.mm.plugin.game.l1 l1Var = this.f139455d;
        l1Var.f139471g = false;
        if (!l1Var.f139472h) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.g1(this.f139455d), "GameLiteAppStoreService.SerialQueue");
        } else {
            l1Var.f139472h = false;
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.f1(this.f139455d), "GameLiteAppStoreService.SerialQueue");
        }
    }
}
