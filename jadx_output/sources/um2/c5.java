package um2;

/* loaded from: classes3.dex */
public final class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f428746e;

    public c5(um2.x5 x5Var, java.lang.Integer num) {
        this.f428745d = x5Var;
        this.f428746e = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        um2.x5 x5Var = this.f428745d;
        com.tencent.mm.plugin.finder.live.plugin.ya D = x5Var.D();
        if (D != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(D.f115171r, null, 1, null);
        }
        com.tencent.mars.xlog.Log.i(x5Var.f429032f, "scene:" + this.f428746e + ", click cancel");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
