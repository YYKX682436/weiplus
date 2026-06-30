package uh1;

/* loaded from: classes7.dex */
public abstract class f1 {
    public static boolean a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a();
    }

    public static uh1.e1 b(java.util.Map map, java.lang.String str) {
        uh1.e1 e1Var = new uh1.e1();
        java.util.HashMap hashMap = null;
        try {
            if (a()) {
                com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("weixin_mini_program_debug_info", 2, null);
                if (N != null) {
                    e1Var.f427781a = N.getString("weixin_mini_program_debug_host", "");
                    e1Var.f427782b = N.getInt("weixin_mini_program_debug_port", 0);
                    if (str != null && !str.isEmpty()) {
                        e1Var.f427783c = new java.net.URL(str).getHost();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, mmkvName:%s, customIp:%s, customPort:%d", "weixin_mini_program_debug_info", e1Var.f427781a, java.lang.Integer.valueOf(e1Var.f427782b));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, mmkv is null, mmkvName:%s", "weixin_mini_program_debug_info");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, not debug environment");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DebugProxyUtils", "getMiniProgramDebugConfig, exception", e17);
        }
        if (map != null) {
            if (a()) {
                try {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    if (context == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, MMApplicationContext.getContext() get a null context!");
                    } else {
                        int i17 = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("pay_uat_test_environment_id", 0);
                        if (i17 != 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, testId: %d", java.lang.Integer.valueOf(i17));
                            r45.fg7 fg7Var = new r45.fg7();
                            fg7Var.f374326d = i17;
                            byte[] byteArray = fg7Var.toByteArray();
                            com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, info byte array length: %d", java.lang.Integer.valueOf(byteArray.length));
                            r45.ch4 ch4Var = new r45.ch4();
                            ch4Var.f371553d = "WXPAY_TEST_ENV_INFO";
                            ch4Var.f371554e = new com.tencent.mm.protobuf.g(byteArray, 0, byteArray.length);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, item: %s", ch4Var.toJSON());
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            linkedList.add(ch4Var);
                            r45.ah4 ah4Var = new r45.ah4();
                            ah4Var.f370012e = 0;
                            ah4Var.f370011d = linkedList;
                            com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, header: %s", ah4Var.toJSON());
                            java.lang.String encodeToString = android.util.Base64.encodeToString(ah4Var.toByteArray(), 2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, base64String: %s", encodeToString);
                            java.util.HashMap hashMap2 = new java.util.HashMap();
                            hashMap2.put("Wxp-Test", encodeToString);
                            hashMap2.put("Wxp-Test-environmentId", java.lang.String.valueOf(i17));
                            hashMap = hashMap2;
                        }
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, exception", e18);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "getWxpTestHeaders, not debug environment");
            }
            if (hashMap != null) {
                e1Var.f427784d = hashMap;
                com.tencent.mars.xlog.Log.i("MicroMsg.DebugProxyUtils", "setMiniProgramDebugProxy, Wxp-Test:%s, Wxp-Test-environmentId:%s", hashMap.get("Wxp-Test"), e1Var.f427784d.get("Wxp-Test-environmentId"));
            }
        }
        return e1Var;
    }
}
