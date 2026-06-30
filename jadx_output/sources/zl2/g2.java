package zl2;

/* loaded from: classes2.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f473783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473785h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473786i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, kotlin.jvm.internal.h0 h0Var, android.view.MenuItem menuItem, android.content.Context context, kotlin.jvm.internal.h0 h0Var2, java.lang.String str) {
        super(1);
        this.f473781d = baseFinderFeed;
        this.f473782e = h0Var;
        this.f473783f = menuItem;
        this.f473784g = context;
        this.f473785h = h0Var2;
        this.f473786i = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = this.f473781d.getFeedObject().getFeedObject();
        if (feedObject != null) {
            android.content.Context context = this.f473784g;
            kotlin.jvm.internal.h0 h0Var = this.f473785h;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f473781d;
            java.lang.String str = this.f473786i;
            kotlin.jvm.internal.h0 h0Var2 = this.f473782e;
            o25.y1 y1Var = (o25.y1) h0Var2.f310123d;
            if (y1Var != null) {
                android.view.MenuItem menuItem = this.f473783f;
                kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
                ((com.tencent.mm.pluginsdk.forward.m) y1Var).aj((db5.h4) menuItem, new zl2.f2(context, h0Var, baseFinderFeed, h0Var2, feedObject, menuItem, str));
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f327970o, null, null, null, null, null, false, 126, null);
        }
        return jz5.f0.f302826a;
    }
}
