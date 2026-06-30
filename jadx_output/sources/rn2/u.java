package rn2;

/* loaded from: classes15.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.w f397881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(rn2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397881e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.u(this.f397881e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397880d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rn2.f fVar = this.f397881e.f397902a.f397854f;
            if (fVar == null) {
                return null;
            }
            this.f397880d = 1;
            obj = ((rn2.c1) fVar).s(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.util.List) obj;
    }
}
