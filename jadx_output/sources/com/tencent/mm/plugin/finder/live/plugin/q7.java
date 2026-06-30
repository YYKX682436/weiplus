package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f113965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113966e;

    public q7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var, int i17) {
        this.f113965d = x7Var;
        this.f113966e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        this.f113965d.f115040t.f();
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f113965d;
        int i17 = this.f113966e;
        java.util.List list = ((mm2.o4) x7Var.P0(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (true ^ ((km2.q) obj).f309177h) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.List list2 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list2, "<get-linkMicUserList>(...)");
        synchronized (list2) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (((km2.q) obj2).f309177h) {
                    arrayList2.add(obj2);
                }
            }
        }
        java.util.List list3 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list3, "<get-audienceLinkMicUserList>(...)");
        synchronized (list3) {
            arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list3) {
                if (!kotlin.jvm.internal.o.b(((km2.q) obj3).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList3.add(obj3);
                }
            }
        }
        int size = arrayList3.size();
        int size2 = ((mm2.o4) x7Var.P0(mm2.o4.class)).f329324s.size();
        if (i17 >= 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = x7Var.f115038r;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(recyclerView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        if (arrayList.isEmpty() && size == 0 && (!arrayList2.isEmpty() || size2 > 0)) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = x7Var.f115038r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList5.add(1);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(recyclerView2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView2.c1(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        if ((!arrayList.isEmpty() || size > 0) && arrayList2.isEmpty() && size2 == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = x7Var.f115038r;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(recyclerView3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView3.c1(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(recyclerView3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLinkListPlugin", "smartScroll", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
