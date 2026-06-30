package qf2;

/* loaded from: classes.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oi2.a f362388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(qf2.q3 q3Var, oi2.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362387d = q3Var;
        this.f362388e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.g3(this.f362387d, this.f362388e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.g3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qf2.q3 q3Var = this.f362387d;
        lj2.o0 o0Var = q3Var.f362548m;
        if (o0Var != null) {
            o0Var.a(this.f362388e.f345610a, 1);
        }
        lj2.o0 o0Var2 = q3Var.f362548m;
        if (o0Var2 == null) {
            return null;
        }
        o0Var2.b();
        return jz5.f0.f302826a;
    }
}
