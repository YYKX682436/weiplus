package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class te implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114388d;

    public te(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f114388d = mgVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f114388d;
        if (action == 0) {
            com.tencent.mm.plugin.finder.live.plugin.me meVar = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0;
            mgVar.M1(false);
        } else if ((action == 1 || action == 3) && !mgVar.B && mgVar.H1() && !mgVar.C) {
            mgVar.M1(true);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$commentListView$2$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
