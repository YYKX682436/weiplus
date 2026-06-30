package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class sf implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.vf f135897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f135898e;

    public sf(com.tencent.mm.plugin.finder.viewmodel.component.vf vfVar, android.widget.LinearLayout linearLayout) {
        this.f135897d = vfVar;
        this.f135898e = linearLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFingerLikeGuideUIC$tryShowDoubleClickFingerLikeTips$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            android.view.View decorView = this.f135897d.getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((android.widget.FrameLayout) decorView).removeView(this.f135898e);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFingerLikeGuideUIC$tryShowDoubleClickFingerLikeTips$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
