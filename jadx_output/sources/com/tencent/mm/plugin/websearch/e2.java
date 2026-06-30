package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.j2 f181498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.h2 f181499e;

    public e2(com.tencent.mm.plugin.websearch.h2 h2Var, su4.j2 j2Var) {
        this.f181499e = h2Var;
        this.f181498d = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i18;
        long j17;
        java.util.Map map;
        if (!com.tencent.mm.plugin.websearch.l2.h(0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.StartWebSearchService", "fts h5 template not avail");
            return;
        }
        su4.j2 j2Var = this.f181498d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartWebSearchService", "startWebSearch, scene: %s, query: %s, parentSearchId: %s", java.lang.Integer.valueOf(j2Var.f412939b), j2Var.f412941d, j2Var.f412956s);
        com.tencent.mm.plugin.websearch.h2 h2Var = this.f181499e;
        h2Var.getClass();
        if (j2Var.f412944g != null && (map = j2Var.f412959v) != null && ((java.util.HashMap) map).size() > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
                ((java.util.HashMap) j2Var.f412944g).put("extClientParams", tg0.r2.a(j2Var.f412939b) ? jSONObject.toString() : android.net.Uri.encode(jSONObject.toString()));
            } catch (org.json.JSONException e17) {
                com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.WebSearch.StartWebSearchService", "", e17);
            }
        }
        java.util.Map map2 = j2Var.f412959v;
        if (map2 != null && j2Var.f412946i) {
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) ((java.util.HashMap) map2).get("exposedFingerWord")) || !android.text.TextUtils.isEmpty((java.lang.CharSequence) ((java.util.HashMap) j2Var.f412959v).get("matchedFingerWord"))) {
                j2Var.f412946i = false;
            }
            if (j2Var.f412939b == 77) {
                j2Var.f412946i = false;
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String f17 = su4.r2.f(j2Var.f412939b);
        java.util.Map map3 = j2Var.f412944g;
        if (map3 != null) {
            i17 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) ((java.util.HashMap) map3).get("chatSearch"), 0);
            str = (java.lang.String) ((java.util.HashMap) j2Var.f412944g).get("reqKey");
        } else {
            i17 = 0;
            str = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(j2Var.f412961x)) {
            str2 = tg0.r2.a(j2Var.f412939b) ? j2Var.f412961x : android.net.Uri.encode(j2Var.f412961x);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(j2Var.f412956s)) {
            str2 = "";
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("parentSearchID", j2Var.f412956s);
            } catch (java.lang.Exception unused) {
            }
            boolean a17 = tg0.r2.a(j2Var.f412939b);
            str2 = jSONObject2.toString();
            if (!a17) {
                str2 = android.net.Uri.encode(str2);
            }
        }
        if (j2Var.f412960w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartWebSearchService", "preload web search data");
            java.util.HashMap hashMap = new java.util.HashMap(j2Var.f412944g);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j2Var.f412961x)) {
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject(j2Var.f412961x);
                    java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        hashMap.put(next, jSONObject3.optString(next, ""));
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j2Var.f412962y)) {
                hashMap.put("extReqParams", j2Var.f412962y);
            }
            hashMap.put("isHomePage", java.util.Objects.equals(java.lang.Boolean.valueOf(j2Var.f412943f), java.lang.Boolean.TRUE) ? "1" : "0");
            obj = "1";
            str3 = "";
            obj2 = "parentSearchID";
            su4.r2.n(valueOf, j2Var.f412942e, f17, j2Var.f412941d, j2Var.f412939b, "", -1, j2Var.f412940c, j2Var.f412956s, i17, str, hashMap);
        } else {
            str3 = "";
            obj = "1";
            obj2 = "parentSearchID";
        }
        java.util.Map d17 = su4.r2.d(j2Var.f412939b, j2Var.f412943f, j2Var.f412940c, str2, "", j2Var.f412942e, j2Var.f412941d, "", f17, "", valueOf);
        java.util.Map map4 = j2Var.f412944g;
        if (map4 != null) {
            ((java.util.HashMap) d17).putAll(map4);
        }
        if (tg0.r2.a(j2Var.f412939b)) {
            ((java.util.HashMap) d17).put("query", j2Var.f412941d);
        } else {
            try {
                ((java.util.HashMap) d17).put("query", fp.s0.b(j2Var.f412941d, com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.lang.Exception unused3) {
                ((java.util.HashMap) d17).put("query", j2Var.f412941d);
            }
        }
        java.util.HashMap hashMap2 = (java.util.HashMap) d17;
        hashMap2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, j2Var.f412942e);
        hashMap2.put(obj2, j2Var.f412956s);
        if (!u46.l.e(j2Var.K)) {
            hashMap2.put("thirdExtParam", tg0.r2.a(j2Var.f412939b) ? j2Var.K : fp.s0.a(j2Var.K));
        }
        if (j2Var.B) {
            hashMap2.put("isHalfScreen", obj);
        }
        h2Var.getClass();
        if (j2Var.I) {
            try {
                java.lang.String str4 = (java.lang.String) ((java.util.HashMap) d17).get("pRequestId");
                java.util.Objects.requireNonNull(str4);
                j17 = java.lang.Long.parseLong(str4);
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.StartWebSearchService", "parse parallelRequestId failed", e18);
                j17 = 0;
            }
            if (j17 == 0) {
                j17 = java.lang.System.currentTimeMillis();
                hashMap2.put("pRequestId", java.lang.String.valueOf(j17));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartWebSearchService", "[fts] prefetch search teach data, requestId=" + j17);
            ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).Zi()).g(java.lang.String.valueOf(j17), j2Var.f412942e, j2Var.f412937J, j2Var.f412939b, j2Var.f412940c);
        }
        java.lang.String e19 = su4.r2.e(d17, 0);
        android.content.Intent a18 = su4.r2.a();
        a18.putExtra("searchPlaceHolder", !android.text.TextUtils.isEmpty(j2Var.f412963z) ? j2Var.f412963z : str3);
        a18.putExtra("ftsType", j2Var.f412940c);
        a18.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, j2Var.f412954q);
        a18.putExtra("ftsbizscene", j2Var.f412939b);
        a18.putExtra("ftsQuery", j2Var.f412941d);
        a18.putExtra("ftsInitToSearch", !android.text.TextUtils.isEmpty(j2Var.f412941d) || j2Var.f412945h);
        a18.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, j2Var.f412942e);
        a18.putExtra("subSessionId", f17);
        a18.putExtra("rawUrl", e19);
        int i19 = j2Var.f412939b;
        h2Var.getClass();
        a18.putExtra("key_preload_biz", 4);
        a18.putExtra("key_weapp_url", com.tencent.mm.plugin.websearch.h2.wi(h2Var, 22, j2Var.f412942e));
        a18.putExtra("hideSearchInput", j2Var.f412946i);
        a18.putExtra("hideSearchInputBackgroundRes", j2Var.f412950m);
        a18.putExtra("fts_need_sos_edittext_tobe_touch_only", j2Var.f412958u);
        a18.putExtra("key_back_btn_type", j2Var.f412951n);
        a18.putExtra("key_hide_shadow_view", j2Var.f412953p);
        a18.putExtra("first_page_result", j2Var.f412955r);
        a18.putExtra("fts_float_ball_key", j2Var.F);
        if (!j2Var.F.isEmpty()) {
            ep1.m.b(j2Var.f412938a, a18, true);
        }
        a18.putExtra("fts_multi_task_info", j2Var.G);
        a18.putExtra("key_multi_task_common_info", j2Var.H);
        j2Var.getClass();
        int i27 = j2Var.f412952o;
        if (i27 != Integer.MAX_VALUE) {
            a18.putExtra("customize_status_bar_color", i27);
        }
        a18.putExtra("key_load_js_without_delay", true);
        a18.putExtra("ftsneedkeyboard", j2Var.A);
        a18.putExtra("forceUseThemeMode", j2Var.f412949l);
        if (j2Var.f412957t) {
            a18.addFlags(67108864);
        }
        if ((j2Var.f412939b == 14 && j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigAppSearchNewStyle()) == 1) || j2Var.f412948k) {
            a18.putExtra("key_back_and_clear_query", true);
        }
        if (j2Var.f412947j) {
            a18.putExtra("hideSearchInput", true);
            a18.putExtra("hideSearchTitle", true);
        }
        if (j2Var.B && j2Var.C) {
            ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(new zg0.s3(j2Var.f412938a, a18, !j2Var.f412947j, 0.7d, true, null, null, false));
            i18 = 0;
        } else {
            i18 = 0;
            ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).wi(j2Var.f412938a, a18, j2Var.B, false);
        }
        if (j2Var.L) {
            android.content.Context context = j2Var.f412938a;
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477886ea, i18);
            }
        }
        com.tencent.mm.plugin.websearch.h2.Ai(h2Var, j2Var.f412939b);
        su4.k2.a(j2Var.f412939b, j2Var.f412942e, f17, j2Var.f412943f, j2Var.f412941d, j2Var.f412940c, "", false, "");
    }
}
