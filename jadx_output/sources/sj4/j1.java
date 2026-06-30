package sj4;

/* loaded from: classes.dex */
public final class j1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408859e;

    public j1(java.lang.String str, java.lang.String str2) {
        this.f408858d = str;
        this.f408859e = str2;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("textStateModelInfo", this.f408858d);
        java.lang.String str = this.f408859e;
        if (!(str == null || r26.n0.N(str))) {
            jSONObject.put("clickTagName", str);
        }
        jSONObject.put("clickTagTime", c01.id.c());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
