package sv2;

/* loaded from: classes10.dex */
public final class g extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.x80 f413278h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f413279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.finder.storage.x80 draftItem) {
        super("draft_" + draftItem.field_localId);
        kotlin.jvm.internal.o.g(draftItem, "draftItem");
        this.f413278h = draftItem;
        this.f413279i = "LogPost.FinderAdDraftPrepareStage";
    }

    @Override // pv2.g
    public int a() {
        return 1;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        com.tencent.mars.xlog.Log.i(this.f413279i, "onFailed " + this.f413278h.field_localId);
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        com.tencent.mars.xlog.Log.i(this.f413279i, "try post need upload task " + this.f413278h.field_localId);
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        com.tencent.mars.xlog.Log.i(this.f413279i, "onWait " + this.f413278h.field_localId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ov2.e
    public pv2.g j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f413278h;
        sb6.append(x80Var.field_localId);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f413279i;
        com.tencent.mars.xlog.Log.i(str, sb7);
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long j17 = x80Var.field_localId;
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = j17;
        gaVar.f6750b = 0;
        gaVar.f6751c = 1;
        feedPostProgressEvent.e();
        com.tencent.mars.xlog.Log.i(str, "try post need upload task " + x80Var.field_localId);
        if (x80Var.t0().getFinderObject().getObjectDesc() != null) {
            mv2.q.f331618a.n(x80Var);
            return new sv2.d(x80Var);
        }
        return new sv2.q(x80Var, null, 2, 0 == true ? 1 : 0);
    }
}
