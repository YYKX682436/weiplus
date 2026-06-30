package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a1 f115008d;

    public x0(com.tencent.mm.plugin.finder.live.plugin.a1 a1Var) {
        this.f115008d = a1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAigcGiftCompletionNotificationPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f115008d.K0(8);
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAigcGiftCompletionNotificationPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
