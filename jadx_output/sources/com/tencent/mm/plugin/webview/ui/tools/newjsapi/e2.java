package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class e2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.e2 f186049d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.e2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.content.Context context = env.f340860a;
        boolean isConnected = com.tencent.mars.comm.NetStatusUtil.isConnected(context);
        nw4.g gVar = env.f340863d;
        if (!isConnected) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, not connected");
            gVar.e(msg.f341013c, "network_type:fail", null);
            return true;
        }
        int i17 = 0;
        com.tencent.mm.plugin.webview.stub.v0 v0Var = env.f340862c;
        if (v0Var != null) {
            try {
                kotlin.jvm.internal.o.d(v0Var);
                android.os.Bundle i18 = v0Var.i(110, new android.os.Bundle());
                kotlin.jvm.internal.o.f(i18, "invokeAsResult(...)");
                int i19 = i18.getInt("sim_card_type", 0);
                if (i19 != 0) {
                    i17 = i19 != 1 ? 2 : 1;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetNetWorkType", "invokeAsResult ex %s", e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, type = %s, simType = %d", java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetType(context)), java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 2g");
            hashMap.put("subtype", "2g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f341013c, "network_type:wwan", hashMap);
            return true;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 3g");
            hashMap.put("subtype", "3g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f341013c, "network_type:wwan", hashMap);
            return true;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 4g");
            hashMap.put("subtype", "4g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f341013c, "network_type:wwan", hashMap);
            return true;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, 5g");
            hashMap.put("subtype", "5g");
            hashMap.put("simtype", java.lang.Integer.valueOf(i17));
            gVar.e(msg.f341013c, "network_type:wwan", hashMap);
            return true;
        }
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetNetWorkType", "getNetworkType, unknown");
            gVar.e(msg.f341013c, "network_type:fail", null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetWorkType", "getNetworkType, wifi");
        hashMap.put("simtype", java.lang.Integer.valueOf(i17));
        gVar.e(msg.f341013c, "network_type:wifi", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 16;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return be1.z.NAME;
    }
}
