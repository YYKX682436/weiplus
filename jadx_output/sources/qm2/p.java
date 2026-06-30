package qm2;

/* loaded from: classes3.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f364741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm2.u f364742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qm2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f364742e = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qm2.p(this.f364742e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qm2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.f3 f3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f364741d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qm2.u uVar = this.f364742e;
            gk2.e eVar = uVar.f364757i;
            if (eVar == null || (f3Var = ((mm2.n0) eVar.a(mm2.n0.class)).f329265g) == null) {
                return jz5.f0.f302826a;
            }
            qm2.o oVar = new qm2.o(uVar);
            this.f364741d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(oVar, this) == aVar) {
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
