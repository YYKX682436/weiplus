package gx0;

/* loaded from: classes5.dex */
public final class y9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f277222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(gx0.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277222e = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.y9(this.f277222e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.y9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277221d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf c86 = this.f277222e.c8();
            this.f277221d = 1;
            if (gx0.bf.d7(c86, null, null, false, this, 7, null) == aVar) {
                return aVar;
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
