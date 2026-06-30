package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y6 implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d7 f120418d;

    public y6(com.tencent.mm.plugin.finder.live.widget.d7 d7Var) {
        this.f120418d = d7Var;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView p07, android.view.MotionEvent p17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        arrayList.add(p17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget$initView$3$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget$initView$3$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var = this.f120418d;
        d7Var.f118082p1[0] = (int) motionEvent.getRawX();
        d7Var.f118082p1[1] = (int) motionEvent.getRawY();
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }
}
