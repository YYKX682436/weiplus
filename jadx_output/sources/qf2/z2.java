package qf2;

/* loaded from: classes10.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362678e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(qf2.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362678e = c3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.z2(this.f362678e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((qf2.z2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362677d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qf2.c3 c3Var = this.f362678e;
            kotlinx.coroutines.flow.j2 j2Var = ((mm2.o4) c3Var.business(mm2.o4.class)).N;
            qf2.y2 y2Var = new qf2.y2(c3Var);
            this.f362677d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(y2Var, this) == aVar) {
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
