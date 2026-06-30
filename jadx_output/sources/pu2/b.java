package pu2;

/* loaded from: classes8.dex */
public final class b {
    public final void a(ts5.p uniqueTag, pu2.a reportStruct) {
        kotlin.jvm.internal.o.g(uniqueTag, "uniqueTag");
        kotlin.jvm.internal.o.g(reportStruct, "reportStruct");
        com.tencent.mars.xlog.Log.i("TrendsReporter", "uniqueTag=" + uniqueTag + " report=" + reportStruct);
        com.tencent.mm.autogen.mmdata.rpt.finder_live_fluent_reportStruct finder_live_fluent_reportstruct = new com.tencent.mm.autogen.mmdata.rpt.finder_live_fluent_reportStruct();
        finder_live_fluent_reportstruct.f63101d = reportStruct.f358422a;
        finder_live_fluent_reportstruct.f63102e = 2;
        finder_live_fluent_reportstruct.f63103f = reportStruct.f358423b;
        java.lang.String jSONObject = reportStruct.f358424c.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        finder_live_fluent_reportstruct.f63104g = finder_live_fluent_reportstruct.b("result", r26.i0.t(jSONObject, ",", ";", false), true);
        java.util.Map map = reportStruct.f358425d;
        if (map != null) {
            if (!(!map.isEmpty())) {
                map = null;
            }
            if (map != null) {
                java.lang.String jSONObject2 = new org.json.JSONObject(map).toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                finder_live_fluent_reportstruct.f63105h = finder_live_fluent_reportstruct.b("extraJson", r26.i0.t(jSONObject2, ",", ";", false), true);
            }
        }
        finder_live_fluent_reportstruct.k();
    }
}
