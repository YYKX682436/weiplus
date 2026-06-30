package ok4;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final ok4.u f346041a = new ok4.u();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f346042b = new java.util.HashMap();

    public final com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a(java.lang.String str) {
        return (com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct) f346042b.get(str);
    }

    public final void b(java.lang.String mediaId, java.lang.String feedId, int i17, boolean z17, boolean z18, int i18, java.lang.String previewReqFlag, int i19, long j17, int i27, boolean z19, int i28, boolean z27) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(previewReqFlag, "previewReqFlag");
        e(new ok4.g(mediaId, feedId, i17, z17, z18, i18, previewReqFlag, j17, i27, i19, z19, i28, z27));
    }

    public final void d(java.lang.String mediaId) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = a(mediaId);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setVideoViewClick >> " + mediaId + ", " + a17.N);
            a17.N = a17.N + 1;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setVideoViewClick >> " + mediaId + " but data is no find");
        }
    }

    public final void e(yz5.a aVar) {
        ((ku5.t0) ku5.t0.f312615d).h(new ok4.t(aVar), "SnsVideoReportThread");
    }
}
