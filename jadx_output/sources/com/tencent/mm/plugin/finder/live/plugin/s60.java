package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s60 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w60 f114225d;

    public s60(com.tencent.mm.plugin.finder.live.plugin.w60 w60Var) {
        this.f114225d = w60Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubbleStatusPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.finder.live.plugin.w60 w60Var = this.f114225d;
        com.tencent.mars.xlog.Log.i(w60Var.f114878q, "[onTouch] touch to dimiss");
        w60Var.K0(8);
        boolean z17 = motionEvent.getAction() != 2;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubbleStatusPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
