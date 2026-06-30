package pp2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final pp2.a f357466a = new pp2.a();

    public final void a(java.lang.String contextId, int i17, java.lang.String feedId, java.lang.String liveId) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
        com.tencent.mm.autogen.mmdata.rpt.EnterFinderLiveFromRedDotReportStruct enterFinderLiveFromRedDotReportStruct = new com.tencent.mm.autogen.mmdata.rpt.EnterFinderLiveFromRedDotReportStruct();
        enterFinderLiveFromRedDotReportStruct.f56096d = 1L;
        enterFinderLiveFromRedDotReportStruct.f56102j = enterFinderLiveFromRedDotReportStruct.b("ContextId", contextId, true);
        enterFinderLiveFromRedDotReportStruct.f56097e = i17;
        enterFinderLiveFromRedDotReportStruct.f56098f = enterFinderLiveFromRedDotReportStruct.b("FeedID", feedId, true);
        enterFinderLiveFromRedDotReportStruct.f56099g = enterFinderLiveFromRedDotReportStruct.b("LiveID", liveId, true);
        enterFinderLiveFromRedDotReportStruct.f56100h = enterFinderLiveFromRedDotReportStruct.b("RedDotTipsID", L0 != null ? L0.field_tipsId : null, true);
        if (L0 != null) {
            org.json.JSONObject g17 = pm0.b0.g(L0.W0());
            g17.put("object_id", pm0.v.u(L0.W0().getLong(0)));
            java.lang.String jSONObject = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            enterFinderLiveFromRedDotReportStruct.f56103k = enterFinderLiveFromRedDotReportStruct.b("ReportExtInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        }
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        enterFinderLiveFromRedDotReportStruct.f56101i = enterFinderLiveFromRedDotReportStruct.b("SessionID", Ri, true);
        com.tencent.mars.xlog.Log.i("EnterFinderLiveFromRedDotReport", "report " + enterFinderLiveFromRedDotReportStruct.n());
        enterFinderLiveFromRedDotReportStruct.k();
    }
}
