package rq2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.p f398858a = new rq2.p();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f398859b = "94";

    public final void a(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, long j17, long j18) {
        java.lang.String str;
        java.lang.String userName = baseFinderFeed.getFeedObject().getUserName();
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        boolean z17 = false;
        if (liveInfo == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        long id6 = baseFinderFeed.getFeedObject().getFeedObject().getId();
        ((m30.m) rVar).getClass();
        java.lang.String q17 = b52.b.q(id6);
        java.lang.String str2 = f398859b;
        java.lang.String sessionBuffer = baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer();
        if (sessionBuffer == null) {
            sessionBuffer = "";
        }
        long integer = baseFinderFeed.getFeedObject().getLiveInfo() != null ? r7.getInteger(10) : 0L;
        r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
        if (liveInfo2 != null && liveInfo2.getInteger(2) == 1) {
            z17 = true;
        }
        long j19 = z17 ? 1L : 2L;
        kotlin.jvm.internal.o.d(q17);
        com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayFeedEntranceLogStruct finderLivePlayFeedEntranceLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayFeedEntranceLogStruct();
        finderLivePlayFeedEntranceLogStruct.f57288d = finderLivePlayFeedEntranceLogStruct.b("UserName", userName, true);
        finderLivePlayFeedEntranceLogStruct.f57289e = finderLivePlayFeedEntranceLogStruct.b("LiveID", str, true);
        finderLivePlayFeedEntranceLogStruct.f57290f = finderLivePlayFeedEntranceLogStruct.b("FeedID", q17, true);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        finderLivePlayFeedEntranceLogStruct.f57291g = finderLivePlayFeedEntranceLogStruct.b("sessionid", Ri != null ? Ri : "", true);
        finderLivePlayFeedEntranceLogStruct.f57292h = c01.id.c();
        finderLivePlayFeedEntranceLogStruct.f57293i = j18;
        finderLivePlayFeedEntranceLogStruct.f57294j = finderLivePlayFeedEntranceLogStruct.b("CommentScene", str2, true);
        finderLivePlayFeedEntranceLogStruct.f57295k = j17;
        finderLivePlayFeedEntranceLogStruct.f57296l = j19;
        finderLivePlayFeedEntranceLogStruct.f57297m = finderLivePlayFeedEntranceLogStruct.b("ContextId", rq2.x.f398915b, true);
        finderLivePlayFeedEntranceLogStruct.f57298n = finderLivePlayFeedEntranceLogStruct.b("ClickTabContextId", "1001-" + c01.id.c(), true);
        finderLivePlayFeedEntranceLogStruct.f57299o = finderLivePlayFeedEntranceLogStruct.b("SessionBuffer", sessionBuffer, true);
        finderLivePlayFeedEntranceLogStruct.f57300p = integer;
        finderLivePlayFeedEntranceLogStruct.k();
        com.tencent.mars.xlog.Log.i("FinderLivePlayFeedEntranceLogReporter", finderLivePlayFeedEntranceLogStruct.n());
    }
}
