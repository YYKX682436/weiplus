package z01;

/* loaded from: classes9.dex */
public final class g implements q31.p {

    /* renamed from: n, reason: collision with root package name */
    public int f469020n;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f469024r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.p f469025s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f469026t;

    /* renamed from: u, reason: collision with root package name */
    public int f469027u;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f469030x;

    /* renamed from: d, reason: collision with root package name */
    public z01.f f469013d = z01.f.f469006f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469014e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469015f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469016g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469017h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469018i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469019m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469021o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f469022p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f469023q = "";

    /* renamed from: v, reason: collision with root package name */
    public int f469028v = 146;

    /* renamed from: w, reason: collision with root package name */
    public int f469029w = 146;

    public final void a() {
        java.lang.String str = this.f469023q;
        int hashCode = str.hashCode();
        if (hashCode == 48936) {
            str.equals("1:1");
            return;
        }
        if (hashCode == 50861) {
            if (str.equals("3:4")) {
                this.f469029w = 195;
            }
        } else if (hashCode == 51821 && str.equals("4:3")) {
            this.f469028v = 195;
        }
    }

    public final void b() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f469021o);
            java.lang.String optString = jSONObject.optString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.CONTENTTYPE);
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            this.f469014e = optString;
            java.lang.String optString2 = jSONObject.optString("subSource");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            this.f469019m = optString2;
            java.lang.String optString3 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            this.f469016g = optString3;
            java.lang.String optString4 = jSONObject.optString("thumbUrl");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            this.f469015f = optString4;
            java.lang.String optString5 = jSONObject.optString("ratioType");
            kotlin.jvm.internal.o.f(optString5, "optString(...)");
            this.f469023q = optString5;
            this.f469020n = jSONObject.optInt("count");
            this.f469022p = c(jSONObject.optInt("duration"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("AskShareViewModel", e17.getMessage());
        }
        java.lang.String str = this.f469014e;
        this.f469013d = kotlin.jvm.internal.o.b(str, "photo") ? z01.f.f469004d : kotlin.jvm.internal.o.b(str, "video") ? z01.f.f469005e : z01.f.f469006f;
        a();
    }

    public final java.lang.String c(int i17) {
        if (i17 < 1) {
            return "";
        }
        int i18 = i17 / 3600;
        int i19 = i17 % 3600;
        int i27 = i19 / 60;
        int i28 = i19 % 60;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i18 > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(i18);
            sb7.append(':');
            sb6.append(sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(i27);
        sb8.append(':');
        sb6.append(sb8.toString());
        if (i28 < 10) {
            sb6.append("0" + i28);
        } else {
            sb6.append(i28);
        }
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }

    public java.lang.Object clone() {
        return super.clone();
    }
}
