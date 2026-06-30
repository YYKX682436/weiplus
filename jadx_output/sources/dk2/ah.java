package dk2;

/* loaded from: classes3.dex */
public final class ah implements l81.p0 {

    /* renamed from: e, reason: collision with root package name */
    public long f233212e;

    /* renamed from: f, reason: collision with root package name */
    public int f233213f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f233218n;

    /* renamed from: p, reason: collision with root package name */
    public int f233220p;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f233221q;

    /* renamed from: r, reason: collision with root package name */
    public int f233222r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f233224t;

    /* renamed from: w, reason: collision with root package name */
    public boolean f233227w;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f233211d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f233214g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f233215h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f233216i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f233217m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f233219o = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f233223s = true;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f233225u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f233226v = "";

    @Override // l81.p0
    public java.lang.String a() {
        try {
            java.lang.String jSONObject = b().toString();
            kotlin.jvm.internal.o.d(jSONObject);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WxLiveShoppingExtranData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, this.f233211d);
        jSONObject.put("productId", this.f233212e);
        jSONObject.put("isPreRender", this.f233213f);
        jSONObject.put("openMode", this.f233214g);
        java.lang.String str = this.f233215h;
        if (str == null) {
            str = "";
        }
        jSONObject.put("shopExtraData", str);
        jSONObject.put("finderUsername", this.f233217m);
        jSONObject.put("finderLiveToken", this.f233216i);
        jSONObject.put("hasClientDragBar", this.f233218n);
        jSONObject.put("liveScene", this.f233219o);
        jSONObject.put("entranceGMsgID", this.f233225u);
        jSONObject.put("query", this.f233226v);
        jSONObject.put("forbidAutoFullScreenWhenTap", this.f233227w);
        com.tencent.mars.xlog.Log.i("WxLiveShoppingExtranData", "finderUsername:" + this.f233217m + ", finderLiveToken:" + this.f233216i + ", entranceGMsgID:" + this.f233225u);
        return jSONObject;
    }

    public java.lang.String toString() {
        return a();
    }
}
