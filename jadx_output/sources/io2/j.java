package io2;

/* loaded from: classes2.dex */
public final class j extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io2.p f293480a;

    public j(io2.p pVar) {
        this.f293480a = pVar;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f293480a.f293491a.f293477d, false, 1, null);
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f293480a.a(false);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        this.f293480a.f293491a.f293477d.requestRefresh();
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        io2.p pVar = this.f293480a;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = pVar.f293493c;
        kotlin.jvm.internal.o.f(refreshLoadMoreLayout, "<get-rfLayout>(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout.u(refreshLoadMoreLayout, null, 1, null);
        pVar.a(false);
    }
}
