package mt4;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331302a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f331303b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f331304c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331305d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f331306e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f331307f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f331308g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f331309h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f331310i;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f331302a = str;
        this.f331307f = str2;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
        this.f331303b = jSONObject.optString("orderId");
        jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        this.f331304c = jSONObject.optString("productId");
        jSONObject.optLong("purchaseTime");
        jSONObject.optInt("purchaseState");
        java.lang.String optString = jSONObject.optString("developerPayload");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str4 = optString;
        while (str4.indexOf("[#]") >= 0) {
            java.lang.String substring = str4.substring(0, str4.indexOf("[#]"));
            str4 = str4.substring(substring.length() + 3);
            arrayList.add(substring);
        }
        arrayList.add(str4);
        if (arrayList.size() == 3) {
            this.f331305d = (java.lang.String) arrayList.get(0);
            this.f331310i = (java.lang.String) arrayList.get(1);
            this.f331309h = (java.lang.String) arrayList.get(2);
        } else {
            this.f331305d = optString;
        }
        this.f331306e = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f331308g = str3;
    }

    public java.lang.String toString() {
        return "PurchaseInfo(type:" + this.f331302a + "):" + this.f331307f;
    }

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f331304c = str;
        this.f331305d = str2;
        this.f331309h = str3;
        this.f331310i = str4;
    }
}
