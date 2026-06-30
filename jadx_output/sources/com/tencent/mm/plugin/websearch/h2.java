package com.tencent.mm.plugin.websearch;

@j95.b
/* loaded from: classes.dex */
public class h2 extends i95.w implements su4.a1 {
    public static void Ai(com.tencent.mm.plugin.websearch.h2 h2Var, int i17) {
        h2Var.getClass();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchDisableInstantPreload()) == 1 && i17 == 3) {
            return;
        }
        su4.r2.p(1000L, false, true, 0);
    }

    public static java.lang.String wi(com.tencent.mm.plugin.websearch.h2 h2Var, int i17, java.lang.String str) {
        h2Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(i17));
        hashMap.put("type", java.lang.String.valueOf(64));
        hashMap.put("lang", com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        hashMap.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        hashMap.put("version", java.lang.String.valueOf(com.tencent.mm.plugin.websearch.l2.a(3)));
        hashMap.put("isHomePage", "0");
        if (com.tencent.mm.ui.bk.C()) {
            hashMap.put("isDarkMode", "1");
        }
        if (!android.text.TextUtils.isEmpty("")) {
            hashMap.put("extParams", "");
        }
        hashMap.put("isSug", "1");
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(com.tencent.mm.plugin.websearch.l2.g(3).l());
        stringBuffer.append("/app.html?");
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            stringBuffer.append("&");
            stringBuffer.append((java.lang.String) entry.getKey());
            stringBuffer.append("=");
            stringBuffer.append((java.lang.String) entry.getValue());
        }
        if (!hashMap.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            stringBuffer.append("&sessionId=");
            tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
            ((sg0.y3) o1Var).getClass();
            stringBuffer.append(su4.r2.f(D1));
        }
        return stringBuffer.toString();
    }

    public void Bi(android.content.Context context, su4.j2 j2Var) {
        ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(context, new com.tencent.mm.plugin.websearch.f2(this, j2Var, context));
    }

    public void Di(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, int i18, boolean z18, java.lang.String str3) {
        Ui(context, i17, str, str2, z17, map, false, Integer.MAX_VALUE, "", i18, z18, false, 0, false, str3);
    }

    public void Ni(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, java.lang.String str3, int i18, boolean z18) {
        Ui(context, i17, str, str2, z17, map, false, i18, str3, 0, z18, false, 0, false, "");
    }

    public void Ri(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, boolean z18, int i18, java.lang.String str3, int i19) {
        Ui(context, i17, str, str2, z17, map, z18, i18, str3, i19, false, false, 0, false, "");
    }

    public void Ui(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, boolean z17, java.util.Map map, boolean z18, int i18, java.lang.String str3, int i19, boolean z19, boolean z27, int i27, boolean z28, java.lang.String str4) {
        ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(context, new com.tencent.mm.plugin.websearch.g2(this, context, map, str, i17, z17, str4, str2, i19, str3, z19, z27, i27, z28, z18, i18));
    }

    public void Vi(su4.j2 j2Var) {
        com.tencent.mm.plugin.websearch.e2 e2Var = new com.tencent.mm.plugin.websearch.e2(this, j2Var);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            e2Var.run();
            return;
        }
        ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).Bi(j2Var.f412938a, e2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zi(android.content.Context r33, org.json.JSONObject r34) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.h2.Zi(android.content.Context, org.json.JSONObject):void");
    }
}
