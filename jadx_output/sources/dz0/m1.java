package dz0;

/* loaded from: classes5.dex */
public final class m1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f244936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244935e = maasSdkUIC;
        this.f244936f = n7Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.m1 m1Var = new dz0.m1(this.f244935e, this.f244936f, (kotlin.coroutines.Continuation) obj3);
        m1Var.f244934d = (java.lang.Throwable) obj2;
        return m1Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f244934d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (th6 != null) {
            com.tencent.mars.xlog.Log.e("MaasMultiTemplate.MaasSdkUIC", "performCreation: onCompletion failed, " + th6.getMessage());
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "performCreation: onComplete start");
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244935e;
        dz0.x xVar = maasSdkUIC.f69789m;
        az0.n7 n7Var = this.f244936f;
        java.util.List<com.tencent.maas.model.MJMusicInfo> currentTemplateMusicInfos = n7Var.f15742a.getCurrentTemplateMusicInfos();
        if (currentTemplateMusicInfos == null) {
            currentTemplateMusicInfos = kz5.p0.f313996d;
        }
        xVar.b(currentTemplateMusicInfos);
        dz0.x xVar2 = maasSdkUIC.f69789m;
        com.tencent.maas.model.MJMusicInfo currentMusicInfo = n7Var.f15742a.getCurrentMusicInfo();
        if (currentMusicInfo == null) {
            currentMusicInfo = new com.tencent.maas.model.MJMusicInfo("", "", "", com.tencent.maas.model.time.MJTime.InvalidTime, new java.lang.Object[0]);
        }
        xVar2.a(currentMusicInfo);
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "startMovieCreationAutoRecommendTemplate onCompletion");
        n7Var.f15742a.setOnPlaybackMediaTimeDidChange(maasSdkUIC.f69802z);
        return f0Var;
    }
}
