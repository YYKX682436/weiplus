package nr0;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f339105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339105d = z17;
        this.f339106e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.t(this.f339105d, this.f339106e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr0.t tVar = (nr0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "setMirror:" + this.f339105d);
        this.f339106e.f339121m.f456179e = this.f339105d;
        return jz5.f0.f302826a;
    }
}
