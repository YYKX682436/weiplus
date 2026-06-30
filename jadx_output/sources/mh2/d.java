package mh2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mh2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326312e = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.d(this.f326312e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f326311d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mh2.k kVar = this.f326312e;
            kotlinx.coroutines.flow.j e17 = kVar.f326375d.e();
            if (e17 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.flow.j n17 = kotlinx.coroutines.flow.l.n(e17, kotlinx.coroutines.internal.b0.f310484a);
                if (n17 != null) {
                    mh2.c cVar = new mh2.c(kVar);
                    this.f326311d = 1;
                    if (n17.a(cVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
