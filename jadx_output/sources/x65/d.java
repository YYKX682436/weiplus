package x65;

/* loaded from: classes12.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f452349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x65.l f452350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x65.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f452350e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x65.d(this.f452350e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x65.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f452349d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f452349d = 1;
            if (x65.l.c(this.f452350e, 1, this) == aVar) {
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
