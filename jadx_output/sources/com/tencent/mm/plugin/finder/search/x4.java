package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class x4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderTopicSearchUI f125978d;

    public x4(com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI) {
        this.f125978d = finderTopicSearchUI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.finder.search.FinderTopicSearchUI finderTopicSearchUI = this.f125978d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderTopicSearchUI.f125590d;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().d();
        finderTopicSearchUI.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
