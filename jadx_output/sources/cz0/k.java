package cz0;

/* loaded from: classes5.dex */
public final class k extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f224948a;

    /* renamed from: b, reason: collision with root package name */
    public int f224949b;

    /* renamed from: c, reason: collision with root package name */
    public int f224950c;

    /* renamed from: d, reason: collision with root package name */
    public int f224951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224952e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224953f = "";

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        this.f224949b = jsonObj.optInt("compatVersion");
        this.f224950c = jsonObj.optInt("resVersion");
        this.f224951d = jsonObj.optInt("baseVersion");
        java.lang.String optString = jsonObj.optString("sha1");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f224952e = optString;
        java.lang.String optString2 = jsonObj.optString("fullSha1");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f224953f = optString2;
        return this;
    }

    public final boolean c() {
        int i17 = this.f224949b;
        cz0.y yVar = cz0.y.f224969a;
        int i18 = cz0.y.f224970b;
        boolean z17 = i17 == i18;
        com.tencent.mars.xlog.Log.i("MaasSdkResConfig", "isComp: " + z17 + ' ' + this.f224949b + ' ' + i18 + ' ');
        return z17;
    }

    public final boolean d() {
        if (this.f224950c <= 0 || this.f224951d <= 0) {
            return false;
        }
        if (this.f224952e.length() > 0) {
            return this.f224953f.length() > 0;
        }
        return false;
    }

    public java.lang.String toString() {
        return "MaasSdkResConfig(compatVersion=" + this.f224949b + ", resVersion=" + this.f224950c + ", baseVersion=" + this.f224951d + ", sha1='" + this.f224952e + "', fullSha1='" + this.f224953f + "')";
    }
}
