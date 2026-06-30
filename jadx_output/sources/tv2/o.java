package tv2;

/* loaded from: classes10.dex */
public final class o extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f422322h;

    /* renamed from: i, reason: collision with root package name */
    public pv2.g f422323i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f422324m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422322h = finderObj;
        this.f422323i = new tv2.q(finderObj);
        this.f422324m = new java.util.concurrent.CountDownLatch(1);
    }

    @Override // pv2.g
    public int a() {
        return 5;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // ov2.e
    public pv2.g j() {
        r45.q23 video_tmpl_info;
        r45.ko6 ko6Var;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422322h;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostConfirmStage", "start localId:" + finderItem.getLocalId() + " checkSum:" + ((objectDesc == null || (video_tmpl_info = objectDesc.getVideo_tmpl_info()) == null || (ko6Var = video_tmpl_info.f383601w) == null) ? null : ko6Var.f378884i));
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(5);
            finderFeedReportObject.setConfirmCgiCount(finderFeedReportObject.getConfirmCgiCount() + 1);
        }
        finderItem.getPostInfo().set(17, java.lang.Long.valueOf(c01.id.a()));
        cu2.u.f222441a.l(finderItem);
        finderItem.trackPost("doPostConfirmStart");
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue();
        java.util.concurrent.CountDownLatch countDownLatch = this.f422324m;
        if (intValue == 6) {
            this.f422323i = new tv2.q(finderItem);
            countDownLatch.countDown();
            return this.f422323i;
        }
        ov2.e.i(this, "andr_Cgi_Confirm_Begin", this.f422322h, 0, null, 12, null);
        new db2.r2(finderItem).l().K(new tv2.n(this));
        countDownLatch.await();
        return this.f422323i;
    }
}
