package vd2;

/* loaded from: classes10.dex */
public final class d2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.e2 f435700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f435701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435702c;

    public d2(vd2.e2 e2Var, long j17, java.lang.String str) {
        this.f435700a = e2Var;
        this.f435701b = j17;
        this.f435702c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        vd2.e2 e2Var = this.f435700a;
        java.util.HashSet hashSet = e2Var.f435716o;
        long j17 = this.f435701b;
        hashSet.remove(java.lang.Long.valueOf(j17));
        r45.uk2 uk2Var = (r45.uk2) fVar.f70618d;
        java.lang.String str = this.f435702c;
        if (uk2Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveNotifyGetMoreLiveService", "cgiGetMoreLive: resp is null, source=" + str + ", feedId=" + pm0.v.u(j17));
        } else if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            e2Var.f435715n.put(java.lang.Long.valueOf(j17), new jz5.l(uk2Var, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() + (uk2Var.getInteger(5) * 1000))));
            if (!uk2Var.getBoolean(12)) {
                e2Var.f435709e = 0;
            }
            if (e2Var.f435708d && (f9Var = (com.tencent.mm.storage.f9) e2Var.f435712h.get(java.lang.Long.valueOf(j17))) != null) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
            }
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyGetMoreLiveService", "cgiGetMoreLive: cgi success, source=" + str + ", feedId=" + pm0.v.u(j17) + ", hasEnterServiceNotify=" + e2Var.f435708d + ", req_interval=" + uk2Var.getInteger(5) + ", is_enable=" + uk2Var.getBoolean(12));
        } else {
            com.tencent.mars.xlog.Log.w("FinderLiveNotifyGetMoreLiveService", "cgiGetMoreLive: cgi fail, source=" + str + ", feedId=" + pm0.v.u(j17) + ", errType=" + fVar.f70615a + ", errCode=" + fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
