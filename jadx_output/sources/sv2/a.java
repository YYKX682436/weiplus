package sv2;

/* loaded from: classes2.dex */
public final class a extends pv2.d {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413237e;

    /* renamed from: f, reason: collision with root package name */
    public final int f413238f;

    /* renamed from: g, reason: collision with root package name */
    public final int f413239g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f413240h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413241i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.storage.x80 draftItem, int i17, int i18, java.lang.String errMsg) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f413237e = draftItem;
        this.f413238f = i17;
        this.f413239g = i18;
        this.f413240h = errMsg;
        this.f413241i = "LogPost.FinderDraftFailedStage";
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post failed, localId:");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413237e;
        sb6.append(x80Var.field_localId);
        sb6.append(", errType %d, errCode %d, errMsg %s");
        com.tencent.mars.xlog.Log.w(this.f413241i, sb6.toString(), java.lang.Integer.valueOf(this.f413238f), java.lang.Integer.valueOf(this.f413239g), this.f413240h);
        x80Var.field_localFlag = (x80Var.field_localFlag | 2) & (-2);
        cu2.o.f222430a.b(x80Var);
        com.tencent.mm.plugin.finder.report.b0.f124961a.a(x80Var);
        mv2.f0 f0Var = mv2.f0.f331561a;
        pm0.v.X(new mv2.t(x80Var.field_localId, false));
        boolean isLongVideo = x80Var.t0().isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1718L, 16L, 1L);
        if (isLongVideo) {
            g0Var.C(1719L, 16L, 1L);
        }
    }
}
