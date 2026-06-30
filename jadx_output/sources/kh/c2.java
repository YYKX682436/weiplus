package kh;

/* loaded from: classes12.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d2 f307771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f307773f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(kh.d2 d2Var, java.lang.String str, long j17) {
        super(0);
        this.f307771d = d2Var;
        this.f307772e = str;
        this.f307773f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kh.m1 m1Var = com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats.Companion;
        java.util.Map<java.lang.String, java.lang.Long> accRunTaskStats = this.f307771d.b().getAccRunTaskStats();
        m1Var.getClass();
        kotlin.jvm.internal.o.g(accRunTaskStats, "<this>");
        java.util.Map c17 = kotlin.jvm.internal.m0.c(accRunTaskStats);
        java.lang.String str = this.f307772e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = 0L;
        }
        c17.put(str, java.lang.Long.valueOf(((java.lang.Number) obj).longValue() + this.f307773f));
        return jz5.f0.f302826a;
    }
}
