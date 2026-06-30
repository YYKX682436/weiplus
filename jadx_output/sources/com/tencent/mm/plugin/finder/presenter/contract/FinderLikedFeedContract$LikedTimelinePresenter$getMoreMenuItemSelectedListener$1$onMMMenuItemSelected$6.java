package com.tencent.mm.plugin.finder.presenter.contract;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "userName", "Ljz5/f0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter f122690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f122691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f122692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f122693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$6(com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, android.view.MenuItem menuItem, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        super(1);
        this.f122690d = likedTimelinePresenter;
        this.f122691e = menuItem;
        this.f122692f = baseFinderFeed;
        this.f122693g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f122690d;
        com.tencent.mm.ui.MMActivity mMActivity = likedTimelinePresenter.f122643d;
        db5.h4 h4Var = (db5.h4) this.f122691e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f122692f;
        ((c61.p2) ybVar).Mj(mMActivity, userName, h4Var, baseFinderFeed.getFeedObject(), null);
        com.tencent.mm.plugin.finder.report.x3.f125432a.e(likedTimelinePresenter.f122643d, userName, baseFinderFeed.getItemId(), this.f122693g);
        return jz5.f0.f302826a;
    }
}
