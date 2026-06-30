package sv2;

/* loaded from: classes10.dex */
public final class f extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413271h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f413272i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f413273m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f413274n;

    /* renamed from: o, reason: collision with root package name */
    public pv2.g f413275o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f413276p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.storage.x80 draftItem, byte[] bArr) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413271h = draftItem;
        this.f413272i = bArr;
        this.f413273m = "LogPost.FinderAdDraftPostCgiStage";
        this.f413274n = draftItem.t0();
        this.f413275o = new sv2.c(draftItem, 2);
        this.f413276p = new java.util.concurrent.CountDownLatch(1);
    }

    @Override // pv2.g
    public int a() {
        return 4;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f413274n;
        sb6.append(finderItem.getLocalId());
        com.tencent.mars.xlog.Log.i(this.f413273m, sb6.toString());
        finderItem.trackDraftPost("doAdDraftPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(4);
        }
        java.lang.String string = finderItem.getPostInfo().getString(0);
        if (string == null || string.length() == 0) {
            finderItem.getPostInfo().set(0, "FinderLocal_feed_" + java.lang.System.nanoTime());
        }
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue();
        java.util.concurrent.CountDownLatch countDownLatch = this.f413276p;
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413271h;
        if (intValue == 3) {
            this.f413275o = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
        } else {
            new db2.w4(x80Var.t0(), null, this.f413272i, (r45.ip2) x80Var.getPostInfo().getCustom(29), 2, null).l().q(new sv2.e(this));
        }
        countDownLatch.await();
        return this.f413275o;
    }
}
