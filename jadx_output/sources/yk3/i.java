package yk3;

/* loaded from: classes8.dex */
public final class i extends yk3.b implements o75.a, zk3.h {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$multiTaskEventListener$1 f462827o;

    /* renamed from: p, reason: collision with root package name */
    public final uh4.i0 f462828p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$multiTaskEventListener$1] */
    public i(final androidx.appcompat.app.AppCompatActivity activity, android.os.Bundle bundle) {
        super(activity, bundle);
        kotlin.jvm.internal.o.g(activity, "activity");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f462827o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MulitTaskEvent>(a0Var) { // from class: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$multiTaskEventListener$1
            {
                this.__eventId = -1085760746;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MulitTaskEvent mulitTaskEvent) {
                pk3.h a17;
                android.view.View rootView;
                com.tencent.mm.autogen.events.MulitTaskEvent event = mulitTaskEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive multitask event, type: ");
                am.ak akVar = event.f54503g;
                sb6.append(akVar != null ? java.lang.Integer.valueOf(akVar.f6161c) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", sb6.toString());
                am.ak akVar2 = event.f54503g;
                if (akVar2 != null) {
                    yk3.i iVar = yk3.i.this;
                    androidx.appcompat.app.AppCompatActivity activity2 = activity;
                    int i17 = akVar2.f6161c;
                    boolean z17 = true;
                    if (i17 == 0) {
                        pk3.h hVar = iVar.f462807i;
                        if ((hVar != null ? hVar.i0() : null) != pk3.a.f356437g && !kotlin.jvm.internal.o.b(akVar2.f6159a, "MultiTaskForSnapshotMinusScreen")) {
                            kotlin.jvm.internal.o.g(activity2, "activity");
                            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC multiTaskUIC = (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
                            if (multiTaskUIC.Y6()) {
                                multiTaskUIC.n7();
                            }
                        }
                        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
                        multiTaskInfo.field_type = akVar2.f6160b;
                        java.lang.String str = akVar2.f6159a;
                        multiTaskInfo.field_id = str;
                        java.util.HashMap hashMap = iVar.f462809n;
                        if (hashMap.containsKey(str)) {
                            pk3.h hVar2 = (pk3.h) hashMap.get(multiTaskInfo.field_id);
                            if (kotlin.jvm.internal.o.b((hVar2 == null || (rootView = hVar2.getRootView()) == null) ? null : rootView.getParent(), iVar.f462805g)) {
                                pm0.v.X(new yk3.a(hVar2));
                            }
                            if (kotlin.jvm.internal.o.b(hVar2, iVar.f462807i) && iVar.f462807i != null) {
                                iVar.e();
                                iVar.f462807i = null;
                            } else if (hVar2 != null) {
                                hVar2.S6();
                            }
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "HideMultiTaskEvent, hideUIComponent, id:%s", multiTaskInfo.field_id);
                        }
                    } else if (i17 == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "showHome");
                        kotlin.jvm.internal.o.g(activity2, "activity");
                        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class);
                        kotlin.jvm.internal.o.f(a18, "get(...)");
                        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.k7((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) a18, false, false, true, true, false, false, false, false, 240, null);
                    } else if (i17 == 4) {
                        pk3.h a19 = iVar.a(0, "MultiTaskForMinusScreen");
                        if (a19 != null) {
                            zk3.g0 g0Var = (zk3.g0) a19;
                            g0Var.f473451f = false;
                            ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).Zi(new zk3.e0(g0Var));
                        }
                    } else if (i17 == 5 && (a17 = iVar.a(0, "MultiTaskForMinusScreen")) != null) {
                        java.lang.String id6 = akVar2.f6159a;
                        kotlin.jvm.internal.o.f(id6, "id");
                        pm0.v.X(new zk3.l((zk3.g0) a17, id6, akVar2.f6160b, null));
                    }
                }
                return false;
            }
        };
        this.f462828p = new yk3.h(activity);
    }

    public void h(android.view.View view, android.view.View view2, int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo taskInfo, boolean z17) {
        int i18;
        jz5.l lVar;
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        androidx.appcompat.app.AppCompatActivity activity = this.f462802d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).Q6(taskInfo.field_type)) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(activity);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onGridItemClick, is TeenMode!");
            return;
        }
        r45.fr4 fr4Var = new r45.fr4();
        pk3.h c17 = c(taskInfo);
        fr4Var.set(2, java.lang.Boolean.valueOf((c17 != null ? c17.Mb(taskInfo, ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).V6()) : z17) && z17));
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.jvd) : null;
        if (findViewById == null) {
            lVar = new jz5.l("", 0);
        } else {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewById.getLocalVisibleRect(rect);
            int i19 = iArr[0];
            int i27 = iArr[1];
            int width = findViewById.getWidth();
            int height = findViewById.getHeight() + i27;
            int height2 = height - rect.height();
            if (rect.top == 0) {
                int height3 = rect.height() + i27;
                if (height > height3) {
                    height = height3;
                    i18 = 4;
                } else {
                    height = height3;
                    i18 = 2;
                }
            } else {
                i18 = 1;
                i27 = height2;
            }
            int i28 = rect.left;
            android.graphics.Rect rect2 = new android.graphics.Rect(i19 + i28, i27, i19 + width + i28, height);
            java.lang.String format = java.lang.String.format("%d,%d,%d,%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(rect2.left), java.lang.Integer.valueOf(rect2.top), java.lang.Integer.valueOf(rect2.right), java.lang.Integer.valueOf(rect2.bottom)}, 4));
            kotlin.jvm.internal.o.f(format, "format(...)");
            lVar = new jz5.l(format, java.lang.Integer.valueOf(i18));
        }
        fr4Var.set(1, (java.lang.String) lVar.f302833d);
        java.lang.Number number = (java.lang.Number) lVar.f302834e;
        fr4Var.set(5, java.lang.Boolean.valueOf((number.intValue() & 1) == 1));
        fr4Var.set(6, java.lang.Boolean.valueOf((number.intValue() & 4) == 1));
        com.tencent.mm.plugin.multitask.u0 u0Var = com.tencent.mm.plugin.multitask.u0.f150506a;
        java.lang.String field_id = taskInfo.field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        fr4Var.set(0, u0Var.b(field_id));
        fr4Var.set(3, u0Var.b("Home"));
        fr4Var.set(4, al3.g.f5858a.a(view));
        fr4Var.set(7, java.lang.Integer.valueOf(i17));
        if (fr4Var.getBoolean(2)) {
            pk3.h b17 = b(1048576, "MultiTaskForSnapshotMinusScreen");
            if (b17 != null) {
                ((zk3.w0) b17).P6(view2, taskInfo, fr4Var, new yk3.e(this, taskInfo, fr4Var, view2));
                return;
            }
            return;
        }
        pk3.h c18 = c(taskInfo);
        if (c18 != null) {
            fr4Var.set(8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c18.P6(view2, taskInfo, fr4Var, ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).V6());
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).U6(taskInfo);
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "needEnterAnim false, onGridItemClick, id:%s", taskInfo.field_id);
        }
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        kotlin.jvm.internal.o.g(event, "event");
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f462808m);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((pk3.h) it.next()).p9(event);
        }
    }

    @Override // pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f462804f, "onDestroy");
        lk3.b aj6 = ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).aj();
        if (aj6 != null) {
            aj6.P6().removeObserver(this);
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this.f462828p);
        dead();
        pk3.h a17 = a(0, "MultiTaskForMinusScreen");
        if (a17 != null) {
            ((zk3.g0) a17).onDestroy();
        }
    }
}
