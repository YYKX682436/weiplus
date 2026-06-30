package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dm0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.km0 f112305d;

    public dm0(com.tencent.mm.plugin.finder.live.plugin.km0 km0Var) {
        this.f112305d = km0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWishBannerPlugin$initPlugin$5$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 1) {
            this.f112305d.f113279p.performClick();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWishBannerPlugin$initPlugin$5$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
