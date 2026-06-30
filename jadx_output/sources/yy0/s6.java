package yy0;

/* loaded from: classes5.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJBeautyAdjustmentDesc f468322e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(yy0.m7 m7Var, com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468321d = m7Var;
        this.f468322e = mJBeautyAdjustmentDesc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.s6(this.f468321d, this.f468322e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.s6 s6Var = (yy0.s6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468321d.f468225d, "notifySCSelectBeautyParam, beautyDesc: presetID=" + this.f468322e.getPresetID() + ", skinSmoothness=" + this.f468322e.getSkinSmoothness() + ", twowayBrightRate=" + this.f468322e.getTwowayBrightRate() + ", faceSlimness=" + this.f468322e.getFaceSlimness() + ", eyeEnhancement=" + this.f468322e.getEyeEnhancement() + ", noseShrinkage=" + this.f468322e.getNoseShrinkage() + ", smileFoldReduction=" + this.f468322e.getSmileFoldReduction() + ", lipShape=" + this.f468322e.getLipShape() + ", eyeDistanceFactor=" + this.f468322e.getEyeDistanceFactor() + ", cheekboneShrinkage=" + this.f468322e.getCheekboneShrinkage() + ", innerEyeCorner=" + this.f468322e.getInnerEyeCorner());
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468321d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.Y1(this.f468322e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468321d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
