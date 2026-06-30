package z43;

/* loaded from: classes8.dex */
public class j0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public org.json.JSONObject f470120g;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        this.f470120g = jSONObject;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(jSONObject.optString("card_image_url"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", jSONObject.optString("card_link"));
        hashMap.put("nickname", jSONObject.optString("card_nick_name"));
        hashMap.put("card_image_url", jSONObject.optString("card_image_url"));
        hashMap.put("card_desc", jSONObject.optString("card_desc"));
        hashMap.put("card_tail", jSONObject.optString("card_tail"));
        if (jSONObject.optJSONObject("liteAppInfo") != null && jSONObject.optJSONObject("liteAppInfo").length() > 0) {
            hashMap.put("liteapp_appId", jSONObject.optJSONObject("liteAppInfo").optString("appId"));
            hashMap.put("liteapp_path", jSONObject.optJSONObject("liteAppInfo").optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
            hashMap.put("liteapp_query", jSONObject.optJSONObject("liteAppInfo").optString("query"));
            hashMap.put("liteapp_minVersion", jSONObject.optJSONObject("liteAppInfo").optString("minVersion"));
        }
        hashMap.put("is_game_card", "true");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("webview_params", hashMap);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).sk(this, intent, 0);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            java.lang.String optString = this.f470120g.optString("appid");
            if (i18 != -1) {
                if (i18 == 0 || i18 == 1) {
                    this.f143443f.a("cancel");
                    return;
                } else {
                    this.f143443f.a("fail");
                    return;
                }
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                this.f143443f.d(false);
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiSendGameNameCard", "onSelectConversationUICallback fail, toUser is null");
                this.f143443f.a("toUser is null");
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiSendGameNameCard", "toUser is null");
                return;
            }
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(this.f470120g.optString("img_url"));
            org.json.JSONObject jSONObject = this.f470120g;
            c53.b bVar = new c53.b();
            bVar.webpageUrl = jSONObject.optString("link");
            bVar.extInfo = jSONObject.optString("review_data");
            bVar.f38653a = jSONObject.optString("card_image_url");
            bVar.f38654b = jSONObject.optString("card_nick_name");
            bVar.f38655c = jSONObject.optString("card_desc");
            bVar.f38656d = jSONObject.optString("card_tail");
            bVar.f38657e = jSONObject.optString("card_link");
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
            wXMediaMessage.mediaObject = bVar;
            wXMediaMessage.title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            wXMediaMessage.description = jSONObject.optString("desc");
            if (Bi != null && !Bi.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiSendGameNameCard", "thumb image is not null");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
            }
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(optString);
            com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
            am.jt jtVar = sendAppMsgEvent.f54749g;
            jtVar.f7080a = wXMediaMessage;
            jtVar.f7081b = optString;
            jtVar.f7082c = h17 == null ? "" : h17.field_appName;
            jtVar.f7083d = stringExtra;
            jtVar.f7084e = 2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f470120g.optString("src_username"))) {
                jtVar.f7087h = null;
            } else {
                jtVar.f7085f = this.f470120g.optString("src_username");
                jtVar.f7086g = this.f470120g.optString("src_displayname");
            }
            jtVar.f7088i = this.f470120g.optString("shareUrl");
            jtVar.f7089j = this.f470120g.optString("currentUrl");
            jtVar.f7090k = this.f470120g.optString("preVerifyAppId");
            sendAppMsgEvent.e();
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = stringExtra;
                mtVar.f7363b = stringExtra2;
                mtVar.f7364c = c01.e2.C(stringExtra);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            }
            db5.e1.T(c(), c().getResources().getString(com.tencent.mm.R.string.f490560yi));
            this.f143443f.d(false);
        }
    }
}
