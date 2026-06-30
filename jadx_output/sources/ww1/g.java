package ww1;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f450187a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f450188b;

    /* renamed from: c, reason: collision with root package name */
    public long f450189c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f450190d;

    /* renamed from: e, reason: collision with root package name */
    public int f450191e;

    public static ww1.g a(org.json.JSONObject jSONObject) {
        ww1.g gVar = new ww1.g();
        gVar.f450187a = jSONObject.optString("bill_id");
        gVar.f450188b = jSONObject.optString("trans_id");
        gVar.f450189c = jSONObject.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, 0L);
        gVar.f450190d = jSONObject.optString("desc");
        gVar.f450191e = jSONObject.optInt("fee", 0);
        return gVar;
    }
}
