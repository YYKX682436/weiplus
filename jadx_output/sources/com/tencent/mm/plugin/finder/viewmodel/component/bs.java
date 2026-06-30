package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class bs implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133927e;

    public bs(in5.s0 s0Var, int i17) {
        this.f133926d = s0Var;
        this.f133927e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView o17 = this.f133926d.o();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f133927e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(o17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        o17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(o17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
