package sv2;

/* loaded from: classes10.dex */
public final class c0 extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413263h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413264i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413263h = draftItem;
        this.f413264i = "LogPost.MvDraftPrepareStage";
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
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413263h;
        sb6.append(x80Var.field_localId);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f413264i;
        com.tencent.mars.xlog.Log.i(str, sb7);
        r45.qb4 postInfo = x80Var.getPostInfo();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.n2().r()).booleanValue() && com.tencent.mars.xlog.Log.getLogLevel() >= 0) {
            com.tencent.mars.xlog.Log.i(str, "debug failed");
            t70Var.n2().o();
            return new sv2.a(x80Var, -1, -1, "failed for debug");
        }
        mv2.f0 f0Var = mv2.f0.f331561a;
        if (f0Var.m(postInfo)) {
            return new sv2.a(x80Var, -1, -1, "try to post this feed too many times!");
        }
        boolean isLongVideo = x80Var.t0().isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 17L, 1L);
        if (isLongVideo) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 17L, 1L);
            }
        }
        f0Var.v(x80Var);
        mv2.q.f331618a.n(x80Var);
        if (((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.field_localId) != null) {
            return new sv2.b0(x80Var);
        }
        com.tencent.mars.xlog.Log.i(str, "post before mediaprocess cancel because feed is deleted");
        return new sv2.c(x80Var, 1);
    }
}
