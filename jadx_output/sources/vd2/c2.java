package vd2;

/* loaded from: classes10.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.e2 f435675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f435676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f435677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.vk2 f435678g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(vd2.e2 e2Var, long j17, int i17, r45.vk2 vk2Var) {
        super(0);
        this.f435675d = e2Var;
        this.f435676e = j17;
        this.f435677f = i17;
        this.f435678g = vk2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vd2.e2 e2Var = this.f435675d;
        java.util.HashMap hashMap = e2Var.f435713i;
        long j17 = this.f435676e;
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() + (this.f435677f * 1000)));
        r45.vk2 vk2Var = this.f435678g;
        if (vk2Var != null) {
            e2Var.f435714m.put(java.lang.Long.valueOf(j17), vk2Var);
            if (e2Var.f435710f != vk2Var.getInteger(2)) {
                if (e2Var.f435710f == 0) {
                    e2Var.f435709e = vk2Var.getInteger(2);
                }
                e2Var.f435710f = vk2Var.getInteger(2);
                com.tencent.mars.xlog.Log.i("FinderLiveNotifyGetMoreLiveService", "addLiveInfoCache: update recommend max cnt = " + e2Var.f435710f);
            }
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) e2Var.f435712h.get(java.lang.Long.valueOf(j17));
        if (f9Var != null) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
        }
        e2Var.Ai("addLiveInfoCache");
        return jz5.f0.f302826a;
    }
}
