package cr0;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.j f221616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.AccBinderCallsStats f221617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.AccBinderCallsStats f221618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cr0.j jVar, com.tencent.mm.matrix.battery.AccBinderCallsStats accBinderCallsStats, com.tencent.mm.matrix.battery.AccBinderCallsStats accBinderCallsStats2) {
        super(0);
        this.f221616d = jVar;
        this.f221617e = accBinderCallsStats;
        this.f221618f = accBinderCallsStats2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedHashMap d17 = this.f221616d.d();
        com.tencent.mm.matrix.battery.AccBinderCallsStats accBinderCallsStats = this.f221617e;
        java.lang.String accProcName = accBinderCallsStats.getAccProcName();
        java.util.Iterator<T> it = accBinderCallsStats.getAccBinderCallsStats().values().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.Map) it.next()).values().iterator();
            long j18 = 0;
            while (it6.hasNext()) {
                j18 += ((com.tencent.mm.matrix.battery.BinderTracker$Timer) it6.next()).f68690e;
            }
            j17 += j18;
        }
        d17.put(accProcName, java.lang.Long.valueOf(j17));
        this.f221618f.merge(accBinderCallsStats);
        return jz5.f0.f302826a;
    }
}
