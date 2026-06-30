package lc5;

/* loaded from: classes8.dex */
public final class t implements gp1.y {

    /* renamed from: d, reason: collision with root package name */
    public static final lc5.t f318032d = new lc5.t();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f318033e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f318034f;

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfoList, "ballInfoList");
        java.util.HashSet Q0 = kz5.n0.Q0(ballInfoList);
        java.util.Iterator it = f318033e.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            lc5.s sVar = (lc5.s) next;
            if (!Q0.contains(sVar.f318030b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageFloatBallMgr", "remove msgId=" + sVar.f318029a + ", talker=" + sVar.f318031c);
                it.remove();
            }
        }
        a();
    }

    public final void a() {
        if (f318033e.isEmpty()) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n(this);
            f318034f = false;
        }
    }

    public final void b(long j17, java.lang.String str) {
        java.util.Iterator it = f318033e.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            lc5.s sVar = (lc5.s) next;
            if (sVar.f318029a == j17 && kotlin.jvm.internal.o.b(sVar.f318031c, str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageFloatBallMgr", "deleteImageFloatBall msgId: " + j17 + ", talker: " + str);
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(sVar.f318030b);
                it.remove();
                a();
                return;
            }
        }
        a();
    }
}
