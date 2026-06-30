package dz0;

/* loaded from: classes5.dex */
public final class s1 implements com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245004a;

    public s1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC) {
        this.f245004a = maasSdkUIC;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete
    public final void onRecommendComplete(com.tencent.maas.model.MJTemplateRecommendResult mJTemplateRecommendResult, com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "startMovieCreation recommend onComplete " + mJError);
        if (mJError == null) {
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f245004a;
            dz0.e0 e0Var = maasSdkUIC.D;
            kotlin.jvm.internal.o.d(mJTemplateRecommendResult);
            e0Var.b(mJTemplateRecommendResult);
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.R6(maasSdkUIC);
        }
    }
}
