package rh4;

/* loaded from: classes8.dex */
public class e0 implements cl1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView f395715a;

    public e0(com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView) {
        this.f395715a = taskBarSectionWeAppRecyclerView;
    }

    @Override // cl1.k0
    public void a(float f17, float f18) {
        this.f395715a.p1(f17, f18);
    }

    @Override // cl1.k0
    public void b(java.lang.Object obj, int i17) {
        if (obj instanceof cl1.n0) {
            this.f395715a.s1(i17);
        }
    }

    @Override // cl1.k0
    public void c(int i17, int i18, java.lang.Object obj) {
        rh4.j0 j0Var;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_reorder, 1) != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder forbidden");
            return;
        }
        if (i17 == i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder false start = end");
            return;
        }
        boolean z17 = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorderCollection %d", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jacob before reorder showlist ");
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = this.f395715a;
        sb6.append(g(taskBarSectionWeAppRecyclerView.f172711f2));
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob before reorder datalist " + g(taskBarSectionWeAppRecyclerView.f172710e2));
        if (taskBarSectionWeAppRecyclerView instanceof com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = taskBarSectionWeAppRecyclerView.f172710e2.size();
            if (size >= taskBarSectionWeAppRecyclerView.getMaxCount()) {
                size = taskBarSectionWeAppRecyclerView.getMaxCount();
            }
            java.util.List subList = taskBarSectionWeAppRecyclerView.f172710e2.subList(0, size);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) taskBarSectionWeAppRecyclerView.f172711f2;
            if (arrayList2.size() >= taskBarSectionWeAppRecyclerView.getMaxCount()) {
                taskBarSectionWeAppRecyclerView.f172710e2.removeAll(subList);
                taskBarSectionWeAppRecyclerView.f172710e2.addAll(0, arrayList2);
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(taskBarSectionWeAppRecyclerView.f172710e2);
                taskBarSectionWeAppRecyclerView.f172710e2.clear();
                java.util.Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    taskBarSectionWeAppRecyclerView.f172710e2.add((cl1.n0) it.next());
                }
            } else {
                taskBarSectionWeAppRecyclerView.f172710e2 = arrayList2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob after reorder showlist " + g(arrayList2));
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob after reorder datalist " + g(taskBarSectionWeAppRecyclerView.f172710e2));
            for (int i19 = 0; i19 < taskBarSectionWeAppRecyclerView.f172710e2.size(); i19++) {
                com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = ((cl1.n0) taskBarSectionWeAppRecyclerView.f172710e2.get(i19)).f42888a;
                if (localUsageInfo != null) {
                    arrayList.add(localUsageInfo);
                }
            }
            ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
            com.tencent.mm.plugin.appbrand.widget.recent.h a17 = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.a();
            if (a17 != null && !(z17 = a17.Lg(arrayList, 0))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorederCollection failed, needProcessResult: %b");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder false");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob collection reorderCollection result: %b, startPos: %d, endPos: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        cl1.n0 n0Var = (cl1.n0) obj;
        if (i17 != i18 && (j0Var = taskBarSectionWeAppRecyclerView.f172715j2) != null && z17) {
            j0Var.b(n0Var.f42888a, i17, i18);
        }
        taskBarSectionWeAppRecyclerView.m1();
    }

    @Override // cl1.k0
    public void d(java.lang.Object obj, int i17) {
        if (obj instanceof cl1.n0) {
            this.f395715a.s1(i17);
        }
    }

    @Override // cl1.k0
    public void e(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "onAddCollection");
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = this.f395715a;
        if (taskBarSectionWeAppRecyclerView.f172715j2.o()) {
            cl1.n0 n0Var = (cl1.n0) obj;
            boolean g17 = taskBarSectionWeAppRecyclerView.g1(n0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionWeAppRecyclerView", "addStarImpl %d， add:%b", 0, java.lang.Boolean.valueOf(g17));
            if (g17) {
                taskBarSectionWeAppRecyclerView.f172715j2.d(0, n0Var);
            }
        }
    }

    @Override // cl1.k0
    public void f(int i17, boolean z17, boolean z18) {
        this.f395715a.o1(i17, z17, z18);
    }

    public final java.lang.String g(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((cl1.n0) it.next()).f42888a.f76365h + " ";
        }
        return str;
    }
}
