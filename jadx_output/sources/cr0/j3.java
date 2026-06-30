package cr0;

/* loaded from: classes12.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f221657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f221658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(q01.s0 s0Var, long j17) {
        super(0);
        this.f221657d = s0Var;
        this.f221658e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cr0.b bVar = com.tencent.mm.matrix.battery.AccBinderCallsStats.Companion;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> accRunCgiStats = cr0.k3.f221668c.getAccRunCgiStats();
        bVar.getClass();
        kotlin.jvm.internal.o.g(accRunCgiStats, "<this>");
        java.util.Map c17 = kotlin.jvm.internal.m0.c(accRunCgiStats);
        q01.s0 s0Var = this.f221657d;
        java.lang.String valueOf = java.lang.String.valueOf(s0Var.f359332d);
        java.lang.Object obj = c17.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(valueOf, obj);
        }
        java.util.Map c18 = kotlin.jvm.internal.m0.c((java.util.Map) obj);
        jz5.g gVar = s0Var.f359333e;
        java.lang.String valueOf2 = java.lang.String.valueOf((java.lang.String) ((jz5.n) gVar).getValue());
        java.lang.Object obj2 = c18.get(java.lang.String.valueOf((java.lang.String) ((jz5.n) gVar).getValue()));
        if (obj2 == null) {
            obj2 = 0L;
        }
        c18.put(valueOf2, java.lang.Long.valueOf(((java.lang.Number) obj2).longValue() + this.f221658e));
        return jz5.f0.f302826a;
    }
}
