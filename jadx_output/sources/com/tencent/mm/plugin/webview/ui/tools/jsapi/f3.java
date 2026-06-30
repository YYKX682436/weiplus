package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f185096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f185097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185099g;

    public f3(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.os.Bundle bundle, java.util.Map map, nw4.y2 y2Var) {
        this.f185099g = c1Var;
        this.f185096d = bundle;
        this.f185097e = map;
        this.f185098f = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f185097e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185099g;
        try {
            c1Var.f184998y.ec();
            c1Var.f184998y.b(this.f185096d);
            new com.tencent.mm.autogen.events.WebViewCloseWindowEvent().e();
            map.put("err_code", 0);
            map.put("err_msg", "ok");
            c1Var.i5(this.f185098f, "close window and next:ok", map);
        } catch (java.lang.Exception e17) {
            c1Var.A5(e17, map);
        }
    }
}
