package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q30 extends xt2.m6 implements android.view.View.OnClickListener, jf2.o, jf2.l, jf2.m {

    /* renamed from: d */
    public final android.view.ViewGroup f119467d;

    /* renamed from: e */
    public final qo0.c f119468e;

    /* renamed from: f */
    public final com.tencent.mm.plugin.finder.live.plugin.l f119469f;

    /* renamed from: g */
    public final java.lang.String f119470g;

    /* renamed from: h */
    public final jz5.g f119471h;

    /* renamed from: i */
    public final jz5.g f119472i;

    /* renamed from: m */
    public final jz5.g f119473m;

    /* renamed from: n */
    public final jz5.g f119474n;

    /* renamed from: o */
    public final android.view.View f119475o;

    /* renamed from: p */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f119476p;

    /* renamed from: q */
    public final android.view.View f119477q;

    /* renamed from: r */
    public final android.widget.TextView f119478r;

    /* renamed from: s */
    public int f119479s;

    /* renamed from: t */
    public hi2.b f119480t;

    /* renamed from: u */
    public boolean f119481u;

    /* renamed from: v */
    public xt2.n6 f119482v;

    /* renamed from: w */
    public int f119483w;

    public q30(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119467d = root;
        this.f119468e = statusMonitor;
        this.f119469f = basePlugin;
        this.f119470g = "Finder.FinderLiveVisitorMicEntranceWidget";
        this.f119471h = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.l30(this));
        this.f119472i = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.m30(this));
        this.f119473m = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.j30(this));
        this.f119474n = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.k30(this));
        this.f119475o = root.findViewById(com.tencent.mm.R.id.fpj);
        this.f119476p = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.fpk);
        this.f119477q = root.findViewById(com.tencent.mm.R.id.f484705f75);
        this.f119478r = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.tpw);
        this.f119481u = true;
        this.f119482v = xt2.n6.f456912d;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(root, "finder_live_apply_for_link");
        if (statusMonitor.getLiveRole() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(root, 8, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(root, com.tencent.mm.plugin.finder.live.widget.g30.f118397a);
        }
        root.setOnClickListener(this);
    }

    public static /* synthetic */ void m(com.tencent.mm.plugin.finder.live.widget.q30 q30Var, int i17, int i18, hi2.b bVar, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 1;
        }
        if ((i19 & 4) != 0) {
            bVar = null;
        }
        q30Var.l(i17, i18, bVar);
    }

    @Override // xt2.o6
    public xt2.n6 D() {
        return this.f119482v;
    }

    @Override // jf2.l
    public void F(int i17) {
        p();
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f119467d;
        if (viewGroup.getVisibility() != 0) {
            p();
        }
        viewGroup.setVisibility(0);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).hk(ml2.n4.f327747p, ml2.s2.f327919e, 0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_icons_outlined_link_mic), java.lang.Integer.valueOf(com.tencent.mm.R.string.dw8));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f119467d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        if (n() == com.tencent.mm.plugin.finder.live.widget.h30.f118523d) {
            return this.f119475o;
        }
        return null;
    }

    @Override // jf2.o
    public void g() {
        this.f119467d.setVisibility(8);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).hk(ml2.n4.f327747p, ml2.s2.f327919e, 8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f119467d;
    }

    @Override // jf2.o
    public boolean i() {
        boolean z17 = this.f119481u;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.w(this.f119470g, "setVisible return for isTeenMode");
            return false;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.N1(this.f119469f.S0())) {
            com.tencent.mars.xlog.Log.w(this.f119470g, "setVisible return for isDisableLinkMic");
            return false;
        }
        if (zl2.r4.F1(this.f119469f.S0())) {
            com.tencent.mars.xlog.Log.w(this.f119470g, "setVisible return for isCoLiveLive");
            return false;
        }
        if (!z17 || r4Var.N1(this.f119469f.S0()) || ((mm2.c1) this.f119469f.P0(mm2.c1.class)).T) {
            return false;
        }
        if (((mm2.n0) this.f119469f.P0(mm2.n0.class)).f329273r) {
            return false;
        }
        return (((mm2.o4) this.f119469f.P0(mm2.o4.class)).k7() || ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) this.f119469f.P0(mm2.o4.class)).H).getValue()).booleanValue()) && ((mm2.c1) this.f119469f.P0(mm2.c1.class)).a8() && !((mm2.c1) this.f119469f.P0(mm2.c1.class)).f328778a5;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        com.tencent.mm.ui.widget.imageview.WeImageView linkMicIcon = this.f119476p;
        kotlin.jvm.internal.o.f(linkMicIcon, "linkMicIcon");
        return linkMicIcon;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r17, int r18, hi2.b r19) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.q30.k(int, int, hi2.b):void");
    }

    public final void l(int i17, int i18, hi2.b bVar) {
        java.lang.Object obj;
        this.f119479s = i17;
        this.f119480t = bVar;
        com.tencent.mars.xlog.Log.i(this.f119470g, "checkRequestLinkMic seatPos: " + i17 + " source: " + i18 + " extData: " + bVar);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327990u, null, null, null, null, null, false, 126, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.P, null, null, null, null, null, false, 126, null);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119469f;
        java.lang.Integer num = ((mm2.e1) lVar.P0(mm2.e1.class)).g7() ? 1 : null;
        fj2.j jVar = fj2.j.f263174a;
        java.lang.String str = this.f119470g;
        android.view.ViewGroup viewGroup = this.f119467d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (jVar.d(str, context, this.f119468e, this.f119469f, i17, dk2.ef.f233372a.u0(), num, bVar)) {
            java.util.List list = ((mm2.o4) lVar.P0(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) lVar.P0(mm2.c1.class)).m8())) {
                        break;
                    }
                }
            }
            boolean z17 = obj != null;
            if (((mm2.o4) lVar.P0(mm2.o4.class)).F7()) {
                db5.t7.makeText(viewGroup.getContext(), com.tencent.mm.R.string.mkg, 0).show();
                return;
            }
            if (!z17) {
                tn0.w0 Z0 = lVar.Z0();
                if (!(Z0 != null && Z0.X())) {
                    if (!((mm2.c1) lVar.P0(mm2.c1.class)).o7() || ((mm2.c1) lVar.P0(mm2.c1.class)).I7().getInteger(2) == 1) {
                        k(i17, i18, bVar);
                        return;
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("PARAM_FINDER_BOTTOM_TIP_TITLE", viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dnk));
                    bundle.putString("PARAM_FINDER_BOTTOM_TIP_MSG", viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dnj));
                    bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 0);
                    bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", i17);
                    bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", i18);
                    lVar.f113325g.statusChange(qo0.b.f365332b4, bundle);
                    return;
                }
            }
            qo0.c.a(lVar.f113325g, qo0.b.f365336c4, null, 2, null);
            android.view.View view = this.f119477q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onMicUserClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onMicUserClick", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            zl2.r4.f473950a.I0().putBoolean("LINK_RED_DOT_ENABLE_KEY", false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r5 == null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.live.widget.h30 n() {
        /*
            r8 = this;
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f119469f
            java.lang.Class<mm2.o4> r1 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.P0(r1)
            mm2.o4 r0 = (mm2.o4) r0
            boolean r0 = r0.G7()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L56
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f119469f
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r0.P0(r3)
            mm2.o4 r0 = (mm2.o4) r0
            java.util.List r0 = r0.f329327v
            java.lang.String r3 = "<get-audienceLinkMicUserList>(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            monitor-enter(r0)
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L53
        L28:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L53
            r5 = 0
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L53
            r6 = r4
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L3a
            java.lang.String r5 = r6.f309170a     // Catch: java.lang.Throwable -> L53
        L3a:
            com.tencent.mm.plugin.finder.live.plugin.l r6 = r8.f119469f     // Catch: java.lang.Throwable -> L53
            java.lang.Class<mm2.c1> r7 = mm2.c1.class
            androidx.lifecycle.c1 r6 = r6.P0(r7)     // Catch: java.lang.Throwable -> L53
            mm2.c1 r6 = (mm2.c1) r6     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = r6.m8()     // Catch: java.lang.Throwable -> L53
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.D0(r5, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L28
            r5 = r4
        L4f:
            monitor-exit(r0)
            if (r5 != 0) goto L69
            goto L56
        L53:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L56:
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f119469f
            tn0.w0 r0 = r0.Z0()
            if (r0 == 0) goto L66
            boolean r0 = r0.X()
            if (r0 != r2) goto L66
            r0 = r2
            goto L67
        L66:
            r0 = r1
        L67:
            if (r0 == 0) goto L6b
        L69:
            r0 = r2
            goto L6c
        L6b:
            r0 = r1
        L6c:
            if (r0 == 0) goto L71
            com.tencent.mm.plugin.finder.live.widget.h30 r0 = com.tencent.mm.plugin.finder.live.widget.h30.f118525f
            goto L95
        L71:
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.f119469f
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r4 = r0.P0(r3)
            mm2.o4 r4 = (mm2.o4) r4
            boolean r4 = r4.E7()
            if (r4 != 0) goto L8d
            androidx.lifecycle.c1 r0 = r0.P0(r3)
            mm2.o4 r0 = (mm2.o4) r0
            boolean r0 = r0.F7()
            if (r0 == 0) goto L8e
        L8d:
            r1 = r2
        L8e:
            if (r1 == 0) goto L93
            com.tencent.mm.plugin.finder.live.widget.h30 r0 = com.tencent.mm.plugin.finder.live.widget.h30.f118524e
            goto L95
        L93:
            com.tencent.mm.plugin.finder.live.widget.h30 r0 = com.tencent.mm.plugin.finder.live.widget.h30.f118523d
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.q30.n():com.tencent.mm.plugin.finder.live.widget.h30");
    }

    public final boolean o() {
        zi2.w wVar = (zi2.w) this.f119469f.X0(zi2.w.class);
        if (wVar != null) {
            return wVar.k0();
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.i2v) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            int ordinal = n().ordinal();
            if (ordinal == 2) {
                kotlin.jvm.internal.o.d(r0Var);
                ml2.r0.ik(r0Var, ml2.n4.f327761y0, null, 0, 6, null);
            } else if (ordinal == 3) {
                kotlin.jvm.internal.o.d(r0Var);
                ml2.r0.ik(r0Var, ml2.n4.f327743l1, null, 0, 6, null);
            }
            com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119469f;
            xh2.c cVar = (xh2.c) ((mm2.o4) lVar.P0(mm2.o4.class)).A.getValue();
            int i18 = 0;
            if (cVar != null && ((i17 = cVar.f454533c) == 3 || i17 == 3)) {
                java.util.LinkedList linkedList = cVar.f454531a;
                if (linkedList.size() > 1) {
                    kz5.g0.t(linkedList, new com.tencent.mm.plugin.finder.live.widget.i30());
                }
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i18 = 1;
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    xh2.a aVar = (xh2.a) next;
                    if (i18 > 0 && aVar.f454521b.f454556h) {
                        break;
                    } else {
                        i18 = i19;
                    }
                }
            }
            m(this, i18, 0, null, 6, null);
            if (((mm2.c1) lVar.P0(mm2.c1.class)).M7() && (uVar = (xu2.u) lVar.X0(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.a();
                vVar.c(2023);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void p() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.f328101y, null, null, null, null, null, false, 126, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.Q, null, null, null, null, null, false, 126, null);
        if (((ml2.r0) i95.n0.c(ml2.r0.class)).L1) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", this.f119467d, null, 25561);
    }

    public final void q() {
        int i17;
        int i18;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f119469f;
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            i17 = com.tencent.mm.R.raw.icon_join_singing_filled;
        } else if (((mm2.e1) lVar.P0(mm2.e1.class)).Z6()) {
            i17 = com.tencent.mm.R.raw.call_on_filled;
        } else {
            xh2.b bVar = ((mm2.y2) lVar.P0(mm2.y2.class)).f329565r;
            i17 = (bVar == null || !((i18 = bVar.f454525d) == 4 || i18 == 5 || i18 == 6)) ? com.tencent.mm.R.raw.finder_icons_filled_link_mic : com.tencent.mm.R.raw.icons_live_connectmic_pk_icon;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f119476p;
        weImageView.setImageResource(i17);
        com.tencent.mm.plugin.finder.live.widget.h30 n17 = n();
        com.tencent.mm.plugin.finder.live.widget.h30 h30Var = com.tencent.mm.plugin.finder.live.widget.h30.f118523d;
        android.view.View view = this.f119475o;
        android.view.ViewGroup viewGroup = this.f119467d;
        if (n17 != h30Var) {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            view.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481762a70));
            return;
        }
        if (((mm2.e1) lVar.P0(mm2.e1.class)).b7()) {
            weImageView.setIconColor(0);
        } else {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        view.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a6z));
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) lVar.X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        if (ag0Var != null) {
            int i19 = ag0Var.f112614r;
            kotlin.jvm.internal.o.d(view);
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.qf0(view, i19));
        }
    }

    public final void r() {
        if (o()) {
            boolean b76 = ((mm2.e1) this.f119469f.P0(mm2.e1.class)).b7();
            java.lang.String str = "";
            android.widget.TextView textView = this.f119478r;
            if (b76) {
                if (textView != null) {
                    textView.setText("");
                }
                this.f119483w = 0;
                return;
            }
            int ordinal = n().ordinal();
            if (ordinal != 0 && ordinal != 1) {
                android.view.ViewGroup viewGroup = this.f119467d;
                if (ordinal == 2) {
                    str = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.opl);
                } else {
                    if (ordinal != 3) {
                        throw new jz5.j();
                    }
                    str = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.opi);
                }
            }
            kotlin.jvm.internal.o.d(str);
            if (kotlin.jvm.internal.o.b(textView != null ? textView.getText() : null, str)) {
                return;
            }
            if (textView != null) {
                textView.setText(str);
            }
            if (textView != null) {
                textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            this.f119483w = textView != null ? textView.getMeasuredWidth() : 0;
        }
    }

    @Override // jf2.o
    public int type() {
        return 10;
    }

    @Override // xt2.o6
    public void v(xt2.n6 type) {
        kotlin.jvm.internal.o.g(type, "type");
        if (o()) {
            xt2.n6 n6Var = this.f119482v;
            this.f119482v = type;
            if (n6Var != type) {
                r();
            }
            int ordinal = type.ordinal();
            android.widget.TextView textView = this.f119478r;
            if (ordinal == 0) {
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
            } else if (ordinal == 1 && textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    @Override // xt2.o6
    public int x(xt2.n6 displayType, android.content.Context context) {
        kotlin.jvm.internal.o.g(displayType, "displayType");
        kotlin.jvm.internal.o.g(context, "context");
        r();
        q();
        int ordinal = displayType.ordinal();
        if (ordinal == 0) {
            return super.x(displayType, context);
        }
        if (ordinal == 1) {
            return (this.f119483w <= 0 || !o()) ? super.x(displayType, context) : this.f119483w + i65.a.f(context, com.tencent.mm.R.dimen.f479725dh);
        }
        throw new jz5.j();
    }
}
