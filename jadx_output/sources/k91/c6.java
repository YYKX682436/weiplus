package k91;

/* loaded from: classes7.dex */
public class c6 extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes f305560d;

    public c6(com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes wxaProfileAttributes) {
        this.f305560d = wxaProfileAttributes;
        put("originalRedirectUrl", wxaProfileAttributes.f77511t);
        put("appServiceType", java.lang.Integer.valueOf(wxaProfileAttributes.f77504m));
        put("originalFlag", java.lang.Integer.valueOf(wxaProfileAttributes.f77510s));
        try {
            put("gameIconFlagList", new org.json.JSONArray(wxaProfileAttributes.f77512u));
            put("tagsInfo", new org.json.JSONObject(wxaProfileAttributes.f77513v));
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("WxaProfileAttributes", "gameIconFlagList Failed to parse JSON: ${e.message}");
        }
        put("relievedBuyFlag", java.lang.Integer.valueOf(this.f305560d.f77506o));
        put("flagshipFlag", java.lang.Integer.valueOf(this.f305560d.f77507p));
        put("brandOfficialFlag", java.lang.Integer.valueOf(this.f305560d.f77508q));
        put("showFinancialLicenseFlag", java.lang.Integer.valueOf(this.f305560d.f77509r));
        put("certificationImageType", java.lang.Integer.valueOf(this.f305560d.A));
    }
}
