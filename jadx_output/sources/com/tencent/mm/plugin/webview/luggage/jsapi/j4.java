package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class j4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.jsapi.f5 f182360e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f182361f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f182362g = "";

    public static void f(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, sd.b bVar) {
        j4Var.getClass();
        if (bVar.f406597b.f344506c.optLong("liteCallbackId", 0L) != 0) {
            j4Var.d(((sd.a) bVar.f406596a).getContext(), bVar.f406597b.f344506c.toString(), new com.tencent.mm.plugin.webview.luggage.jsapi.q4(j4Var, bVar));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsapi_name", com.tencent.mm.plugin.webview.luggage.jsapi.j4.class.getName());
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, bVar.f406597b.f344506c.toString());
        sw4.g.a((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, bundle, sw4.k.class, new com.tencent.mm.plugin.webview.luggage.jsapi.r4(j4Var, bVar));
    }

    public static void g(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        j4Var.getClass();
        if (jSONObject == null) {
            q5Var.a("params is null", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 35);
        intent.putExtra("mutil_select_is_ret", true);
        if (j4Var.f182360e == com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_IMG) {
            intent.putExtra("select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 0);
            j4Var.k(jSONObject, context, new com.tencent.mm.plugin.webview.luggage.jsapi.a5(j4Var, q5Var, jSONObject, intent, context, str));
            return;
        }
        intent.putExtra("scene_from", 2);
        intent.putExtra("Retr_Msg_Type", 2);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("friend");
        if (optJSONObject == null) {
            q5Var.a("friend data is null", null);
            return;
        }
        j4Var.f182362g = optJSONObject.optString("appid");
        java.lang.String optString = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = optJSONObject.optString("desc");
        java.lang.String optString3 = optJSONObject.optString("img_url");
        java.lang.String optString4 = optJSONObject.optString("link");
        com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(optString3);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("img_url", optString3);
        hashMap.put("desc", optString2);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, optString);
        hashMap.put("url", optString4);
        hashMap.put("appId", j4Var.f182362g);
        hashMap.put("srcUserName", optJSONObject.optString("src_username"));
        hashMap.put("srcDisplayname", optJSONObject.optString("src_displayname"));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "shareCustomContent params:" + hashMap);
        intent.putExtra("webview_params", hashMap);
        j4Var.n(intent, context, jSONObject, hashMap, str, q5Var);
    }

    public static boolean h(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, boolean z17) {
        j4Var.getClass();
        java.lang.String optString = jSONObject.optString("videoId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            return false;
        }
        m33.g1 mj6 = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).mj(optString);
        if (mj6 == null) {
            q5Var.a("localVideo not exist videoId = videoId", null);
        } else {
            m33.k1 k1Var = new m33.k1();
            k1Var.f323305c = mj6.f323290d;
            k1Var.f323303a = mj6.f323288b;
            k1Var.f323304b = mj6.f323289c;
            k1Var.f323307e = mj6.f323294h;
            k1Var.f323308f = mj6.f323295i;
            k1Var.f323306d = mj6.f323296j;
            if (z17) {
                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ri(context, k1Var, 2, new com.tencent.mm.plugin.webview.luggage.jsapi.d5(j4Var, q5Var));
            } else if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ri((com.tencent.mm.ui.MMFragmentActivity) context, k1Var, 1, new com.tencent.mm.plugin.webview.luggage.jsapi.e5(j4Var, q5Var));
            } else {
                q5Var.a("context is not MMFragmentActivity", null);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(com.tencent.mm.plugin.webview.luggage.jsapi.j4 j4Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        j4Var.getClass();
        if (context == 0) {
            return;
        }
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            if (mMActivity.isFinishing()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShareCustomContent", "activity is null or finish");
                return;
            }
            mMActivity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.l4(j4Var, q5Var, str, mMActivity));
        } else if (context instanceof q80.z) {
            ((q80.z) context).R1(new com.tencent.mm.plugin.webview.luggage.jsapi.m4(j4Var, q5Var, str, context));
        }
        android.content.Intent intent = new android.content.Intent();
        if (j4Var.f182360e == com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_IMG) {
            j4Var.k(jSONObject, context, new com.tencent.mm.plugin.webview.luggage.jsapi.n4(j4Var, q5Var, intent, context));
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("timeline");
        if (optJSONObject == null) {
            return;
        }
        java.lang.String optString = optJSONObject.optString("link");
        java.lang.String optString2 = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "link is null");
            return;
        }
        java.lang.String optString3 = optJSONObject.optString("img_url");
        intent.putExtra("Ksnsupload_link", optString);
        intent.putExtra("Ksnsupload_title", optString2);
        intent.putExtra("Ksnsupload_imgurl", optString3);
        intent.putExtra("ShareUrlOriginal", optString);
        intent.putExtra("ShareUrlOpen", optJSONObject.optString("currentUrl"));
        intent.putExtra("JsAppId", optJSONObject.optString("preVerifyAppId"));
        intent.putExtra("need_result", true);
        intent.putExtra("Ksnsupload_type", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "doTimeline, start activity");
        j45.l.o(context, "sns", ".ui.SnsUploadUI", intent, 2, false);
    }

    @Override // sd.c
    public java.lang.String b() {
        return "shareCustomContent";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.webview.luggage.jsapi.z4(this, str, q5Var, context));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.webview.luggage.jsapi.p4(this, bVar));
    }

    public final void j(org.json.JSONArray jSONArray, db5.g4 g4Var, android.content.Context context) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        if (jSONArray == null) {
            return;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                int optInt = jSONObject.optInt(dm.i4.COL_ID);
                byte[] decode = android.util.Base64.decode(jSONObject.optString("iconData"), 0);
                if (decode != null) {
                    int length = decode.length;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(length));
                    arrayList.add(0);
                    arrayList.add(decode);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent", "addMenuItemByJsonArray", "(Lorg/json/JSONArray;Lcom/tencent/mm/ui/base/MMMenu;Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                    yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/webview/luggage/jsapi/JsApiShareCustomContent", "addMenuItemByJsonArray", "(Lorg/json/JSONArray;Lcom/tencent/mm/ui/base/MMMenu;Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), decodeByteArray);
                } else {
                    bitmapDrawable = null;
                }
                if (bitmapDrawable != null) {
                    try {
                        g4Var.n(optInt + 1000, optString, bitmapDrawable, 0);
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "err:" + e.getMessage());
                    }
                }
            } catch (org.json.JSONException e18) {
                e = e18;
            }
        }
    }

    public final void k(org.json.JSONObject jSONObject, android.content.Context context, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        int i17;
        if (jSONObject == null) {
            q5Var.a("params is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("imgUrl");
        java.lang.String optString2 = jSONObject.optString("imgLocalId");
        this.f182361f = jSONObject.optString("imgPath");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f182361f)) {
                    jSONObject2.put("imgPath", this.f182361f);
                    q5Var.a(null, jSONObject2);
                    return;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2) && com.tencent.mm.sdk.platformtools.t8.K0(this.f182361f)) {
                    this.f182361f = m(optString2, null);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f182361f)) {
                    jSONObject2.put("imgPath", this.f182361f);
                    q5Var.a(null, jSONObject2);
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    q5Var.a("imgUrl is null", null);
                    return;
                }
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                k70.v vVar = (k70.v) i95.n0.c(k70.v.class);
                com.tencent.mm.plugin.webview.luggage.jsapi.o4 o4Var = new com.tencent.mm.plugin.webview.luggage.jsapi.o4(this, countDownLatch, jSONObject2, q5Var);
                ((j70.e) vVar).getClass();
                m11.b1.wi().a(optString, false, o4Var);
                try {
                    try {
                        countDownLatch.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(optString);
                        if (currentTimeMillis2 >= 5000 && com.tencent.mm.sdk.platformtools.t8.K0(jSONObject2.optString(this.f182361f))) {
                            q5Var.a("download image fail", null);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "recent forward send success, loading duration is %d", java.lang.Long.valueOf(currentTimeMillis2));
                    } catch (java.lang.InterruptedException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiShareCustomContent", e17, "", new java.lang.Object[0]);
                        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(optString);
                        if (currentTimeMillis3 >= 5000 && com.tencent.mm.sdk.platformtools.t8.K0(jSONObject2.optString(this.f182361f))) {
                            q5Var.a("download image fail", null);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "recent forward send success, loading duration is %d", java.lang.Long.valueOf(currentTimeMillis3));
                    }
                } catch (java.lang.Throwable th6) {
                    long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(optString);
                    if (currentTimeMillis4 >= 5000 && com.tencent.mm.sdk.platformtools.t8.K0(jSONObject2.optString(this.f182361f))) {
                        q5Var.a("download image fail", null);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareCustomContent", "recent forward send success, loading duration is %d", java.lang.Long.valueOf(currentTimeMillis4));
                    throw th6;
                }
            } catch (org.json.JSONException e18) {
                e = e18;
                i17 = 0;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiShareCustomContent", e, "", new java.lang.Object[i17]);
                q5Var.a("JSONException", null);
            }
        } catch (org.json.JSONException e19) {
            e = e19;
            i17 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.content.Context r20, org.json.JSONObject r21, java.lang.String r22, int r23, int r24, android.content.Intent r25, com.tencent.mm.plugin.webview.luggage.jsapi.q5 r26) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.luggage.jsapi.j4.l(android.content.Context, org.json.JSONObject, java.lang.String, int, int, android.content.Intent, com.tencent.mm.plugin.webview.luggage.jsapi.q5):void");
    }

    public final java.lang.String m(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
            return com.tencent.mm.plugin.webview.model.o5.d(str);
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir() + "/gamecenter/tmp/share/";
        if (bitmap == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMImage_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b("shareImage".getBytes()));
        sb6.append(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        java.lang.String sb7 = sb6.toString();
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2 + sb7, true);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "save temp file failed");
        }
        return str2 + sb7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(android.content.Intent intent, final android.content.Context context, final org.json.JSONObject jSONObject, java.util.HashMap hashMap, final java.lang.String str, final com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.b5(this, context, jSONObject, str, q5Var));
        } else if (context instanceof q80.z) {
            ((q80.z) context).R1(new com.tencent.mm.plugin.webview.luggage.jsapi.c5(this, context, jSONObject, str, q5Var));
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.j4$$c
            @Override // com.tencent.mm.ui.xc
            public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent2) {
                com.tencent.mm.plugin.webview.luggage.jsapi.j4.this.l(context, jSONObject, str, i17, i18, intent2, q5Var);
            }
        };
        if (this.f182360e != com.tencent.mm.plugin.webview.luggage.jsapi.f5.GAME_SHARE_TYPE_IMG) {
            se5.a aVar = new se5.a();
            aVar.l(n13.v.f334140a.e(hashMap));
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334118b = 1;
            rVar.f334119c = daVar;
            rVar.f334120d.f334139a = 3;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Retr_File_Name", this.f182361f);
        intent2.putExtra("Retr_Compress_Type", 1);
        intent2.putExtra("Retr_Msg_Type", 0);
        intent2.putExtra("Retr_show_success_tips", false);
        intent2.putExtra("content_type_forward_to_wework", 2);
        intent2.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.ImgData(this.f182361f));
        java.lang.Object obj = hashMap.get("tail_url");
        if (obj != null && !com.tencent.mm.sdk.platformtools.t8.K0(obj.toString())) {
            intent2.putExtra("sourceImgInfo", new com.tencent.mm.modelmulti.SourceImgInfo(obj.toString(), 1));
        }
        j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent2, 1);
    }
}
