package ka3;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final ka3.e f306067g = new ka3.e(null);

    /* renamed from: h, reason: collision with root package name */
    public static final r26.t f306068h = new r26.t("^\\d{6,20}_[a-zA-Z0-9]+@pay$");

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f306069i = "HceRegistChecker";

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f306070a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f306071b;

    /* renamed from: c, reason: collision with root package name */
    public final ka3.w f306072c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f306073d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f306074e;

    /* renamed from: f, reason: collision with root package name */
    public final ka3.f f306075f;

    public g(org.json.JSONObject registerOption, java.lang.String uin, ka3.w walletType) {
        kotlin.jvm.internal.o.g(registerOption, "registerOption");
        kotlin.jvm.internal.o.g(uin, "uin");
        kotlin.jvm.internal.o.g(walletType, "walletType");
        this.f306070a = registerOption;
        this.f306071b = uin;
        this.f306072c = walletType;
        this.f306073d = new java.util.ArrayList();
        this.f306074e = "HceRegisterationManager";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(uin);
        sb6.append('_');
        java.lang.String optString = registerOption.optString("storeAppId");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        sb6.append(optString);
        this.f306075f = new ka3.f(registerOption, sb6.toString());
    }

    public final org.json.JSONArray a() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = this.f306073d.iterator();
        while (it.hasNext()) {
            java.util.List list = ((ka3.f) it.next()).f306058a;
            if (list != null) {
                linkedHashSet.addAll(list);
            }
        }
        java.lang.String str = "get all registeredAids=" + linkedHashSet + ", registeringAids=" + b();
        java.lang.String str2 = this.f306074e;
        com.tencent.mars.xlog.Log.i(str2, str);
        linkedHashSet.addAll(b());
        com.tencent.mars.xlog.Log.i(str2, "registeringAids allAids=" + linkedHashSet);
        return new org.json.JSONArray((java.util.Collection) linkedHashSet);
    }

    public final java.util.List b() {
        org.json.JSONArray optJSONArray = this.f306070a.optJSONArray("aidList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String string = optJSONArray.getString(i17);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String upperCase = string.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
        }
        return arrayList;
    }
}
