package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class r80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f135777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f135778e;

    public r80(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17) {
        this.f135777d = linearLayoutManager;
        this.f135778e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f135777d;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(this.f135778e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC$onUserVisibleFocused$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC$onUserVisibleFocused$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
