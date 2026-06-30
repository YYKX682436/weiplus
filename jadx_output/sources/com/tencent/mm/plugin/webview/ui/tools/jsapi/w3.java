package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f185493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.x3 f185494e;

    public w3(com.tencent.mm.plugin.webview.ui.tools.jsapi.x3 x3Var, int i17) {
        this.f185494e = x3Var;
        this.f185493d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f185493d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.x3 x3Var = this.f185494e;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "EU user failed");
            x3Var.f185521c.i5(x3Var.f185519a, "add_contact:fail  EU user failed", null);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = x3Var.f185521c;
        nw4.y2 y2Var = x3Var.f185519a;
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = x3Var.f185520b;
        char[] cArr = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f184973z1;
        c1Var.r5(y2Var, jsapiPermissionWrapper);
    }
}
