package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f115337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f115338e;

    public zf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, int i17) {
        this.f115337d = mgVar;
        this.f115338e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C1 = this.f115337d.C1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f115338e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(C1, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$onTextClick$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        C1.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(C1, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$showStickTopTitleMsg$onTextClick$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
