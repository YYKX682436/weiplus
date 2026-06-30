package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f139402a = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.game.commlib.util.e.class, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "getSessionId()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.game.commlib.util.e.class, "timeStamp", "getTimeStamp()J", 0))};

    public e(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.game.commlib.util.g a() {
        if (com.tencent.mm.plugin.game.commlib.util.g.f139407e == null) {
            synchronized (com.tencent.mm.plugin.game.commlib.util.g.class) {
                if (com.tencent.mm.plugin.game.commlib.util.g.f139407e == null) {
                    com.tencent.mm.plugin.game.commlib.util.g.f139407e = new com.tencent.mm.plugin.game.commlib.util.g(null);
                }
            }
        }
        com.tencent.mm.plugin.game.commlib.util.g gVar = com.tencent.mm.plugin.game.commlib.util.g.f139407e;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.o.o("instance");
        throw null;
    }

    public final long b() {
        return ((java.lang.Number) com.tencent.mm.plugin.game.commlib.util.g.f139406d.b(this, f139402a[1])).longValue();
    }

    public final void c() {
        if (com.tencent.mm.plugin.game.commlib.util.g.f139407e == null) {
            synchronized (com.tencent.mm.plugin.game.commlib.util.g.class) {
                if (com.tencent.mm.plugin.game.commlib.util.g.f139407e == null) {
                    com.tencent.mm.plugin.game.commlib.util.g.f139407e = new com.tencent.mm.plugin.game.commlib.util.g(null);
                    return;
                }
            }
        }
        if (!(java.lang.System.currentTimeMillis() - b() > 300000 && com.tencent.mm.plugin.game.commlib.util.i.f139412d.getInt("existNum", 0) == 0)) {
            com.tencent.mm.plugin.game.commlib.util.g.f139406d.c(this, f139402a[1], java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        m53.p1 p1Var = new m53.p1();
        com.tencent.mm.plugin.game.commlib.util.g gVar = com.tencent.mm.plugin.game.commlib.util.g.f139407e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("instance");
            throw null;
        }
        p1Var.f323959d = gm0.j1.a() ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) gVar.f139408a).getValue()).intValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p1Var.f323960e = currentTimeMillis;
        nf.r rVar = com.tencent.mm.plugin.game.commlib.util.g.f139406d;
        f06.v[] vVarArr = f139402a;
        rVar.c(this, vVarArr[1], java.lang.Long.valueOf(currentTimeMillis));
        java.lang.String encodeToString = android.util.Base64.encodeToString(p1Var.toByteArray(), 2);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        com.tencent.mm.plugin.game.commlib.util.g.f139405c.c(this, vVarArr[0], encodeToString);
    }
}
