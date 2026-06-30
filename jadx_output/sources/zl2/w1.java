package zl2;

/* loaded from: classes2.dex */
public final class w1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f474012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f474014f;

    public w1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f474012d = baseFinderFeed;
        this.f474013e = context;
        this.f474014f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        boolean z19;
        ec2.d e27;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f490559yh);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f492075f54);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lxl object Status: ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f474012d;
        sb6.append(baseFinderFeed.getFeedObject().getFeedObject().getObjectStatus());
        sb6.append(" isOnlySelfSee=");
        sb6.append(baseFinderFeed.getFeedObject().isOnlySelfSee());
        sb6.append(" isSelf=");
        sb6.append(hc2.b0.i(baseFinderFeed));
        sb6.append(" objectStatus:");
        sb6.append(baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc());
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        boolean isOnlySelfSee = baseFinderFeed.getFeedObject().isOnlySelfSee();
        android.content.Context context = this.f474013e;
        if (isOnlySelfSee && hc2.b0.i(baseFinderFeed)) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            zl2.v1 v1Var = new zl2.v1(g4Var, baseFinderFeed, context, this.f474014f);
            ((c61.p2) ybVar).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            jz5.o b17 = com.tencent.mm.plugin.finder.assist.c5.f102058a.b(context, baseFinderFeed, 2, v1Var);
            java.lang.String str2 = (java.lang.String) b17.f302841d;
            string2 = (java.lang.String) b17.f302842e;
            str = str2;
            z19 = true;
            z18 = true;
        } else {
            if (baseFinderFeed.getFeedObject().checkIsEnableShare(103)) {
                z17 = false;
            } else {
                zl2.q4 q4Var = zl2.q4.f473933a;
                string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3v);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                z17 = true;
            }
            if (baseFinderFeed.getFeedObject().checkIsEnableShare(102)) {
                str = string;
                z18 = false;
            } else {
                zl2.q4 q4Var2 = zl2.q4.f473933a;
                java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3u);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                str = string3;
                z18 = true;
            }
            z19 = z17;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        if (r4Var.n(liveInfo != null ? liveInfo.getInteger(54) : 0)) {
            g4Var.j(102, str, com.tencent.mm.R.raw.finder_icons_filled_share, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m), z18);
            g4Var.j(103, string2, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z19);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f328062m;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            boolean z27 = context instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z27) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
            ((b92.d1) zbVar).sj(u1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a(appCompatActivity).c(zy2.ra.class))).V6());
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var2 = ml2.u1.f328065n;
            if (!z27) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((b92.d1) zbVar2).sj(u1Var2, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a(appCompatActivity).c(zy2.ra.class))).V6());
        }
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        if (Sj != null) {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            long itemId = baseFinderFeed.getItemId();
            int i17 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).f135380n;
            ((c61.p2) ybVar2).getClass();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bj(itemId, i17);
        }
        zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        if (Sj2 == null || (e27 = zy2.ra.e2(Sj2, 0, 1, null)) == null) {
            return;
        }
        e27.a(new ec2.a(16, baseFinderFeed.getItemId(), baseFinderFeed.w()));
    }
}
