package dz0;

/* loaded from: classes5.dex */
public final class t1 implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f245015b;

    public t1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var) {
        this.f245014a = maasSdkUIC;
        this.f245015b = n7Var;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        com.tencent.maas.model.MJMusicInfo musicInfo;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "performCreationWithTemplate: onComplete " + mJError);
        if (mJError == null) {
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f245014a;
            maasSdkUIC.getClass();
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "triggerRecommend: ");
            az0.n7 n7Var = this.f245015b;
            java.lang.String str = null;
            pf5.e.launch$default(maasSdkUIC, null, null, new dz0.p2(n7Var, maasSdkUIC, null), 3, null);
            com.tencent.maas.model.MJMusicOptions currentMusicOptions = n7Var.f15742a.getCurrentMusicOptions();
            if (currentMusicOptions != null && (musicInfo = currentMusicOptions.getMusicInfo()) != null) {
                str = musicInfo.getMusicID();
            }
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = maasSdkUIC.f69794r;
            java.lang.String str3 = maasSdkUIC.f69795s;
            maasSdkUIC.f69797u.put(str2 + '-' + str3, str);
        }
    }
}
