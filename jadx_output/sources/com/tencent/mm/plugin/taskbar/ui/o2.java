package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public final class o2 implements com.tencent.mm.plugin.taskbar.ui.u {
    public final com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$homeTabChangedListener$1 A;
    public final uh4.i0 B;
    public final jz5.g C;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.taskbar.ui.a2 f172655a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f172656b;

    /* renamed from: c, reason: collision with root package name */
    public int f172657c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.b6 f172658d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.z5 f172659e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.a6 f172660f;

    /* renamed from: j, reason: collision with root package name */
    public long f172664j;

    /* renamed from: k, reason: collision with root package name */
    public int f172665k;

    /* renamed from: l, reason: collision with root package name */
    public int f172666l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f172667m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f172668n;

    /* renamed from: p, reason: collision with root package name */
    public int f172670p;

    /* renamed from: q, reason: collision with root package name */
    public long f172671q;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f172673s;

    /* renamed from: u, reason: collision with root package name */
    public long f172675u;

    /* renamed from: v, reason: collision with root package name */
    public long f172676v;

    /* renamed from: x, reason: collision with root package name */
    public int f172678x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$taskBarUpdateEventListener$1 f172679y;

    /* renamed from: z, reason: collision with root package name */
    public final l75.q0 f172680z;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f172661g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f172662h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f172663i = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f172669o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public int f172672r = 60;

    /* renamed from: t, reason: collision with root package name */
    public final ih4.a f172674t = new ih4.a();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f172677w = new java.util.ArrayList();

    static {
        new com.tencent.mm.plugin.taskbar.ui.z1(null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$taskBarUpdateEventListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$homeTabChangedListener$1] */
    public o2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f172679y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TaskBarDataUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$taskBarUpdateEventListener$1
            {
                this.__eventId = -1489804983;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TaskBarDataUpdateEvent taskBarDataUpdateEvent) {
                com.tencent.mm.autogen.events.TaskBarDataUpdateEvent event = taskBarDataUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "received taskBarUpdateEventListener");
                com.tencent.mm.plugin.taskbar.ui.o2.this.b(true, 300L);
                return false;
            }
        };
        this.f172680z = new com.tencent.mm.plugin.taskbar.ui.m2(this);
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarViewPresenter$homeTabChangedListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.taskbar.ui.o2 o2Var = com.tencent.mm.plugin.taskbar.ui.o2.this;
                boolean z17 = o2Var.f172670p == 0;
                am.nh nhVar = event.f54438g;
                if (nhVar != null) {
                    int i17 = nhVar.f7425a;
                    o2Var.f172670p = i17;
                    if (!z17) {
                        if (i17 == 0) {
                            com.tencent.mm.plugin.taskbar.ui.a2 a2Var = o2Var.f172655a;
                            if (a2Var != null) {
                                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var;
                                taskBarView.post(taskBarView.X2);
                                taskBarView.m1();
                            }
                            if (o2Var.f172665k == 1) {
                                ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.taskbar.ui.f2.f172612d);
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.B = new com.tencent.mm.plugin.taskbar.ui.n2(this);
        this.C = jz5.h.b(new com.tencent.mm.plugin.taskbar.ui.d2(this));
        this.f172668n = kz5.c1.i(new jz5.l(4, new lh4.n(4, new int[]{2, 21, 22, 25, 6, 4, 3})));
    }

    public final lh4.n a(int i17) {
        return (lh4.n) this.f172668n.get(java.lang.Integer.valueOf(i17));
    }

    public final void b(boolean z17, long j17) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.taskbar.ui.j2 j2Var = new com.tencent.mm.plugin.taskbar.ui.j2(this, z17);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(j2Var, j17, "TaskBarReloadData");
    }

    public final synchronized void c(lh4.n viewModel) {
        com.tencent.mm.plugin.taskbar.ui.a2 a2Var;
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        int size = viewModel.f318723c.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList c17 = lh4.n.f318719e.c();
        this.f172669o.clear();
        for (int i17 : viewModel.f318722b) {
            if (!lh4.n.f318719e.a(i17) && !c17.contains(java.lang.Integer.valueOf(i17))) {
                java.util.List Di = ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Di(i17);
                int size2 = Di.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    if (i18 < 1) {
                        arrayList.add(Di.get(i18));
                    } else {
                        this.f172669o.add(Di.get(i18));
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "type blocked " + i17);
        }
        kz5.g0.t(arrayList, com.tencent.mm.plugin.taskbar.ui.k2.f172638d);
        viewModel.f318723c = arrayList;
        if (size > 0 && arrayList.isEmpty() && (a2Var = this.f172655a) != null) {
            ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var).l1(viewModel.f318721a);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reloadOtherData " + viewModel.f318721a + ' ' + size + ' ' + viewModel.f318723c.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "trans recent cover images for tempSectionData");
        }
        if (!this.f172669o.isEmpty()) {
            arrayList2.addAll(this.f172669o);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "trans recent cover images for exceedOtherData");
        }
        if (!arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "transSectionData size:%d", java.lang.Integer.valueOf(arrayList2.size()));
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarLogic", "transRecentCoverImgFilePath");
            o11.g gVar = gh4.j0.f271933a;
            boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("taskbar_config").getBoolean("taskbar_recent_first_trans_image_path", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarConfig", "needTaskBarRecentFirstTransImgPath flag:%b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarLogic", "need trans cover image path");
                ((ku5.t0) ku5.t0.f312615d).q(new gh4.k0(arrayList2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x014e, code lost:
    
        if (r6 != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.o2.d(boolean, int):void");
    }

    public final void e(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "removeWeAppData pos:%d, isMy:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.appbrand.widget.recent.v vVar = com.tencent.mm.plugin.appbrand.widget.recent.v.f92067a;
        if (z17) {
            if (this.f172659e == null) {
                ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
                this.f172659e = vVar.a();
            }
            com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = this.f172659e;
            if (z5Var != null) {
                ((com.tencent.mm.plugin.appbrand.widget.recent.h) z5Var).nh(((cl1.n0) this.f172662h.get(i17)).f42888a.f76361d, ((cl1.n0) this.f172662h.get(i17)).f42888a.f76363f);
                return;
            }
            return;
        }
        if (this.f172658d == null) {
            ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
            this.f172658d = vVar.c();
        }
        com.tencent.mm.plugin.appbrand.appusage.b6 b6Var = this.f172658d;
        if (b6Var != null) {
            ((com.tencent.mm.plugin.appbrand.widget.recent.j1) b6Var).x0(((cl1.n0) this.f172661g.get(i17)).f42888a.f76361d, ((cl1.n0) this.f172661g.get(i17)).f42888a.f76363f);
        }
    }

    public final void f() {
        java.util.ArrayList arrayList = this.f172677w;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.taskbar.ui.b2 b2Var = (com.tencent.mm.plugin.taskbar.ui.b2) it.next();
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = b2Var.f172572d;
            if (multiTaskInfo != null) {
                ((gh4.e0) i95.n0.c(gh4.e0.class)).getClass();
                gh4.s0 s0Var = (gh4.s0) i95.n0.c(gh4.s0.class);
                s0Var.getClass();
                java.util.HashSet hashSet = (java.util.HashSet) s0Var.f271954d.get(multiTaskInfo.field_type);
                if (hashSet != null) {
                    java.util.Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        ((hh4.k) it6.next()).k0(multiTaskInfo);
                    }
                }
                fs.g.c(hh4.j.class, java.lang.Integer.valueOf(multiTaskInfo.field_type), new gh4.q0(multiTaskInfo));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "do reportFirstFeedShow " + b2Var.f172571c + ' ' + b2Var.f172570b + ' ' + b2Var.f172569a + ' ' + b2Var.f172573e);
            this.f172674t.d(b2Var.f172569a, b2Var.f172570b, b2Var.f172571c, 1, null, b2Var.f172573e, b2Var.f172575g, this.f172666l, b2Var.f172574f, b2Var.f172576h ? 4 : 0);
        }
        arrayList.clear();
    }

    public final void g(cl1.n0 item, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = item.f42888a.f76362e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i27 = item.f42889b;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemManualDeleted appId:%s,pos:%d, viewType:%d", str, valueOf, java.lang.Integer.valueOf(i27));
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = item.f42888a;
        this.f172674t.c(i18, i19, i27 == 2 ? 3 : i27 == 7 ? 14 : 1, com.tencent.mm.plugin.multitask.s0.b(localUsageInfo.f76362e, localUsageInfo.f76363f), 0, 1, 0, 0, item.f42888a.f76361d, item.b() ? 4 : 0);
    }

    public final void h(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemAddDeleted type:%d,pos:%d", java.lang.Integer.valueOf(multiTaskInfo.field_type), java.lang.Integer.valueOf(i17));
        long c17 = i18 == 2 ? c01.id.c() - multiTaskInfo.field_updateTime : 0L;
        ih4.a aVar = this.f172674t;
        aVar.c(i18, i19, aVar.a(multiTaskInfo.field_type), multiTaskInfo.field_id, ((int) c17) / 1000, 1, 0, 0, "", -1);
    }

    public final void i(android.view.View view, int i17) {
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.jqf) : null;
        if (findViewById != null && findViewById.getVisibility() == 0) {
            int i18 = 2;
            if (i17 == 2) {
                i18 = 11;
            } else if (i17 == 7) {
                i18 = 15;
            }
            this.f172674t.d(1, i18, null, 1, null, "", 0, this.f172666l, "", -1);
        }
    }

    public final void j(cl1.n0 item, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = item.f42888a;
        java.lang.String b17 = com.tencent.mm.plugin.multitask.s0.b(localUsageInfo.f76362e, localUsageInfo.f76363f);
        int i18 = item.f42889b;
        int i19 = i18 == 2 ? 3 : i18 == 7 ? 14 : 1;
        com.tencent.mm.plugin.taskbar.ui.b2 b2Var = new com.tencent.mm.plugin.taskbar.ui.b2();
        b2Var.f172569a = 1;
        b2Var.f172570b = i19;
        b2Var.f172571c = b17;
        b2Var.f172575g = i17;
        b2Var.f172574f = item.f42888a.f76361d;
        b2Var.f172576h = item.b();
        com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo appBrandCommUseInfo = item.f42888a.f76375u;
        if (appBrandCommUseInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandCommUseInfo.f76339f)) {
            b2Var.f172573e = item.f42888a.f76375u.f76339f;
        }
        this.f172677w.add(b2Var);
    }

    public final void k(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo appItem, int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var;
        int i19;
        kotlin.jvm.internal.o.g(appItem, "appItem");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str = appItem.f76362e;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemReorderWeApp appId:%s,start:%d end:%d", str, valueOf, valueOf2);
        java.lang.String b17 = com.tencent.mm.plugin.multitask.s0.b(str, appItem.f76363f);
        int i27 = z17 ? 1 : 3;
        if (appItem instanceof com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) {
            if (((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) appItem).f76358z == 4) {
                o2Var = this;
                i19 = 4;
                o2Var.f172674t.c(3, 0, 3, b17, 0, i27, i17, i18, appItem.f76361d, i19);
            }
        }
        o2Var = this;
        i19 = 0;
        o2Var.f172674t.c(3, 0, 3, b17, 0, i27, i17, i18, appItem.f76361d, i19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r26, int r27) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.o2.l(boolean, int):void");
    }

    public final void m() {
        ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
        int i17 = com.tencent.mm.plugin.appbrand.appusage.j0.f76467a;
        if (i17 == 0) {
            r45.a60 b17 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
            i17 = b17 != null ? b17.f369757e : 0;
            com.tencent.mm.plugin.appbrand.appusage.j0.f76467a = i17;
        }
        int i18 = 8;
        int i19 = i17 != 1 ? 8 : 4;
        int i27 = ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).Bi() != 1 ? 8 : 4;
        boolean z17 = this.f172663i.size() > 0;
        if (!z17) {
            i19 = 0;
        } else if (this.f172663i.size() <= i19) {
            i19 = this.f172663i.size();
        }
        if (!z17) {
            i27 = this.f172661g.size() >= 8 ? 8 : this.f172661g.size();
        } else if (this.f172661g.size() < i27) {
            i27 = this.f172661g.size();
        }
        if (z17) {
            i18 = 0;
        } else if (this.f172662h.size() < 8) {
            i18 = this.f172662h.size();
        }
        this.f172677w.clear();
        if (!this.f172661g.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f172661g);
            int size = arrayList.size();
            if (size <= i27) {
                i27 = size;
            }
            for (int i28 = 0; i28 < i27; i28++) {
                java.lang.Object obj = arrayList.get(i28);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                j((cl1.n0) obj, false, i28);
            }
        }
        if (!this.f172662h.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f172662h);
            int size2 = arrayList2.size();
            if (size2 <= i18) {
                i18 = size2;
            }
            for (int i29 = 0; i29 < i18; i29++) {
                java.lang.Object obj2 = arrayList2.get(i29);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                j((cl1.n0) obj2, true, i29);
            }
        }
        if (!this.f172663i.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(this.f172663i);
            int size3 = arrayList3.size();
            if (size3 <= i19) {
                i19 = size3;
            }
            for (int i37 = 0; i37 < i19; i37++) {
                java.lang.Object obj3 = arrayList3.get(i37);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                j((cl1.n0) obj3, true, i37);
            }
        }
    }

    public final void n() {
        if (gm0.j1.a()) {
            this.f172656b = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
            this.f172657c = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", java.lang.Boolean.valueOf(this.f172656b), java.lang.Integer.valueOf(this.f172657c));
        }
    }
}
