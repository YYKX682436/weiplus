package cu2;

/* loaded from: classes2.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f222408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f222409e;

    public i(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, zy2.gc gcVar) {
        this.f222408d = baseFinderFeed;
        this.f222409e = gcVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0 b0Var = hb2.b0.f280025e;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f222408d;
            b0Var.o(baseFinderFeed.getFeedObject().getId(), baseFinderFeed.getFeedObject().getFeedObject(), baseFinderFeed.getFeedObject().getObjectNonceId(), r45.uh2.CloseComment, this.f222409e);
        }
    }
}
