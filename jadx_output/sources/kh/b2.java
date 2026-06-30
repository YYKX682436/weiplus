package kh;

/* loaded from: classes12.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d2 f307758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(kh.d2 d2Var, java.lang.String str, long j17) {
        super(0);
        this.f307758d = d2Var;
        this.f307759e = str;
        this.f307760f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kh.m1 m1Var = com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats.Companion;
        kh.d2 d2Var = this.f307758d;
        java.util.Map<java.lang.String, com.tencent.matrix.battery.TaskProfiler$Timer> accFinTaskStats = d2Var.b().getAccFinTaskStats();
        m1Var.getClass();
        kotlin.jvm.internal.o.g(accFinTaskStats, "<this>");
        java.util.Map c17 = kotlin.jvm.internal.m0.c(accFinTaskStats);
        java.lang.String str = this.f307759e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = new com.tencent.matrix.battery.TaskProfiler$Timer(0, 0L, 3, null);
            c17.put(str, obj);
        }
        com.tencent.matrix.battery.TaskProfiler$Timer taskProfiler$Timer = (com.tencent.matrix.battery.TaskProfiler$Timer) obj;
        taskProfiler$Timer.f52548d++;
        taskProfiler$Timer.f52549e += this.f307760f;
        if (d2Var.b().getAccBeginTime() <= 0) {
            d2Var.b().setAccBeginTime(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f302826a;
    }
}
