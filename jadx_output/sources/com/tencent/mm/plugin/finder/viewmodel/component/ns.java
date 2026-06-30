package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class ns implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f135350e;

    public ns(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        this.f135349d = s0Var;
        this.f135350e = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView o17 = this.f135349d.o();
        int i17 = this.f135350e.f135618s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(o17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$setLandscapeLiveVideoView$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        o17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(o17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderOrientationUIC$HDRHorizontalLivePreviewLayout$setLandscapeLiveVideoView$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
