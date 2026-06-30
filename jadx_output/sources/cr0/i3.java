package cr0;

/* loaded from: classes12.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f221650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f221651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(q01.s0 s0Var, long j17) {
        super(0);
        this.f221650d = s0Var;
        this.f221651e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cr0.b bVar = com.tencent.mm.matrix.battery.AccBinderCallsStats.Companion;
        com.tencent.mm.matrix.battery.NetSceneProfiler$AccCgiStats netSceneProfiler$AccCgiStats = cr0.k3.f221668c;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.tencent.mm.matrix.battery.BinderTracker$Timer>> accFinCgiStats = netSceneProfiler$AccCgiStats.getAccFinCgiStats();
        bVar.getClass();
        kotlin.jvm.internal.o.g(accFinCgiStats, "<this>");
        java.util.Map c17 = kotlin.jvm.internal.m0.c(accFinCgiStats);
        q01.s0 s0Var = this.f221650d;
        java.lang.String valueOf = java.lang.String.valueOf(s0Var.f359332d);
        java.lang.Object obj = c17.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(valueOf, obj);
        }
        java.util.Map c18 = kotlin.jvm.internal.m0.c((java.util.Map) obj);
        java.lang.String valueOf2 = java.lang.String.valueOf((java.lang.String) ((jz5.n) s0Var.f359333e).getValue());
        java.lang.Object obj2 = c18.get(valueOf2);
        if (obj2 == null) {
            obj2 = new com.tencent.mm.matrix.battery.BinderTracker$Timer(0, 0L, 3, null);
            c18.put(valueOf2, obj2);
        }
        com.tencent.mm.matrix.battery.BinderTracker$Timer binderTracker$Timer = (com.tencent.mm.matrix.battery.BinderTracker$Timer) obj2;
        binderTracker$Timer.f68689d++;
        binderTracker$Timer.f68690e += this.f221651e;
        if (netSceneProfiler$AccCgiStats.getAccBeginTime() <= 0) {
            netSceneProfiler$AccCgiStats.setAccBeginTime(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f302826a;
    }
}
