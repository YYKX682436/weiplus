package vr0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439466e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr0.e(this.f439466e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439465d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        vr0.z zVar = this.f439466e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = zVar.f411441r;
            this.f439465d = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "bindCameraUseCases");
            java.lang.Object a17 = or0.c.f347429a.a(new vr0.c(zVar, i18, true, null), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        zVar.e(zVar.f411440q);
        return f0Var;
    }
}
