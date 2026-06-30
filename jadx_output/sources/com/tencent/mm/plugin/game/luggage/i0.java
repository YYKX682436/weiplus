package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f139562a = new java.util.concurrent.atomic.AtomicInteger(0);

    public static void a() {
        int decrementAndGet = f139562a.decrementAndGet();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameWebViewActivityStack", "remove count = " + decrementAndGet);
        if (decrementAndGet <= 0) {
            if (h53.j.d() != null) {
                h53.j d17 = h53.j.d();
                d17.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.GameJsCore", "stop");
                d17.f279058h = h53.i.stopped;
                d17.f279056f.a(new h53.f(d17, "onStop"));
                com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new h53.d(d17), false);
                d17.f279059i = b4Var;
                b4Var.c(300000L, 300000L);
            }
            java.lang.String str = vz4.h.f441734a;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameJsServerCommLibPkg", "load");
        }
    }
}
