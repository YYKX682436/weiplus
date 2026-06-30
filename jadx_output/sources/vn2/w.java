package vn2;

/* loaded from: classes2.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f438400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f438402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f438403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f438404h;

    public w(android.app.Activity activity, boolean z17, boolean z18, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.qt2 qt2Var) {
        this.f438400d = activity;
        this.f438401e = z17;
        this.f438402f = z18;
        this.f438403g = baseFinderFeed;
        this.f438404h = qt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        android.app.Activity activity = this.f438400d;
        java.lang.String string2 = activity.getResources().getString(com.tencent.mm.R.string.lql);
        boolean z17 = this.f438401e;
        if (z17) {
            string = this.f438402f ? activity.getResources().getString(com.tencent.mm.R.string.lqj) : activity.getResources().getString(com.tencent.mm.R.string.lqk);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = "";
        }
        com.tencent.mm.ui.widget.snackbar.j.c(string2, string, activity, new vn2.v(this.f438401e, this.f438403g, this.f438404h, this.f438402f, this.f438400d), null);
        java.lang.String str = z17 ? "open_topstory_bar" : "set_watch_later_describe";
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("view_id", str);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f438403g;
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        r45.qt2 qt2Var = this.f438404h;
        lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.getString(1) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.getString(2) : null);
        lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
        java.lang.String sessionBuffer = baseFinderFeed.getFeedObject().getFeedObject().getSessionBuffer();
        lVarArr[5] = new jz5.l("session_buffer", sessionBuffer != null ? sessionBuffer : "");
        ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVarArr), 1, true);
    }
}
