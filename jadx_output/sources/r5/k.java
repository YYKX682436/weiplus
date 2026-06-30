package r5;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r5.p f392534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c6.j f392535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r5.p pVar, c6.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f392534e = pVar;
        this.f392535f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new r5.k(this.f392534e, this.f392535f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((r5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f392533d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f392533d = 1;
            obj = r5.p.a(this.f392534e, this.f392535f, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c6.l lVar = (c6.l) obj;
        if (lVar instanceof c6.f) {
            throw ((c6.f) lVar).f38799c;
        }
        return jz5.f0.f302826a;
    }
}
