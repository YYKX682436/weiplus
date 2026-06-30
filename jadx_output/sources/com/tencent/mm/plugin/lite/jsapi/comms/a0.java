package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class a0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final int f143496g = hashCode() & 65535;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int i17 = this.f143496g;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiChooseLocation", "chooseLocation data: %s, requestCode: %d", jSONObject, java.lang.Integer.valueOf(i17));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 8);
        intent.putExtra("type_tag", 4);
        if (jSONObject != null && jSONObject.has("latitude") && jSONObject.has("longitude")) {
            double F = com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("latitude"), 0.0d);
            double F2 = com.tencent.mm.sdk.platformtools.t8.F(jSONObject.optString("longitude"), 0.0d);
            intent.putExtra("KPickPoiLat", F);
            intent.putExtra("KPickPoiLong", F2);
        }
        if (!(c() instanceof android.app.Activity)) {
            this.f143443f.a("invalid activity");
            return;
        }
        android.app.Activity activity = (android.app.Activity) c();
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(activity, "android.permission.ACCESS_FINE_LOCATION", 64, "", "", new com.tencent.mm.plugin.lite.jsapi.comms.y(this, activity, intent))) {
            nf.g.a(activity).f(new com.tencent.mm.plugin.lite.jsapi.comms.z(this));
            j45.l.n(activity, ya.b.LOCATION, ".ui.RedirectUI", intent, i17);
        }
    }
}
