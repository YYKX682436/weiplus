package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.l1 f139463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cl0.g f139465f;

    public k1(com.tencent.mm.plugin.game.l1 l1Var, java.lang.String str, cl0.g gVar) {
        this.f139463d = l1Var;
        this.f139464e = str;
        this.f139465f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mm.plugin.game.l1.wi(this.f139463d)) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            java.lang.String str = this.f139464e;
            cl0.g gVar = this.f139465f;
            com.tencent.mm.plugin.lite.w.l(str, gVar);
            com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "publishGlobalEventToAll, " + str + ", " + gVar);
        }
    }
}
