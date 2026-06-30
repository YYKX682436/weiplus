package nr0;

/* loaded from: classes14.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f339107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i17, nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339107d = i17;
        this.f339108e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.u(this.f339107d, this.f339108e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr0.u uVar = (nr0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", "setRotate:" + this.f339107d);
        xr0.k kVar = this.f339108e.f339121m;
        int i17 = this.f339107d;
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKitModel", "updateRotate >> " + i17 + " origin >> " + kVar);
        kVar.f456178d = i17;
        kVar.a();
        return jz5.f0.f302826a;
    }
}
