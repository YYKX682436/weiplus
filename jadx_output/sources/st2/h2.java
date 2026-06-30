package st2;

/* loaded from: classes3.dex */
public class h2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412356a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f412357b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f412358c;

    public h2(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.lang.String appId) {
        df2.mu muVar;
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f412356a = "Finder.LiveMiniProgramReceiver";
        this.f412357b = new java.lang.ref.WeakReference(k0Var);
        this.f412358c = appId;
        if (k0Var == null || (muVar = (df2.mu) k0Var.getController(df2.mu.class)) == null) {
            return;
        }
        muVar.Z6(appId);
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(java.lang.String value) {
        boolean z17;
        st2.h2 h2Var;
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i(this.f412356a, "onReceiveValue value".concat(value));
        if (com.tencent.mm.sdk.platformtools.t8.K0(value)) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f412357b;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = weakReference != null ? (com.tencent.mm.plugin.finder.live.view.k0) weakReference.get() : null;
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.i(this.f412356a, "pluginLayout is null!");
            return;
        }
        cl0.g gVar = new cl0.g(value);
        int optInt = gVar.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String optString = gVar.optString("appId");
        java.lang.String optString2 = gVar.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        gVar.optString("shopWindowId");
        java.lang.String optString3 = gVar.optString("sceneNote");
        int optInt2 = gVar.optInt("shareMode");
        long optLong = gVar.optLong("productId");
        int optInt3 = gVar.optInt("usePushAnimation");
        boolean z18 = gVar.optInt(nd1.a2.NAME, 1) == 1;
        java.lang.String optString4 = gVar.optString("mode", "");
        boolean z19 = gVar.optInt("autoFullScreenWhenTap") == 1;
        java.lang.String optString5 = gVar.optString("entranceGMsgID", "");
        java.lang.String str = (java.lang.String) ((mm2.f6) k0Var.getBuContext().a(mm2.f6.class)).Q.get(optString);
        boolean z27 = z19;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) ((mm2.f6) k0Var.getBuContext().a(mm2.f6.class)).R.get(optString);
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo customSubjectInfo = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CustomSubjectInfo(str2, str);
        boolean optBoolean = gVar.optBoolean("ignoreNextShopShelfOrderHintBeforeReopen");
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = (com.tencent.mm.plugin.finder.live.view.k0) this.f412357b.get();
        boolean z28 = (k0Var2 == null || (ga0Var = (com.tencent.mm.plugin.finder.live.plugin.ga0) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ga0.class)) == null || ga0Var.w0() != 0) ? false : true;
        if (optBoolean && z28) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var3 = (com.tencent.mm.plugin.finder.live.view.k0) this.f412357b.get();
            mm2.f6 f6Var = k0Var3 != null ? (mm2.f6) k0Var3.business(mm2.f6.class) : null;
            if (f6Var != null) {
                f6Var.Y6(true);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f412356a, "showNavigationBar:" + z18);
        if (optInt != 0) {
            if (optInt != 1) {
                return;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            st2.g2 g2Var = new st2.g2(optInt2, k0Var, optLong, optString, optString2, optString3, optInt3, optString4, z18, z27, customSubjectInfo, this, optString5);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(g2Var, 250L, false);
            return;
        }
        if (zl2.r4.f473950a.w1() || ((mm2.c1) k0Var.getBuContext().a(mm2.c1.class)).T) {
            z17 = true;
            h2Var = this;
        } else {
            h2Var = this;
            z17 = false;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var4 = kotlin.jvm.internal.o.b(optString, h2Var.f412358c) & z17 ? k0Var : null;
        if (k0Var4 != null) {
            qo0.b bVar = qo0.b.f365359h2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
            k0Var4.statusChange(bVar, bundle);
        }
    }
}
