package cr0;

/* loaded from: classes12.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f221665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(cr0.u0 u0Var) {
        super(0);
        this.f221665d = u0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> accBinderCallsStats = this.f221665d.c().getAccBinderCallsStats();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dump ProxyCalls: size=");
        sb6.append(accBinderCallsStats.size());
        sb6.append(", totalMs=");
        java.util.Iterator<T> it = accBinderCallsStats.values().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.Map) it.next()).values().iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                j18 += ((com.tencent.mm.matrix.battery.BinderTracker$Timer) it6.next()).f68690e;
            }
            j17 += j18;
        }
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BinderTracker", sb6.toString());
        for (java.util.Map.Entry entry : kz5.c1.q(kz5.n0.x0(kz5.n0.F0(kz5.e1.v(accBinderCallsStats), new cr0.j1()))).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Map map = (java.util.Map) entry.getValue();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" - ProxyCall: ");
            sb7.append(str);
            sb7.append('=');
            java.util.Iterator it7 = map.values().iterator();
            long j19 = 0;
            while (it7.hasNext()) {
                j19 += ((com.tencent.mm.matrix.battery.BinderTracker$Timer) it7.next()).f68690e;
            }
            sb7.append(j19);
            com.tencent.mars.xlog.Log.i("MicroMsg.BinderTracker", sb7.toString());
        }
        return jz5.f0.f302826a;
    }
}
