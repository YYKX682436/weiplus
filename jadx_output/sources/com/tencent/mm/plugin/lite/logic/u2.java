package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class u2 implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (!gm0.j1.a()) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppNewXmlConsumer", "liteapp consumeNewXml subtype: %s values: %s", str, map.toString());
        if (!map.containsKey(".sysmsg.mmlite.pkg_cdn_url") || !map.containsKey(".sysmsg.mmlite.app_id") || !map.containsKey(".sysmsg.mmlite.pkg_ecsda_pubkey") || !map.containsKey(".sysmsg.mmlite.pkg_md5")) {
            return null;
        }
        if (((java.lang.String) map.get(".sysmsg.mmlite.app_id")).equals(com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB)) {
            oq1.q qVar = new oq1.q();
            qVar.f347346a = (java.lang.String) map.get(".sysmsg.mmlite.app_id");
            qVar.f347349d = (java.lang.String) map.get(".sysmsg.mmlite.pkg_cdn_url");
            qVar.f347350e = (java.lang.String) map.get(".sysmsg.mmlite.pkg_md5");
            qVar.f347352g = (java.lang.String) map.get(".sysmsg.mmlite.pkg_ecsda_pubkey");
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.d(qVar, "debug", null, null, new com.tencent.mm.plugin.lite.logic.t2(this));
        } else {
            oq1.q qVar2 = new oq1.q();
            qVar2.f347346a = (java.lang.String) map.get(".sysmsg.mmlite.app_id");
            qVar2.f347349d = (java.lang.String) map.get(".sysmsg.mmlite.pkg_cdn_url");
            qVar2.f347350e = (java.lang.String) map.get(".sysmsg.mmlite.pkg_md5");
            qVar2.f347352g = (java.lang.String) map.get(".sysmsg.mmlite.pkg_ecsda_pubkey");
            java.lang.String[] strArr = new java.lang.String[2];
            int i17 = 0;
            if (map.containsKey(".sysmsg.mmlite.entry") && !((java.lang.String) map.get(".sysmsg.mmlite.entry")).isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppNewXmlConsumer", "liteapp consumeNewXml entry:" + ((java.lang.String) map.get(".sysmsg.mmlite.entry")));
                strArr = ra3.h0.e((java.lang.String) map.get(".sysmsg.mmlite.entry"), false);
            }
            java.lang.String[] strArr2 = strArr;
            if (map.containsKey(".sysmsg.mmlite.is_half_screen") && !((java.lang.String) map.get(".sysmsg.mmlite.is_half_screen")).isEmpty()) {
                i17 = java.lang.Integer.parseInt((java.lang.String) map.get(".sysmsg.mmlite.is_half_screen"));
            }
            int i18 = i17;
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar2, "debug", null, null, new com.tencent.mm.plugin.lite.logic.s2(this, strArr2, i18, (1 == i18 && map.containsKey(".sysmsg.mmlite.height_percent") && !((java.lang.String) map.get(".sysmsg.mmlite.height_percent")).isEmpty()) ? java.lang.Integer.parseInt((java.lang.String) map.get(".sysmsg.mmlite.height_percent")) / 100.0f : 0.0d));
        }
        return null;
    }
}
