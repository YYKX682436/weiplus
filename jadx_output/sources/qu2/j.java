package qu2;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qu2.k f366787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qu2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366787e = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qu2.j(this.f366787e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f366786d;
        qu2.k kVar = this.f366787e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kVar.f366792e = true;
            kotlinx.coroutines.r2 r2Var = kVar.f366789b;
            if (r2Var != null) {
                this.f366786d = 1;
                if (kotlinx.coroutines.v2.d(r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ts5.b bVar = kVar.f366790c;
        if (bVar != null) {
            ou2.c cVar = (ou2.c) bVar;
            nu2.e.a(cVar.f348929b, cVar.f348930c, cVar.f348928a, false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
