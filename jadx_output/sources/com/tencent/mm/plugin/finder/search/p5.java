package com.tencent.mm.plugin.finder.search;

/* loaded from: classes5.dex */
public final class p5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u5 f125817d;

    public p5(com.tencent.mm.plugin.finder.search.u5 u5Var) {
        this.f125817d = u5Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/RingtoneSearchSuggestionManager$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f125817d.f125894d.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/search/RingtoneSearchSuggestionManager$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
