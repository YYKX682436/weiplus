package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class k3 implements com.tencent.mm.plugin.appbrand.service.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185230b;

    public k3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185230b = c1Var;
        this.f185229a = y2Var;
    }

    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "success:%b, data:%s", java.lang.Boolean.valueOf(z17), str);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185230b;
        nw4.y2 y2Var = this.f185229a;
        if (!z17) {
            c1Var.i5(y2Var, y2Var.f341019i + ":fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
        hashMap.put("status", java.lang.Integer.valueOf(i17));
        c1Var.i5(y2Var, y2Var.f341019i + ":ok", hashMap);
    }
}
