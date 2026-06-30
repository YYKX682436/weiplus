package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.x5 f139770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139771g;

    public w5(java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, com.tencent.mm.plugin.game.luggage.jsapi.x5 x5Var, android.content.Context context) {
        this.f139768d = str;
        this.f139769e = q5Var;
        this.f139770f = x5Var;
        this.f139771g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.p0 p0Var = (com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class));
        java.lang.String str = this.f139768d;
        m33.g1 mj6 = p0Var.mj(str);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139769e;
        if (mj6 == null) {
            q5Var.a("videoId not exist in client", null);
        }
        if (!com.tencent.mm.vfs.w6.j(mj6.f323290d)) {
            this.f139770f.getClass();
            com.tencent.mars.xlog.Log.e("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + str + ", local file not exist");
            q5Var.a("local file not exist", null);
            return;
        }
        m33.k1 k1Var = new m33.k1();
        k1Var.f323303a = mj6.f323288b;
        k1Var.f323306d = mj6.f323296j;
        k1Var.f323304b = mj6.f323289c;
        k1Var.f323305c = mj6.f323290d;
        k1Var.f323307e = mj6.f323294h;
        k1Var.f323308f = mj6.f323295i;
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.game.luggage.jsapi.v5(this.f139771g, k1Var, this.f139770f, this.f139768d, this.f139769e));
    }
}
