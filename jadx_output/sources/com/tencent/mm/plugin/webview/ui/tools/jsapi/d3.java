package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class d3 implements com.tencent.mm.plugin.webview.ui.tools.jsapi.p8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e3 f185048a;

    public d3(com.tencent.mm.plugin.webview.ui.tools.jsapi.e3 e3Var) {
        this.f185048a = e3Var;
    }

    public final void a(int i17, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e3 e3Var = this.f185048a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = e3Var.f185072i;
        char[] cArr = com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.f184973z1;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.g8 c76 = c1Var.c7(i17);
        if (c76 == null || c76.f185140a == null || c76.f185141b == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var2 = e3Var.f185072i;
        com.tencent.mm.plugin.webview.stub.z0 z0Var = c1Var2.f184998y;
        nw4.y2 y2Var = c1Var2.f184976e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "fail";
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1.L3(c1Var2, z0Var, y2Var, "openMapNavigateMenu:".concat(str), null, true, true);
    }
}
