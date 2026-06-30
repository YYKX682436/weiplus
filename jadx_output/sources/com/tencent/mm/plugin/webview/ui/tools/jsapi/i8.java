package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes15.dex */
public class i8 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f185196a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f185197b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f185198c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f185199d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f185200e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.jsapi.h8 f185201f;

    public i8(com.tencent.mm.plugin.webview.ui.tools.jsapi.h8 h8Var) {
        this.f185201f = h8Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h8 h8Var;
        this.f185199d = true;
        this.f185197b = z17;
        this.f185198c = z18;
        if (!this.f185200e || (h8Var = this.f185201f) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.jsapi.w1) h8Var).a(this.f185196a, z17, z18);
    }

    public void b(boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h8 h8Var;
        this.f185196a = z17;
        this.f185200e = true;
        if (!this.f185199d || (h8Var = this.f185201f) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.jsapi.w1) h8Var).a(z17, this.f185197b, this.f185198c);
    }
}
