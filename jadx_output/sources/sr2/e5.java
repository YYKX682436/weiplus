package sr2;

/* loaded from: classes.dex */
public final class e5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411549d;

    public e5(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411549d = postMainUIC;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10000) {
            com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411549d;
            com.tencent.mm.plugin.finder.post.PostMainUIC.T6(postMainUIC, 1);
            com.tencent.mm.plugin.finder.post.PostMainUIC.P6(postMainUIC);
        }
    }
}
