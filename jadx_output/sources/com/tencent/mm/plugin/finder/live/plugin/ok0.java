package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ok0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.vk0 f113763d;

    public ok0(com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var) {
        this.f113763d = vk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$newCommentTipsView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.vk0 vk0Var = this.f113763d;
        com.tencent.mm.view.recyclerview.WxRecyclerView u17 = vk0Var.u1();
        int itemCount = vk0Var.t1().getItemCount() - 1;
        if (itemCount < 0) {
            itemCount = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(itemCount));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(u17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$newCommentTipsView$2$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
        u17.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$newCommentTipsView$2$1$1", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
        vk0Var.f114785q = vk0Var.t1().getItemCount() - 1;
        vk0Var.f114791w = 0;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin$newCommentTipsView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
