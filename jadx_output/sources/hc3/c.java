package hc3;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final hc3.c f280356a = new hc3.c();

    public final r45.qg7 a(org.json.JSONObject jSONObject) {
        long optLong = jSONObject != null ? jSONObject.optLong("expiresIn", 0L) : 0L;
        int optInt = jSONObject != null ? jSONObject.optInt("quota", 0) : 0;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("packetId", "") : null;
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("channel", "") : null;
        java.lang.String str = optString2 != null ? optString2 : "";
        java.lang.String str2 = gm0.j1.b().j() + '_' + java.util.UUID.randomUUID();
        com.tencent.mars.xlog.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[assembleData] expiresIn: " + optLong + "、quota: " + optInt + "、packetId：" + optString + "、channel、：" + str + "、token：" + str2);
        if (optLong <= 0) {
            optLong = 3600;
        }
        if (optInt <= 0) {
            optInt = 1;
        }
        long a17 = c01.id.a() + (optLong * 1000);
        r45.qg7 qg7Var = new r45.qg7();
        qg7Var.f383977d = str2;
        qg7Var.f383978e = a17;
        qg7Var.f383979f = optInt;
        qg7Var.f383980g = 0;
        qg7Var.f383981h = optString;
        qg7Var.f383982i = str;
        return qg7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.qg7 b(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc3.c.b(java.lang.String):r45.qg7");
    }

    public final void c(r45.qg7 qg7Var) {
        if (qg7Var == null) {
            return;
        }
        try {
            byte[] byteArray = qg7Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
            kotlin.jvm.internal.o.f(ISO_8859_1, "ISO_8859_1");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_YUANBAO_TOKEN_DATA_STRING_SYNC, new java.lang.String(byteArray, ISO_8859_1));
            com.tencent.mars.xlog.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[setSaveTokenData] success，tokenData: " + qg7Var.f383977d + "、expiredTime: " + qg7Var.f383978e + "、packetId: " + qg7Var.f383981h + "、quota: " + qg7Var.f383979f + "、quotaUsed: " + qg7Var.f383980g + "、channel: " + qg7Var.f383982i);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HongbaoVsYuanBaoLogic", "[setSaveTokenData] failed :%s", e17.getMessage());
        }
    }
}
