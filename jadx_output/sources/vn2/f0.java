package vn2;

/* loaded from: classes2.dex */
public final class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f438270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f438273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f438275i;

    public f0(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, r45.qt2 qt2Var, android.content.Context context, ym5.q1 q1Var) {
        this.f438270d = baseFeedLoader;
        this.f438271e = baseFinderFeed;
        this.f438272f = str;
        this.f438273g = qt2Var;
        this.f438274h = context;
        this.f438275i = q1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        if (menuItem.getItemId() == 1) {
            java.util.List<E> listOfType = this.f438270d.getListOfType(so2.j5.class);
            int indexOf = listOfType.indexOf(this.f438271e);
            if (indexOf >= 0) {
                java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f438271e;
                synchronized (listOfType) {
                    int i18 = 0;
                    for (java.lang.Object obj : listOfType) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        so2.j5 j5Var = (so2.j5) obj;
                        if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == baseFinderFeed.getFeedObject().getId()) {
                            linkedList.add(0, new jz5.l(java.lang.Integer.valueOf(i18), j5Var));
                        }
                        i18 = i19;
                    }
                }
                android.content.Context context = this.f438274h;
                r45.qt2 qt2Var = this.f438273g;
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f438270d;
                ym5.q1 q1Var = this.f438275i;
                java.lang.String str2 = this.f438272f;
                for (jz5.l lVar : linkedList) {
                    kotlin.jvm.internal.o.g(context, "context");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(um3.b.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    pf5.e.launch$default((pf5.e) a17, null, null, new vn2.e0(context, qt2Var, lVar, baseFeedLoader, q1Var, str2, null), 3, null);
                    str2 = str2;
                }
            } else {
                com.tencent.mars.xlog.Log.i(this.f438272f, "deleteSeeLater pos error=" + indexOf + ", feed=" + this.f438271e + ", dataList=" + listOfType);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("view_id", "remove_watch_later_card");
            r45.qt2 qt2Var2 = this.f438273g;
            if (qt2Var2 == null || (str = qt2Var2.getString(1)) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("finder_context_id", str);
            r45.qt2 qt2Var3 = this.f438273g;
            lVarArr[2] = new jz5.l("comment_scene", qt2Var3 != null ? java.lang.Integer.valueOf(qt2Var3.getInteger(5)) : "");
            lVarArr[3] = new jz5.l("feed_id", pm0.v.u(this.f438271e.getItemId()));
            ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
        }
    }
}
