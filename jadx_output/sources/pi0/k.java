package pi0;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f354624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.m1 f354625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f354626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f354627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354628h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pi0.u0 u0Var, pi0.m1 m1Var, long j17, long j18, pi0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f354624d = u0Var;
        this.f354625e = m1Var;
        this.f354626f = j17;
        this.f354627g = j18;
        this.f354628h = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new pi0.k(this.f354624d, this.f354625e, this.f354626f, this.f354627g, this.f354628h, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pi0.k kVar = (pi0.k) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pi0.a aVar2 = new pi0.a();
        java.lang.String str = this.f354624d.f354730a;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar2.f354502a = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pi0.m1 m1Var = this.f354625e;
        sb6.append(m1Var.f354665a);
        sb6.append('/');
        sb6.append(m1Var.f354667c);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.g(sb7, "<set-?>");
        aVar2.f354508g = sb7;
        aVar2.f354503b = this.f354626f - this.f354627g;
        aVar2.f354504c = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pi0.q qVar = this.f354628h;
        aVar2.f354505d = currentTimeMillis - qVar.f354712p;
        aVar2.f354507f = qVar.e();
        int e17 = qVar.e();
        aVar2.f354506e = e17 + (qVar.f354700d != null ? r1.getDestroyEngineCount() : 0);
        qVar.f354711o = aVar2;
        io.flutter.Log.i("MicroMsg.CachedFlutterEngineGroup", "create rootEngine cost:" + aVar2.f354503b);
        return jz5.f0.f302826a;
    }
}
