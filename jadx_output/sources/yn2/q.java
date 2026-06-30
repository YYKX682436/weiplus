package yn2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.r f464004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn2.c f464005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f464006f;

    public q(yn2.r rVar, zn2.c cVar, int i17) {
        this.f464004d = rVar;
        this.f464005e = cVar;
        this.f464006f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/SeeLaterCardConvert$setRecommendInfo$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("view_id", "remove_watch_later_card_icon");
        yn2.r rVar2 = this.f464004d;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = rVar2.f464008e;
        if (eVar == null || (str = ((xn2.p0) eVar).f455544b) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        lVarArr[2] = new jz5.l("comment_scene", 281);
        zn2.c feed = this.f464005e;
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(feed.getItemId()));
        lVarArr[4] = new jz5.l("session_buffer", feed.getFeedObject().getFeedObject().getSessionBuffer());
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar2 = rVar2.f464008e;
        if (eVar2 != null) {
            int i17 = this.f464006f;
            xn2.p0 p0Var = (xn2.p0) eVar2;
            kotlin.jvm.internal.o.g(feed, "feed");
            vn2.u0 u0Var = vn2.u0.f438387a;
            r45.qt2 l17 = p0Var.l();
            xn2.b bVar = p0Var.f455547e;
            ym5.q1 a17 = bVar != null ? ((xn2.f1) bVar).a() : null;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader loader = p0Var.j();
            java.lang.String tag = p0Var.f455545c;
            kotlin.jvm.internal.o.g(tag, "tag");
            android.app.Activity context = p0Var.f455543a;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(loader, "loader");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
            k0Var.f211872n = new vn2.x(context);
            k0Var.f211881s = new vn2.y(tag, context, l17, a17, loader, i17, feed);
            k0Var.v();
            dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr2 = new jz5.l[4];
            lVarArr2[0] = new jz5.l("view_id", "remove_watch_later_card");
            if (l17 == null || (str2 = l17.getString(1)) == null) {
                str2 = "";
            }
            lVarArr2[1] = new jz5.l("finder_context_id", str2);
            lVarArr2[2] = new jz5.l("comment_scene", l17 != null ? java.lang.Integer.valueOf(l17.getInteger(5)) : "");
            lVarArr2[3] = new jz5.l("feed_id", pm0.v.u(feed.getItemId()));
            ((cy1.a) rVar3).yj("view_exp", null, kz5.c1.k(lVarArr2), 1, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/SeeLaterCardConvert$setRecommendInfo$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
