package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class k1 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getSystemInfo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("osVersion", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        hashMap.put("cpuCores", java.lang.Integer.valueOf(y7.b.d()));
        hashMap.put("cpuFreqHz", java.lang.Integer.valueOf(y7.b.b()));
        hashMap.put("memory", java.lang.Long.valueOf(y7.b.e(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        hashMap.put("brand", android.os.Build.BRAND);
        hashMap.put("model", wo.w0.m());
        bVar.d(hashMap);
    }
}
