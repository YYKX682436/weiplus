package mm2;

/* loaded from: classes3.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f329299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(mm2.s1 s1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329299e = s1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.o1(this.f329299e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((mm2.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329298d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mm2.s1 s1Var = this.f329299e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.g1) s1Var.business(mm2.g1.class)).f329071i;
            mm2.n1 n1Var = new mm2.n1(s1Var);
            this.f329298d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(n1Var, this) == aVar) {
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
