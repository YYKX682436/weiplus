package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes10.dex */
public final class na implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f186386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186389f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186390g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f186391h;

    public na(nw4.k kVar, nw4.y2 y2Var, yz5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f186384a = kVar;
        this.f186385b = y2Var;
        this.f186386c = lVar;
        this.f186387d = str;
        this.f186388e = str2;
        this.f186389f = str3;
        this.f186390g = str4;
        this.f186391h = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra.f186491e;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra.f186491e = null;
        boolean b17 = fVar.b();
        nw4.k kVar = this.f186384a;
        nw4.y2 y2Var = this.f186385b;
        if (b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPublishTextState", "CheckTextStateReq success");
            pj4.c0 c0Var = ((pj4.d) fVar.f70618d).f355013d;
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra raVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.ra.f186490d;
            java.lang.String str = c0Var.f355004e;
            java.lang.String str2 = c0Var.f355006g;
            java.lang.String str3 = c0Var.f355007h;
            java.util.LinkedList jumps = c0Var.f355009m;
            kotlin.jvm.internal.o.f(jumps, "jumps");
            if (raVar.g(str, str2, str3, jumps)) {
                bi4.c1 c1Var = new bi4.c1();
                c1Var.b(this.f186387d);
                bi4.d1 d1Var = c1Var.f21034a;
                d1Var.f354937d.f354975g.f355218i = this.f186388e;
                c1Var.g(c0Var.f355006g);
                c1Var.f(c0Var.f355004e);
                c1Var.d(c0Var.f355005f);
                c1Var.h(((pj4.d) fVar.f70618d).f355014e);
                c1Var.e(c0Var.f355007h);
                d1Var.f354938e = this.f186389f;
                c1Var.a(this.f186390g);
                c1Var.c(c0Var.f355009m);
                d1Var.f354952v = this.f186391h;
                this.f186386c.invoke(d1Var);
            } else {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail_invalid_arguments", null);
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "fail_invalid_arguments");
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPublishTextState", "error info:" + fVar);
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail_liteapp_check", null);
        }
        return jz5.f0.f302826a;
    }
}
