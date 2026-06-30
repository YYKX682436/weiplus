package pt2;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI f358251d;

    public k(com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI finderSearchBaseUI) {
        this.f358251d = finderSearchBaseUI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI finderSearchBaseUI = this.f358251d;
        finderSearchBaseUI.f7().getFtsEditText().d();
        finderSearchBaseUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
