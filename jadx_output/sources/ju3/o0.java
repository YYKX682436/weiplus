package ju3;

/* loaded from: classes10.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f301984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f301985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301985e = improveCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.o0(this.f301985e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f301984d;
        com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout = this.f301985e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraKitPluginLayout", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ju3.n0 n0Var = new ju3.n0(improveCameraKitPluginLayout, null);
            this.f301984d = 1;
            if (kotlinx.coroutines.l.g(g3Var, n0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    nu3.m mVar = nu3.m.f340229a;
                    mVar.t(android.os.SystemClock.elapsedRealtime());
                    mVar.p(booleanValue);
                    return jz5.f0.f302826a;
                }
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                nu3.m mVar2 = nu3.m.f340229a;
                mVar2.t(android.os.SystemClock.elapsedRealtime());
                mVar2.p(booleanValue);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = ((-improveCameraKitPluginLayout.getOrientationPlugin().f465719f) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        boolean a17 = improveCameraKitPluginLayout.getOrientationPlugin().a();
        improveCameraKitPluginLayout.getCameraUsage().setLightTorch(improveCameraKitPluginLayout.getSwitchFlashPlugin().f465347f == yt3.c.f465373d);
        if (improveCameraKitPluginLayout.getEnableLandscape()) {
            lu3.m recorder = improveCameraKitPluginLayout.getRecorder();
            this.f301984d = 2;
            obj = recorder.i(0, false, this);
            if (obj == aVar) {
                return aVar;
            }
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
            nu3.m mVar22 = nu3.m.f340229a;
            mVar22.t(android.os.SystemClock.elapsedRealtime());
            mVar22.p(booleanValue);
            return jz5.f0.f302826a;
        }
        lu3.m recorder2 = improveCameraKitPluginLayout.getRecorder();
        this.f301984d = 3;
        obj = recorder2.i(i18, a17, this);
        if (obj == aVar) {
            return aVar;
        }
        booleanValue = ((java.lang.Boolean) obj).booleanValue();
        nu3.m mVar222 = nu3.m.f340229a;
        mVar222.t(android.os.SystemClock.elapsedRealtime());
        mVar222.p(booleanValue);
        return jz5.f0.f302826a;
    }
}
