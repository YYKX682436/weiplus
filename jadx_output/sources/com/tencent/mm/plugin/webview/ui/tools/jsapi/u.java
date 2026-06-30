package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class u implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185423b;

    public u(nw4.k kVar, nw4.y2 y2Var) {
        this.f185422a = kVar;
        this.f185423b = y2Var;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 b0Var = com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.f184939d;
        nw4.k kVar = this.f185422a;
        nw4.y2 y2Var = this.f185423b;
        kotlin.jvm.internal.o.d(intent);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.b0.e(b0Var, kVar, y2Var, i17, i18, intent);
    }
}
