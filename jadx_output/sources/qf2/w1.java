package qf2;

/* loaded from: classes10.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(qf2.y1 y1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362629e = y1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.w1(this.f362629e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((qf2.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362628d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qf2.y1 y1Var = this.f362629e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.o4) y1Var.business(mm2.o4.class)).M;
            qf2.v1 v1Var = new qf2.v1(y1Var);
            this.f362628d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(v1Var, this) == aVar) {
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
