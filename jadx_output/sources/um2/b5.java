package um2;

/* loaded from: classes3.dex */
public final class b5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f428729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428730f;

    public b5(um2.x5 x5Var, int i17, int i18) {
        this.f428728d = x5Var;
        this.f428729e = i17;
        this.f428730f = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        um2.x5 x5Var = this.f428728d;
        com.tencent.mm.plugin.finder.live.plugin.ya D = x5Var.D();
        if (D != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(D.f115171r, null, 1, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = x5Var.f429075t0;
        if (ag0Var != null) {
            ag0Var.f111884z.k(this.f428729e, this.f428730f, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC$onStatusChanged$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
