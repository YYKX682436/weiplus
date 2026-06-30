package ur0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.hardware.camera2.CameraCaptureSession f430320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ur0.s sVar, android.hardware.camera2.CameraCaptureSession cameraCaptureSession, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430319e = sVar;
        this.f430320f = cameraCaptureSession;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ur0.o(this.f430319e, this.f430320f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ur0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430318d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ur0.s sVar = this.f430319e;
            sVar.f430335y = this.f430320f;
            this.f430318d = 1;
            if (ur0.s.I(sVar, this) == aVar) {
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
