package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f183209a = new java.util.HashMap();

    public y5(com.tencent.mm.plugin.webview.model.b6 b6Var) {
    }

    public void a(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.stopLoadUrl failed, url is null");
            return;
        }
        java.util.HashMap hashMap = this.f183209a;
        if (hashMap.containsKey(str)) {
            if (!z17) {
                hashMap.put(str, -1L);
            } else {
                hashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Long) hashMap.get(str)).longValue()));
            }
        }
    }
}
