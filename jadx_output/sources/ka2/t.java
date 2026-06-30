package ka2;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306048d;

    public t(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI) {
        this.f306048d = finderPoiNormalLbsListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initViews$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306048d;
        ha2.a aVar = finderPoiNormalLbsListUI.f101794u;
        jz5.f0 f0Var = null;
        if (aVar != null) {
            finderPoiNormalLbsListUI.m7(aVar, null, false);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            finderPoiNormalLbsListUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiNormalLbsListUI$initViews$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
