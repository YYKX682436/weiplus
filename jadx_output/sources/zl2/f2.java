package zl2;

/* loaded from: classes2.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f473761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f473762i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473763m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(android.content.Context context, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.view.MenuItem menuItem, java.lang.String str) {
        super(1);
        this.f473757d = context;
        this.f473758e = h0Var;
        this.f473759f = baseFinderFeed;
        this.f473760g = h0Var2;
        this.f473761h = finderObject;
        this.f473762i = menuItem;
        this.f473763m = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "onClick onMenuItemSelect");
        android.content.Context context = this.f473757d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f473759f;
        if (appCompatActivity != null) {
            r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context, 14, r45.pk5.class);
            if (pk5Var != null) {
                pk5Var.f383136h = ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) this.f473760g.f310123d)).f188722e;
            }
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(this.f473761h, 16384);
            a17.setShareScene(baseFinderFeed.getFeedObject().getShareScene());
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            a17.setEcSource(c1Var != null ? c1Var.f328786c3 : null);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            android.view.MenuItem menuItem = this.f473762i;
            kotlin.jvm.internal.o.d(menuItem);
            ((c61.p2) ybVar).Nj(appCompatActivity, userName, (db5.h4) menuItem, a17, new zl2.e2(baseFinderFeed, this.f473763m));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f473758e.f310123d;
        if (k0Var != null) {
            k0Var.u();
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.t1 t1Var = ml2.t1.f327973p;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((b92.d1) zbVar).rj(t1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6());
        return jz5.f0.f302826a;
    }
}
