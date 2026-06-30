package gx4;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f277433a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f277434b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f277435c;

    /* renamed from: d, reason: collision with root package name */
    public int f277436d;

    /* renamed from: e, reason: collision with root package name */
    public int f277437e;

    /* renamed from: f, reason: collision with root package name */
    public long f277438f;

    /* renamed from: g, reason: collision with root package name */
    public int f277439g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f277440h;

    public s() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEBVIEW_BAG_INFO_STRING_SYNC, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "BagInfo#load %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f277433a = null;
            this.f277434b = null;
            this.f277435c = null;
            this.f277437e = (i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) - gx4.e.f277413d) - gx4.e.f277414e;
            this.f277436d = gx4.e.f277412c + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aeh);
            this.f277440h = new org.json.JSONObject();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagMgr", "BAG_INIT_X:%d BAG_INIT_Y:%d", java.lang.Integer.valueOf(this.f277437e), java.lang.Integer.valueOf(this.f277436d));
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f277434b = jSONObject.getString("url");
            this.f277433a = jSONObject.optString(dm.i4.COL_ID, com.tencent.mm.sdk.platformtools.w2.a(java.lang.String.format("bagId#%d#%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), this.f277434b)));
            this.f277435c = jSONObject.getString("icon");
            this.f277436d = jSONObject.getInt("pos_y");
            this.f277437e = jSONObject.getInt("pos_x");
            this.f277438f = jSONObject.getLong("last_active_time");
            this.f277440h = jSONObject.getJSONObject("extras");
            this.f277439g = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagMgr", "BagInfo#load exp:%s", e17);
        }
    }

    public void a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f277433a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put(dm.i4.COL_ID, str);
            java.lang.String str3 = this.f277434b;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("url", str3);
            java.lang.String str4 = this.f277435c;
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("icon", str2);
            jSONObject.put("pos_y", this.f277436d);
            jSONObject.put("pos_x", this.f277437e);
            jSONObject.put("last_active_time", this.f277438f);
            jSONObject.put("extras", this.f277440h);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f277439g);
            java.lang.String jSONObject2 = jSONObject.toString();
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WEBVIEW_BAG_INFO_STRING_SYNC, jSONObject2);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagMgr", "BagInfo#save exp:%s", e17);
        }
    }
}
