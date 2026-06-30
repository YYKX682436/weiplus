package vm1;

/* loaded from: classes11.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f438043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f438044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(long j17, long j18, vm1.x0 x0Var, yz5.l lVar) {
        super(0);
        this.f438043d = j17;
        this.f438044e = j18;
        this.f438045f = x0Var;
        this.f438046g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.f8 f8Var = (qk.f8) i95.n0.c(qk.f8.class);
        double d17 = this.f438043d;
        double d18 = this.f438044e;
        gf0.r rVar = (gf0.r) f8Var;
        rVar.f271233f = d17;
        rVar.f271234g = d18;
        gf0.r rVar2 = (gf0.r) ((qk.f8) i95.n0.c(qk.f8.class));
        rVar2.f271236i = null;
        rVar2.f271237m = null;
        rVar2.f271238n = null;
        rVar2.f271235h = null;
        rVar2.f271239o = null;
        qk.f8 f8Var2 = (qk.f8) i95.n0.c(qk.f8.class);
        vm1.x0 x0Var = this.f438045f;
        vm1.o0 o0Var = new vm1.o0(x0Var);
        gf0.r rVar3 = (gf0.r) f8Var2;
        rVar3.getClass();
        rVar3.f271238n = o0Var;
        qk.f8 f8Var3 = (qk.f8) i95.n0.c(qk.f8.class);
        vm1.p0 p0Var = new vm1.p0(this.f438046g);
        gf0.r rVar4 = (gf0.r) f8Var3;
        rVar4.getClass();
        rVar4.f271236i = p0Var;
        qk.f8 f8Var4 = (qk.f8) i95.n0.c(qk.f8.class);
        android.app.Activity activity = x0Var.f438069e;
        kotlin.jvm.internal.o.d(activity);
        ((gf0.r) f8Var4).Ai(activity);
        return jz5.f0.f302826a;
    }
}
