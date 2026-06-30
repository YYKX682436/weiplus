package st2;

/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final st2.k2 f412388a = new st2.k2();

    public final void a(gk2.e liveData, l81.b1 bundle, long j17, long j18) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        if (((zy2.qa) i95.n0.c(zy2.qa.class)) != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            st2.f2 f2Var = st2.f2.f412287a;
            boolean z17 = st2.f2.f412288b;
            boolean z18 = st2.f2.f412289c;
            java.lang.String liveid = java.lang.String.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0));
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            java.lang.String finderid = xy2.c.e(context2);
            java.lang.String sessionid = java.lang.String.valueOf(((mm2.c1) liveData.a(mm2.c1.class)).f328861p2);
            java.lang.String str = bundle.f317014b;
            if (str == null) {
                str = "";
            }
            kotlin.jvm.internal.o.g(liveid, "liveid");
            kotlin.jvm.internal.o.g(finderid, "finderid");
            kotlin.jvm.internal.o.g(sessionid, "sessionid");
            com.tencent.mm.autogen.mmdata.rpt.FinderLivePreWarmEndReportStruct finderLivePreWarmEndReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePreWarmEndReportStruct();
            finderLivePreWarmEndReportStruct.f57303d = finderLivePreWarmEndReportStruct.b("appuin", str, true);
            finderLivePreWarmEndReportStruct.f57305f = 10;
            finderLivePreWarmEndReportStruct.f57304e = finderLivePreWarmEndReportStruct.b("appversion", "", true);
            finderLivePreWarmEndReportStruct.f57312m = z17 ? 1 : 0;
            finderLivePreWarmEndReportStruct.f57313n = z18 ? 1 : 0;
            finderLivePreWarmEndReportStruct.f57307h = finderLivePreWarmEndReportStruct.b("liveid", liveid, true);
            finderLivePreWarmEndReportStruct.f57308i = finderLivePreWarmEndReportStruct.b("finderid", finderid, true);
            finderLivePreWarmEndReportStruct.f57309j = finderLivePreWarmEndReportStruct.b("shopwindowid", "", true);
            finderLivePreWarmEndReportStruct.f57310k = finderLivePreWarmEndReportStruct.b("sessionid", sessionid, true);
            finderLivePreWarmEndReportStruct.f57311l = 0L;
            finderLivePreWarmEndReportStruct.f57306g = finderLivePreWarmEndReportStruct.b("networktype", java.lang.String.valueOf(by5.y.a(context)), true);
            finderLivePreWarmEndReportStruct.f57314o = j17;
            finderLivePreWarmEndReportStruct.f57315p = j18;
            finderLivePreWarmEndReportStruct.k();
        }
    }
}
