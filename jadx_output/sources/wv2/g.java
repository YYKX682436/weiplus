package wv2;

/* loaded from: classes10.dex */
public final class g extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f450012h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f450013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f450012h = finderObj;
        this.f450013i = "LogPost.MvPostPrepareStage";
    }

    @Override // pv2.g
    public int a() {
        return 1;
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
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f450012h;
        sb6.append(finderItem.getLocalId());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f450013i;
        com.tencent.mars.xlog.Log.i(str, sb7);
        r45.qb4 postInfo = finderItem.getPostInfo();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.n2().r()).booleanValue() && com.tencent.mars.xlog.Log.getLogLevel() >= 0) {
            com.tencent.mars.xlog.Log.i(str, "debug failed");
            t70Var.n2().o();
            return new tv2.a(finderItem, Integer.MIN_VALUE, Integer.MIN_VALUE, "failed for debug");
        }
        mv2.f0 f0Var = mv2.f0.f331561a;
        if (f0Var.n(postInfo)) {
            return new tv2.a(finderItem, Integer.MIN_VALUE, Integer.MIN_VALUE, "try to post this feed too many times!");
        }
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 17L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 17L, 1L);
            }
        }
        f0Var.w(finderItem);
        mv2.q.f331618a.o(finderItem);
        if (postInfo.getInteger(2) == 1) {
            if (cu2.u.f222441a.k(finderItem.getLocalId())) {
                return new wv2.f(finderItem);
            }
            com.tencent.mars.xlog.Log.i(str, "post before doscene2 cancel because feed is deleted");
            return new wv2.n(finderItem, 1);
        }
        if (cu2.u.f222441a.k(finderItem.getLocalId())) {
            return new wv2.c(finderItem);
        }
        com.tencent.mars.xlog.Log.i(str, "post before mediaprocess cancel because feed is deleted");
        return new wv2.n(finderItem, 1);
    }
}
