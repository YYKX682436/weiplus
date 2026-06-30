package kp3;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp3.x f311036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kp3.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f311036e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp3.q(this.f311036e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp3.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f311035d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        kp3.x xVar = this.f311036e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = xVar.f311051g;
            if (cameraKitRecordViewLayout != null) {
                this.f311035d = 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
                java.lang.Object i18 = cameraKitRecordViewLayout.f155806e.i(0, false, this);
                if (i18 != aVar) {
                    i18 = f0Var;
                }
                if (i18 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        xVar.Q6(3);
        return f0Var;
    }
}
