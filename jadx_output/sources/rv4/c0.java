package rv4;

/* loaded from: classes12.dex */
public final class c0 implements mv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.i f400447a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.w f400448b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400449c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f400450d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f400451e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f400452f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f400453g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f400454h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f400455i;

    /* renamed from: j, reason: collision with root package name */
    public int f400456j;

    public c0(mv4.i boxData, org.json.JSONObject json, rv4.w session) {
        java.lang.Long c17;
        kotlin.jvm.internal.o.g(boxData, "boxData");
        kotlin.jvm.internal.o.g(json, "json");
        kotlin.jvm.internal.o.g(session, "session");
        this.f400447a = boxData;
        this.f400448b = session;
        java.lang.String optString = json.optString("hotword");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f400449c = optString;
        java.lang.Integer b17 = pv4.a.b(json, "businessType");
        this.f400451e = b17;
        this.f400452f = pv4.a.b(json, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f400454h = json.has("isSwitchClosed") ? java.lang.Boolean.valueOf(json.optBoolean("isSwitchClosed")) : null;
        this.f400455i = json.optBoolean("needHideKeyBoard");
        pv4.a.b(json, "optype");
        org.json.JSONObject optJSONObject = session.a().f400554a.optJSONObject("localVerticalSwitchMap");
        optJSONObject = optJSONObject == null ? new org.json.JSONObject() : optJSONObject;
        if (b17 != null && b17.intValue() == 0) {
            c17 = pv4.a.c(optJSONObject, optString);
        } else {
            c17 = pv4.a.c(optJSONObject, java.lang.String.valueOf(b17));
            if (c17 == null) {
                c17 = pv4.a.c(optJSONObject, optString);
            }
        }
        this.f400450d = c17;
    }

    public final ov4.c a(ov4.d dVar) {
        org.json.JSONObject jSONObject;
        rv4.w wVar = this.f400448b;
        jv4.i iVar = wVar.f400557c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String str = wVar.f331674a;
        rv4.b0 b0Var = (rv4.b0) this.f400447a;
        java.lang.String str2 = b0Var.f400443f;
        int i17 = b0Var.f400445h;
        java.lang.String title = b0Var.f400441d;
        kotlin.jvm.internal.o.g(title, "title");
        java.lang.String str3 = i17 + "|55|" + fp.s0.b(title, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        java.lang.String str4 = this.f400456j + '|' + this.f400456j + '|' + fp.s0.b(this.f400449c, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding) + "||||||title|";
        java.lang.Integer num = this.f400451e;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str, null, str2, 0L, dVar, str3, str4, 0, 0, null, 0, 3, 0, intValue, jSONObject2, 6026, null);
    }

    public boolean b() {
        java.lang.Long l17 = this.f400450d;
        if (l17 == null) {
            if (!kotlin.jvm.internal.o.b(this.f400454h, java.lang.Boolean.TRUE)) {
                return true;
            }
        } else if (l17.longValue() == 0) {
            return true;
        }
        return false;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return this.f400449c + '-' + this.f400451e;
    }

    @Override // nv4.g
    public void w() {
        ov4.c a17 = a(ov4.d.f349207f);
        rv4.w wVar = this.f400448b;
        if (wVar.f331675b.d("vertical-entry-" + ((rv4.b0) this.f400447a).f400443f + '-' + this.f400449c, a17)) {
            nv4.k kVar = wVar.f331675b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vertical-22369-");
            sb6.append(wVar.f331674a);
            sb6.append('-');
            java.lang.Integer num = this.f400451e;
            sb6.append(num != null ? num.intValue() : 0);
            kVar.d(sb6.toString(), new ov4.b(wVar.f331674a, java.lang.String.valueOf(num != null ? num.intValue() : 0), 2));
        }
    }
}
