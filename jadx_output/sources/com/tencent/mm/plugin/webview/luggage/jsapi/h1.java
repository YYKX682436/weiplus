package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class h1 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return be1.z.NAME;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "invoke");
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(((sd.u0) bVar.f406596a).f406610d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, not connected");
            bVar.c("network_type:fail", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, type = " + com.tencent.mars.comm.NetStatusUtil.getNetType(((sd.u0) bVar.f406596a).f406610d));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("simtype", (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.webview.luggage.jsapi.g1.class));
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(((sd.u0) bVar.f406596a).f406610d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, wifi");
            bVar.b("network_type:wifi", hashMap);
            return;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(((sd.u0) bVar.f406596a).f406610d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 2g");
            hashMap.put("subtype", "2g");
        } else if (com.tencent.mars.comm.NetStatusUtil.is3G(((sd.u0) bVar.f406596a).f406610d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 3g");
            hashMap.put("subtype", "3g");
        } else if (com.tencent.mars.comm.NetStatusUtil.is4G(((sd.u0) bVar.f406596a).f406610d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 4g");
            hashMap.put("subtype", "4g");
        } else if (com.tencent.mars.comm.NetStatusUtil.is5G(((sd.u0) bVar.f406596a).f406610d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getNetworkType, 5g");
            hashMap.put("subtype", "5g");
        }
        bVar.b("network_type:wwan", hashMap);
    }
}
