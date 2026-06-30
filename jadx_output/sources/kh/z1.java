package kh;

/* loaded from: classes12.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.d2 f307963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(kh.d2 d2Var) {
        super(0);
        this.f307963d = d2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kh.m1 m1Var = com.tencent.matrix.battery.TaskProfiler$AccTaskJiffyStats.Companion;
        java.util.Map<java.lang.String, java.lang.Long> accRunTaskStats = this.f307963d.b().getAccRunTaskStats();
        m1Var.getClass();
        kotlin.jvm.internal.o.g(accRunTaskStats, "<this>");
        kotlin.jvm.internal.m0.c(accRunTaskStats).clear();
        return jz5.f0.f302826a;
    }
}
