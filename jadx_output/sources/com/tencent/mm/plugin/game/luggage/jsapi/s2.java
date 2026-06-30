package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes8.dex */
public class s2 implements com.tencent.mm.ipcinvoker.j {
    public final long a(java.lang.String str) {
        long j17 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0L;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.d(new com.tencent.mm.plugin.game.luggage.jsapi.r2(this, jSONObject));
            com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData openExtraData = new com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData();
            openExtraData.store = sVar;
            j17 = com.tencent.mm.plugin.lite.LiteAppCenter.genDataUuid();
            com.tencent.mm.plugin.lite.LiteAppCenter.setOpenExtraData(j17, openExtraData);
            return j17;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenGameUrlWithExtraWebView", e17, "", new java.lang.Object[0]);
            return j17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: Exception -> 0x00f4, TryCatch #0 {Exception -> 0x00f4, blocks: (B:3:0x0016, B:5:0x0030, B:9:0x0039, B:12:0x0049, B:14:0x0054, B:17:0x005b, B:18:0x006d, B:19:0x0068, B:20:0x0071, B:22:0x0085, B:24:0x0091, B:27:0x0099, B:30:0x00a3, B:32:0x00c4), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: Exception -> 0x00f4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f4, blocks: (B:3:0x0016, B:5:0x0030, B:9:0x0039, B:12:0x0049, B:14:0x0054, B:17:0x005b, B:18:0x006d, B:19:0x0068, B:20:0x0071, B:22:0x0085, B:24:0x0091, B:27:0x0099, B:30:0x00a3, B:32:0x00c4), top: B:2:0x0016 }] */
    @Override // com.tencent.mm.ipcinvoker.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.Object r19, com.tencent.mm.ipcinvoker.r r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.jsapi.s2.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
