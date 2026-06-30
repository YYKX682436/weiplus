package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes4.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f186026d = webViewUI;
        this.f186027e = kVar;
        this.f186028f = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f186026d.U7();
        nw4.g gVar = this.f186027e.f340863d;
        nw4.y2 y2Var = this.f186028f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return jz5.f0.f302826a;
    }
}
