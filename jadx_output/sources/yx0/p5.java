package yx0;

/* loaded from: classes5.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSegmentationDesc f467558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(yx0.b8 b8Var, com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467557e = b8Var;
        this.f467558f = mJCamSegmentationDesc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.p5(this.f467557e, this.f467558f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.p5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467556d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "setExposureCheck");
            pp0.p0 p0Var = this.f467557e.K;
            if (p0Var == null) {
                return null;
            }
            com.tencent.maas.camstudio.MJCamSegmentationDesc mJCamSegmentationDesc = this.f467558f;
            this.f467556d = 1;
            obj = p0Var.W(mJCamSegmentationDesc, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (java.lang.Boolean) obj;
    }
}
