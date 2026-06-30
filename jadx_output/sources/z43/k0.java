package z43;

/* loaded from: classes8.dex */
public class k0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470121g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f470122h;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean z18;
        this.f470121g = str;
        this.f470122h = jSONObject;
        java.lang.String optString = jSONObject.optString("appId");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f470121g = optString;
        }
        java.lang.String optString2 = jSONObject.optString("thumbUrl");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2) && optString2.startsWith("http")) {
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString2, null);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = "";
        if (optString2 == null) {
            optString2 = "";
        }
        hashMap.put("img_url", optString2);
        hashMap.put("desc", jSONObject.optString("desc"));
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        hashMap.put("appId", this.f470121g);
        hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
        hashMap.put("query", jSONObject.optString("query"));
        hashMap.put("bizData", jSONObject.optString("bizData"));
        hashMap.put(ya.b.SOURCE, java.lang.String.valueOf(jSONObject.optInt(ya.b.SOURCE)));
        hashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, java.lang.String.valueOf(jSONObject.optInt(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY)));
        hashMap.put("gameShareId", jSONObject.optString("gameShareId"));
        hashMap.put("gameShareData", jSONObject.optString("gameShareData"));
        hashMap.put("srcId", jSONObject.optString("srcId"));
        hashMap.put("isVideo", java.lang.String.valueOf(jSONObject.optInt("isVideo")));
        hashMap.put("duration", java.lang.String.valueOf(jSONObject.optInt("duration")));
        hashMap.put("isGameShareCard", "true");
        com.tencent.mars.xlog.Log.i("LiteAppJsApiSendGameShareCard", "sendGameShareCard params:" + hashMap);
        boolean optBoolean = jSONObject.optBoolean("isRecentForward");
        java.lang.String optString3 = jSONObject.optString("content");
        int optInt = jSONObject.optInt(ya.b.INDEX);
        if (optBoolean) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 12L, 1L, false);
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            java.util.ArrayList Ui = new com.tencent.mm.pluginsdk.forward.m().Ui();
            if (!Ui.isEmpty()) {
                for (int i17 = 0; i17 < Ui.size(); i17++) {
                    o25.m2 m2Var = (o25.m2) Ui.get(i17);
                    if (optInt == i17 && optString3.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.w2.a(m2Var.f342560a))) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 13L, 1L, false);
                        z18 = true;
                        str2 = m2Var.f342560a;
                        break;
                    }
                }
            }
        }
        z18 = false;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("webview_params", hashMap);
        if (z18 && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 14L, 1L, false);
            intent.putExtra("Select_Conv_User", str2);
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).sk(this, intent, 0);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            this.f143443f.a("");
            return;
        }
        if (i18 != -1) {
            if (i18 == 0 || i18 == 1) {
                this.f143443f.a("cancel");
                return;
            } else {
                this.f143443f.a("");
                return;
            }
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            this.f143443f.d(false);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null) {
            return;
        }
        java.lang.String optString = this.f470122h.optString("thumbUrl");
        byte[] bArr = null;
        android.graphics.Bitmap Bi = !com.tencent.mm.sdk.platformtools.t8.K0(optString) ? optString.startsWith("http") ? ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(optString) : com.tencent.mm.graphics.e.c(this.f470122h.optString("thumbUrl")) : null;
        if (Bi != null && !Bi.isRecycled()) {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiSendGameShareCard", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).Ai(new com.tencent.mm.plugin.gamesharecard.GameShareCardInfo(new com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo(this.f470121g, this.f470122h.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), this.f470122h.optString("query"), this.f470122h.optString("bizData"), java.lang.Integer.valueOf(this.f470122h.optInt(ya.b.SOURCE)), this.f470122h.optInt(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY)), this.f470122h.optString("gameShareId"), this.f470122h.optString("gameShareData"), this.f470122h.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), this.f470122h.optInt("isVideo"), this.f470122h.optInt("duration"), this.f470122h.optString("srcId"), this.f470122h.optString("desc")), bArr, stringExtra);
        db5.e1.T(c(), c().getResources().getString(com.tencent.mm.R.string.fw6));
        this.f143443f.d(false);
    }
}
