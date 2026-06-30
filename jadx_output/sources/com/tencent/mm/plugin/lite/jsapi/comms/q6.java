package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes9.dex */
public class q6 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143730g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f143731h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f143732i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.lite.jsapi.comms.v6 f143733m = new com.tencent.mm.plugin.lite.jsapi.comms.v6(null);

    public final void A(org.json.JSONObject jSONObject, java.util.HashMap hashMap) {
        java.lang.String str;
        boolean z17;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiSendAppMessage", "liteapp sendAppMessage params:" + hashMap);
        boolean optBoolean = jSONObject.optBoolean("isRecentForward");
        java.lang.String optString = jSONObject.optString("content");
        int optInt = jSONObject.optInt(ya.b.INDEX);
        if (optBoolean) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 12L, 1L, false);
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            java.util.ArrayList Ui = new com.tencent.mm.pluginsdk.forward.m().Ui();
            if (!Ui.isEmpty()) {
                for (int i17 = 0; i17 < Ui.size(); i17++) {
                    o25.m2 m2Var = (o25.m2) Ui.get(i17);
                    if (optInt == i17 && optString.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.w2.a(m2Var.f342560a))) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 13L, 1L, false);
                        z17 = true;
                        str = m2Var.f342560a;
                        break;
                    }
                }
            }
        }
        str = "";
        z17 = false;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 0);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("callback_id", m93.j.a(this));
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 14L, 1L, false);
            intent.putExtra("Select_Conv_User", str);
        }
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "continueForwardAction", "(Lorg/json/JSONObject;Ljava/util/HashMap;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendAppMessage", "continueForwardAction", "(Lorg/json/JSONObject;Ljava/util/HashMap;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final java.lang.String B(java.lang.String str) {
        java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) i95.n0.c(com.tencent.mm.feature.lite.i.class)).zj(this.f143730g, this.f143442e.f299024a, str);
        return !zj6.isEmpty() ? zj6 : str;
    }

    public final java.lang.String C(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("error", str2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", e17.getMessage());
        }
        return java.lang.String.format("LiteAppJsApiSendAppMessage,%s,%s", jSONObject.toString().replace(",", ";"), str);
    }

    public void D(java.lang.String str) {
        final java.lang.String B = B(str);
        try {
            this.f143732i.put("thumbUrl", B);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", "invoke: failed to update thumbUrl in data", e17);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(B)) {
            return;
        }
        if (B.startsWith("http")) {
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(B, new com.tencent.mm.plugin.lite.jsapi.comms.r6(this));
        } else if (com.tencent.mm.vfs.w6.j(B)) {
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.q6$$e
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var = com.tencent.mm.plugin.lite.jsapi.comms.q6.this;
                    q6Var.getClass();
                    java.lang.String str2 = B;
                    android.graphics.Bitmap N = com.tencent.mm.sdk.platformtools.x.N(str2, 480, 480);
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(str2, N);
                    java.lang.String C = q6Var.C(q6Var.f143730g, "[pushThumbToCache] download localId picture error");
                    if (N == null || N.isRecycled()) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, C);
                    }
                }
            });
        }
    }

    public final void E(java.lang.String str, byte[] bArr) {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        java.lang.String str2 = this.f143730g;
        org.json.JSONObject jSONObject = this.f143732i;
        if (this instanceof com.tencent.mm.plugin.lite.jsapi.comms.v7) {
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
            wXWebpageObject.webpageUrl = jSONObject.optString("url");
            wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
            wXMediaMessage.mediaObject = wXWebpageObject;
            wXMediaMessage.title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            wXMediaMessage.description = jSONObject.optString("desc");
        } else {
            ja3.a aVar = new ja3.a();
            aVar.userName = str2;
            aVar.path = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            aVar.webpageUrl = jSONObject.optString("url");
            aVar.source = jSONObject.optInt(ya.b.SOURCE);
            aVar.f298612a = jSONObject.optString("minVersion");
            aVar.f298613b = jSONObject.optBoolean("isTransparent");
            aVar.f298614c = jSONObject.optBoolean("hideIcon");
            aVar.f298615d = jSONObject.optBoolean("forbidForward");
            java.lang.String optString = jSONObject.optString("oldImageInfo");
            if (!optString.isEmpty()) {
                aVar.f298617f = z05.a.a(optString);
            }
            aVar.f298616e = jSONObject.optString("imageConf");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("query");
            if (optJSONObject != null) {
                aVar.query = optJSONObject.toString();
            }
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(aVar);
            wXMediaMessage2.title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            wXMediaMessage2.description = jSONObject.optString("desc");
            wXMediaMessage = wXMediaMessage2;
        }
        wXMediaMessage.thumbData = bArr;
        java.lang.String optString2 = this.f143732i.optString("srcId");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(optString2);
        com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
        am.jt jtVar = sendAppMsgEvent.f54749g;
        jtVar.f7080a = wXMediaMessage;
        jtVar.f7083d = str;
        jtVar.f7084e = 2;
        jtVar.f7081b = optString2;
        jtVar.f7082c = h17 == null ? "" : h17.field_appName;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f143732i.optString("src_username"))) {
            jtVar.f7087h = null;
        } else {
            jtVar.f7085f = this.f143732i.optString("src_username");
            jtVar.f7086g = this.f143732i.optString("src_displayname");
        }
        jtVar.f7089j = this.f143732i.optString("url");
        jtVar.f7088i = this.f143732i.optString("url");
        sendAppMsgEvent.e();
        db5.e1.T(c(), c().getResources().getString(com.tencent.mm.R.string.fw6));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r17, final org.json.JSONObject r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.q6.a(java.lang.String, org.json.JSONObject, boolean):void");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        byte[] bArr;
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
        this.f143732i.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", "mmOnActivityResult fail, toUser is null");
            this.f143443f.a("");
        } else {
            java.lang.String optString = this.f143732i.optString("thumbUrl");
            byte[] bArr2 = null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                E(stringExtra, null);
            } else if (optString.startsWith("http")) {
                gk0.h hVar = new gk0.h(optString);
                gk0.k kVar = new gk0.k(0, 0);
                final g75.z Ui = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ui(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar), kVar, null, "");
                Ui.l("Common_HttpParams", hVar);
                try {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) kotlinx.coroutines.l.e(oz5.m.f350329d, new yz5.p() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.q6$$f
                        @Override // yz5.p
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni().a(g75.z.this, (kotlin.coroutines.Continuation) obj2);
                        }
                    });
                    if (bitmap == null || bitmap.isRecycled()) {
                        if (bitmap == null) {
                            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", "[publicSendAppMgsEvent] thumb image is null");
                        } else {
                            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", "[publicSendAppMgsEvent] thumb image is recycled");
                        }
                    } else if (!bitmap.isRecycled()) {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        E(stringExtra, bArr);
                    }
                    bArr = null;
                    E(stringExtra, bArr);
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", e17.getMessage());
                    E(stringExtra, null);
                }
            } else {
                android.graphics.Bitmap c17 = com.tencent.mm.graphics.e.c(optString);
                if (c17 == null || c17.isRecycled()) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", "[publicSendAppMgsEvent] thumb image decode failed or recycled");
                } else if (!c17.isRecycled()) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                    c17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                    bArr2 = byteArrayOutputStream2.toByteArray();
                }
                E(stringExtra, bArr2);
            }
        }
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
