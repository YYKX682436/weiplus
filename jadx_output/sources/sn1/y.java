package sn1;

/* loaded from: classes9.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f410115f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, java.util.function.Consumer consumer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410114e = str;
        this.f410115f = consumer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sn1.y(this.f410114e, this.f410115f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sn1.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410113d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sn1.z zVar = sn1.z.f410116a;
            this.f410113d = 1;
            obj = zVar.f(this.f410114e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        sn1.x xVar = new sn1.x(this.f410115f, (sn1.j) obj, null);
        this.f410113d = 2;
        if (kotlinx.coroutines.l.g(g3Var, xVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
