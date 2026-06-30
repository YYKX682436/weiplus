package qj5;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qj5.n f363975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qj5.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363975e = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qj5.j(this.f363975e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qj5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363974d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qj5.n nVar = this.f363975e;
            qj5.q qVar = nVar.f363990x2;
            if (qVar == null) {
                return null;
            }
            java.lang.String str = (java.lang.String) ((jz5.n) nVar.F2).getValue();
            this.f363974d = 1;
            obj = qVar.d(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.lang.String) obj;
    }
}
