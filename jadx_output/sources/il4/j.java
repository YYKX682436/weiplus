package il4;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final il4.j f292139d = new il4.j();

    @Override // java.lang.Runnable
    public final void run() {
        if (kotlin.jvm.internal.o.b(il4.l.f292145d, java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicUtils", "clearExploreSessionsContext but has update exploreSessionsContext");
            return;
        }
        if (((ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class))).Ai()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicUtils", "clearExploreSessionsContext but has ting instance");
            return;
        }
        il4.l lVar = il4.l.f292142a;
        il4.l.f292146e = null;
        b66.x Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            urgen.ur_2BA9.UR_5769.UR_82F8(((b66.y) Zi).getCppPointer(), 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMusicUtils", "clearExploreSessionsContext");
    }
}
