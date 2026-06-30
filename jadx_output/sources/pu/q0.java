package pu;

/* loaded from: classes12.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.c f358365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qi3.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358365e = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.q0(this.f358365e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358364d;
        qi3.c cVar = this.f358365e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cVar.p();
            jg0.x xVar = cVar instanceof jg0.x ? (jg0.x) cVar : null;
            if (xVar != null) {
                this.f358364d = 1;
                if (xVar.J(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cVar.f1();
        return jz5.f0.f302826a;
    }
}
