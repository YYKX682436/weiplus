package io2;

/* loaded from: classes2.dex */
public final class o implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.p f293490d;

    public o(io2.p pVar) {
        this.f293490d = pVar;
    }

    @Override // ym5.m1
    public void onChanged() {
        this.f293490d.f293493c.onChanged();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        io2.p pVar = this.f293490d;
        pVar.f293493c.onItemRangeChanged(i17 + pVar.f293491a.c().a0(), i18);
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        io2.p pVar = this.f293490d;
        pVar.f293493c.onItemRangeInserted(i17 + pVar.f293491a.c().a0(), i18);
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        io2.p pVar = this.f293490d;
        pVar.f293493c.onItemRangeMoved(i17 + pVar.f293491a.c().a0(), i18 + pVar.f293491a.c().a0(), i19);
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        io2.p pVar = this.f293490d;
        pVar.f293493c.onItemRangeRemoved(i17 + pVar.f293491a.c().a0(), i18);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f293490d.f293493c;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.O(reason);
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f293490d.f293493c.onPreFinishLoadMoreSmooth(reason);
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f293490d.f293493c;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.Q(reason);
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        io2.p pVar = this.f293490d;
        pVar.f293493c.onItemRangeChanged(i17 + pVar.f293491a.c().a0(), i18, obj);
    }
}
