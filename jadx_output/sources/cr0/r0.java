package cr0;

/* loaded from: classes12.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f221728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f221731g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f221732h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(cr0.u0 u0Var, java.lang.String str, java.lang.String str2, long j17, long j18) {
        super(0);
        this.f221728d = u0Var;
        this.f221729e = str;
        this.f221730f = str2;
        this.f221731g = j17;
        this.f221732h = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cr0.b bVar = com.tencent.mm.matrix.battery.AccBinderCallsStats.Companion;
        cr0.u0 u0Var = this.f221728d;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> accBinderCallsStats = u0Var.c().getAccBinderCallsStats();
        bVar.getClass();
        kotlin.jvm.internal.o.g(accBinderCallsStats, "<this>");
        java.util.Map c17 = kotlin.jvm.internal.m0.c(accBinderCallsStats);
        java.lang.String str = this.f221729e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(str, obj);
        }
        java.util.Map c18 = kotlin.jvm.internal.m0.c((java.util.Map) obj);
        java.lang.String str2 = this.f221730f;
        java.lang.Object obj2 = c18.get(str2);
        if (obj2 == null) {
            obj2 = new com.tencent.mm.matrix.battery.BinderTracker$Timer(0, 0L, 3, null);
            c18.put(str2, obj2);
        }
        com.tencent.mm.matrix.battery.BinderTracker$Timer binderTracker$Timer = (com.tencent.mm.matrix.battery.BinderTracker$Timer) obj2;
        binderTracker$Timer.f68689d++;
        long j17 = binderTracker$Timer.f68690e;
        long j18 = this.f221731g - this.f221732h;
        if (j18 < 0) {
            j18 = 0;
        }
        if (j18 >= 60000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BinderTracker", "long binderProxy calling: " + j18 + "ms, name=" + str + ", code=" + str2);
        }
        binderTracker$Timer.f68690e = j17 + j18;
        if (u0Var.c().getAccBeginTime() <= 0) {
            u0Var.c().setAccBeginTime(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f302826a;
    }
}
