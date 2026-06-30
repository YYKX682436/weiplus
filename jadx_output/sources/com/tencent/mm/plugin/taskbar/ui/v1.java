package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class v1 implements rh4.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.w1 f172736a;

    public v1(com.tencent.mm.plugin.taskbar.ui.w1 w1Var) {
        this.f172736a = w1Var;
    }

    @Override // rh4.j0
    public boolean a(float f17, float f18) {
        rh4.m mVar;
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        rh4.o oVar = w1Var.f172743e.f172532l2;
        if (oVar != null) {
            return oVar.q(f17, f18);
        }
        if (!o() || (mVar = w1Var.f172743e.f172533m2) == null) {
            return false;
        }
        return mVar.q(f17, f18);
    }

    @Override // rh4.j0
    public void b(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo, int i17, int i18) {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = this.f172736a.f172743e.f172523c2;
        if (o2Var == null) {
            return;
        }
        o2Var.k(localUsageInfo, i17, i18, true);
    }

    @Override // rh4.j0
    public void c(cl1.n0 n0Var, boolean z17) {
    }

    @Override // rh4.j0
    public void d(int i17, cl1.n0 n0Var) {
        this.f172736a.f172743e.D(true, n0Var, i17, true, 1);
    }

    @Override // rh4.j0
    public void e(int i17, cl1.n0 newItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "notifyMyWeAppChanged %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        int indexOf = w1Var.f172743e.f172525e2.indexOf(2);
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = w1Var.f172743e;
        if (indexOf != -1) {
            rh4.o oVar = taskBarView.f172532l2;
            if (oVar != null) {
                kotlin.jvm.internal.o.g(newItem, "newItem");
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView recyclerView = oVar.getRecyclerView();
                kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView");
                com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView taskBarSectionMyWeAppRecyclerView = (com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView) recyclerView;
                int size = taskBarSectionMyWeAppRecyclerView.getDataList().size();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted showlist filled %s", rh4.n0.k(taskBarSectionMyWeAppRecyclerView.getShowList()));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted %d %d %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size), newItem.f42888a.f76365h, rh4.n0.k(taskBarSectionMyWeAppRecyclerView.getDataList()));
                int i18 = 0;
                while (true) {
                    if (i18 >= taskBarSectionMyWeAppRecyclerView.getShowList().size()) {
                        i18 = -1;
                        break;
                    } else if (newItem.a(taskBarSectionMyWeAppRecyclerView.getShowList().get(i18))) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 != -1) {
                    taskBarSectionMyWeAppRecyclerView.getShowList().remove(i18);
                    taskBarSectionMyWeAppRecyclerView.getDataList().remove(i18);
                    taskBarSectionMyWeAppRecyclerView.getDataList().add(newItem);
                    int size2 = taskBarSectionMyWeAppRecyclerView.getShowList().size();
                    taskBarSectionMyWeAppRecyclerView.getShowList().add(taskBarSectionMyWeAppRecyclerView.getDataList().get(size2));
                    taskBarSectionMyWeAppRecyclerView.f172712g2.notifyItemRemoved(i18);
                    taskBarSectionMyWeAppRecyclerView.f172712g2.notifyItemInserted(size2);
                } else {
                    int size3 = taskBarSectionMyWeAppRecyclerView.getShowList().size();
                    if (size3 < 8) {
                        taskBarSectionMyWeAppRecyclerView.getShowList().add(size3, newItem);
                        taskBarSectionMyWeAppRecyclerView.f172712g2.notifyItemInserted(size3);
                    }
                    int i19 = 0;
                    while (true) {
                        if (i19 >= taskBarSectionMyWeAppRecyclerView.getDataList().size()) {
                            break;
                        }
                        if (newItem.a(taskBarSectionMyWeAppRecyclerView.getDataList().get(i19))) {
                            taskBarSectionMyWeAppRecyclerView.getDataList().remove(i19);
                            break;
                        }
                        i19++;
                    }
                    taskBarSectionMyWeAppRecyclerView.getDataList().add(newItem);
                    if (taskBarSectionMyWeAppRecyclerView.getShowList().size() > 8) {
                        taskBarSectionMyWeAppRecyclerView.getShowList().remove(8);
                        taskBarSectionMyWeAppRecyclerView.f172712g2.notifyItemRemoved(7);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted showlist filled %s", rh4.n0.k(taskBarSectionMyWeAppRecyclerView.getShowList()));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopSectionWeAppRecyclerView", "notifyItemInserted filled %s", rh4.n0.k(taskBarSectionMyWeAppRecyclerView.getDataList()));
                androidx.recyclerview.widget.f2 f2Var = taskBarSectionMyWeAppRecyclerView.f172712g2;
                int itemCount = f2Var.getItemCount();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                f2Var.notifyItemRangeChanged(0, itemCount, bool);
                oVar.n();
                if (((com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView) oVar.getRecyclerView()).getDataList().size() > 8) {
                    lh4.b callback = oVar.getCallback();
                    java.util.List<cl1.n0> dataList = ((com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView) oVar.getRecyclerView()).getDataList();
                    kotlin.jvm.internal.o.f(dataList, "getDataList(...)");
                    java.lang.String str = ((cl1.n0) kz5.n0.i0(dataList)).f42888a.f76362e;
                    com.tencent.mm.plugin.taskbar.ui.o2 o2Var = ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) callback).f172523c2;
                    if (o2Var != null) {
                        o2Var.f172674t.d(2, 11, null, 1, str, "", i17, o2Var.f172666l, "", -1);
                    }
                }
                if (!taskBarView.getRecyclerView().E0()) {
                    taskBarView.f172536p2.notifyItemChanged(indexOf, bool);
                }
            }
        } else if (!taskBarView.getRecyclerView().E0()) {
            if (taskBarView.f172523c2.f172662h.isEmpty()) {
                taskBarView.f172523c2.f172662h.add(newItem);
            }
            taskBarView.w1();
            if (!o()) {
                taskBarView.f172536p2.notifyItemInserted(taskBarView.f172525e2.indexOf(2));
            }
        }
        w1Var.f172743e.D(true, newItem, i17, true, 1);
    }

    @Override // rh4.j0
    public void f(cl1.n0 n0Var, int i17) {
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = w1Var.f172743e.f172523c2;
        o2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "removeCommonUsedAppData pos:%d", java.lang.Integer.valueOf(i17));
        if (o2Var.f172660f == null) {
            ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
            o2Var.f172660f = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a.b();
        }
        com.tencent.mm.plugin.appbrand.appusage.a6 a6Var = o2Var.f172660f;
        if (a6Var != null) {
            ((com.tencent.mm.plugin.appbrand.widget.recent.m) a6Var).x0(((cl1.n0) o2Var.f172663i.get(i17)).f42888a.f76361d, ((cl1.n0) o2Var.f172663i.get(i17)).f42888a.f76363f);
        }
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = w1Var.f172743e;
        taskBarView.f172536p2.notifyItemChanged(taskBarView.f172525e2.indexOf(7), java.lang.Boolean.TRUE);
        taskBarView.u1(n0Var, i17);
    }

    @Override // rh4.j0
    public void g() {
        s(1);
    }

    @Override // rh4.j0
    public void h(cl1.n0 n0Var, int i17) {
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        w1Var.f172743e.f172523c2.e(i17, true);
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = w1Var.f172743e;
        taskBarView.f172536p2.notifyItemChanged(taskBarView.f172525e2.indexOf(2), java.lang.Boolean.TRUE);
        w1Var.f172743e.u1(n0Var, i17);
    }

    @Override // rh4.j0
    public void i() {
        this.f172736a.f172743e.n1();
    }

    @Override // rh4.j0
    public void j(float f17) {
    }

    @Override // rh4.j0
    public int k() {
        return this.f172736a.f172743e.f172523c2.f172662h.size();
    }

    @Override // rh4.j0
    public void l(cl1.n0 n0Var, int i17) {
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        w1Var.f172743e.f172523c2.e(i17, false);
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = w1Var.f172743e;
        taskBarView.f172536p2.notifyItemChanged(taskBarView.f172525e2.indexOf(1), java.lang.Boolean.TRUE);
        w1Var.f172743e.u1(n0Var, i17);
    }

    @Override // rh4.j0
    public boolean m() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        long j17 = currentTimeMillis - w1Var.f172743e.f172523c2.f172664j;
        ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        int i17 = com.tencent.mm.plugin.appbrand.appusage.j0.f76469c;
        if (i17 == -1) {
            r45.a60 b17 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
            i17 = b17 != null ? b17.f369760h : 0;
            com.tencent.mm.plugin.appbrand.appusage.j0.f76469c = i17;
        }
        long j18 = i17;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = w1Var.f172743e;
        boolean z17 = taskBarView.H2;
        taskBarView.H2 = false;
        if (!z17 || j17 > j18) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "should not Response Click");
        return false;
    }

    @Override // rh4.j0
    public android.view.View n() {
        boolean o17 = o();
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        return o17 ? w1Var.f172743e.f172533m2 : w1Var.f172743e.f172532l2;
    }

    @Override // rh4.j0
    public boolean o() {
        return this.f172736a.f172743e.f172523c2.f172663i.size() > 0 && !lh4.n.f318719e.a(1);
    }

    @Override // rh4.j0
    public void p(androidx.recyclerview.widget.k3 k3Var, android.view.View view, cl1.n0 n0Var, int i17) {
        if (n0Var == null) {
            return;
        }
        this.f172736a.f172743e.G(k3Var.getAdapterPosition(), n0Var, false);
    }

    @Override // rh4.j0
    public void q(boolean z17) {
        rh4.m mVar;
        com.tencent.mm.plugin.taskbar.ui.w1 w1Var = this.f172736a;
        rh4.o oVar = w1Var.f172743e.f172532l2;
        if (oVar != null) {
            oVar.p(z17);
        }
        if (!o() || (mVar = w1Var.f172743e.f172533m2) == null) {
            return;
        }
        mVar.p(z17);
    }

    @Override // rh4.j0
    public void r(int i17) {
        s(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(int r18) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.v1.s(int):void");
    }
}
