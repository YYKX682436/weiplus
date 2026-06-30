package ur2;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.v f430423d;

    public r(ur2.v vVar) {
        this.f430423d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ur2.v vVar = this.f430423d;
        android.view.View view2 = vVar.f430426f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("layout");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null || (str = finderFeedReportObject.getSessionId()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_post_sessionid", str);
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        lVarArr[1] = new jz5.l("enter_scene", java.lang.Integer.valueOf(finderFeedReportObject2 != null ? finderFeedReportObject2.getEnterScene() : 0));
        lVarArr[2] = new jz5.l("if_clk_empty", java.lang.Integer.valueOf(1 ^ (vVar.f430424d ? 1 : 0)));
        hc2.v0.b(view2, "short_title_input_box", "view_clk", 0, kz5.c1.k(lVarArr), null, 20, null);
        if (vVar.f430424d) {
            ry2.j.f401398a.a(vVar.getActivity(), kz5.c0.i(new ry2.f(1, 0, 0, new ur2.s(vVar), null, 22, null), new ry2.f(3, 0, 0, new ur2.t(vVar), null, 22, null), new ry2.f(2, com.tencent.mm.R.color.Red_100, 0, new ur2.u(vVar), null, 20, null)), null);
        } else {
            vVar.P6(0L);
            yz5.a aVar = vVar.f430425e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
