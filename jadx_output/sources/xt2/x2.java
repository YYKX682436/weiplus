package xt2;

/* loaded from: classes3.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f457096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f457097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(xt2.e3 e3Var, cm2.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f457096e = e3Var;
        this.f457097f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xt2.x2 x2Var = new xt2.x2(this.f457096e, this.f457097f, continuation);
        x2Var.f457095d = obj;
        return x2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xt2.x2 x2Var = (xt2.x2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f457095d;
        xt2.e3 e3Var = this.f457096e;
        kotlinx.coroutines.r2 job = e3Var.getJob();
        if (job != null) {
            kotlinx.coroutines.p2.a(job, null, 1, null);
        }
        e3Var.setJob(kotlinx.coroutines.l.d(y0Var, null, null, new xt2.w2(e3Var, this.f457097f, null), 3, null));
        return jz5.f0.f302826a;
    }
}
