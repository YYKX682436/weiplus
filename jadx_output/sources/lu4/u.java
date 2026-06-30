package lu4;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f321451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f321453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lu4.v f321455h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321456i;

    public u(kotlin.jvm.internal.h0 h0Var, java.lang.String str, java.util.Map map, java.lang.String str2, lu4.v vVar, java.lang.String str3) {
        this.f321451d = h0Var;
        this.f321452e = str;
        this.f321453f = map;
        this.f321454g = str2;
        this.f321455h = vVar;
        this.f321456i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String upperCase = ((java.lang.String) this.f321451d.f310123d).toUpperCase();
        kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
        boolean b17 = kotlin.jvm.internal.o.b(upperCase, "POST");
        java.lang.String str = this.f321454g;
        java.util.Map map = this.f321453f;
        java.lang.String str2 = this.f321452e;
        hy4.e f17 = b17 ? hy4.f.f(str2, map, str) : hy4.f.e(str2, map, str);
        lu4.v vVar = this.f321455h;
        if (f17 == null) {
            com.tencent.mars.xlog.Log.w(vVar.f321431c, "request response is null, return");
            lu4.c.u((lu4.c) vVar.f321430b, this.f321456i, "fail:response is null", null, 4, null);
            return;
        }
        java.lang.String str3 = vVar.f321431c;
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(f17.f286097a);
        java.util.Map header = f17.f286098b;
        objArr[1] = java.lang.Integer.valueOf(header != null ? ((java.util.HashMap) header).size() : 0);
        com.tencent.mars.xlog.Log.i(str3, "request response statusCode:%d, header.size:%d", objArr);
        java.lang.String str4 = vVar.f321431c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("statusCode", f17.f286097a);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, f17.f286099c);
        if (header != null) {
            if (header != null && (!((java.util.HashMap) header).isEmpty())) {
                z17 = true;
            }
            if (z17) {
                hy4.f.g(header);
                kotlin.jvm.internal.o.f(header, "header");
                jSONObject.put("header", new org.json.JSONObject(kz5.c1.s(header)));
            }
        }
        com.tencent.mars.xlog.Log.i(vVar.f321431c, "request success");
        lu4.c cVar = (lu4.c) vVar.f321430b;
        java.lang.String str5 = this.f321456i;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        lu4.c.u(cVar, str5, jSONObject2, null, 4, null);
    }
}
