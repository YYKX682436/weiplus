package s73;

/* loaded from: classes9.dex */
public class l implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.paymsg.PayMsgType"), 0) == 35) {
            com.tencent.mars.xlog.Log.i("HoneyPayNewXmlListener", "receive honey pay newxml");
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.paymsg.appmsgcontent");
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.paymsg.fromusername");
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.paymsg.tousername");
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.paymsg.paymsgid");
            java.lang.String str6 = (java.lang.String) map.get(".sysmsg.paymsg.systip");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                u73.h.k(str5, java.net.URLDecoder.decode(str2), str4, str3);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                return;
            }
            java.lang.String decode = java.net.URLDecoder.decode(str6);
            u73.b bVar = new u73.b();
            bVar.field_payMsgId = str5;
            ((u73.c) ((q73.f) i95.n0.c(q73.f.class)).f360381d.a()).get(bVar, new java.lang.String[0]);
            if (bVar.field_msgId <= 0) {
                com.tencent.mars.xlog.Log.i("HoneyPayNewXmlListener", "can not found honey pay record, will not insert sysmsg");
                return;
            }
            if (pt0.f0.Li((com.tencent.mm.sdk.platformtools.t8.K0(str3) || str3.equals(c01.z1.r())) ? str4 : str3, bVar.field_msgId).getMsgId() <= 0) {
                com.tencent.mars.xlog.Log.i("HoneyPayNewXmlListener", "can not found honey bubble, will not insert sysmsg");
            } else if (c01.z1.J(str3)) {
                u73.h.f(str4, decode, str3);
            } else {
                u73.h.f(str3, decode, str4);
            }
        }
    }
}
