package rv4;

/* loaded from: classes12.dex */
public final class k implements mv4.f {

    /* renamed from: r, reason: collision with root package name */
    public static final rv4.j f400502r = new rv4.j(null);

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f400503a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f400504b;

    /* renamed from: c, reason: collision with root package name */
    public final rv4.h f400505c;

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f400506d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400507e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400508f;

    /* renamed from: g, reason: collision with root package name */
    public final int f400509g;

    /* renamed from: h, reason: collision with root package name */
    public final long f400510h;

    /* renamed from: i, reason: collision with root package name */
    public final int f400511i;

    /* renamed from: j, reason: collision with root package name */
    public final org.json.JSONArray f400512j;

    /* renamed from: k, reason: collision with root package name */
    public final org.json.JSONArray f400513k;

    /* renamed from: l, reason: collision with root package name */
    public final org.json.JSONObject f400514l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f400515m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f400516n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f400517o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f400518p;

    /* renamed from: q, reason: collision with root package name */
    public int f400519q;

    public k(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, rv4.w session, java.lang.String requestId, rv4.h boxData) {
        java.lang.String optString;
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(boxData, "boxData");
        this.f400503a = session;
        this.f400504b = requestId;
        this.f400505c = boxData;
        org.json.JSONObject jSONObject3 = jSONObject == null ? jSONObject2 : jSONObject;
        this.f400506d = jSONObject3;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString(dm.i4.COL_ID) : null;
        if (optString2 == null) {
            optString2 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(optString2, "toString(...)");
        }
        this.f400507e = optString2;
        if (jSONObject == null || (optString = jSONObject.optString("hotword")) == null) {
            optString = jSONObject2 != null ? jSONObject2.optString("nickname") : null;
            if (optString == null) {
                optString = "";
            }
        }
        this.f400508f = optString;
        this.f400509g = jSONObject != null ? jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : 101;
        this.f400510h = jSONObject != null ? jSONObject.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP) : jSONObject2 != null ? jSONObject2.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP) : 0L;
        this.f400511i = jSONObject != null ? jSONObject.optInt("businesstype") : 0;
        this.f400512j = jSONObject3 != null ? jSONObject3.optJSONArray("checkboxes") : null;
        this.f400513k = jSONObject3 != null ? jSONObject3.optJSONArray("extReqParams") : null;
        org.json.JSONObject optJSONObject3 = jSONObject != null ? jSONObject.optJSONObject("extLocalInfo") : null;
        this.f400514l = optJSONObject3;
        this.f400515m = (optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("historyUploadExtInfo")) == null) ? null : optJSONObject2.optString("parentSearchIDKV");
        this.f400516n = (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("historyUploadExtInfo")) == null) ? null : optJSONObject.optString("uploadFileIconName");
        if (jSONObject != null) {
            pv4.a.b(jSONObject, "opType");
        }
        this.f400517o = jSONObject2 != null ? pv4.a.d(jSONObject2, dm.i4.COL_USERNAME) : null;
        if (jSONObject2 != null) {
            pv4.a.d(jSONObject2, "headUrl");
        }
        this.f400518p = jSONObject2 != null ? pv4.a.b(jSONObject2, "type") : null;
        if (jSONObject2 != null) {
            pv4.a.b(jSONObject2, "verifyFlag");
        }
    }

    public final ov4.c a(ov4.d dVar) {
        org.json.JSONObject jSONObject;
        rv4.w wVar = this.f400503a;
        jv4.i iVar = wVar.f400557c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String str = wVar.f331674a;
        java.lang.String str2 = this.f400504b;
        java.lang.String a17 = this.f400505c.i().a();
        java.lang.String b17 = b();
        int i17 = this.f400511i;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str, null, str2, 0L, dVar, a17, b17, 0, 0, null, 0, 3, 0, i17, jSONObject2, 6026, null);
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f400519q);
        sb6.append('|');
        sb6.append(this.f400519q);
        sb6.append('|');
        java.lang.String str = this.f400508f;
        sb6.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        sb6.append('|');
        java.lang.String str2 = this.f400517o;
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        sb6.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        sb6.append("|1||");
        sb6.append(this.f400509g);
        sb6.append('_');
        sb6.append(this.f400511i);
        sb6.append("||title|");
        java.lang.Integer num = this.f400518p;
        sb6.append(num != null ? num.intValue() : 0);
        return sb6.toString();
    }

    public final org.json.JSONObject d(org.json.JSONArray jSONArray, java.lang.String str) {
        java.lang.String optString;
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null && (optString = optJSONObject.optString("key")) != null && kotlin.jvm.internal.o.b(str, optString)) {
                return optJSONObject;
            }
        }
        return null;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return this.f400508f + '-' + this.f400507e;
    }

    @Override // nv4.g
    public void w() {
        this.f400503a.f331675b.d("history-" + this.f400504b + '-' + this.f400508f, a(ov4.d.f349207f));
    }
}
