package sc2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f405955a;

    /* renamed from: b, reason: collision with root package name */
    public int f405956b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f405957c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f405958d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f405959e;

    public final void a(android.content.Context context, boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        r45.xl2 event;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f405957c = context;
        java.lang.String e17 = xy2.c.e(context);
        long id6 = feed.getFeedObject().getId();
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feed.getFeedObject().getFeedObject().getObjectDesc();
        long j17 = (objectDesc == null || (event = objectDesc.getEvent()) == null) ? 0L : event.getLong(0);
        int i17 = z17 ? 3 : 4;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(id6);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        db2.g2 g2Var = new db2.g2(i17, valueOf, e17, valueOf2, nyVar != null ? nyVar.V6() : null);
        g2Var.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        pq5.g l17 = g2Var.l();
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            l17.f((com.tencent.mm.ui.MMActivity) context);
        }
        l17.K(new sc2.c(this, i17, id6));
    }
}
