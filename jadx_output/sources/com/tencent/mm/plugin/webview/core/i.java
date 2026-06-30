package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f181847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(0);
        this.f181847d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String url;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.webview.core.r0 r0Var = this.f181847d;
        if (r0Var.B0.contains(java.lang.Integer.valueOf(r0Var.f181951r0))) {
            com.tencent.mars.xlog.Log.i(r0Var.T(), "WebView-Trace PageLoadFull has commit status return");
        } else {
            java.lang.String str = r0Var.D;
            if (str == null || r26.n0.N(str)) {
                url = r0Var.f181916a.getUrl();
                if (url == null) {
                    url = "";
                }
            } else {
                url = r0Var.D;
            }
            r0Var.P0(url);
            nw4.n g07 = r0Var.g0();
            if (g07 != null && (linkedList = g07.f340891e) != null) {
                linkedList.clear();
            }
            r0Var.X0(url);
        }
        return jz5.f0.f302826a;
    }
}
