package com.tencent.mm.plugin.finder.report;

/* loaded from: classes8.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.e3 f125009a = new com.tencent.mm.plugin.finder.report.e3();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f125010b = "1";

    public final void a(java.lang.String eventId, java.lang.String finderUin, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(finderUin, "finderUin");
        com.tencent.mm.autogen.mmdata.rpt.FinderUserFlowActionStruct finderUserFlowActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderUserFlowActionStruct();
        if (kotlin.jvm.internal.o.b(eventId, "1")) {
            f125010b = "1-" + c01.id.c();
        }
        finderUserFlowActionStruct.f57961d = finderUserFlowActionStruct.b("biz_id", "4", true);
        finderUserFlowActionStruct.f57962e = finderUserFlowActionStruct.b("flow_id", f125010b, true);
        finderUserFlowActionStruct.f57963f = finderUserFlowActionStruct.b("event_id", eventId, true);
        finderUserFlowActionStruct.f57964g = finderUserFlowActionStruct.b("event_time", java.lang.String.valueOf(c01.id.c()), true);
        finderUserFlowActionStruct.f57965h = finderUserFlowActionStruct.b("finderuin", finderUin, true);
        if (jSONObject != null) {
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderUserFlowActionStruct.f57966i = finderUserFlowActionStruct.b("udf_kv", r26.i0.t(jSONObject2, ",", ";", false), true);
        }
        finderUserFlowActionStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderUserFlowActionStruct);
    }
}
