package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class t implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.k3 f187537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f187538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f187539f;

    public t(zg0.k3 k3Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, android.app.Activity activity) {
        this.f187537d = k3Var;
        this.f187538e = jsapiPermissionWrapper;
        this.f187539f = activity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        zg0.k3 k3Var = this.f187537d;
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = this.f187538e;
        boolean f17 = ((com.tencent.mm.plugin.webview.ui.tools.widget.d0) k3Var).f(jsapiPermissionWrapper, 21, 1);
        android.app.Activity activity = this.f187539f;
        if (f17) {
            g4Var.l(1, activity.getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.bottomsheet_icon_transmit, false);
        }
        if (((com.tencent.mm.plugin.webview.ui.tools.widget.d0) k3Var).f(jsapiPermissionWrapper, 23, 2)) {
            g4Var.l(2, activity.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, false);
        }
    }
}
