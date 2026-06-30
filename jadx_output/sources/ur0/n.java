package ur0;

/* loaded from: classes14.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430317d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430317d = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ur0.n(this.f430317d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ur0.n nVar = (ur0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ur0.s sVar = this.f430317d;
        if (sVar.f430336z.a(true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onZoomOut to send req");
            sVar.O();
        }
        return jz5.f0.f302826a;
    }
}
