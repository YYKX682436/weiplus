package tr0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f421297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tr0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f421298e = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tr0.f(this.f421298e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f421297d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera1Impl", "GrabStartPreview");
            tr0.t tVar = this.f421298e;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(tVar.v());
            this.f421297d = 1;
            if (tVar.n(valueOf, this) == aVar) {
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
