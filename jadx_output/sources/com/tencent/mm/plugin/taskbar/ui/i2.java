package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes7.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.o2 f172627d;

    public i2(com.tencent.mm.plugin.taskbar.ui.o2 o2Var) {
        this.f172627d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.json.JSONObject jSONObject;
        ((com.tencent.mm.feature.appbrand.support.a) ((ft.a) i95.n0.c(ft.a.class))).getClass();
        java.lang.String str = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77231y1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "parseCommonSetting wxaCommUseSetting: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TaskBarViewPresenter", "wxaCommUseSettingJson#get, fail since " + e17);
            jSONObject = new org.json.JSONObject();
        }
        this.f172627d.f172665k = jSONObject.optInt("UpdateRegularlySwitch", 0);
    }
}
