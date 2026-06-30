package dz0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.yb f245010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f245011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.e f245012g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245013h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(az0.yb ybVar, kotlin.jvm.internal.h0 h0Var, az0.e eVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f245010e = ybVar;
        this.f245011f = h0Var;
        this.f245012g = eVar;
        this.f245013h = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.t0 t0Var = new dz0.t0(this.f245010e, this.f245011f, this.f245012g, this.f245013h, (kotlin.coroutines.Continuation) obj3);
        t0Var.f245009d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        t0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f245010e.f16090a = ((java.lang.Throwable) this.f245009d) == null && this.f245011f.f310123d == null;
        az0.e eVar = this.f245012g;
        if (eVar != null) {
            ((mz0.w1) eVar).b(this.f245013h);
        }
        return jz5.f0.f302826a;
    }
}
