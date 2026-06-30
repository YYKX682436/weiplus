package qm2;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f364709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm2.e f364710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qm2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f364710e = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qm2.d(this.f364710e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qm2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j2 j2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f364709d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qm2.e eVar = this.f364710e;
            gk2.e eVar2 = eVar.f364711d;
            if (eVar2 == null || (j2Var = ((mm2.g1) eVar2.a(mm2.g1.class)).f329068f) == null) {
                return jz5.f0.f302826a;
            }
            qm2.c cVar = new qm2.c(eVar);
            this.f364709d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(cVar, this) == aVar) {
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
