package cp2;

/* loaded from: classes2.dex */
public final class p1 extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f220878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(cp2.q1 q1Var, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        super(finderRefreshLayout);
        this.f220878e = q1Var;
        kotlin.jvm.internal.o.d(finderRefreshLayout);
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishRefresh(reason);
        this.f220878e.f220884f.onRefreshEnd(reason);
    }
}
