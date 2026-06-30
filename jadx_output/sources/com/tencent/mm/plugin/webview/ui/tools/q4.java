package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f186768a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f186769b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public q4() {
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f186768a = p0Var;
        this.f186769b = new java.util.concurrent.CountDownLatch(1);
        com.tencent.mm.plugin.webview.ui.tools.t4 t4Var = com.tencent.mm.plugin.webview.ui.tools.t4.f186884a;
        if (!com.tencent.mm.plugin.webview.ui.tools.t4.f186887d) {
            com.tencent.mm.plugin.webview.ui.tools.t4.f186887d = true;
            ip.e a17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
            ip.d dVar = com.tencent.mm.plugin.webview.ui.tools.t4.f186886c;
            synchronized (a17) {
                a17.f293555d.add(dVar);
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.p4 p4Var = new com.tencent.mm.plugin.webview.ui.tools.p4(this);
        synchronized (t4Var) {
            ?? r47 = (java.util.List) com.tencent.mm.plugin.webview.ui.tools.t4.f186888e.get();
            p0Var = r47 != 0 ? r47 : p0Var;
        }
        if (!p0Var.isEmpty()) {
            p4Var.invoke(p0Var);
            return;
        }
        com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder newBuilder = com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.newBuilder();
        newBuilder.setConfigFilePath(ip.e.c(1));
        for (java.lang.String str : com.tencent.mm.plugin.webview.ui.tools.t4.f186885b) {
            newBuilder.addMenuConfigNames(str);
        }
        com.tencent.wechat.aff.misc.WebViewManager.getInstance().readDynamicMenuConfigAsync((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) newBuilder.build(), new com.tencent.mm.plugin.webview.ui.tools.r4(p4Var));
    }
}
