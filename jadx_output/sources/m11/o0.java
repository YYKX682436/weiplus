package m11;

/* loaded from: classes12.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f322764a = new java.util.HashSet();

    public static boolean a(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgService", "remove Run %s", java.lang.Long.valueOf(j17));
        return ((java.util.HashSet) f322764a).remove(java.lang.Long.valueOf(j17));
    }

    public static void b(long j17) {
        com.tencent.mm.storage.f9 Li;
        oi3.d dVar = new oi3.d();
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.ImgService", "setImgError, %d, stack = %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(j17));
        if (C1.f322633a <= 0) {
            return;
        }
        m11.b0 z18 = m11.b1.Di().z1(C1.f322633a);
        if (z18 != null) {
            z18.D(-1);
            m11.b1.Di().F4(java.lang.Long.valueOf(z18.f322633a), z18);
            Li = pt0.f0.Li(z18.f322645m, z18.f322647o);
        } else {
            C1.D(-1);
            m11.b1.Di().F4(java.lang.Long.valueOf(j17), C1);
            Li = pt0.f0.Li(C1.f322645m, C1.f322647o);
        }
        if (Li.getMsgId() == 0) {
            return;
        }
        long msgId = Li.getMsgId();
        java.util.Map map = oi3.c.f345614a;
        oi3.c.f345614a.put(java.lang.Long.valueOf(msgId), dVar);
        Li.r1(5);
        jx3.f.INSTANCE.idkeyStat(111L, 31L, 1L, true);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb((int) Li.getMsgId(), Li, true);
    }
}
