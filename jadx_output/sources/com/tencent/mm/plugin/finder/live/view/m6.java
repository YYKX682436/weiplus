package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class m6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.r6 f116475d;

    public m6(com.tencent.mm.plugin.finder.live.view.r6 r6Var) {
        this.f116475d = r6Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f116475d.f116631a.onTouchEvent(motionEvent);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/FinderLiveMicCenterView$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
