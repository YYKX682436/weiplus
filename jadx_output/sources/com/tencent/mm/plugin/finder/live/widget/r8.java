package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class r8 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f119590a;

    /* renamed from: b, reason: collision with root package name */
    public final qo0.c f119591b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f119592c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f119593d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119594e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.p8 f119595f;

    /* renamed from: g, reason: collision with root package name */
    public yi2.o0 f119596g;

    /* renamed from: h, reason: collision with root package name */
    public yi2.o0 f119597h;

    /* renamed from: i, reason: collision with root package name */
    public final yi2.o0 f119598i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.q8 f119599j;

    /* renamed from: k, reason: collision with root package name */
    public final xi2.g f119600k;

    /* renamed from: l, reason: collision with root package name */
    public xi2.g f119601l;

    /* renamed from: m, reason: collision with root package name */
    public final lj2.d f119602m;

    /* renamed from: n, reason: collision with root package name */
    public ai2.a f119603n;

    /* renamed from: o, reason: collision with root package name */
    public int f119604o;

    public r8(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119590a = root;
        this.f119591b = statusMonitor;
        this.f119592c = basePlugin;
        this.f119593d = "FinderLiveBattleManager";
        this.f119594e = 1;
        com.tencent.mm.plugin.finder.live.widget.o8 o8Var = new com.tencent.mm.plugin.finder.live.widget.o8(this);
        com.tencent.mm.plugin.finder.live.widget.p8 p8Var = new com.tencent.mm.plugin.finder.live.widget.p8(this);
        this.f119595f = p8Var;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ep9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119598i = new yi2.f((android.view.ViewGroup) findViewById, p8Var);
        com.tencent.mm.plugin.finder.live.widget.q8 q8Var = new com.tencent.mm.plugin.finder.live.widget.q8(this);
        this.f119599j = q8Var;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.eou);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f119600k = new xi2.d((com.tencent.mm.view.MMPAGView) findViewById2, q8Var);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.eop);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f119602m = new lj2.d((android.view.ViewGroup) findViewById3, o8Var);
        this.f119604o = 0;
    }

    public final yi2.o0 a() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119592c;
        xh2.b bVar = ((mm2.y2) lVar.P0(mm2.y2.class)).f329565r;
        java.lang.Integer valueOf = bVar != null ? java.lang.Integer.valueOf(bVar.f454525d) : null;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        java.lang.Integer valueOf2 = u4Var != null ? java.lang.Integer.valueOf(u4Var.f234160g) : null;
        boolean g76 = ((mm2.e1) lVar.P0(mm2.e1.class)).g7();
        yi2.o0 o0Var = this.f119598i;
        if ((g76 && valueOf2 != null && valueOf2.intValue() == 1) || (valueOf != null && valueOf.intValue() == 4)) {
            ((yi2.p) o0Var).setVisible(8);
            yi2.o0 g17 = g();
            if (g17 != null) {
                g17.setVisible(8);
            }
            yi2.o0 f17 = f();
            return f17 == null ? o0Var : f17;
        }
        if ((((mm2.e1) lVar.P0(mm2.e1.class)).g7() && valueOf2 != null && valueOf2.intValue() == 2) || ((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 6))) {
            ((yi2.p) o0Var).setVisible(8);
            yi2.o0 f18 = f();
            if (f18 != null) {
                f18.setVisible(8);
            }
            yi2.o0 g18 = g();
            return g18 == null ? o0Var : g18;
        }
        yi2.o0 g19 = g();
        if (g19 != null) {
            g19.setVisible(8);
        }
        yi2.o0 f19 = f();
        if (f19 != null) {
            f19.setVisible(8);
        }
        return o0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (kotlin.jvm.internal.o.b(r2 != null ? r2.h() : null, r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ai2.a b() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r3.f119592c
            java.lang.Class<zi2.w> r1 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r0.X0(r1)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L16
            fi2.m r0 = r0.x1()
            android.view.View r0 = r0.s()
            goto L17
        L16:
            r0 = r1
        L17:
            ai2.a r2 = r3.f119603n
            if (r2 == 0) goto L27
            if (r2 == 0) goto L21
            android.view.View r1 = r2.h()
        L21:
            boolean r1 = kotlin.jvm.internal.o.b(r1, r0)
            if (r1 != 0) goto L30
        L27:
            if (r0 == 0) goto L30
            lj2.b r1 = new lj2.b
            r1.<init>(r0)
            r3.f119603n = r1
        L30:
            ai2.a r0 = r3.f119603n
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.r8.b():ai2.a");
    }

    public final xi2.g c() {
        xi2.g e17;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119592c;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        boolean z17 = false;
        boolean z18 = u4Var != null && u4Var.k();
        xi2.g gVar = this.f119600k;
        if (!z18) {
            dk2.u4 u4Var2 = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
            if (u4Var2 != null && u4Var2.g()) {
                z17 = true;
            }
            if (!z17) {
                return (((mm2.o4) lVar.P0(mm2.o4.class)).f329324s.size() <= 1 || (e17 = e()) == null) ? gVar : e17;
            }
        }
        xi2.g e18 = e();
        return e18 == null ? gVar : e18;
    }

    public final java.util.ArrayList d() {
        ai2.a battleResultWidget;
        zi2.w wVar = (zi2.w) this.f119592c.X0(zi2.w.class);
        if (wVar == null) {
            return null;
        }
        fi2.a aVar = (fi2.a) wVar.x1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.ViewGroup p17 = aVar.p();
        if (p17 == null) {
            return arrayList;
        }
        int childCount = p17.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.KeyEvent.Callback childAt = p17.getChildAt(i17);
            if ((childAt instanceof lj2.u0) && (battleResultWidget = ((lj2.u0) childAt).getBattleResultWidget()) != null) {
                arrayList.add(battleResultWidget);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (kotlin.jvm.internal.o.b(r2 != null ? r2.a() : null, r0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xi2.g e() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r3.f119592c
            java.lang.Class<zi2.w> r1 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r0.X0(r1)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L16
            fi2.m r0 = r0.x1()
            android.widget.ImageView r0 = r0.o()
            goto L17
        L16:
            r0 = r1
        L17:
            xi2.g r2 = r3.f119601l
            if (r2 == 0) goto L29
            if (r2 == 0) goto L22
            android.view.View r2 = r2.a()
            goto L23
        L22:
            r2 = r1
        L23:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r0)
            if (r2 != 0) goto L38
        L29:
            if (r0 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r0
        L2d:
            if (r1 == 0) goto L38
            xi2.k r0 = new xi2.k
            com.tencent.mm.plugin.finder.live.widget.q8 r2 = r3.f119599j
            r0.<init>(r1, r2)
            r3.f119601l = r0
        L38:
            xi2.g r0 = r3.f119601l
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.r8.e():xi2.g");
    }

    public final yi2.o0 f() {
        zi2.w wVar = (zi2.w) this.f119592c.X0(zi2.w.class);
        android.view.View j17 = wVar != null ? wVar.x1().j() : null;
        yi2.o0 o0Var = this.f119596g;
        if (o0Var != null) {
            if (kotlin.jvm.internal.o.b(o0Var != null ? o0Var.f() : null, j17)) {
                return this.f119596g;
            }
        }
        if (j17 == null) {
            return null;
        }
        yi2.l0 l0Var = new yi2.l0(j17, this.f119595f);
        this.f119596g = l0Var;
        return l0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (kotlin.jvm.internal.o.b(r2 != null ? r2.f() : null, r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yi2.o0 g() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r3.f119592c
            java.lang.Class<zi2.w> r1 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r0.X0(r1)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L16
            fi2.m r0 = r0.x1()
            android.view.View r0 = r0.v()
            goto L17
        L16:
            r0 = r1
        L17:
            yi2.o0 r2 = r3.f119597h
            if (r2 == 0) goto L27
            if (r2 == 0) goto L21
            android.view.View r1 = r2.f()
        L21:
            boolean r1 = kotlin.jvm.internal.o.b(r1, r0)
            if (r1 != 0) goto L32
        L27:
            if (r0 == 0) goto L32
            yi2.n0 r1 = new yi2.n0
            com.tencent.mm.plugin.finder.live.widget.p8 r2 = r3.f119595f
            r1.<init>(r0, r2)
            r3.f119597h = r1
        L32:
            yi2.o0 r0 = r3.f119597h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.r8.g():yi2.o0");
    }

    public final void h() {
        this.f119604o = 0;
        j();
        i();
        yi2.o0 f17 = f();
        if (f17 != null) {
            f17.reset();
        }
        yi2.o0 g17 = g();
        if (g17 != null) {
            g17.reset();
        }
        ((yi2.p) this.f119598i).reset();
        qo0.b bVar = qo0.b.W3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_BATTLE_BAT_IS_SHOW", false);
        this.f119591b.statusChange(bVar, bundle);
    }

    public final void i() {
        com.tencent.mars.xlog.Log.i(this.f119593d, "resetBattleEndWidget");
        lj2.d dVar = this.f119602m;
        if (dVar != null) {
            dVar.reset();
        }
        java.util.ArrayList<ai2.a> d17 = d();
        if (d17 != null) {
            for (ai2.a aVar : d17) {
                if (aVar != null) {
                    aVar.reset();
                }
            }
        }
        ai2.a b17 = b();
        if (b17 != null) {
            b17.reset();
        }
    }

    public final void j() {
        com.tencent.mars.xlog.Log.i(this.f119593d, "resetBattleStartWidget");
        ((xi2.d) this.f119600k).reset();
        xi2.g e17 = e();
        if (e17 != null) {
            e17.reset();
        }
    }

    public final void k(int i17) {
        xh2.b bVar = ((mm2.y2) this.f119592c.P0(mm2.y2.class)).f329565r;
        boolean z17 = bVar != null && bVar.f454525d == 4;
        yi2.o0 o0Var = this.f119598i;
        if (!z17) {
            if (o0Var != null) {
                ((yi2.p) o0Var).setVisible(i17);
            }
        } else {
            yi2.o0 f17 = f();
            if (f17 != null) {
                f17.setVisible(0);
            }
            if (o0Var != null) {
                ((yi2.p) o0Var).setVisible(8);
            }
        }
    }

    public final void l() {
        dk2.u4 u4Var = ((mm2.o4) this.f119592c.P0(mm2.o4.class)).Z;
        java.lang.Integer valueOf = u4Var != null ? java.lang.Integer.valueOf(u4Var.f234158e) : null;
        if (valueOf != null && valueOf.intValue() == 6) {
            i();
            j();
        }
        a().d();
    }
}
