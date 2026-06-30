package zr4;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f475203a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f475204b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f475205c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f475206d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475207e;

    public static zr4.d a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("notify_flag", 0);
        java.lang.String optString = jSONObject.optString("notify_wording", "");
        java.lang.String optString2 = jSONObject.optString("left_button_wording", "");
        java.lang.String optString3 = jSONObject.optString("right_button_wording", "");
        java.lang.String optString4 = jSONObject.optString("confirm_button_wording", "");
        if (optInt == 0) {
            return null;
        }
        zr4.d dVar = new zr4.d();
        dVar.f475203a = optInt;
        dVar.f475204b = optString;
        dVar.f475205c = optString2;
        dVar.f475206d = optString3;
        dVar.f475207e = optString4;
        return dVar;
    }
}
