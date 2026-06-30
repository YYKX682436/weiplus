package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class p1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f182429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f182430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.r1 f182431f;

    public p1(com.tencent.mm.plugin.webview.luggage.jsapi.r1 r1Var, sd.b bVar, org.json.JSONObject jSONObject) {
        this.f182431f = r1Var;
        this.f182429d = bVar;
        this.f182430e = jSONObject;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        org.json.JSONObject optJSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("nowUrl");
        java.lang.String[] stringArray = bundle.getStringArray("urlList");
        sd.b bVar = this.f182429d;
        if (stringArray == null || stringArray.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiImagePreview", "fail, urls is null");
            bVar.c("invalid_url", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String a17 = com.tencent.xweb.d.g().a(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).u());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            intent.putExtra("cookie", a17);
        }
        org.json.JSONObject jSONObject = this.f182430e;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("currentInfo");
        this.f182431f.getClass();
        float f17 = j65.f.f();
        if (((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182180p.isXWalkKernel()) {
            zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
            if (com.tencent.xweb.WebView.getCurrentModuleWebCoreType() == com.tencent.xweb.f1.WV_KIND_PINUS && org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST) ? org.xwalk.core.XWalkEnvironment.f347975h : false) {
                f17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182180p.getResources().getDisplayMetrics().density;
            }
        }
        if (f17 <= 0.0f) {
            f17 = i65.a.g(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d);
        }
        java.lang.String d17 = com.tencent.mm.plugin.webview.modeltools.x0.d(jSONObject.optString("thumbUrl"));
        if (com.tencent.mm.plugin.webview.modeltools.x0.a(d17)) {
            intent.putExtra("nowUrlPath", d17);
        }
        boolean z17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406657n.getBoolean("show_full_screen", false);
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("pos")) != null) {
            int height = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f182186t.getHeight();
            double d18 = f17;
            int optDouble = (int) (optJSONObject.optDouble("width") * d18);
            int optDouble2 = (int) (optJSONObject.optDouble("height") * d18);
            int i17 = height;
            int optDouble3 = (int) (optJSONObject.optDouble("x") * d18);
            double optDouble4 = optJSONObject.optDouble("y") * d18;
            if (z17) {
                i17 = 0;
            }
            intent.putExtra("img_gallery_width", optDouble).putExtra("img_gallery_height", optDouble2).putExtra("img_gallery_left", optDouble3).putExtra("img_gallery_top", (int) (i17 + optDouble4));
            bVar = bVar;
            int k17 = i65.a.k(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d);
            if (optDouble > 0 && optDouble2 > 0 && optDouble2 < k17) {
                intent.putExtra("shouldRunDragAnimation", true);
            }
        }
        intent.putExtra("forBidForward", bVar.f406597b.f344506c.optInt("forbidForward", 0) == 1);
        if (jSONObject.has("searchInfos")) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("searchInfos"));
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject3 = jSONArray.optJSONObject(i18);
                    arrayList.add(optJSONObject3 != null ? com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo.f181442u.a(optJSONObject3) : null);
                }
                intent.putParcelableArrayListExtra("searchInfos", arrayList);
            } catch (org.json.JSONException unused) {
            }
        }
        intent.putExtra("nowUrl", string);
        intent.putExtra("urlList", stringArray);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("currentPos", jSONObject.optInt("currentPos", -1));
        j45.l.j(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
        bVar.a();
    }
}
