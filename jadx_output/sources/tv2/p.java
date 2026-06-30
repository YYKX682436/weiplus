package tv2;

/* loaded from: classes10.dex */
public final class p extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f422325h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f422326i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f422325h = finderObj;
        this.f422326i = "LogPost.FinderPostPrepareStage";
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
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422325h;
        sb6.append(finderItem.getLocalId());
        sb6.append(" desc:");
        sb6.append(finderItem.getDescription());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f422326i;
        com.tencent.mars.xlog.Log.i(str, sb7);
        r45.qb4 postInfo = finderItem.getPostInfo();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.n2().r()).booleanValue() && com.tencent.mars.xlog.Log.getLogLevel() >= 0) {
            com.tencent.mars.xlog.Log.i(str, "debug failed");
            t70Var.n2().o();
            return new tv2.a(finderItem, Integer.MIN_VALUE, Integer.MIN_VALUE, "failed for debug");
        }
        if (finderItem.isPostFakeOk()) {
            return new tv2.o(finderItem);
        }
        mv2.f0 f0Var = mv2.f0.f331561a;
        if (f0Var.n(postInfo)) {
            return new tv2.a(finderItem, Integer.MIN_VALUE, Integer.MIN_VALUE, "try to post this feed too many times!");
        }
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 17L, 1L);
        if (isLongVideo) {
            g0Var.C(1523L, 17L, 1L);
        }
        f0Var.w(finderItem);
        boolean z17 = true;
        if (postInfo.getInteger(2) == 1) {
            if (cu2.u.f222441a.k(finderItem.getLocalId())) {
                return new tv2.m(finderItem, null);
            }
            com.tencent.mars.xlog.Log.i(str, "post before doscene2 cancel because feed is deleted");
            return new tv2.x(finderItem, 1);
        }
        com.tencent.mars.xlog.Log.i(str, "try post need upload task " + finderItem.getLocalId());
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderItem.getFinderObject();
        if ((finderObject != null ? finderObject.getObjectDesc() : null) == null) {
            return new tv2.m(finderItem, null);
        }
        mv2.q.f331618a.o(finderItem);
        if (!cu2.u.f222441a.k(finderItem.getLocalId())) {
            com.tencent.mars.xlog.Log.i(str, "post before mediaprocess cancel because feed is deleted");
            return new tv2.x(finderItem, 1);
        }
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.C).getValue()).r()).booleanValue() && !((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.A).getValue()).r()).booleanValue()) {
            z17 = false;
        }
        return z17 ? new tv2.g(finderItem) : new tv2.f(finderItem);
    }
}
