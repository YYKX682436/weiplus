package cu2;

/* loaded from: classes2.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f222416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f222417e;

    public l(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, zy2.gc gcVar) {
        this.f222416d = finderItem;
        this.f222417e = gcVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0 b0Var = hb2.b0.f280025e;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f222416d;
            b0Var.o(finderItem.getId(), finderItem.getFeedObject(), finderItem.getObjectNonceId(), r45.uh2.OpenComment, this.f222417e);
        }
    }
}
