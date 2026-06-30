package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u20 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i30 f114512d;

    public u20(com.tencent.mm.plugin.finder.live.plugin.i30 i30Var) {
        this.f114512d = i30Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f114512d.u1();
        boolean z17 = motionEvent.getAction() != 2;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
