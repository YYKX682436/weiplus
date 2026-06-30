package gs2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gs2.c f275072a = new gs2.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f275073b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f275074c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f275075d = kz5.c0.i(gs2.a.E, gs2.a.F);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f275076e = kz5.b1.e(new jz5.l(gs2.a.f275055n, kz5.b0.c(gs2.a.f275057p)));

    public final android.view.View a(android.view.View view, int i17) {
        if (view.hashCode() == i17) {
            return view;
        }
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            kotlin.jvm.internal.o.d(childAt);
            android.view.View a17 = a(childAt, i17);
            if (a17 != null) {
                return a17;
            }
        }
        return null;
    }

    public final boolean b(gs2.a aVar, gs2.a aVar2) {
        java.util.List list = (java.util.List) f275076e.get(aVar);
        if (list != null) {
            return list.contains(aVar2);
        }
        return false;
    }

    public final boolean c(int i17, gs2.a priority) {
        kotlin.jvm.internal.o.g(priority, "priority");
        if (f275075d.contains(priority)) {
            com.tencent.mars.xlog.Log.i("FinderFeedViewPriorityManager", "[isPriorityOk] holder:" + i17 + " priority:" + priority + " isPriorityWhite:true");
            return true;
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K0().r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("FinderFeedViewPriorityManager", "[isPriorityOk] use backend priority, return true");
            return true;
        }
        gs2.a aVar = (gs2.a) f275073b.get(java.lang.Integer.valueOf(i17));
        if (aVar == null) {
            aVar = gs2.a.D;
        }
        if (gs2.a.D != aVar && priority.compareTo(aVar) > 0) {
            return b(aVar, priority);
        }
        return true;
    }

    public final void d(int i17, int i18, gs2.a aVar, jz5.l lVar, int i19) {
        com.tencent.mars.xlog.Log.i("FinderFeedViewPriorityManager", "[setPriorityFlag] " + i19 + ", holder:" + i17 + " viewHash:" + i18 + " priority:" + aVar + " config.first:" + lVar.f302833d + " config.second:" + lVar.f302834e);
    }

    public final void e(in5.s0 holder, android.view.View view, gs2.a priority, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(priority, "priority");
        if (f275075d.contains(priority)) {
            com.tencent.mars.xlog.Log.i("FinderFeedViewPriorityManager", "[setPriorityFlag] priority:" + priority + " isPriorityWhite");
            return;
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K0().r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("FinderFeedViewPriorityManager", "[setPriorityFlag] use backend priority, return");
            return;
        }
        if (view.getVisibility() == 0 || z17) {
            int hashCode = view.hashCode();
            int hashCode2 = holder.hashCode();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f275073b;
            gs2.a aVar = (gs2.a) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode2));
            if (aVar == null) {
                aVar = gs2.a.D;
            }
            if (priority.compareTo(aVar) < 0) {
                concurrentHashMap.put(java.lang.Integer.valueOf(hashCode2), priority);
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f275074c;
            java.lang.Object obj = concurrentHashMap2.get(java.lang.Integer.valueOf(hashCode2));
            if (obj == null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(java.lang.Integer.valueOf(hashCode));
                jz5.l lVar = new jz5.l(priority, linkedList);
                concurrentHashMap2.put(java.lang.Integer.valueOf(hashCode2), lVar);
                d(hashCode2, hashCode, priority, lVar, 1);
                return;
            }
            jz5.l lVar2 = (jz5.l) obj;
            java.lang.Object obj2 = lVar2.f302833d;
            java.lang.Object obj3 = lVar2.f302834e;
            if (priority == obj2) {
                java.util.LinkedList linkedList2 = (java.util.LinkedList) obj3;
                if (!linkedList2.contains(java.lang.Integer.valueOf(hashCode))) {
                    linkedList2.add(java.lang.Integer.valueOf(hashCode));
                }
                d(hashCode2, hashCode, priority, lVar2, 3);
                return;
            }
            if (priority.compareTo((gs2.a) obj2) >= 0) {
                if (b((gs2.a) obj2, priority)) {
                    java.util.LinkedList linkedList3 = (java.util.LinkedList) obj3;
                    if (linkedList3.contains(java.lang.Integer.valueOf(hashCode))) {
                        return;
                    }
                    linkedList3.add(java.lang.Integer.valueOf(hashCode));
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/priority/FinderFeedViewPriorityManager", "setPriorityFlag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/priority/FinderFeedViewPriority;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/priority/FinderFeedViewPriorityManager", "setPriorityFlag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/priority/FinderFeedViewPriority;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            linkedList4.add(java.lang.Integer.valueOf(hashCode));
            jz5.l lVar3 = new jz5.l(priority, linkedList4);
            boolean b17 = b(priority, priority);
            java.util.Iterator it = ((java.util.LinkedList) obj3).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (b17) {
                    ((java.util.LinkedList) lVar3.f302834e).add(java.lang.Integer.valueOf(intValue));
                } else {
                    gs2.c cVar = f275072a;
                    android.view.View itemView = holder.itemView;
                    kotlin.jvm.internal.o.f(itemView, "itemView");
                    android.view.View a17 = cVar.a(itemView, intValue);
                    if (a17 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/priority/FinderFeedViewPriorityManager", "setPriorityFlag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/priority/FinderFeedViewPriority;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(a17, "com/tencent/mm/plugin/finder/priority/FinderFeedViewPriorityManager", "setPriorityFlag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/priority/FinderFeedViewPriority;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            concurrentHashMap2.put(java.lang.Integer.valueOf(hashCode2), lVar3);
            d(hashCode2, hashCode, priority, lVar3, 2);
        }
    }
}
