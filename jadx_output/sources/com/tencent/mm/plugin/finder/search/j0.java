package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class j0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFansSearchUI f125728d;

    public j0(com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI) {
        this.f125728d = finderFansSearchUI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI = this.f125728d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderFansSearchUI.f125536t;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().d();
        finderFansSearchUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
