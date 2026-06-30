package hr5;

/* loaded from: classes15.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f284498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f284499f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(hr5.a1 a1Var, long j17, long j18) {
        super(1);
        this.f284497d = a1Var;
        this.f284498e = j17;
        this.f284499f = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zq5.v a17;
        long j17 = ((zq5.l) obj).f475080a;
        hr5.a1 a1Var = this.f284497d;
        zq5.v vVar = a1Var.f284296t;
        long c17 = a1Var.c(j17, vVar.c());
        boolean z17 = !(c17 == vVar.f475096b);
        if (z17) {
            a17 = r12.a((r20 & 1) != 0 ? r12.f475095a : 0L, (r20 & 2) != 0 ? r12.f475096b : c17, (r20 & 4) != 0 ? r12.f475097c : 0.0f, (r20 & 8) != 0 ? r12.f475098d : 0L, (r20 & 16) != 0 ? a1Var.f284296t.f475099e : 0L);
            a1Var.f284277a.d(new hr5.x(a1Var, this.f284498e, this.f284499f, a17, z17));
            a1Var.j(a17);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
