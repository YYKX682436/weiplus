package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b10 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f133823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f133825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f133826g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f133827h;

    public b10(boolean z17, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f133823d = z17;
        this.f133824e = s0Var;
        this.f133825f = t10Var;
        this.f133826g = mMActivity;
        this.f133827h = baseFinderFeed;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.ui.MMActivity mMActivity = this.f133826g;
        boolean z17 = this.f133823d;
        if (integer != 0) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "modifyFeedBullet: isClose = " + z17 + ", resultCode = " + ret.getInteger(1));
            db5.t7.h(mMActivity, mMActivity.getResources().getString(z17 ? com.tencent.mm.R.string.f491361cv2 : com.tencent.mm.R.string.cwd));
            return;
        }
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "modifyFeedBullet: isClose = " + z17 + ", success");
        in5.s0 s0Var = this.f133824e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
        lVarArr[1] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
        lVarArr[2] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133825f.f135959e;
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        lVarArr[4] = new jz5.l("playpercent", java.lang.Integer.valueOf(finderVideoLayout != null ? finderVideoLayout.getPlayPercent() : 0));
        lVarArr[5] = new jz5.l("login_mode", 1);
        lVarArr[6] = new jz5.l("screen_type", 2);
        lVarArr[7] = new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, java.lang.Integer.valueOf(!z17 ? 1 : 0));
        ((cy1.a) rVar).yj("finder_barrage_comments_switch", null, kz5.c1.k(lVarArr), 1, false);
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.a10(this.f133823d, this.f133827h, this.f133825f, this.f133824e, this.f133826g));
        db5.t7.h(mMActivity, mMActivity.getResources().getString(z17 ? com.tencent.mm.R.string.f491362cv3 : com.tencent.mm.R.string.cwe));
    }
}
