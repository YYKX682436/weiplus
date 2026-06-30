package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rk0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vk0 f114156d;

    public rk0(com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var) {
        this.f114156d = vk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var = this.f114156d;
        com.tencent.mm.view.recyclerview.WxRecyclerView u17 = vk0Var.u1();
        int itemCount = vk0Var.t1().getItemCount() - 1;
        if (itemCount < 0) {
            itemCount = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(itemCount));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$onAddedInViewPager$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        u17.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$onAddedInViewPager$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        vk0Var.f114791w = 0;
    }
}
