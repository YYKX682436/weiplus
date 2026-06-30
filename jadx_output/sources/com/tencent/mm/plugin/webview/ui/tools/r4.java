package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class r4 implements com.tencent.wechat.aff.misc.WebViewManager.ReadDynamicMenuConfigCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f186808a;

    public r4(yz5.l lVar) {
        this.f186808a = lVar;
    }

    @Override // com.tencent.wechat.aff.misc.WebViewManager.ReadDynamicMenuConfigCallback
    public final void complete(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp readDynamicMenuConfigResp) {
        yz5.l lVar = this.f186808a;
        java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig> configsList = readDynamicMenuConfigResp.getConfigsList();
        kotlin.jvm.internal.o.f(configsList, "getConfigsList(...)");
        lVar.invoke(configsList);
        com.tencent.mm.plugin.webview.ui.tools.t4 t4Var = com.tencent.mm.plugin.webview.ui.tools.t4.f186884a;
        java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig> configsList2 = readDynamicMenuConfigResp.getConfigsList();
        kotlin.jvm.internal.o.f(configsList2, "getConfigsList(...)");
        synchronized (t4Var) {
            com.tencent.mm.plugin.webview.ui.tools.t4.f186888e = new java.lang.ref.WeakReference(configsList2);
        }
    }
}
