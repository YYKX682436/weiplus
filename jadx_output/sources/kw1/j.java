package kw1;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f312849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mw1.b f312850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.p pVar, mw1.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312849e = pVar;
        this.f312850f = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kw1.j(this.f312849e, this.f312850f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312848d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f312848d = 1;
            obj = this.f312849e.invoke(this.f312850f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
