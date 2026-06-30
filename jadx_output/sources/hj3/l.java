package hj3;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f281641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jj3.c f281642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.p pVar, jj3.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281641e = pVar;
        this.f281642f = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hj3.l(this.f281641e, this.f281642f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281640d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f281640d = 1;
            obj = this.f281641e.invoke(this.f281642f, this);
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
