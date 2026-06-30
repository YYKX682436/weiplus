package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class p8 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f186433c;

    public p8(nw4.k kVar, nw4.y2 y2Var, kotlin.jvm.internal.c0 c0Var) {
        this.f186431a = kVar;
        this.f186432b = y2Var;
        this.f186433c = c0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp fail");
        nw4.g gVar = this.f186431a.f340863d;
        nw4.y2 y2Var = this.f186432b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ": fail open liteapp", null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLiteApp", "JsApiOpenLiteApp success");
        this.f186431a.f340863d.e(this.f186432b.f341013c, this.f186432b.f341019i + ": success", null);
        if (this.f186433c.f310112d) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o8(this.f186431a));
        }
    }
}
