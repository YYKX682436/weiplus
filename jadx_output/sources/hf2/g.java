package hf2;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281061e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.g(this.f281061e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((hf2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281060d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hf2.x xVar = this.f281061e;
            kotlinx.coroutines.flow.i2 i2Var = ((je2.g) xVar.business(je2.g.class)).f299227o;
            hf2.f fVar = new hf2.f(xVar);
            this.f281060d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
