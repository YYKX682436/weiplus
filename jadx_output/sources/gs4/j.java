package gs4;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f275103a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f275104b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f275105c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f275106d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275107e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f275108f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f275109g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f275110h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275111i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f275112j;

    public java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("ret_code", this.f275103a);
            jSONObject.put("ret_msg", this.f275104b);
            jSONObject.put("is_show", this.f275105c);
            jSONObject.put("is_open", this.f275106d);
            jSONObject.put("entrance_name", this.f275107e);
            jSONObject.put("wording", this.f275108f);
            jSONObject.put("is_new_user", this.f275109g);
            jSONObject.put("compliance_item_wording", this.f275110h);
            jSONObject.put("compliance_item_title", this.f275111i);
            jSONObject.put("compliance_item_link", this.f275112j);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.NetSceneMobileRemitGetSwitch", "MobileRemitSwitchConfig getJSONObjectString() Exception: %s", e17.getMessage());
            return "";
        }
    }

    public java.lang.String toString() {
        return "MobileRemitSwitchConfig{ret_code=" + this.f275103a + ", ret_msg='" + this.f275104b + "', is_show=" + this.f275105c + ", is_open=" + this.f275106d + ", entrance_name='" + this.f275107e + "', wording='" + this.f275108f + "', is_new_user='" + this.f275109g + ", compliance_item_wording='" + this.f275110h + "', compliance_item_title='" + this.f275111i + "', compliance_item_link='" + this.f275112j + "'}";
    }
}
