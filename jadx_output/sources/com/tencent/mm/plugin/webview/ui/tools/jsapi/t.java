package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class t implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185408e;

    public t(nw4.k kVar, nw4.y2 y2Var) {
        this.f185407d = kVar;
        this.f185408e = y2Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 b0Var = com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184939d;
        nw4.k kVar = this.f185407d;
        nw4.y2 y2Var = this.f185408e;
        kotlin.jvm.internal.o.d(intent);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.e(b0Var, kVar, y2Var, i17, i18, intent);
    }
}
