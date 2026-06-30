package vg0;

/* loaded from: classes8.dex */
public final class b implements ou4.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f436446a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f436447b;

    public b(java.lang.ref.WeakReference callbackRef) {
        kotlin.jvm.internal.o.g(callbackRef, "callbackRef");
        this.f436446a = callbackRef;
        this.f436447b = "downloadPageDataForFastLoad";
    }

    @Override // ou4.c0
    public void a(java.util.Map map, ou4.b0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object obj = map != null ? map.get("itemList") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        if (((tg0.q1) this.f436446a.get()) != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.hitest.FTSFlutterSearchUIC", "downloadPageDataForFastLoad invalid item index: " + i17);
                } else {
                    java.lang.String optString = optJSONObject.optString("url");
                    int optInt = optJSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
                    int optInt2 = optJSONObject.optInt("item_show_type", -1);
                    java.lang.String optString2 = optJSONObject.optString("brand_user_name");
                    com.tencent.mars.xlog.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: " + optString);
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                    if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(optInt)) {
                        kotlin.jvm.internal.o.d(optString);
                        if (optString.length() > 0) {
                            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.hitest.FTSFlutterSearchUIC", "downloadPageDataForFastLoad can not preload openScene: " + optInt);
                    }
                }
            }
        }
        ou4.b0.c(callback, null, 1, null);
    }

    @Override // ou4.c0
    public java.lang.String b() {
        return this.f436447b;
    }
}
