package jn2;

/* loaded from: classes10.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(jn2.r1 r1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300644e = r1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.l1(this.f300644e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((jn2.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f300643d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            jn2.r1 r1Var = this.f300644e;
            kotlinx.coroutines.flow.f3 f3Var = ((mm2.m6) r1Var.H.a(mm2.m6.class)).f329251s;
            jn2.k1 k1Var = new jn2.k1(r1Var);
            this.f300643d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(k1Var, this) == aVar) {
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
