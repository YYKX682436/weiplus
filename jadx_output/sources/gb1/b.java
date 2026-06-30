package gb1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f269976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f269977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gb1.n f269978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f269979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gb1.d f269980h;

    public b(gb1.d dVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, gb1.n nVar, org.json.JSONObject jSONObject) {
        this.f269980h = dVar;
        this.f269976d = tVar;
        this.f269977e = c0Var;
        this.f269978f = nVar;
        this.f269979g = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17;
        gb1.n nVar;
        java.lang.String str2;
        boolean z18;
        java.lang.String str3;
        android.view.View view;
        int i17;
        gb1.d dVar;
        gb1.n nVar2;
        java.lang.String str4;
        int i18;
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.lang.String str5;
        org.json.JSONObject jSONObject = this.f269979g;
        gb1.d dVar2 = this.f269980h;
        java.lang.String k17 = dVar2.k();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f269976d;
        if (!tVar.c(k17, this.f269977e)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseInsertViewJsApi", "fail, component is not running");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.s customViewContainer = tVar.getCustomViewContainer();
        gb1.n nVar3 = this.f269978f;
        if (customViewContainer == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseInsertViewJsApi", "fail, component custom view container is null");
            str5 = android.text.TextUtils.isEmpty("fail:insert view failed") ? "fail:internal error" : "fail:insert view failed";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            nVar3.a(dVar2.u(str5, jSONObject2));
            return;
        }
        try {
            int H = dVar2.H(jSONObject);
            android.view.View L = dVar2.L(tVar, jSONObject, H);
            if (L == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BaseInsertViewJsApi", "inflate view return null.");
                str5 = android.text.TextUtils.isEmpty("fail:inflate view failed") ? "fail:internal error" : "fail:inflate view failed";
                java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 4);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                nVar3.a(dVar2.u(str5, jSONObject3));
                return;
            }
            boolean optBoolean = jSONObject.optBoolean("independent", false);
            if ((L instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) && jSONObject.has("draggable")) {
                boolean optBoolean2 = jSONObject.optBoolean("draggable", false);
                com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer coverViewContainer = (com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) L;
                str = "fail:internal error";
                java.lang.String e19 = c75.c.e(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                coverViewContainer.f80634o = optBoolean2;
                coverViewContainer.f80636q = H;
                java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.C;
                if (optBoolean2) {
                    coverViewContainer.f80635p = e19;
                    hashMap.put(java.lang.Integer.valueOf(H), coverViewContainer);
                } else {
                    hashMap.remove(java.lang.Integer.valueOf(H));
                }
                coverViewContainer.setDragConfig(jSONObject.optString("dragConfig"));
            } else {
                str = "fail:internal error";
            }
            if (((com.tencent.mm.plugin.appbrand.page.ia) tVar.M(optBoolean)).p(H) != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BaseInsertViewJsApi", "insert view(%d) failed, it has been inserted before.", java.lang.Integer.valueOf(H));
                java.lang.String str8 = android.text.TextUtils.isEmpty("fail:the view has already exist") ? str : "fail:the view has already exist";
                java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 4);
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                }
                nVar3.a(dVar2.u(str8, jSONObject4));
                return;
            }
            nVar3.f269998c = L;
            int optInt = jSONObject.optInt("parentId", 0);
            try {
                float[] F = dVar2.F(jSONObject);
                try {
                    i18 = jSONObject.getBoolean("hide") ? 4 : 0;
                } catch (org.json.JSONException unused) {
                    i18 = -1;
                }
                try {
                    bool = java.lang.Boolean.valueOf(jSONObject.getBoolean("fixed"));
                } catch (org.json.JSONException unused2) {
                    bool = null;
                }
                try {
                    bool2 = java.lang.Boolean.valueOf(jSONObject.getBoolean("fullscreen"));
                } catch (org.json.JSONException unused3) {
                    bool2 = null;
                }
                java.lang.Boolean G = dVar2.G(jSONObject);
                z17 = tVar.M(optBoolean).c(L, H, optInt, F, i18, bool != null && bool.booleanValue(), bool2 != null && bool2.booleanValue(), G != null && G.booleanValue());
            } catch (org.json.JSONException e28) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseInsertViewJsApi", "parse position error. Exception :%s", e28);
                z17 = false;
            }
            boolean M = dVar2.M();
            if (z17) {
                if (dVar2.I()) {
                    c01.l2 b17 = tVar.M(optBoolean).b(H, true);
                    nVar = nVar3;
                    str2 = "errno";
                    z18 = false;
                    b17.j("disableScroll", jSONObject.optBoolean("disableScroll", false));
                    b17.j("enableLongClick", dVar2.J());
                    b17.k(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, c75.c.e(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
                    if (jSONObject.optBoolean("gesture", false)) {
                        L.setOnTouchListener(new if1.l(tVar, b17));
                    }
                } else {
                    nVar = nVar3;
                    str2 = "errno";
                    z18 = false;
                }
                if (M) {
                    this.f269980h.O(this.f269976d, H, L, this.f269979g, this.f269978f);
                } else {
                    dVar2.N(tVar, H, L, jSONObject);
                }
            } else {
                nVar = nVar3;
                str2 = "errno";
                z18 = false;
            }
            c01.l2 b18 = tVar.M(optBoolean).b(H, true);
            if (((com.tencent.mm.plugin.appbrand.jsapi.w) b18.c("baseViewDestroyListener", null)) == null) {
                str3 = null;
                view = L;
                i17 = H;
                nVar2 = nVar;
                dVar = dVar2;
                str4 = str2;
                gb1.c cVar = new gb1.c(dVar2, tVar, optBoolean, i17, b18);
                b18.i("baseViewDestroyListener", cVar);
                tVar.w(cVar);
            } else {
                str3 = null;
                view = L;
                i17 = H;
                dVar = dVar2;
                nVar2 = nVar;
                str4 = str2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseInsertViewJsApi", "insert view(parentId : %s, viewId : %s, view : %s, r : %s)", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(view.hashCode()), java.lang.Boolean.valueOf(z17));
            if (M) {
                return;
            }
            if (z17) {
                java.lang.String str10 = android.text.TextUtils.isEmpty(str3) ? "ok" : str3;
                if (str10 == null) {
                    str10 = "";
                }
                java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                try {
                    jSONObject5.put(str4, 0);
                } catch (java.lang.Exception e29) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                }
                nVar2.a(dVar.u(str10, jSONObject5));
                return;
            }
            gb1.d dVar3 = dVar;
            gb1.n nVar4 = nVar2;
            java.lang.String str12 = android.text.TextUtils.isEmpty("fail:insert view fail") ? str : "fail:insert view fail";
            java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put(str4, 4);
            } catch (java.lang.Exception e37) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
            }
            nVar4.a(dVar3.u(str12, jSONObject6));
        } catch (org.json.JSONException unused4) {
            java.lang.String str14 = android.text.TextUtils.isEmpty("fail:invalid view id") ? "fail:internal error" : "fail:invalid view id";
            java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            try {
                jSONObject7.put("errno", 4);
            } catch (java.lang.Exception e38) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
            }
            nVar3.a(dVar2.u(str14, jSONObject7));
        }
    }
}
