package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wg0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114930p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorClosePlugin$closeEventListener$1 f114931q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f114932r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f114933s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f114934t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f114935u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorClosePlugin$closeEventListener$1] */
    public wg0(android.view.ViewGroup root, qo0.c statueMonitor) {
        super(root, statueMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statueMonitor, "statueMonitor");
        this.f114930p = statueMonitor;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f114931q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveCloseEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveVisitorClosePlugin$closeEventListener$1
            {
                this.__eventId = -956107388;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveCloseEvent finderLiveCloseEvent) {
                com.tencent.mm.autogen.events.FinderLiveCloseEvent event = finderLiveCloseEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorClosePlugin", "rcv FinderLiveCloseEvent");
                com.tencent.mm.plugin.finder.live.plugin.wg0.this.u1(true);
                return false;
            }
        };
        this.f114932r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.pg0(root, this));
        this.f114933s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.sg0(root, this));
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.igy);
        this.f114934t = findViewById;
        com.tencent.mm.ui.bl.c(root.getContext());
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.lg0(this));
        if (root.getLayoutParams() != null && (root.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            if (x0()) {
                android.view.ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(com.tencent.mm.ui.zk.a(root.getContext(), 32));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = root.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(com.tencent.mm.ui.zk.a(root.getContext(), 8));
            }
        }
        zl2.r4.f473950a.d(this);
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var) {
        jk2.l Z6;
        boolean z17;
        if (!((mm2.c1) wg0Var.P0(mm2.c1.class)).M7()) {
            android.content.Context context = wg0Var.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (!((androidx.appcompat.app.AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                om2.l lVar = (om2.l) wg0Var.P0(om2.l.class);
                boolean z18 = false;
                if (((mm2.e1) lVar.business(mm2.e1.class)).b7() && (((om2.g) lVar.business(om2.g.class)).f346316w > 0 || ((om2.g) lVar.business(om2.g.class)).S6())) {
                    ((fh2.g) ((jz5.n) wg0Var.f114932r).getValue()).w();
                    return;
                }
                if (((mm2.o4) wg0Var.P0(mm2.o4.class)).z7()) {
                    ((ni2.e2) ((jz5.n) wg0Var.f114933s).getValue()).w();
                    return;
                }
                df2.yv yvVar = (df2.yv) wg0Var.U0(df2.yv.class);
                if (yvVar != null && (Z6 = yvVar.Z6()) != null) {
                    long a17 = dk2.tf.f234133a.a(((mm2.c1) ((df2.wv) Z6.f300073a).b().a(mm2.c1.class)).f328852o);
                    java.util.ArrayList arrayList = Z6.f300074b;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (a17 >= ((long) ((jk2.j) next).f300070b.getInteger(2))) {
                            arrayList2.add(next);
                        }
                    }
                    java.util.Iterator it6 = kz5.n0.F0(arrayList2, new jk2.k()).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z17 = false;
                            break;
                        }
                        jk2.j jVar = (jk2.j) it6.next();
                        if (jVar.g()) {
                            jVar.d().putInt(jVar.c(), 1);
                            com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject visitorGuideLogic$MMKVObject = (com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject) jVar.d().r(jVar.b(), com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject.class);
                            if (visitorGuideLogic$MMKVObject == null) {
                                visitorGuideLogic$MMKVObject = new com.tencent.mm.plugin.finder.live.model.guide.VisitorGuideLogic$MMKVObject();
                                visitorGuideLogic$MMKVObject.f111741d = c01.id.c();
                            }
                            visitorGuideLogic$MMKVObject.f111742e++;
                            com.tencent.mars.xlog.Log.i(jVar.f300072d, "save result: " + jVar.d().C(jVar.b(), visitorGuideLogic$MMKVObject));
                            jVar.i();
                            z17 = true;
                        }
                    }
                    if (z17) {
                        z18 = true;
                    }
                }
                if (z18) {
                    return;
                }
                wg0Var.u1(true);
                return;
            }
        }
        if (((mm2.c1) wg0Var.P0(mm2.c1.class)).L5) {
            ((mm2.c1) wg0Var.P0(mm2.c1.class)).N5 = 1;
            wg0Var.u1(true);
        } else {
            xu2.u uVar = (xu2.u) wg0Var.X0(xu2.u.class);
            if (uVar != null) {
                uVar.x1(new com.tencent.mm.plugin.finder.live.plugin.mg0(wg0Var));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        android.view.ViewGroup viewGroup = this.f365323d;
        if (com.tencent.mm.ui.bl.c(viewGroup.getContext()) == 0) {
            com.tencent.mm.ui.zk.a(viewGroup.getContext(), 16);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 7) {
                K0(0);
                return;
            } else if (ordinal == 213) {
                u1(true);
                return;
            } else if (ordinal != 27 && ordinal != 28) {
                return;
            }
        }
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        dead();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f114935u;
        if (k0Var != null) {
            k0Var.u();
        }
        this.f114935u = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r15 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u1(boolean r15) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.wg0.u1(boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        alive();
    }
}
