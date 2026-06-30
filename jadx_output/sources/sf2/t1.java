package sf2;

/* loaded from: classes5.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f407289d = hVar;
        this.f407290e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.t1(this.f407289d, continuation, this.f407290e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.t1 t1Var = (sf2.t1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.vt1 vt1Var = (r45.vt1) ((xg2.i) this.f407289d).f454393b;
        this.f407290e.f310123d = vt1Var.f388514d;
        return jz5.f0.f302826a;
    }
}
