package ls;

/* loaded from: classes5.dex */
public final class i implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            r45.j4 j4Var = addMsgInfo.f70726a;
            if (j4Var.f377560g == 10002) {
                java.lang.String g17 = x51.j1.g(j4Var.f377561h);
                if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                    com.tencent.mars.xlog.Log.w("GatewayLoginConfigSysCmdMsgNewXmlListener", "msg content is empty");
                    return;
                }
                try {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
                    if (d17 == null || !(!d17.isEmpty())) {
                        com.tencent.mars.xlog.Log.w("GatewayLoginConfigSysCmdMsgNewXmlListener", "values is null or empty");
                        return;
                    }
                    java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                    com.tencent.mars.xlog.Log.i("GatewayLoginConfigSysCmdMsgNewXmlListener", "type:" + str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        return;
                    }
                    if (r26.i0.q(str, "GatewayLoginConfig", false, 2, null)) {
                        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.GatewayLoginConfig.ShowGatewayLogin");
                        if (ot5.h.f348877a.a((java.lang.String) d17.get(".sysmsg.GatewayLoginConfig.DeviceUUID"), wo.w0.k(), "GatewayLoginConfig", false)) {
                            java.lang.String str3 = "key_show_gateway_flag_" + gm0.j1.b().k();
                            com.tencent.mars.xlog.Log.i("GatewayLoginConfigSysCmdMsgNewXmlListener", "gateway login config:" + str2);
                            com.tencent.mm.sdk.platformtools.o4.M("GatewayLoginConfigSysCmdMsgNewXmlListener").G(str3, str2 != null ? str2.equals("1") : false);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("GatewayLoginConfigSysCmdMsgNewXmlListener", "parse gatewayloginconfig sysmsg fail:" + e17.getMessage());
                }
            }
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
    }
}
