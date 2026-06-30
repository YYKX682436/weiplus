package xv2;

/* loaded from: classes10.dex */
public final class f extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f457408h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f457409i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f457408h = finderObj;
        this.f457409i = "LogPost.FinderPostPrepareStage";
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
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f457408h;
        sb6.append(finderItem.getLocalId());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f457409i;
        com.tencent.mars.xlog.Log.i(str, sb7);
        r45.qb4 postInfo = finderItem.getPostInfo();
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
        if (postInfo.getInteger(2) == 1) {
            if (cu2.u.f222441a.k(finderItem.getLocalId())) {
                return new xv2.e(finderItem, null);
            }
            com.tencent.mars.xlog.Log.i(str, "post before doscene2 cancel because feed is deleted");
            return new tv2.x(finderItem, 1);
        }
        com.tencent.mars.xlog.Log.i(str, "try post need upload task " + finderItem.getLocalId());
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderItem.getFinderObject();
        if ((finderObject != null ? finderObject.getObjectDesc() : null) == null) {
            return new xv2.e(finderItem, null);
        }
        mv2.q.f331618a.o(finderItem);
        if (cu2.u.f222441a.k(finderItem.getLocalId())) {
            return new xv2.b(finderItem);
        }
        com.tencent.mars.xlog.Log.i(str, "post before mediaprocess cancel because feed is deleted");
        return new tv2.x(finderItem, 1);
    }
}
