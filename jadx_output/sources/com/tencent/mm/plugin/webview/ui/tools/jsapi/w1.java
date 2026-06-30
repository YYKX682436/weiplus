package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes15.dex */
public class w1 implements com.tencent.mm.plugin.webview.ui.tools.jsapi.h8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.x1 f185489a;

    public w1(com.tencent.mm.plugin.webview.ui.tools.jsapi.x1 x1Var) {
        this.f185489a = x1Var;
    }

    public void a(boolean z17, boolean z18, boolean z19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.webview.ui.tools.jsapi.x1 x1Var = this.f185489a;
        if (z18) {
            com.tencent.mm.plugin.webview.model.h4.c(x1Var.f185517g.f185549f);
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var = x1Var.f185517g;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = y1Var.f185557q;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J3(c1Var, y1Var.f185547d, c1Var.f184984o, 1);
        } else if (z19) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var2 = x1Var.f185517g;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var2 = y1Var2.f185557q;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J3(c1Var2, y1Var2.f185547d, c1Var2.f184984o, 2);
        } else {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var3 = x1Var.f185517g;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var3 = y1Var3.f185557q;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.J3(c1Var3, y1Var3.f185547d, c1Var3.f184984o, 3);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(x1Var.f185517g.f185550g);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.y1 y1Var4 = x1Var.f185517g;
        if (K0) {
            if (z17) {
                y1Var4.f185557q.i5(y1Var4.f185548e, "launchApplication:ok", null);
                return;
            } else {
                y1Var4.f185557q.i5(y1Var4.f185548e, "launchApplication:fail", null);
                return;
            }
        }
        if (z18) {
            y1Var4.f185557q.i5(y1Var4.f185548e, "launchApplication:ok", null);
        } else if (z19) {
            y1Var4.f185557q.i5(y1Var4.f185548e, "launchApplication:cancel", null);
        } else {
            y1Var4.f185557q.i5(y1Var4.f185548e, "launchApplication:fail", null);
        }
    }
}
