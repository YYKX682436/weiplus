package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class vc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(nw4.k kVar) {
        super(1);
        this.f186589d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String sourUserName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(sourUserName, "sourUserName");
        java.util.HashMap e17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.e(com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186685d, com.tencent.mm.plugin.webview.ui.tools.newjsapi.yc.f186686e);
        e17.put("sourUserName", sourUserName);
        nw4.k kVar = this.f186589d;
        android.content.Context context = kVar.f340860a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).L1.g0().j("sendAppMessage", true);
        android.content.Context context2 = kVar.f340860a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).L1.g0().j0(e17, 4);
        return jz5.f0.f302826a;
    }
}
