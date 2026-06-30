package x51;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f451989a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final y61.f f451990b = new x51.a();

    public static boolean a(y61.f fVar) {
        long id6 = java.lang.Thread.currentThread().getId();
        boolean a17 = r61.q0.a();
        if (a17) {
            com.tencent.mm.sdk.platformtools.u3.h(new x51.b(id6, fVar));
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AddrBookSyncHelper", "canSync:%b, skip", java.lang.Boolean.valueOf(a17));
        return false;
    }
}
