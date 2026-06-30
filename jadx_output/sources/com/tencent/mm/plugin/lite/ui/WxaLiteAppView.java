package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public class WxaLiteAppView extends com.tencent.liteapp.ui.WxaLiteAppBaseView implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: p1, reason: collision with root package name */
    public static android.database.ContentObserver f144373p1;

    /* renamed from: l1, reason: collision with root package name */
    public q80.v f144374l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f144375p0;

    /* renamed from: x0, reason: collision with root package name */
    public q80.y f144376x0;

    /* renamed from: y0, reason: collision with root package name */
    public q80.u f144377y0;

    public WxaLiteAppView(android.content.Context context) {
        super(context);
        this.f144375p0 = true;
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView
    public void a() {
        super.a();
        if (f144373p1 != null) {
            getContext().getContentResolver().unregisterContentObserver(f144373p1);
            f144373p1 = null;
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void closeWindow(android.content.Intent intent) {
        q80.v vVar = this.f144374l1;
        if (vVar != null) {
            y54.i0 i0Var = (y54.i0) vVar;
            i0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCloseWindow", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$setupLiteAppView$liteAppView$1");
            com.tencent.mars.xlog.Log.i("SnsAd.HalfScreenVangogh", "onCloseWindow");
            i0Var.f459546a.V6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCloseWindow", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$setupLiteAppView$liteAppView$1");
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView
    public void f() {
        super.f();
    }

    public final void h() {
        com.tencent.mm.plugin.lite.ui.z1 z1Var = (com.tencent.mm.plugin.lite.ui.z1) com.tencent.mm.plugin.lite.w.f144514q.get(java.lang.Long.valueOf(getAppUuid()));
        if (z1Var != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            boolean z17 = !this.f144375p0;
            if (this.f46039J) {
                z17 = false;
            }
            hashMap.put("popGestureEnable", java.lang.Boolean.valueOf(z17));
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.ui.y1(z1Var, "popGestureEnable", hashMap));
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onBodySizeChange(java.lang.String str, long j17, long j18, float f17, float f18) {
        q80.u uVar = this.f144377y0;
        if (uVar != null) {
            uVar.onBodySizeChange(str, j17, j18, f17, f18);
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckBaseLibSumFail(java.lang.String str, java.util.List list) {
        super.onCheckBaseLibSumFail(str, list);
        com.tencent.mm.plugin.lite.logic.g1.s().B(this.f46040d);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void onCheckSumFail(java.lang.String str, java.util.List list) {
        super.onCheckSumFail(str, list);
        com.tencent.mm.plugin.lite.logic.g1.s().C(str, this.f46040d);
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView
    public void onResume() {
        super.onResume();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17 && j45.l.f()) {
            if (f144373p1 == null) {
                f144373p1 = new ra3.g0(getContext(), new java.lang.ref.WeakReference(this));
            }
            getContext().getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, f144373p1);
        } else if (f144373p1 != null) {
            getContext().getContentResolver().unregisterContentObserver(f144373p1);
            f144373p1 = null;
        }
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setForbidRightGestureEnable(boolean z17) {
        super.setForbidRightGestureEnable(z17);
        q80.y yVar = this.f144376x0;
        if (yVar != null) {
            java.lang.String str = this.f46051r;
            com.tencent.mm.plugin.game.ui.v6 v6Var = (com.tencent.mm.plugin.game.ui.v6) yVar;
            v6Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppGameTabUI", "onRightGestureForbidChange appId = %s, forbid = %b", str, java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.game.ui.LiteAppGameTabUI liteAppGameTabUI = v6Var.f141810a;
            liteAppGameTabUI.f141003y = z17;
            if (z17) {
                liteAppGameTabUI.getSwipeBackLayout().setEnableGesture(false);
            } else {
                liteAppGameTabUI.getSwipeBackLayout().setEnableGesture(true);
            }
        }
        h();
    }

    @Override // com.tencent.liteapp.ui.WxaLiteAppBaseView, com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback
    public void setIsPopGestureEnabled(boolean z17) {
        super.setIsPopGestureEnabled(z17);
        this.f144375p0 = z17;
        h();
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(getAppUuid(), "app.screenshot", (org.json.JSONObject) null);
    }
}
