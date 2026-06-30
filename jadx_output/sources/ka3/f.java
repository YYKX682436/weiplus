package ka3;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f306058a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f306059b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f306060c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f306061d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306062e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f306063f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f306064g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f306065h;

    /* renamed from: i, reason: collision with root package name */
    public final org.json.JSONObject f306066i;

    public f(org.json.JSONObject params, java.lang.String kvKey) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(kvKey, "kvKey");
        org.json.JSONArray optJSONArray = params.optJSONArray("aidList");
        optJSONArray = optJSONArray == null ? new org.json.JSONArray() : optJSONArray;
        e06.k m17 = e06.p.m(0, optJSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add(optJSONArray.getString(((kz5.x0) it).b()));
        }
        this.f306058a = arrayList;
        ka3.v vVar = ka3.w.f306106e;
        this.f306059b = params.optString("wallet", "cn");
        this.f306060c = params.optString("storeActionName");
        this.f306061d = params.optBoolean("requireDeviceUnlock");
        this.f306062e = params.optBoolean("requireDeviceScreenOn");
        this.f306063f = params.optString("storeAppId");
        this.f306064g = params.optString("payHomePage");
        this.f306065h = kvKey;
        this.f306066i = params;
    }
}
