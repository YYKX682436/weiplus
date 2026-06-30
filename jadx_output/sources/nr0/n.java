package nr0;

/* loaded from: classes4.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339095e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339095e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        nr0.n nVar = new nr0.n(this.f339095e, continuation);
        nVar.f339094d = obj;
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr0.n nVar = (nr0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "pause hash:" + ((kotlinx.coroutines.y0) this.f339094d).hashCode());
        this.f339095e.f339127s = true;
        return jz5.f0.f302826a;
    }
}
