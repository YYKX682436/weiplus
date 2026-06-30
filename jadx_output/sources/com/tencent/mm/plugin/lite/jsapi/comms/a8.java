package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/a8;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a8 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f143510g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f143511h = "";

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f143512i = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f143513m = "";

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "fail, data is null");
            this.f143443f.a("openFinderMovieEditor:data is null");
            return;
        }
        if (!((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).aj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "fail isMovieComposingEnabled:false");
            this.f143443f.a("function not support");
            return;
        }
        if (str != null) {
            f143510g = str;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("localIds");
        if ((optJSONArray == null) || optJSONArray.length() == 0) {
            this.f143443f.a("openFinderMovieEditor:invalid localIds");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String zj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optJSONArray.optString(i17));
            kotlin.jvm.internal.o.d(zj6);
            arrayList.add(zj6);
        }
        if (arrayList.isEmpty()) {
            this.f143443f.a("openFinderMovieEditor:invalid localIds");
            return;
        }
        if (f143511h.length() == 0) {
            java.lang.String str2 = com.tencent.mm.plugin.lite.logic.y2.f(f143510g, null, null) + "LiteAppMJVideo";
            f143511h = str2;
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
        }
        java.lang.String str4 = "MicroMsg_" + java.lang.System.currentTimeMillis();
        f143512i = f143511h + '/' + str4 + ".mp4";
        f143513m = f143511h + '/' + str4 + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start edit video and save to ");
        sb6.append(f143512i);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("mediaPathsStr", arrayList.toString());
        hashMap.put("savePath", f143512i);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 16);
        intent.putExtra("open_finder_movie_editor_params", hashMap);
        int i18 = m93.j.G + 1;
        m93.j.G = i18;
        m93.j.H.put(java.lang.Integer.valueOf(i18), this);
        intent.putExtra("callback_id", m93.j.G);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c17, arrayList2.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsapiOpenFinderMovieEditor", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsapiOpenFinderMovieEditor", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void q(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "onActivityResult requestCode: " + i17 + ", resultCode: " + i18 + ", data: " + intent);
        if (i17 != 1000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "startStandaloneMovieComposingForResult not from openFinderMovieEditor");
            return;
        }
        if (i18 != -1) {
            if (i18 != 0) {
                return;
            }
            if (intent == null || !intent.getBooleanExtra("cancel", false)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "openFinderMovieEditor fail");
                this.f143443f.a("openFinderMovieEditor:editVideo fail");
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "openFinderMovieEditor cancel");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("result", "cancel");
            if (intent.hasExtra("edited")) {
                hashMap.put("edited", java.lang.Boolean.valueOf(intent.getBooleanExtra("edited", false)));
            }
            this.f143443f.b(hashMap);
            return;
        }
        try {
            android.graphics.Bitmap D = com.tencent.mm.sdk.platformtools.x.D(f143512i, 1, -1);
            kotlin.jvm.internal.o.f(D, "createVideoThumbnail(...)");
            com.tencent.mm.sdk.platformtools.x.D0(D, 60, android.graphics.Bitmap.CompressFormat.JPEG, f143513m, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "create thumb error: %s", e17.getMessage());
        }
        gp.d dVar = new gp.d();
        try {
            try {
                dVar.setDataSource(f143512i);
                int V1 = com.tencent.mm.sdk.platformtools.t8.V1(com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0));
                int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
                int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
                long k17 = com.tencent.mm.vfs.w6.k(f143512i);
                zg0.r3 r3Var = (zg0.r3) i95.n0.c(zg0.r3.class);
                java.lang.String str2 = f143512i;
                ((yg0.u4) r3Var).getClass();
                com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(str2);
                com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem Ai = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(f143513m);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                if (intent != null) {
                    if (intent.hasExtra("edited")) {
                        str = "openFinderMovieEditor:editVideo fail";
                        try {
                            hashMap2.put("edited", java.lang.Boolean.valueOf(intent.getBooleanExtra("edited", true)));
                            hashMap2.put("result", "finish");
                            java.lang.String localId = b17.f182736e;
                            kotlin.jvm.internal.o.f(localId, "localId");
                            hashMap2.put(dm.i4.COL_LOCALID, localId);
                            java.lang.String localId2 = Ai.f182736e;
                            kotlin.jvm.internal.o.f(localId2, "localId");
                            hashMap2.put("thumbLocalId", localId2);
                            hashMap2.put("duration", java.lang.Integer.valueOf(V1));
                            hashMap2.put("size", java.lang.Long.valueOf(k17));
                            hashMap2.put("height", java.lang.Integer.valueOf(P2));
                            hashMap2.put("width", java.lang.Integer.valueOf(P));
                            this.f143443f.b(hashMap2);
                        } catch (java.lang.Exception e18) {
                            e = e18;
                            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsapiOpenFinderMovieEditor", "set result error: %s", e.getMessage());
                            dVar.release();
                            this.f143443f.a(str);
                            return;
                        }
                    }
                }
                str = "openFinderMovieEditor:editVideo fail";
                hashMap2.put("result", "finish");
                java.lang.String localId3 = b17.f182736e;
                kotlin.jvm.internal.o.f(localId3, "localId");
                hashMap2.put(dm.i4.COL_LOCALID, localId3);
                java.lang.String localId22 = Ai.f182736e;
                kotlin.jvm.internal.o.f(localId22, "localId");
                hashMap2.put("thumbLocalId", localId22);
                hashMap2.put("duration", java.lang.Integer.valueOf(V1));
                hashMap2.put("size", java.lang.Long.valueOf(k17));
                hashMap2.put("height", java.lang.Integer.valueOf(P2));
                hashMap2.put("width", java.lang.Integer.valueOf(P));
                this.f143443f.b(hashMap2);
            } finally {
                dVar.release();
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str = "openFinderMovieEditor:editVideo fail";
        }
    }
}
