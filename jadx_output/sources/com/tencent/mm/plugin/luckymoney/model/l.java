package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.luckymoney.model.m a() {
        com.tencent.mm.plugin.luckymoney.model.m mVar = new com.tencent.mm.plugin.luckymoney.model.m();
        mVar.f145436b = "";
        mVar.f145438d = "";
        r45.wv3 wv3Var = new r45.wv3();
        wv3Var.f389500f = "";
        wv3Var.f389498d = "";
        wv3Var.f389501g = com.tencent.mm.plugin.luckymoney.model.m.f145434e.b(false);
        mVar.f145435a = wv3Var;
        return mVar;
    }

    public final r45.xv3 b(boolean z17) {
        r45.xv3 xv3Var = new r45.xv3();
        xv3Var.f390477d = "";
        xv3Var.f390478e = "";
        xv3Var.f390479f = "";
        xv3Var.f390480g = "";
        xv3Var.f390481h = "";
        xv3Var.f390482i = "";
        xv3Var.f390483m = "";
        xv3Var.f390484n = "";
        xv3Var.f390485o = "";
        xv3Var.f390486p = "";
        xv3Var.f390487q = "";
        xv3Var.f390488r = "";
        xv3Var.f390489s = "";
        xv3Var.f390490t = "";
        xv3Var.f390491u = 0;
        xv3Var.f390492v = "";
        xv3Var.f390493w = "";
        xv3Var.f390494x = "";
        xv3Var.f390495y = "";
        xv3Var.f390496z = "";
        xv3Var.A = "";
        xv3Var.B = "";
        xv3Var.C = "";
        xv3Var.D = 0;
        xv3Var.E = "";
        xv3Var.F = "";
        xv3Var.G = "";
        xv3Var.H = "";
        xv3Var.I = "";
        xv3Var.f390476J = "";
        xv3Var.M = "";
        xv3Var.N = "";
        xv3Var.L = z17;
        return xv3Var;
    }

    public final com.tencent.mm.plugin.luckymoney.model.k0 c() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_STRING_SYNC, "");
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        java.lang.String str2 = str != null ? str : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopSourceMac", "[getProtoDataCache] dataStr is null");
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.k0 k0Var = new com.tencent.mm.plugin.luckymoney.model.k0();
        try {
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            kotlin.jvm.internal.o.f(ISO_8859_1, "ISO_8859_1");
            byte[] bytes = str2.getBytes(ISO_8859_1);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            k0Var.parseFrom(bytes);
            com.tencent.mm.plugin.luckymoney.model.p0 p0Var = k0Var.f145364d;
            if (p0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopSourceMac", "[getProtoDataCache] success， is default source? %s , id：%s , expired_time：%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f145526f)), p0Var.f145526f, java.lang.Integer.valueOf(p0Var.f145536s));
                return k0Var;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopSourceMac", "[getProtoDataCache] fail: %s", e17.getLocalizedMessage());
        }
        return null;
    }

    public final boolean d() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_prepare_use_new_logic_close, false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopSourceMac", "[useNewLogic] needCloseNewLogic");
            return false;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_USE_NEW_LOGIC_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        java.lang.Boolean bool = m17 instanceof java.lang.Boolean ? (java.lang.Boolean) m17 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopSourceMac", "[useNewLogic] %s", java.lang.Boolean.valueOf(booleanValue));
        return booleanValue;
    }

    public final com.tencent.mm.plugin.luckymoney.model.m e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopSourceMac", "json is null");
            return null;
        }
        com.tencent.mm.plugin.luckymoney.model.m mVar = new com.tencent.mm.plugin.luckymoney.model.m();
        java.lang.String optString = jSONObject.optString("showSourceMac");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        mVar.f145436b = optString;
        java.lang.String optString2 = jSONObject.optString("illegal_msg");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        mVar.f145438d = optString2;
        mVar.f145437c = jSONObject.optBoolean("is_illegal");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("showSource");
        if (optJSONObject != null) {
            mVar.f145435a = com.tencent.mm.plugin.luckymoney.model.g5.b(optJSONObject);
        }
        java.lang.String optString3 = jSONObject.optString("cover_info_buffer_for_place_order");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            r45.wv3 wv3Var = mVar.f145435a;
            r45.km5 km5Var = new r45.km5();
            try {
                km5Var.parseFrom(android.util.Base64.decode(optString3.getBytes(), 0));
            } catch (java.io.IOException unused) {
            }
            r45.xv3 xv3Var = wv3Var.f389501g;
            if (xv3Var != null) {
                xv3Var.f390491u = km5Var.f378831d;
                xv3Var.f390492v = km5Var.f378832e;
                xv3Var.f390496z = km5Var.f378833f;
            }
            mVar.f145435a = wv3Var;
        }
        return mVar;
    }

    public final void f(com.tencent.mm.plugin.luckymoney.model.k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        try {
            byte[] byteArray = k0Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            kotlin.jvm.internal.o.f(ISO_8859_1, "ISO_8859_1");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOP_PREPARE_INFO_STRING_SYNC, new java.lang.String(byteArray, ISO_8859_1));
            com.tencent.mm.plugin.luckymoney.model.p0 p0Var = k0Var.f145364d;
            if (p0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopSourceMac", "[setProtoDataCache] success， is default source? %s, id：%s , expired_time：%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f145526f)), p0Var.f145526f, java.lang.Integer.valueOf(p0Var.f145536s));
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopSourceMac", "[setProtoDataCache] failed :%s", e17.getMessage());
        }
    }
}
