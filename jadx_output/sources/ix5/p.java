package ix5;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f295664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f295666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295665e = str;
        this.f295666f = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ix5.p(this.f295665e, this.f295666f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix5.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f295664d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (ix5.h.f295631b.e()) {
                this.f295664d = 1;
                if (kotlinx.coroutines.l.g(ix5.h.f295639j, new ix5.q(this.f295665e, this.f295666f, null), this) == aVar) {
                    return aVar;
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
