package rf1;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f394622a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f394623b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f394624c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f394625d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f394626e = null;

    public boolean a() {
        return (android.text.TextUtils.isEmpty(this.f394622a) || this.f394622a.equals("<unknown ssid>") || android.text.TextUtils.isEmpty(this.f394623b) || this.f394623b.equals("02:00:00:00:00:00")) ? false : true;
    }

    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("SSID", this.f394622a);
        jSONObject.put("BSSID", this.f394623b);
        java.lang.Boolean bool = this.f394625d;
        if (bool != null) {
            jSONObject.put("secure", bool);
        }
        java.lang.Integer num = this.f394624c;
        if (num != null) {
            jSONObject.put("signalStrength", num);
        }
        java.lang.Integer num2 = this.f394626e;
        if (num2 != null) {
            jSONObject.put("frequency", num2);
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return "WiFiItem{mSsid='" + this.f394622a + "', mBssid='" + this.f394623b + "', mSignalStrength=" + this.f394624c + ", mSecurity=" + this.f394625d + ", frequency=" + this.f394626e + '}';
    }
}
