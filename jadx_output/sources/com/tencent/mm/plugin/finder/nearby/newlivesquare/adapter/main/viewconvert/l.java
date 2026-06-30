package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l f121762d = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert$bindAggregationCardRecyclerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
