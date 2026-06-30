package xn2;

/* loaded from: classes2.dex */
public final class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f455541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f455542f;

    public p(xn2.p0 p0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f455540d = p0Var;
        this.f455541e = baseFinderFeed;
        this.f455542f = s0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 99) {
            xn2.p0 p0Var = this.f455540d;
            java.util.List<E> listOfType = p0Var.j().getListOfType(so2.j5.class);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f455541e;
            int indexOf = listOfType.indexOf(baseFinderFeed);
            if (indexOf >= 0) {
                bd2.r.f19284a.e(p0Var.f455543a, baseFinderFeed.getFeedObject().getId(), baseFinderFeed.w(), baseFinderFeed.getFeedObject().getObjectNonceId(), baseFinderFeed.getFeedObject().isLiveFeed(), this.f455542f);
                return;
            }
            com.tencent.mars.xlog.Log.i(p0Var.f455545c, "[not interested] pos error=" + indexOf + ", feed=" + baseFinderFeed + ", dataList=" + listOfType);
        }
    }
}
