package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class m80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f135150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135151e;

    public m80(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, boolean z17) {
        this.f135150d = linearLayoutManager;
        this.f135151e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f135150d;
        if (linearLayoutManager != null) {
            int i17 = !this.f135151e ? 1 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC$onActionbarClick$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC$onActionbarClick$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
