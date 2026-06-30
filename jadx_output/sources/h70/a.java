package h70;

@j95.b
/* loaded from: classes8.dex */
public final class a extends i95.w implements f70.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f279371d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f279372e = new java.lang.Object();

    public void Ai() {
        if (this.f279371d) {
            return;
        }
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).aj();
        ((mn3.h) ((ra0.u) i95.n0.c(ra0.u.class))).Zi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        if (hm4.c.f282293a.b()) {
            arrayList.add(10);
        }
        arrayList.add(11);
        w71.m1 wi6 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initAffSync businessTypeList: %s, reddotSyncManager: ");
        sb6.append(wi6 != null ? java.lang.Integer.valueOf(wi6.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AffRedDotFeatureService", sb6.toString(), kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        if (wi6 != null) {
            synchronized (this.f279372e) {
                if (this.f279371d) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AffRedDotFeatureService", "initAffSync has init and ignore");
                } else {
                    this.f279371d = true;
                    urgen.ur_C563.UR_379F.UR_75EC(((w71.n1) wi6).getCppPointer(), kz5.n0.R0(arrayList));
                }
            }
        }
    }

    public w71.m1 wi() {
        int i17 = w71.n1.f443422d;
        return (w71.m1) urgen.ur_C563.UR_379F.UR_1332();
    }
}
