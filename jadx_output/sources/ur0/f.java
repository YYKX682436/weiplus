package ur0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.camera2.CameraDevice f430293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.hardware.camera2.CameraDevice cameraDevice, ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430293d = cameraDevice;
        this.f430294e = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ur0.f(this.f430293d, this.f430294e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ur0.f fVar = (ur0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f430293d.close();
        this.f430294e.K();
        return jz5.f0.f302826a;
    }
}
