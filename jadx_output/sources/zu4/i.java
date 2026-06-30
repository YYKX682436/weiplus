package zu4;

/* loaded from: classes8.dex */
public class i implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        int D1;
        su4.f3 f3Var;
        if (map == null || str == null || !str.equals("mmsearch_reddot_new") || (D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.entry"), 0)) != 1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FtsRedPointReceiver", "recv %s, %s", "mmsearch_reddot_new", map.toString());
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.clear"), 0);
        java.lang.String z17 = com.tencent.mm.sdk.platformtools.t8.z1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.msgid"), new java.lang.Object[0]);
        int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.discovery"), 0);
        int D14 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.android_cli_version"), 0);
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.expire_time"));
        int D15 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.h5_version"), 0);
        int D16 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.reddot_type"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.reddot_text");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.reddot_icon");
        long E12 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(".sysmsg.mmsearch_reddot_new.timestamp"));
        su4.g3 g3Var = su4.g3.f412902d;
        if (D1 != 1) {
            g3Var.getClass();
            f3Var = null;
        } else {
            f3Var = g3Var.f412903a;
        }
        if (f3Var == null) {
            f3Var = new su4.f3();
        }
        if (f3Var.f412889i < E12) {
            f3Var.f412881a = z17;
            f3Var.f412890j = D13;
            f3Var.f412882b = D1;
            f3Var.f412883c = D14;
            f3Var.f412884d = E1;
            f3Var.f412885e = D15;
            f3Var.f412886f = D16;
            f3Var.f412887g = str2;
            f3Var.f412888h = str3;
            f3Var.f412889i = E12;
            f3Var.f412893m = D12;
            f3Var.f412891k = java.lang.System.currentTimeMillis();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "timestamp %d not big than last msg %d", java.lang.Long.valueOf(E12), java.lang.Long.valueOf(f3Var.f412889i));
        }
        g3Var.b();
        new com.tencent.mm.autogen.events.SearchSysMsgNotifyEvent().e();
    }
}
