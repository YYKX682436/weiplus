package hf2;

/* loaded from: classes10.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f281131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(hf2.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281131e = p1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.o1(this.f281131e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((hf2.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281130d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hf2.p1 p1Var = this.f281131e;
            kotlinx.coroutines.flow.i2 i2Var = ((je2.g) p1Var.f281136a.business(je2.g.class)).f299232t;
            hf2.n1 n1Var = new hf2.n1(p1Var);
            this.f281130d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, n1Var, this) == aVar) {
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
