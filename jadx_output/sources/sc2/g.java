package sc2;

/* loaded from: classes2.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.i f405896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405897e;

    public g(sc2.i iVar, android.content.Context context) {
        this.f405896d = iVar;
        this.f405897e = context;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        sc2.i iVar;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        r45.xl2 event;
        if (menuItem.getItemId() != 2000 || (baseFinderFeed = (iVar = this.f405896d).f405959e) == null) {
            return;
        }
        iVar.getClass();
        android.content.Context context = this.f405897e;
        java.lang.String e17 = xy2.c.e(context);
        long id6 = baseFinderFeed.getFeedObject().getId();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
        long j17 = (objectDesc == null || (event = objectDesc.getEvent()) == null) ? 0L : event.getLong(0);
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(id6);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        db2.g2 g2Var = new db2.g2(2, valueOf, e17, valueOf2, nyVar != null ? nyVar.V6() : null);
        g2Var.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        pq5.g l17 = g2Var.l();
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            l17.f((com.tencent.mm.ui.MMActivity) context);
        }
        l17.K(new sc2.e(baseFinderFeed, j17, context));
    }
}
