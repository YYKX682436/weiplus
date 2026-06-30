package yy0;

/* loaded from: classes5.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yy0.m7 f468130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJBeautyAdjustmentDesc f468131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(yy0.m7 m7Var, com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468130d = m7Var;
        this.f468131e = mJBeautyAdjustmentDesc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.h5(this.f468130d, this.f468131e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.h5 h5Var = (yy0.h5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f468130d.f468225d, "notifySCAdjustBeauty, beautyDesc: presetID=" + this.f468131e.getPresetID() + ", skinSmoothness=" + this.f468131e.getSkinSmoothness() + ", twowayBrightRate=" + this.f468131e.getTwowayBrightRate() + ", faceSlimness=" + this.f468131e.getFaceSlimness() + ", eyeEnhancement=" + this.f468131e.getEyeEnhancement() + ", noseShrinkage=" + this.f468131e.getNoseShrinkage() + ", smileFoldReduction=" + this.f468131e.getSmileFoldReduction() + ", lipShape=" + this.f468131e.getLipShape() + ", eyeDistanceFactor=" + this.f468131e.getEyeDistanceFactor() + ", cheekboneShrinkage=" + this.f468131e.getCheekboneShrinkage() + ", innerEyeCorner=" + this.f468131e.getInnerEyeCorner());
        com.tencent.maas.instamovie.MJPublisherSessionMetrics mJPublisherSessionMetrics = this.f468130d.f468228g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (mJPublisherSessionMetrics != null) {
            mJPublisherSessionMetrics.n1(this.f468131e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f468130d.f468225d, "mjPublisherSessionMetrics is null. Please call initMetrics() first.");
        }
        return f0Var2;
    }
}
