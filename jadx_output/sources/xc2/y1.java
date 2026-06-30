package xc2;

/* loaded from: classes2.dex */
public final class y1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f453342e;

    public y1(java.lang.String str, xc2.p0 p0Var) {
        this.f453341d = str;
        this.f453342e = p0Var;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        java.lang.String string;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.f453341d;
        java.lang.String str2 = "";
        if (str == null || str.length() == 0) {
            str = "";
        }
        jSONObject.put(dm.i4.COL_FINDEROBJECT, str);
        xc2.p0 p0Var = this.f453342e;
        r45.l34 l34Var = p0Var.f453238c;
        if (l34Var != null && (string = l34Var.getString(3)) != null) {
            str2 = string;
        }
        jSONObject.put("finder_context", str2);
        java.util.Map map = p0Var.f453235a0;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject.toString();
    }
}
