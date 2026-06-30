package lu4;

/* loaded from: classes7.dex */
public final class p implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.q f321449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321450e;

    public p(lu4.q qVar, java.lang.String str) {
        this.f321449d = qVar;
        this.f321450e = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        lu4.q qVar = this.f321449d;
        com.tencent.mars.xlog.Log.i(qVar.f321431c, "videoPreloadCgi callback " + i17 + '/' + i17 + ' ' + str);
        if (i17 != 0 || i18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("errMsg", "fail");
            jSONObject.put("errCode", i18);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            lu4.c.u((lu4.c) qVar.f321430b, this.f321450e, jSONObject2, null, 4, null);
            return 0;
        }
        java.lang.String str2 = qVar.f321431c;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        if (fVar instanceof r45.c97) {
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("errMsg", "ok");
        jSONObject3.put("errCode", i18);
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        r45.c97 c97Var = fVar2 instanceof r45.c97 ? (r45.c97) fVar2 : null;
        java.lang.String str3 = c97Var != null ? c97Var.f371387d : null;
        if (str3 == null) {
            str3 = "{}";
        }
        try {
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(str3));
        } catch (java.lang.Exception unused) {
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str3);
        }
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        lu4.c.u((lu4.c) qVar.f321430b, this.f321450e, jSONObject4, null, 4, null);
        return 0;
    }
}
