package n0;

/* loaded from: classes14.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.k4 f333679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f333680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f333681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(n0.k4 k4Var, n0.d dVar, java.util.List list) {
        super(3);
        this.f333679d = k4Var;
        this.f333680e = dVar;
        this.f333681f = list;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g(rememberManager, "rememberManager");
        java.util.List list = this.f333681f;
        n0.k4 k4Var = this.f333679d;
        n0.o4 j17 = k4Var.j();
        try {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((yz5.q) list.get(i17)).invoke(applier, j17, rememberManager);
            }
            j17.e();
            int i18 = slots.f333655m;
            slots.f333655m = i18 + 1;
            if (i18 == 0) {
                slots.f333658p.b(((slots.f333644b.length / 5) - slots.f333648f) - slots.f333649g);
            }
            n0.d dVar = this.f333680e;
            dVar.getClass();
            slots.s(k4Var, k4Var.e(dVar));
            slots.i();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            j17.e();
            throw th6;
        }
    }
}
