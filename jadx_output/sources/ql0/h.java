package ql0;

/* loaded from: classes13.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql0.l f364470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f364472f;

    public h(ql0.l lVar, java.lang.String str, java.lang.Boolean bool) {
        this.f364470d = lVar;
        this.f364471e = str;
        this.f364472f = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ql0.l lVar = this.f364470d;
        lVar.getClass();
        java.lang.String str = this.f364471e;
        hl0.e eVar = new hl0.e("LiveHomeRedDot", str);
        eVar.f282058f = java.lang.System.currentTimeMillis();
        eVar.a();
        com.tencent.mars.xlog.Log.i(lVar.f364493d, "discoverLiveHomeDataPrepare " + str);
        if (wm.a.a()) {
            lVar.getClass();
            ((vm.b) ((xs.x0) i95.n0.c(xs.x0.class))).requireAccountInitialized();
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            java.lang.Boolean bool = this.f364472f;
            if (isEmpty) {
                new com.tencent.wechat.aff.cara.CaraCppLiveCellProphet().reportThatPreload(java.util.Optional.of(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
            } else {
                new com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet().reportThatPreload(str, java.util.Optional.of(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
            }
        }
    }
}
