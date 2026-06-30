package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.MMWebView f183353b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.modeltools.u0 f183352a = new com.tencent.mm.plugin.webview.modeltools.u0();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f183354c = jz5.h.b(com.tencent.mm.plugin.webview.modeltools.q0.f183337d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f183355d = jz5.h.b(com.tencent.mm.plugin.webview.modeltools.r0.f183344d);

    public final void a() {
        if (((java.lang.Boolean) ((jz5.n) f183355d).getValue()).booleanValue() && ((java.lang.Boolean) ((jz5.n) f183354c).getValue()).booleanValue()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", "preload");
            pm0.v.X(new com.tencent.mm.plugin.webview.modeltools.t0(currentTimeMillis));
        }
    }
}
