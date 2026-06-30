package z43;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(optString) ? str : optString;
        java.lang.String optString2 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.String optString3 = jSONObject.optString("query");
        java.lang.String optString4 = jSONObject.optString("bizData");
        int optInt = jSONObject.optInt(ya.b.SOURCE);
        int optInt2 = jSONObject.optInt(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY);
        java.lang.String optString5 = jSONObject.optString("gameShareId");
        java.lang.String optString6 = jSONObject.optString("gameShareData");
        java.lang.String optString7 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        int optInt3 = jSONObject.optInt("isVideo");
        int optInt4 = jSONObject.optInt("duration");
        java.lang.String optString8 = jSONObject.optString("thumbUrl");
        com.tencent.mm.plugin.gamesharecard.GameShareCardInfo gameShareCardInfo = new com.tencent.mm.plugin.gamesharecard.GameShareCardInfo(new com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo(str2, optString2, optString3, optString4, java.lang.Integer.valueOf(optInt), optInt2), optString5, optString6, optString7, optInt3, optInt4, jSONObject.optString("srcId"), jSONObject.optString("desc"));
        m63.g gVar = (m63.g) i95.n0.c(m63.g.class);
        android.content.Context c17 = c();
        ((l63.h) gVar).getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str3 = gameShareCardInfo.f142111g;
        if (str3 == null) {
            str3 = "";
        }
        intent.putExtra("Ksnsupload_title", str3);
        java.lang.String str4 = gameShareCardInfo.f142115n;
        intent.putExtra("KContentObjDesc", str4 != null ? str4 : "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString8)) {
            if (optString8.startsWith("http")) {
                intent.putExtra("Ksnsupload_imgurl", optString8);
            } else {
                intent.putExtra("KsnsUpload_imgPath", optString8);
            }
        }
        intent.putExtra("Ksnsupload_type", 34);
        java.lang.String str5 = gameShareCardInfo.f142114m;
        if (str5 != null && str5.length() > 0) {
            intent.putExtra("Ksnsupload_appid", str5);
        }
        intent.putExtra("ksnsis_gamesharecard", true);
        intent.putExtra("ksnsUpload_gameShareIsVideo", gameShareCardInfo.f142112h);
        intent.putExtra("ksnsUpload_gameShareData", gameShareCardInfo.f142110f);
        intent.putExtra("ksnsUpload_gameShareDuration", gameShareCardInfo.f142113i);
        intent.putExtra("ksnsUpload_gameShareId", gameShareCardInfo.f142109e);
        com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo = gameShareCardInfo.f142108d;
        intent.putExtra("KsnsUpload_LiteAppId", liteAppBizDataInfo.f142116d);
        intent.putExtra("KsnsUpload_LiteAppPath", liteAppBizDataInfo.f142117e);
        intent.putExtra("KsnsUpload_LiteAppQuery", liteAppBizDataInfo.f142118f);
        intent.putExtra("ksnsUpload_gameShareLiteAppBizData", liteAppBizDataInfo.f142119g);
        intent.putExtra("ksnsUpload_gameShareLiteAppPriority", liteAppBizDataInfo.f142121i);
        j45.l.j(c17, "sns", ".ui.SnsUploadUI", intent, null);
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
