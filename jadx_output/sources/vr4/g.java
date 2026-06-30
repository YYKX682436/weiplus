package vr4;

/* loaded from: classes9.dex */
public final class g implements vg3.r4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg3.r4
    public void h0(java.lang.String subType, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(subType, "subType");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) values.get(".sysmsg.paymsg.PayMsgType"), 0);
        java.lang.String str = "";
        com.tencent.mm.storage.f9 f9Var = null;
        f9Var = null;
        f9Var = null;
        f9Var = null;
        if (P != 60) {
            if (P != 61) {
                return;
            }
            java.lang.String str2 = (java.lang.String) values.get(".sysmsg.paymsg.app_id");
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = (java.lang.String) values.get(".sysmsg.paymsg.path");
            java.lang.String str4 = (java.lang.String) values.get(".sysmsg.paymsg.query");
            java.lang.String str5 = (java.lang.String) values.get(".sysmsg.paymsg.is_half_screen");
            java.lang.String str6 = (java.lang.String) values.get(".sysmsg.paymsg.height_percent");
            java.lang.Double valueOf = str6 != null ? java.lang.Double.valueOf(java.lang.Double.parseDouble(str6)) : null;
            java.lang.String str7 = (java.lang.String) values.get(".sysmsg.paymsg.is_transparent");
            java.lang.String str8 = (java.lang.String) values.get(".sysmsg.paymsg.min_version");
            java.lang.String str9 = (java.lang.String) values.get(".sysmsg.paymsg.anim_in");
            if (str9 == null) {
                str9 = "sight_slide_bottom_in";
            }
            java.lang.String str10 = (java.lang.String) values.get(".sysmsg.paymsg.anim_out");
            if (str10 == null) {
                str10 = "sight_slide_bottom_out";
            }
            java.lang.String str11 = (java.lang.String) values.get(".sysmsg.paymsg.busi_data");
            com.tencent.mars.xlog.Log.i("CommonPayNewXmlListener", "receive newxml for handleOpenPayLiteAppMsg values:" + values);
            java.util.ArrayList arrayList = (java.util.ArrayList) ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tj(str2);
            if (!arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("CommonPayNewXmlListener", "current LiteApp is exist:".concat(str2));
                java.lang.Long l17 = (java.lang.Long) arrayList.get(0);
                kotlin.jvm.internal.o.d(l17);
                com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(l17.longValue(), new android.content.Intent());
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", str2);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str3);
            if (str11 != null) {
                str = "busiData=" + java.net.URLEncoder.encode(str11, com.tencent.mapsdk.internal.rv.f51270c);
            }
            if (str4 != null) {
                if (str4.length() > 0) {
                    str = str4 + '&' + str;
                }
            }
            bundle.putString("query", str);
            bundle.putBoolean("isHalfScreen", kotlin.jvm.internal.o.b(str5, "1"));
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, kotlin.jvm.internal.o.b(str7, "1"));
            bundle.putString("minVersion", str8);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("nextAnimIn", str9);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            bundle.putInt("nextAnimIn", ra3.h0.a(jSONObject));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("currentAnimOut", str10);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            bundle.putInt("currentAnimOut", ra3.h0.b(jSONObject2));
            if (valueOf != null) {
                double doubleValue = valueOf.doubleValue();
                if (java.lang.Double.compare(doubleValue, 0.0f) > 0) {
                    bundle.putDouble("heightPercent", doubleValue);
                }
            }
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.APP;
            liteAppReferrerInfo.sceneId = "handleOpenPayLiteAppMsg";
            bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, new vr4.f());
            return;
        }
        java.lang.String str12 = (java.lang.String) values.get(".sysmsg.paymsg.appmsgcontent");
        java.lang.String str13 = (java.lang.String) values.get(".sysmsg.paymsg.paymsgid");
        java.lang.String str14 = (java.lang.String) values.get(".sysmsg.paymsg.systip");
        java.lang.String str15 = (java.lang.String) values.get(".sysmsg.paymsg.fromusername");
        com.tencent.mars.xlog.Log.i("CommonPayNewXmlListener", "receive newxml for third c2c message, payMsgId:" + str13 + " sysTip:" + str14 + " fromUsername:" + str15);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str13)) {
                jz5.g gVar = rb3.g.f393858a;
                up5.a0 a0Var = (up5.a0) ((com.tencent.wcdb.core.Table) ((jz5.n) rb3.g.f393860c).getValue()).getFirstObject(up5.m.f430015c.eq(str13));
                if (a0Var != null) {
                    java.lang.Long msgId = a0Var.f429889b;
                    kotlin.jvm.internal.o.f(msgId, "msgId");
                    if (msgId.longValue() > 0) {
                        com.tencent.mars.xlog.Log.i("CommonPayNewXmlListener", "find third c2c msg:" + a0Var.f429889b + " in db");
                        pt0.e0 e0Var = pt0.f0.f358209b1;
                        java.lang.String str16 = a0Var.f429890c;
                        java.lang.Long msgId2 = a0Var.f429889b;
                        kotlin.jvm.internal.o.f(msgId2, "msgId");
                        com.tencent.mm.storage.f9 n17 = e0Var.n(str16, msgId2.longValue());
                        if (n17.getMsgId() > 0) {
                            f9Var = n17;
                        } else {
                            com.tencent.mars.xlog.Log.w("CommonPayNewXmlListener", "can not find third c2c msg:" + a0Var.f429889b + " in message");
                        }
                    }
                }
                com.tencent.mars.xlog.Log.w("CommonPayNewXmlListener", "can not find third c2c record for payMsgId:" + str13);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("CommonPayNewXmlListener", e17, "", new java.lang.Object[0]);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str12) && f9Var != null) {
            java.lang.String decode = java.net.URLDecoder.decode(str12);
            kotlin.jvm.internal.o.d(decode);
            f9Var.d1(decode);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str14) || com.tencent.mm.sdk.platformtools.t8.K0(str15) || f9Var == null) {
            return;
        }
        java.lang.String decode2 = java.net.URLDecoder.decode(str14);
        kotlin.jvm.internal.o.d(decode2);
        kotlin.jvm.internal.o.d(str15);
        com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
        f9Var2.j1(0);
        f9Var2.u1(str15);
        f9Var2.r1(6);
        f9Var2.d1(decode2);
        f9Var2.e1(c01.w9.m(str15, java.lang.System.currentTimeMillis() / 1000));
        f9Var2.setType(10000);
        f9Var2.f1(f9Var2.w0() | 8);
        long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
        com.tencent.mars.xlog.Log.i("CommonPayNewXmlListener", "insert msgId: %s", java.lang.Long.valueOf(M9));
        if (M9 <= 0) {
            com.tencent.mars.xlog.Log.w("CommonPayNewXmlListener", "insert sys msg fail!");
        }
    }
}
