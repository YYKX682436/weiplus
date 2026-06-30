package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j4 f139676g;

    public i4(java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.content.Context context, com.tencent.mm.plugin.game.luggage.jsapi.j4 j4Var) {
        this.f139673d = str;
        this.f139674e = q5Var;
        this.f139675f = context;
        this.f139676g = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.p0 p0Var = (com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class));
        java.lang.String str = this.f139673d;
        m33.g1 mj6 = p0Var.mj(str);
        com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139674e;
        if (mj6 == null) {
            q5Var.a("videoId not exist in client", null);
        }
        boolean j17 = com.tencent.mm.vfs.w6.j(mj6.f323290d);
        com.tencent.mm.plugin.game.luggage.jsapi.j4 j4Var = this.f139676g;
        if (j17) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            java.lang.String str2 = mj6.f323290d;
            android.content.Context context = this.f139675f;
            ((yb0.g) b0Var).Bi(context, str2, new com.tencent.mm.plugin.game.luggage.jsapi.h4(j4Var, context, q5Var, str));
            return;
        }
        j4Var.getClass();
        com.tencent.mars.xlog.Log.e("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, error videoId = " + str + ", local file not exist");
        q5Var.a("local file not exist", null);
    }
}
