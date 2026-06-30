package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class kx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f118866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f118867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f118868g;

    public kx(com.tencent.mm.plugin.finder.live.widget.rx rxVar, int i17, int i18, int i19) {
        this.f118865d = rxVar;
        this.f118866e = i17;
        this.f118867f = i18;
        this.f118868g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f118865d.N;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("timeRv");
            throw null;
        }
        int i17 = this.f118866e - (this.f118867f - this.f118868g);
        if (i17 < 0) {
            i17 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$onCardSelected$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskPanel$onCardSelected$1$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
