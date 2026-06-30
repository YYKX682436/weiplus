package dz0;

/* loaded from: classes5.dex */
public final class r1 implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244998b;

    public r1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var) {
        this.f244997a = maasSdkUIC;
        this.f244998b = n7Var;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "recommend with blank onComplete " + mJError);
        if (mJError == null) {
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244997a;
            maasSdkUIC.getClass();
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "triggerRecommend: ");
            pf5.e.launch$default(maasSdkUIC, null, null, new dz0.p2(this.f244998b, maasSdkUIC, null), 3, null);
        }
    }
}
