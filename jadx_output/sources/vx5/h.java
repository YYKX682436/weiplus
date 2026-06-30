package vx5;

/* loaded from: classes13.dex */
public class h implements tx5.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.n f441350a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f441351b = new java.util.concurrent.ConcurrentHashMap();

    public h() {
        if (!com.tencent.xweb.o2.c() || !org.xwalk.core.XWalkEnvironment.t()) {
            by5.c4.f("PinusProfileStoreWrapper", "PinusProfileStoreWrapper not used, isSupportMultiProfile:" + com.tencent.xweb.o2.c() + ", isCurrentVersionSupportMultiProfile:" + org.xwalk.core.XWalkEnvironment.t());
            return;
        }
        try {
            this.f441350a = com.tencent.xweb.pinus.sdk.m.f220460a;
        } catch (java.lang.Exception e17) {
            by5.c4.g("PinusProfileStoreWrapper", "Create pinus profile store failed." + android.util.Log.getStackTraceString(e17));
            xx5.l.a(10, 1, com.tencent.xweb.o2.c());
        }
    }

    @Override // tx5.d
    public tx5.c getOrCreateProfile(java.lang.String str) {
        vx5.g gVar = (vx5.g) ((java.util.concurrent.ConcurrentHashMap) this.f441351b).get(str);
        if (gVar != null) {
            return gVar;
        }
        try {
            com.tencent.xweb.pinus.sdk.k a17 = this.f441350a.a(str);
            synchronized (this.f441351b) {
                if (a17 == null) {
                    return null;
                }
                vx5.g gVar2 = new vx5.g(a17);
                ((java.util.concurrent.ConcurrentHashMap) this.f441351b).put(str, gVar2);
                return gVar2;
            }
        } catch (java.lang.Exception e17) {
            by5.c4.c("PinusProfileStoreWrapper", "getOrCreateProfile error: " + e17);
            return null;
        }
    }
}
