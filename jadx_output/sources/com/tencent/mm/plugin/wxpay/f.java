package com.tencent.mm.plugin.wxpay;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.BypPayMsgReportEvent f188567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxpay.PluginWxPay$2 f188568e;

    public f(com.tencent.mm.plugin.wxpay.PluginWxPay$2 pluginWxPay$2, com.tencent.mm.autogen.events.BypPayMsgReportEvent bypPayMsgReportEvent) {
        this.f188568e = pluginWxPay$2;
        this.f188567d = bypPayMsgReportEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        this.f188568e.f188562d.getClass();
        com.tencent.mm.autogen.events.BypPayMsgReportEvent bypPayMsgReportEvent = this.f188567d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(bypPayMsgReportEvent.f54021g.f7209b);
        int i18 = 0;
        am.l1 l1Var = bypPayMsgReportEvent.f54021g;
        if (!K0) {
            for (java.lang.String str : l1Var.f7209b.split("\\|")) {
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
                if (D1 > 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(2050L, D1, 1L);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f7214g)) {
            int i19 = l1Var.f7212e;
            i18 = l1Var.f7213f;
            i17 = i19;
        } else {
            ot0.q v17 = ot0.q.v(l1Var.f7214g);
            if (v17 != null) {
                java.util.Map map = v17.G2;
                int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.ext_pay_info.business_type"), 0);
                java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_type");
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equals("wx_f2f") || str2.equals("wx_md")) {
                    int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_fee"), 0);
                    java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_feetype");
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_outtradeno");
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (P2 > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        i18 = 1;
                    }
                }
                i17 = i18;
                i18 = P;
            } else {
                i17 = 0;
            }
        }
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "business type is 0, ignore report");
            return;
        }
        java.lang.String str5 = (((("" + l1Var.f7210c + ",") + l1Var.f7208a + ",") + l1Var.f7211d + ",") + i17 + ",") + i18 + "";
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginWxPay", "byp report: %s", str5);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.kvStat(31619, str5);
        if (l1Var.f7208a == 1) {
            if (l1Var.f7211d == 1) {
                g0Var.C(2050L, 4L, 1L);
                return;
            } else {
                g0Var.C(2050L, 7L, 1L);
                return;
            }
        }
        if (l1Var.f7211d == 1) {
            g0Var.C(2050L, 5L, 1L);
            if (i17 == 1) {
                g0Var.C(2050L, 6L, 1L);
                return;
            }
            return;
        }
        g0Var.C(2050L, 8L, 1L);
        if (i17 == 1) {
            g0Var.C(2050L, 9L, 1L);
        }
    }
}
