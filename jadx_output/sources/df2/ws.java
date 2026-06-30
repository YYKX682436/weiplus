package df2;

/* loaded from: classes10.dex */
public final class ws implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.h f231706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f231708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f231709g;

    public ws(dk2.h hVar, df2.lt ltVar, boolean z17, kotlin.jvm.internal.h0 h0Var) {
        this.f231706d = hVar;
        this.f231707e = ltVar;
        this.f231708f = z17;
        this.f231709g = h0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        java.lang.String str2 = df2.lt.W;
        if (itemId != 0) {
            if (menuItem.getItemId() == df2.lt.f230698p0) {
                rl2.f fVar = (rl2.f) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f67001y).getValue();
                synchronized (fVar) {
                    fVar.f397195f.clear();
                    fVar.rawQuery("delete * from " + fVar.getTableName(), new java.lang.String[0]);
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "click dislike banner menu");
        r45.bm1 bm1Var = this.f231706d.f233545h;
        if (bm1Var == null || (str = bm1Var.getString(0)) == null) {
            str = "";
        }
        df2.lt ltVar = this.f231707e;
        dk2.h hVar = this.f231706d;
        ltVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("Finder.LivePromoteBannerController", "dislikeId is empty");
        } else {
            java.lang.String str3 = ((mm2.c1) ltVar.business(mm2.c1.class)).f328852o;
            if (zl2.r4.f473950a.w1()) {
                str3 = xy2.c.e(ltVar.O6());
            }
            new db2.y1(((mm2.e1) ltVar.business(mm2.e1.class)).f328983m, ((mm2.e1) ltVar.business(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) ltVar.business(mm2.e1.class)).f328985o), str3, ((mm2.e1) ltVar.business(mm2.e1.class)).f328992v, str).l().K(df2.rr.f231264a);
            pm0.v.X(new df2.ur(ltVar, str, hVar));
        }
        df2.lt ltVar2 = this.f231707e;
        ltVar2.t7(ltVar2.k7(str, 3));
        if (this.f231708f) {
            df2.lt ltVar3 = this.f231707e;
            ltVar3.t7(ltVar3.k7(str, 5));
        } else {
            df2.lt ltVar4 = this.f231707e;
            ltVar4.t7(ltVar4.k7(str, 4));
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f231707e.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            qo0.c.a(k0Var, qo0.b.J4, null, 2, null);
        }
        ((com.tencent.mm.ui.widget.dialog.k0) this.f231709g.f310123d).u();
    }
}
