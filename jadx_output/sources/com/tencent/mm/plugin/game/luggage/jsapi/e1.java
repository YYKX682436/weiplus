package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class e1 implements com.tencent.mm.plugin.wepkg.event.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.g1 f139624c;

    public e1(com.tencent.mm.plugin.game.luggage.jsapi.g1 g1Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139624c = g1Var;
        this.f139622a = str;
        this.f139623b = q5Var;
    }

    @Override // com.tencent.mm.plugin.wepkg.event.c
    public void a(java.lang.Object obj) {
        if ((obj instanceof com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify) && this.f139622a.equals(((com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify) obj).f188325d)) {
            com.tencent.mm.plugin.wepkg.event.h.b(this.f139624c.f139645e);
            this.f139623b.a(null, this.f139624c.f(this.f139622a));
            ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.JsApiGetWepkgFileList");
        }
    }
}
