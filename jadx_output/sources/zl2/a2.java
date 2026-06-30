package zl2;

/* loaded from: classes2.dex */
public final class a2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473643g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473644h;

    public a2(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f473640d = context;
        this.f473641e = baseFinderFeed;
        this.f473642f = str;
        this.f473643g = h0Var;
        this.f473644h = h0Var2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        android.content.Context context = this.f473640d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f473641e;
        if (valueOf != null && valueOf.intValue() == 103) {
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            c61.ub.I2((c61.ub) c17, (com.tencent.mm.ui.MMActivity) context, this.f473641e, null, 0, 0, 28, null);
            vs5.a aVar = vs5.a.f439924a;
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            aVar.a(java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null), java.lang.String.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId()), baseFinderFeed.getFeedObject().getFeedObject().getUsername(), this.f473642f, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.t1 t1Var = ml2.t1.f327964m;
            androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) context;
            kotlin.jvm.internal.o.g(activity, "activity");
            ((b92.d1) zbVar).rj(t1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6());
        } else if (valueOf != null && valueOf.intValue() == 102) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(baseFinderFeed.getFeedObject().getFeedObject(), 16384);
            a17.setShareScene(baseFinderFeed.getFeedObject().getShareScene());
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            a17.setEcSource(c1Var != null ? c1Var.f328786c3 : null);
            android.os.Bundle bundle = new android.os.Bundle();
            o25.y1 y1Var = (o25.y1) this.f473644h.f310123d;
            bundle.putInt("quick_share_item_count", y1Var != null ? ((com.tencent.mm.pluginsdk.forward.m) y1Var).f188722e : 0);
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.t1 t1Var2 = ml2.t1.f327954i;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((b92.d1) zbVar2).rj(t1Var2, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6());
            i95.m c18 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c61.ub.ah((c61.ub) c18, (com.tencent.mm.ui.MMActivity) context, a17, bundle, 0, new zl2.z1(baseFinderFeed, this.f473642f), 8, null);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f473643g.f310123d;
        if (k0Var != null) {
            k0Var.u();
        }
    }
}
