package z50;

/* loaded from: classes8.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(vu4.a actionId, vu4.b actionType, int i17, int i18, org.json.JSONObject extInfo, java.lang.String query) {
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(query, "query");
        vu4.c cVar = new vu4.c(actionId, actionType, java.lang.String.valueOf(o13.p.f342250c), java.lang.String.valueOf(o13.p.f342251d), java.lang.String.valueOf(o13.p.f342251d), 0, query, null, null, null, false, 1920, null);
        cVar.f440289l = i17;
        cVar.f440290m = i18;
        java.lang.String jSONObject = extInfo.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        cVar.f440291n = jSONObject;
        vu4.k a17 = cVar.a();
        rk0.c.c("MicroMsg.FTS.FTSReportHelper", "doReport26897: " + a17, new java.lang.Object[0]);
        ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().k(a17);
    }

    public final void b(vu4.a actionId, vu4.b actionType, org.json.JSONObject extInfo, java.lang.String query) {
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(query, "query");
        vu4.c cVar = new vu4.c(actionId, actionType, java.lang.String.valueOf(o13.p.f342250c), java.lang.String.valueOf(o13.p.f342251d), java.lang.String.valueOf(o13.p.f342251d), 0, query, null, null, null, false, 1920, null);
        java.lang.String jSONObject = extInfo.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        cVar.f440291n = jSONObject;
        ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().k(cVar.a());
    }
}
