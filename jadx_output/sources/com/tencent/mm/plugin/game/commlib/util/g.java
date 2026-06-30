package com.tencent.mm.plugin.game.commlib.util;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.game.commlib.util.e f139404b = new com.tencent.mm.plugin.game.commlib.util.e(null);

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f139405c = new nf.r("", "gameSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final nf.r f139406d = new nf.r(0L, "gameSessionTimeStamp");

    /* renamed from: e, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.game.commlib.util.g f139407e;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f139408a;

    public g(kotlin.jvm.internal.i iVar) {
        jz5.g b17 = jz5.h.b(com.tencent.mm.plugin.game.commlib.util.f.f139403d);
        this.f139408a = b17;
        m53.p1 p1Var = new m53.p1();
        p1Var.f323959d = gm0.j1.a() ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) b17).getValue()).intValue();
        com.tencent.mm.plugin.game.commlib.util.e eVar = f139404b;
        p1Var.f323960e = eVar.b();
        java.lang.String encodeToString = android.util.Base64.encodeToString(p1Var.toByteArray(), 2);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        f139405c.c(eVar, com.tencent.mm.plugin.game.commlib.util.e.f139402a[0], encodeToString);
    }
}
