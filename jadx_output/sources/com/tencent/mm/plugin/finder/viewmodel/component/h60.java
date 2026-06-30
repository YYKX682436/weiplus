package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h60 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.i60 f134588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f134589e;

    public h60(com.tencent.mm.plugin.finder.viewmodel.component.i60 i60Var, kotlin.jvm.internal.h0 h0Var) {
        this.f134588d = i60Var;
        this.f134589e = h0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.finder.viewmodel.component.i60 i60Var;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC$checkShow$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0 && (view2 = (i60Var = this.f134588d).f134702d) != null) {
            view2.animate().cancel();
            view2.animate().setStartDelay(0L).setDuration(300L).alpha(0.0f).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.g60(view2, this.f134589e, i60Var)).start();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedGuideUIC$checkShow$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
