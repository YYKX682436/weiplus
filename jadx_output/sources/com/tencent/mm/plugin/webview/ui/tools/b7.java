package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class b7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f183951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f183952e;

    public b7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f183952e = c6Var;
        this.f183951d = jsapiPermissionWrapper;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f183952e;
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = this.f183951d;
        if (c6Var.A(jsapiPermissionWrapper, 21, 1)) {
            g4Var.l(1, c6Var.c().getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.bottomsheet_icon_transmit, false);
        }
        if (c6Var.A(jsapiPermissionWrapper, 23, 2)) {
            g4Var.l(2, c6Var.c().getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, false);
        }
    }
}
