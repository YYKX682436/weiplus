package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tk implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f119892d;

    public tk(com.tencent.mm.plugin.finder.live.widget.hl hlVar) {
        this.f119892d = hlVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayPagWidget$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f119892d.f118574b.v1();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGiftPlayPagWidget$init$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
