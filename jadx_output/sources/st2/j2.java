package st2;

/* loaded from: classes3.dex */
public final class j2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412376a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f412377b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f412378c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412379d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f412380e;

    public j2(android.content.Context context, java.lang.String appId, java.lang.String iconUrl, java.lang.String title) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        kotlin.jvm.internal.o.g(title, "title");
        this.f412376a = appId;
        this.f412377b = iconUrl;
        this.f412378c = title;
        this.f412379d = "Finder.MiniProgramReceiverV2";
        this.f412380e = new java.lang.ref.WeakReference(context);
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i(this.f412379d, "onReceiveValue value" + str + ", outter appId:" + this.f412376a + '!');
        android.content.Context context = (android.content.Context) this.f412380e.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e(this.f412379d, "on receive value, context has been released");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        cl0.g gVar = new cl0.g(str);
        int optInt = gVar.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String optString = gVar.optString("appId");
        java.lang.String optString2 = gVar.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        gVar.optString("shopWindowId");
        java.lang.String optString3 = gVar.optString("sceneNote");
        gVar.optInt("shareMode");
        gVar.optLong("productId");
        int optInt2 = gVar.optInt("usePushAnimation");
        boolean z17 = gVar.optInt(nd1.a2.NAME, 1) == 1;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo(this.f412378c, this.f412377b);
        com.tencent.mars.xlog.Log.i(this.f412379d, "showNavigationBar:" + z17 + ",scene:" + optInt + '!');
        if (optInt != 1) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        st2.i2 i2Var = new st2.i2(context, optString, optString2, optString3, optInt2, z17, customSubjectInfo, this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(i2Var, 250L, false);
    }
}
