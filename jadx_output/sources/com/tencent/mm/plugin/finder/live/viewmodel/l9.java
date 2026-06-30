package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class l9 implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117230d;

    public l9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        this.f117230d = v9Var;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView p07, android.view.MotionEvent p17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        arrayList.add(p17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC$onCreate$2$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC$onCreate$2$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117230d;
        v9Var.f117493o[0] = (int) motionEvent.getRawX();
        v9Var.f117493o[1] = (int) motionEvent.getRawY();
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
