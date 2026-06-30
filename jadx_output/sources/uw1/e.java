package uw1;

/* loaded from: classes15.dex */
public class e implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        if (tw1.f.Di().Ni() == null) {
            com.tencent.mars.xlog.Log.w("PayMsgListener", "func[onRecieveMsg] payerMsgMgr null");
            return;
        }
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        ww1.v Ni = tw1.f.Di().Ni();
        long j17 = p0Var.f70726a.f377565o;
        Ni.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), 0);
        if (P != 9 && P != 26 && P != 50) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectPayerMsgMgr", "Not ftf collect msg type, ignore; type=" + P);
            return;
        }
        ww1.g2 g2Var = new ww1.g2();
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.paymsg.username");
        if (str == null) {
            str = "";
        }
        g2Var.f450195d = str;
        g2Var.f450197f = com.tencent.mm.sdk.platformtools.t8.F((java.lang.String) d17.get(".sysmsg.paymsg.fee"), 0.0d) / 100.0d;
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.paymsg.feetype");
        if (str2 == null) {
            str2 = "";
        }
        g2Var.f450198g = str2;
        g2Var.f450199h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsgtimestamp"), (int) com.tencent.mm.sdk.platformtools.t8.i1());
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.paymsg.transid");
        if (str3 == null) {
            str3 = "";
        }
        g2Var.f450196e = str3;
        java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.paymsg.displayname");
        if (str4 == null) {
            str4 = "";
        }
        g2Var.f450202n = str4;
        g2Var.f450200i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.scene"), 1);
        g2Var.f450201m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.status"), 0);
        g2Var.f450204p = P;
        java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.paymsg.outtradeno");
        if (str5 == null) {
            str5 = "";
        }
        g2Var.f450203o = str5;
        java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.paymsg.type");
        if (str6 == null) {
            str6 = "";
        }
        g2Var.f450205q = str6;
        java.lang.String str7 = (java.lang.String) d17.get(".sysmsg.paymsg.headimgurl");
        if (str7 == null) {
            str7 = "";
        }
        g2Var.f450206r = str7;
        java.lang.String str8 = (java.lang.String) d17.get(".sysmsg.paymsg.voice_content");
        if (str8 == null) {
            str8 = "";
        }
        java.lang.String str9 = (java.lang.String) d17.get(".sysmsg.paymsg.expire_voice_timestamp");
        java.lang.String str10 = str9 != null ? str9 : "";
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.need_failover"), 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectPayerMsgMgr", "func[onResvMsg] final content:%s", g17);
        for (ww1.u uVar : Ni.f450311d) {
            if (uVar != null) {
                uVar.E4(g2Var);
            }
        }
        if (g2Var.f450201m == 1) {
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent collectRcvVoiceEvent = new com.tencent.mm.autogen.events.CollectRcvVoiceEvent();
            int round = (int) java.lang.Math.round(g2Var.f450197f * 100.0d);
            am.h3 h3Var = collectRcvVoiceEvent.f54069g;
            h3Var.f6808a = round;
            h3Var.f6809b = g2Var.f450198g;
            h3Var.f6811d = g2Var.f450205q;
            h3Var.f6810c = g2Var.f450203o;
            h3Var.f6812e = c01.id.c() - (j17 * 1000);
            h3Var.f6813f = 1;
            h3Var.f6814g = str8;
            h3Var.f6815h = str10;
            if (P2 == 0) {
                h3Var.f6816i = false;
            } else {
                h3Var.f6816i = true;
            }
            collectRcvVoiceEvent.e();
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
