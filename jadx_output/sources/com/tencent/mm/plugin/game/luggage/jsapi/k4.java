package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes9.dex */
public class k4 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f139699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.l4 f139701f;

    public k4(com.tencent.mm.plugin.game.luggage.jsapi.l4 l4Var, int i17, org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139701f = l4Var;
        this.f139699d = jSONObject;
        this.f139700e = q5Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            org.json.JSONObject jSONObject = this.f139699d;
            java.lang.String optString = jSONObject.optString("appid");
            com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var = this.f139700e;
            if (i18 != -1) {
                if (i18 == 0 || i18 == 1) {
                    q5Var.a("cancel", null);
                    return;
                } else {
                    q5Var.a("fail", null);
                    return;
                }
            }
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (intent != null) {
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                arrayList = intent.getStringArrayListExtra("SendMsgUsernames");
            }
            if (arrayList == null || arrayList.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendGameNameCard", "mmOnActivityResult fail, toUser is null");
                q5Var.a("fail", null);
                return;
            }
            java.util.Iterator<java.lang.String> it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.K0(next) || next.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendGameNameCard", "toUser is null");
                } else {
                    android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(jSONObject.optString("img_url"));
                    this.f139701f.getClass();
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendGameNameCard", "thumb image is not null");
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
                    jtVar.f7083d = next;
                    jtVar.f7084e = 2;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(jSONObject.optString("src_username"))) {
                        jtVar.f7087h = null;
                    } else {
                        jtVar.f7085f = jSONObject.optString("src_username");
                        jtVar.f7086g = jSONObject.optString("src_displayname");
                    }
                    jtVar.f7088i = jSONObject.optString("shareUrl");
                    jtVar.f7089j = jSONObject.optString("currentUrl");
                    jtVar.f7090k = jSONObject.optString("preVerifyAppId");
                    sendAppMsgEvent.e();
                    java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
                        java.util.HashMap a17 = com.tencent.mm.ui.i1.a(stringExtra);
                        if (!com.tencent.mm.storage.z3.R4(next) || a17 == null) {
                            com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                            am.mt mtVar = sendMsgEvent.f54752g;
                            mtVar.f7362a = next;
                            mtVar.f7363b = stringExtra;
                            mtVar.f7364c = c01.e2.C(next);
                            mtVar.f7365d = 0;
                            sendMsgEvent.e();
                        } else if (w11.t1.a(next)) {
                            w11.r1 a18 = w11.s1.a(next);
                            a18.e(stringExtra);
                            a18.f442130e = c01.e2.C(next);
                            a18.f442131f = 1;
                            a18.f442133h = a17;
                            a18.b();
                        } else {
                            w11.r1 a19 = w11.s1.a(next);
                            a19.g(next);
                            a19.e(stringExtra);
                            a19.f442130e = c01.e2.C(next);
                            a19.f442131f = 1;
                            a19.f442133h = a17;
                            a19.f442134i = 5;
                            a19.a().a();
                        }
                    }
                }
            }
            q5Var.a(null, null);
        }
    }
}
