package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f114202d;

    public s(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var) {
        this.f114202d = q0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoPlugin$enableTouchEvent$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = this.f114202d;
        if (valueOf != null && valueOf.intValue() == 0) {
            q0Var.f113941q = android.os.SystemClock.elapsedRealtime();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (q0Var.f113941q > 0 && android.os.SystemClock.elapsedRealtime() - q0Var.f113941q <= android.view.ViewConfiguration.getTapTimeout() && (x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) q0Var.X0(com.tencent.mm.plugin.finder.live.plugin.x80.class)) != null) {
                com.tencent.mm.plugin.finder.live.plugin.x80.A1(x80Var, null, motionEvent, 1, null);
            }
            q0Var.f113941q = -1L;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoPlugin$enableTouchEvent$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
