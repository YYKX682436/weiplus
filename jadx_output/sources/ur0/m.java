package ur0;

/* loaded from: classes14.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430316d = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ur0.m(this.f430316d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ur0.m mVar = (ur0.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ur0.s sVar = this.f430316d;
        if (sVar.f430336z.a(false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Camera2Impl", "onZoomInt to send Req");
            sVar.O();
        }
        return jz5.f0.f302826a;
    }
}
