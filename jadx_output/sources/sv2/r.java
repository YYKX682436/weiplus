package sv2;

/* loaded from: classes10.dex */
public final class r extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.x80 f413349h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413350i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413349h = draftItem;
        this.f413350i = "LogPost.FinderDraftPrepareStage";
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ov2.e
    public pv2.g j() {
        java.lang.String str = "start localId:" + this.f413349h.field_localId;
        java.lang.String str2 = this.f413350i;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mm.plugin.finder.storage.x80 D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(this.f413349h.field_localId);
        boolean z17 = true;
        if (D0 == null) {
            com.tencent.mars.xlog.Log.i(str2, "draftItem is deleted, " + this.f413349h.v0());
            return new sv2.c(this.f413349h, 1);
        }
        com.tencent.mars.xlog.Log.i(str2, "refresh draftItem, " + this.f413349h.v0());
        this.f413349h = D0;
        r45.qb4 postInfo = D0.getPostInfo();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.n2().r()).booleanValue() && com.tencent.mars.xlog.Log.getLogLevel() >= 0) {
            com.tencent.mars.xlog.Log.i(str2, "debug failed");
            t70Var.n2().o();
            return new sv2.a(this.f413349h, -1, -1, "failed for debug");
        }
        mv2.f0 f0Var = mv2.f0.f331561a;
        if (f0Var.m(postInfo)) {
            return new sv2.a(this.f413349h, -1, -1, "try to post this feed too many times!");
        }
        boolean isLongVideo = this.f413349h.t0().isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 17L, 1L);
        if (isLongVideo) {
            g0Var.C(1719L, 17L, 1L);
        }
        f0Var.v(this.f413349h);
        com.tencent.mars.xlog.Log.i(str2, "try post need upload task " + this.f413349h.field_localId);
        if (this.f413349h.t0().getFinderObject().getObjectDesc() == null) {
            return new sv2.q(this.f413349h, null, 2, 0 == true ? 1 : 0);
        }
        mv2.q.f331618a.n(this.f413349h);
        if ((((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(this.f413349h.field_localId) != null) != true) {
            com.tencent.mars.xlog.Log.i(str2, "post before mediaprocess cancel because feed is deleted");
            return new sv2.c(this.f413349h, 1);
        }
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.C).getValue()).r()).booleanValue() && !((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.A).getValue()).r()).booleanValue()) {
            z17 = false;
        }
        return z17 ? new sv2.n(this.f413349h) : new sv2.m(this.f413349h);
    }
}
