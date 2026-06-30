package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class jd extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment f174014a;

    public jd(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment) {
        this.f174014a = textStatusLikeListFragment;
    }

    @Override // ym5.q3
    public void b(int i17) {
        pm0.v.X(new com.tencent.mm.plugin.textstatus.ui.id(this.f174014a));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment textStatusLikeListFragment = this.f174014a;
        com.tencent.mm.plugin.textstatus.ui.uc ucVar = textStatusLikeListFragment.f173647r;
        if (ucVar == null) {
            kotlin.jvm.internal.o.o("dataLoader");
            throw null;
        }
        if (ucVar.a()) {
            return;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = textStatusLikeListFragment.f173643n;
        if (refreshLoadMoreLayout != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(refreshLoadMoreLayout, null, 1, null);
        } else {
            kotlin.jvm.internal.o.o("mRefreshLayout");
            throw null;
        }
    }
}
