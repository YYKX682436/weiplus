package pt2;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI f358253d;

    public m(com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI finderSearchBaseUI) {
        this.f358253d = finderSearchBaseUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f358253d.onClickBackBtn(view);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initSearchView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
