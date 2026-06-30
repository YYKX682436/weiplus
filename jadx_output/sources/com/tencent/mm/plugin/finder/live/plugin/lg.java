package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f113394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113395e;

    public lg(java.util.List list, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f113394d = list;
        this.f113395e = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f113394d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f113395e;
        synchronized (list) {
            if (kotlin.jvm.internal.o.b(((mm2.c1) mgVar.P0(mm2.c1.class)).G3, java.lang.Boolean.FALSE)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (kz5.z.F((int[]) ((jz5.n) mgVar.V).getValue(), ((dk2.zf) obj).getType())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.addAll(list);
            }
        }
        this.f113395e.R1(arrayList, true);
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = this.f113395e;
        mgVar2.I = ((mm2.x4) mgVar2.P0(mm2.x4.class)).f329539t;
        boolean z17 = ((mm2.x4) this.f113395e.P0(mm2.x4.class)).f329538s;
        int i17 = ((mm2.x4) this.f113395e.P0(mm2.x4.class)).f329537r;
        long j17 = ((mm2.c1) this.f113395e.P0(mm2.c1.class)).f328775a2 - this.f113395e.I;
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "[updateMessagesOnViewAttach] readCount:" + this.f113395e.I + ", unreadCount" + j17 + ",reachLast" + z17 + ", position" + i17);
        if (this.f113395e.D.getItemCount() > 0) {
            if (z17) {
                this.f113395e.C1().post(new com.tencent.mm.plugin.finder.live.plugin.kg(this.f113395e));
                return;
            }
            if (i17 < 0) {
                i17 = 0;
            } else if (i17 >= this.f113395e.D.getItemCount()) {
                i17 = this.f113395e.D.getItemCount() - 1;
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView C1 = this.f113395e.C1();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(C1, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateMessagesOnViewAttach$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            C1.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(C1, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateMessagesOnViewAttach$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            this.f113395e.N1(j17);
        }
    }
}
