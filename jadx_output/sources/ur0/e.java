package ur0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.hardware.camera2.CameraDevice f430291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.hardware.camera2.CameraDevice cameraDevice, ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430291d = cameraDevice;
        this.f430292e = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ur0.e(this.f430291d, this.f430292e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ur0.e eVar = (ur0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sessionCallback onDisconnected ");
        android.hardware.camera2.CameraDevice cameraDevice = this.f430291d;
        sb6.append(cameraDevice.hashCode());
        com.tencent.mars.xlog.Log.e("MicroMsg.Camera.Camera2Impl", sb6.toString());
        cameraDevice.close();
        this.f430292e.K();
        return jz5.f0.f302826a;
    }
}
