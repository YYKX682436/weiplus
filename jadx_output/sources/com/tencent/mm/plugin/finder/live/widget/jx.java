package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class jx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118786e;

    public jx(com.tencent.mm.plugin.finder.live.widget.rx rxVar, int i17) {
        this.f118785d = rxVar;
        this.f118786e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f118785d.N;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("timeRv");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f118786e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$onCardSelected$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$onCardSelected$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
