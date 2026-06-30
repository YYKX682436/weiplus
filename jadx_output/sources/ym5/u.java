package ym5;

/* loaded from: classes2.dex */
public class u implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f463541d;

    public u(com.tencent.mm.view.RefreshLoadMoreLayout rlLayout) {
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        this.f463541d = rlLayout;
    }

    public void a() {
    }

    @Override // ym5.m1
    public void onChanged() {
        this.f463541d.onChanged();
        a();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        this.f463541d.onItemRangeChanged(i17 + 0, i18);
        a();
    }

    @Override // ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        this.f463541d.onItemRangeInserted(i17 + 0, i18);
        a();
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        this.f463541d.onItemRangeMoved(i17 + 0, i18 + 0, i19);
        a();
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        this.f463541d.onItemRangeRemoved(i17 + 0, i18);
        a();
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463541d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.O(reason);
        a();
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f463541d.onPreFinishLoadMoreSmooth(reason);
        a();
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463541d;
        refreshLoadMoreLayout.getClass();
        refreshLoadMoreLayout.Q(reason);
        a();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        this.f463541d.onItemRangeChanged(i17 + 0, i18, obj);
        a();
    }
}
