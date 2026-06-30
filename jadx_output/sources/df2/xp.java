package df2;

/* loaded from: classes3.dex */
public final class xp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.yp f231793d;

    public xp(df2.yp ypVar) {
        this.f231793d = ypVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePostStrengthenController$initStrengthenPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView finderLiveLocationView = (com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView) this.f231793d.S6(com.tencent.mm.R.id.l0q);
        if (finderLiveLocationView != null) {
            finderLiveLocationView.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePostStrengthenController$initStrengthenPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
