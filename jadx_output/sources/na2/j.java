package na2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.k f335964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f335965e;

    public j(na2.k kVar, kotlin.jvm.internal.h0 h0Var) {
        this.f335964d = kVar;
        this.f335965e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("toggleFavorite: currentFavStatus=");
        na2.k kVar = this.f335964d;
        sb6.append(kVar.f335970n);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", sb6.toString());
        int i17 = kVar.f335970n;
        if (i17 == 1) {
            kVar.V6(2);
            new db2.i0(kVar.f335971o, 1).l();
        } else if (i17 == 2) {
            kVar.V6(1);
            new db2.i0(kVar.f335971o, 2).l();
        }
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
        java.util.Map map = (java.util.Map) this.f335965e.f310123d;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("shoot_status", java.lang.Integer.valueOf(kVar.f335970n));
        android.widget.TextView textView = kVar.f335966g;
        lVarArr[1] = new jz5.l("cluster_name", textView != null ? textView.getText() : null);
        android.widget.TextView textView2 = kVar.f335967h;
        lVarArr[2] = new jz5.l("cluster_reason_recommendation", textView2 != null ? textView2.getText() : null);
        d2Var.h(activity, "cluster_shoot", "view_clk", false, kz5.c1.m(map, kz5.c1.k(lVarArr)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
