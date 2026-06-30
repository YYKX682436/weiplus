package ij5;

/* loaded from: classes.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f291784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ij5.t tVar, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291783d = tVar;
        this.f291784e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ij5.m(this.f291783d, this.f291784e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ij5.m mVar = (ij5.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ij5.t tVar = this.f291783d;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = tVar.O6();
        if (O6 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new ij5.l(tVar, this.f291784e, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
