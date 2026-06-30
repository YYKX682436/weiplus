package dk2;

/* loaded from: classes2.dex */
public final class r6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f234016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f234017g;

    public r6(int i17, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var) {
        this.f234014d = i17;
        this.f234015e = context;
        this.f234016f = finderObject;
        this.f234017g = qt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk() || ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "startPlayLiveOnFeedFlow: isVisitorLiving or isAnchorLiving, next loop");
            dk2.u6.f234174d.c(this.f234014d * 1000, 0L);
            return;
        }
        dk2.u6 u6Var = dk2.u6.f234171a;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f234016f;
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        if (liveInfo == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFeedFlowReporter", "[reportJoinLiveOnFeedFlow]， liveid = " + liveInfo.getLong(0));
        u6Var.c(this.f234015e, finderObject, this.f234017g);
    }
}
