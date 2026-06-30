package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class na extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f113603p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.r8 f113604q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113603p = "FinderLiveBattleInfoPlugin";
        this.f113604q = new com.tencent.mm.plugin.finder.live.widget.r8(root, statusMonitor, this);
        K0(8);
    }

    public final void A1(int i17, boolean z17) {
        dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
        java.lang.Boolean valueOf = u4Var != null ? java.lang.Boolean.valueOf(u4Var.i()) : null;
        com.tencent.mars.xlog.Log.i(this.f113603p, "onBattleFinishPublicityCountDown timeLeft: " + i17 + " timeLeft: " + i17 + " isBattleFinish: " + valueOf);
        boolean b17 = kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
        if (b17) {
            r8Var.j();
            r8Var.i();
            r8Var.a().a(0, true);
        } else {
            if (z17) {
                r8Var.j();
                r8Var.i();
            }
            r8Var.a().a(i17, z17);
        }
    }

    public final void B1() {
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i(this.f113603p, "releaseBattle: " + android.util.Log.getStackTraceString(new java.lang.Throwable("releaseBattle")));
        }
        ((mm2.y2) P0(mm2.y2.class)).c7();
        ((mm2.y2) P0(mm2.y2.class)).f329566s = null;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ka(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        xh2.i iVar;
        android.view.View f17;
        android.view.View f18;
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("micUserMap size: ");
        sb6.append(micUserMap.size());
        sb6.append(" isPk: ");
        km2.q l76 = ((mm2.o4) P0(mm2.o4.class)).l7();
        java.lang.Object obj = null;
        sb6.append(l76 != null ? java.lang.Boolean.valueOf(l76.f309177h) : null);
        sb6.append(" isLink: ");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).S7());
        com.tencent.mars.xlog.Log.i(this.f113603p, sb6.toString());
        v1();
        xh2.b bVar = ((mm2.y2) P0(mm2.y2.class)).f329565r;
        if (bVar != null) {
            com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
            r8Var.getClass();
            r8Var.l();
            int i17 = bVar.f454527f;
            if ((i17 == 1 || (i17 == 0 && bVar.f454526e == 0)) == true) {
                yi2.o0 o0Var = r8Var.f119598i;
                com.tencent.mm.plugin.finder.live.plugin.l lVar = r8Var.f119592c;
                int i18 = bVar.f454525d;
                if (i18 == 4) {
                    ((yi2.p) o0Var).setVisible(8);
                    yi2.o0 g17 = r8Var.g();
                    if (g17 != null) {
                        g17.setVisible(8);
                    }
                    yi2.o0 f19 = r8Var.f();
                    if (f19 != null) {
                        f19.setVisible(((mm2.o4) lVar.P0(mm2.o4.class)).Z == null ? 8 : 0);
                        return;
                    }
                    return;
                }
                if (i18 != 5 && i18 != 6) {
                    yi2.o0 g18 = r8Var.g();
                    if (g18 != null) {
                        g18.setVisible(8);
                    }
                    yi2.o0 f27 = r8Var.f();
                    if (f27 != null) {
                        f27.setVisible(8);
                        return;
                    }
                    return;
                }
                ((yi2.p) o0Var).setVisible(8);
                yi2.o0 f28 = r8Var.f();
                if (f28 != null) {
                    f28.setVisible(8);
                }
                yi2.o0 g19 = r8Var.g();
                if (g19 != null) {
                    g19.setVisible(((mm2.o4) lVar.P0(mm2.o4.class)).Z != null ? 0 : 8);
                }
                if (i18 == 6) {
                    yi2.o0 g27 = r8Var.g();
                    android.view.ViewGroup.LayoutParams layoutParams = (g27 == null || (f18 = g27.f()) == null) ? null : f18.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = 0;
                        return;
                    }
                    return;
                }
                yi2.o0 g28 = r8Var.g();
                android.view.ViewGroup.LayoutParams layoutParams2 = (g28 == null || (f17 = g28.f()) == null) ? null : f17.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    java.util.Iterator it = bVar.f454530i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if ((((xh2.a) next).f454521b.f454553e == 2) != false) {
                            obj = next;
                            break;
                        }
                    }
                    xh2.a aVar = (xh2.a) obj;
                    if (aVar == null || (iVar = aVar.f454521b) == null) {
                        return;
                    }
                    marginLayoutParams2.topMargin = ((int) (bVar.f454524c.height() * iVar.f282610b)) - i65.a.b(r8Var.f119590a.getContext(), 16);
                }
            }
        }
    }

    public final void C1() {
        com.tencent.mars.xlog.Log.i(this.f113603p, "restoreBattleInfo curBattle:" + ((mm2.o4) P0(mm2.o4.class)).Z);
        dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
        if (u4Var != null) {
            int i17 = u4Var.f234158e;
            if (i17 == 0) {
                E1();
                return;
            }
            if (i17 == 1) {
                D1();
                return;
            }
            com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
            if (i17 == 2) {
                r8Var.l();
                u1(false);
            } else {
                if (i17 != 3) {
                    return;
                }
                r8Var.l();
                t1(false);
            }
        }
    }

    public final void D1() {
        km2.k a17;
        dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
        if (kotlin.jvm.internal.o.b((u4Var == null || (a17 = u4Var.a()) == null) ? null : a17.f309114a, ((mm2.c1) P0(mm2.c1.class)).f328852o)) {
            com.tencent.mars.xlog.Log.i(this.f113603p, "showAppliedBattileTip cur user is applicant");
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
        r8Var.h();
        K0(0);
        qi2.s1 w17 = w1();
        if (w17 != null) {
            ((lj2.c0) w17).g(0);
        }
        qi2.s1 w18 = w1();
        if (w18 != null) {
            pm0.v.X(new lj2.a0((lj2.c0) w18));
        }
        r8Var.k(8);
    }

    public final void E1() {
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
        r8Var.h();
        K0(0);
        qi2.s1 w17 = w1();
        if (w17 != null) {
            ((lj2.c0) w17).g(0);
        }
        qi2.s1 w18 = w1();
        if (w18 != null) {
            pm0.v.X(new lj2.b0((lj2.c0) w18));
        }
        r8Var.k(8);
    }

    public final void F1(boolean z17) {
        this.f113604q.getClass();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        com.tencent.mars.xlog.Log.i(this.f113603p, "set FinderLiveBattleInfoPlugin visibility: " + i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, r4) == false) goto L38;
     */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.na.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        qi2.s1 w17 = w1();
        if (w17 != null) {
            lj2.c0 c0Var = (lj2.c0) w17;
            c0Var.e(null);
            qi2.s1.a(c0Var, null, 1, null);
            c0Var.g(8);
        }
        this.f113604q.h();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void c1(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
        if (z17) {
            r8Var.f119590a.setVisibility(8);
        } else {
            r8Var.getClass();
            r8Var.k(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    public final void t1(boolean z17) {
        java.util.List list;
        r45.r22 r22Var;
        android.view.View h17;
        java.util.List list2;
        java.lang.Object obj;
        android.view.View h18;
        com.tencent.mars.xlog.Log.i(this.f113603p, "battleEnd withAnim: " + z17);
        K0(0);
        qi2.s1 w17 = w1();
        if (w17 != null) {
            ((lj2.c0) w17).g(8);
        }
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
        r8Var.k(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd curBattle:");
        com.tencent.mm.plugin.finder.live.plugin.l lVar = r8Var.f119592c;
        sb6.append(((mm2.o4) lVar.P0(mm2.o4.class)).Z);
        com.tencent.mars.xlog.Log.i(r8Var.f119593d, sb6.toString());
        if (((mm2.o4) lVar.P0(mm2.o4.class)).Z != null) {
            r8Var.f119604o = r8Var.f119594e;
            r45.r22 r22Var2 = null;
            r45.r22 r22Var3 = null;
            r22Var2 = null;
            if (((mm2.o4) lVar.P0(mm2.o4.class)).f329324s.size() <= 1) {
                dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
                if ((u4Var != null && u4Var.f()) != false) {
                    dk2.u4 u4Var2 = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
                    if ((u4Var2 != null && u4Var2.f234168o == 0) != false) {
                        r8Var.f119602m.j(z17, null);
                    }
                }
            }
            dk2.u4 u4Var3 = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
            if (u4Var3 != null) {
                ai2.a b17 = r8Var.b();
                android.view.ViewGroup.LayoutParams layoutParams = (b17 == null || (h18 = b17.h()) == null) ? null : h18.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                }
                if (u4Var3.k()) {
                    dk2.u4 u4Var4 = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
                    if (u4Var4 == null || (list2 = u4Var4.f234163j) == null) {
                        r22Var = null;
                    } else {
                        java.util.Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if ((((r45.r22) obj).getInteger(2) != 3) != false) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        r22Var = (r45.r22) obj;
                    }
                    if (r22Var == null) {
                        if (u4Var3.f234160g == 2 && !((mm2.e1) lVar.P0(mm2.e1.class)).g7()) {
                            ai2.a b18 = r8Var.b();
                            android.view.ViewGroup.LayoutParams layoutParams2 = (b18 == null || (h17 = b18.h()) == null) ? null : h17.getLayoutParams();
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (marginLayoutParams2 != null) {
                                marginLayoutParams2.setMargins(0, i65.a.b(r8Var.f119590a.getContext(), 120), 0, 0);
                            }
                        }
                        ai2.a b19 = r8Var.b();
                        if (b19 != null) {
                            b19.j(z17, u4Var3);
                        }
                    }
                }
                int i17 = u4Var3.f234160g;
                if (i17 != 2 && u4Var3.f234157d == 3) {
                    ai2.a b27 = r8Var.b();
                    if (b27 != null) {
                        b27.j(z17, u4Var3);
                    }
                } else if (i17 == 2) {
                    dk2.u4 u4Var5 = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
                    if (u4Var5 != null && (list = u4Var5.f234163j) != null) {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            ?? next = it6.next();
                            if ((((r45.r22) next).getInteger(2) != 3) != false) {
                                r22Var3 = next;
                                break;
                            }
                        }
                        r22Var2 = r22Var3;
                    }
                    if (r22Var2 == null) {
                        ai2.a b28 = r8Var.b();
                        if (b28 != null) {
                            b28.j(z17, u4Var3);
                        }
                    }
                }
            }
            java.util.ArrayList<ai2.a> d17 = r8Var.d();
            if (d17 != null) {
                for (ai2.a aVar : d17) {
                    if (aVar != null) {
                        aVar.j(z17, ((mm2.o4) lVar.P0(mm2.o4.class)).Z);
                    }
                }
            }
        }
        r8Var.a().c(z17);
        tf2.n nVar = (tf2.n) U0(tf2.n.class);
        if (nVar != null) {
            nVar.Z6(false);
        }
    }

    public final void u1(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f113603p, "battleStart withAnim: " + z17);
        K0(0);
        qi2.s1 w17 = w1();
        if (w17 != null) {
            lj2.c0 c0Var = (lj2.c0) w17;
            c0Var.e(null);
            qi2.s1.a(c0Var, null, 1, null);
            c0Var.g(8);
        }
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f113604q;
        r8Var.k(0);
        com.tencent.mars.xlog.Log.i(r8Var.f119593d, "battleStart withAnim:" + z17);
        lj2.d dVar = r8Var.f119602m;
        if (dVar != null) {
            dVar.i(z17);
        }
        ai2.a b17 = r8Var.b();
        if (b17 != null) {
            b17.i(z17);
        }
        java.util.ArrayList<ai2.a> d17 = r8Var.d();
        if (d17 != null) {
            for (ai2.a aVar : d17) {
                if (aVar != null) {
                    aVar.i(z17);
                }
            }
        }
        r8Var.f119604o = 0;
        r8Var.a().i(z17);
        if (z17) {
            xi2.g c17 = r8Var.c();
            qo0.c cVar = r8Var.f119591b;
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            c17.b(((com.tencent.mm.plugin.finder.live.view.k0) cVar).getViewScope());
        } else {
            r8Var.c().setVisibility(8);
        }
        tf2.n nVar = (tf2.n) U0(tf2.n.class);
        if (nVar != null) {
            nVar.Z6(true);
        }
    }

    public final void v1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkNeedRelease isPk: ");
        km2.q l76 = ((mm2.o4) P0(mm2.o4.class)).l7();
        sb6.append(l76 != null ? java.lang.Boolean.valueOf(l76.f309177h) : null);
        com.tencent.mars.xlog.Log.i(this.f113603p, sb6.toString());
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
        if (pm0.v.F(list)) {
            dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
            boolean z17 = false;
            if (u4Var != null && u4Var.f()) {
                z17 = true;
            }
            if (z17) {
                B1();
            }
        }
    }

    public final qi2.s1 w1() {
        km2.k a17;
        zi2.w wVar = (zi2.w) X0(zi2.w.class);
        if (wVar == null) {
            return null;
        }
        dk2.u4 u4Var = ((mm2.o4) P0(mm2.o4.class)).Z;
        lj2.u0 y17 = ((fi2.a) wVar.x1()).y((u4Var == null || (a17 = u4Var.a()) == null) ? null : a17.f309114a);
        if (y17 != null) {
            return y17.getBattleTipsWidget();
        }
        return null;
    }

    public final void x1() {
        K0(0);
        qi2.s1 w17 = w1();
        if (w17 != null) {
            ((lj2.c0) w17).g(0);
        }
        qi2.s1 w18 = w1();
        if (w18 != null) {
            ((lj2.c0) w18).d(new com.tencent.mm.plugin.finder.live.plugin.ia(this));
        }
        this.f113604q.k(8);
    }

    public final void y1() {
        qi2.s1 w17 = w1();
        if (w17 != null) {
            lj2.c0 c0Var = (lj2.c0) w17;
            android.view.View view = c0Var.b().f318944h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "onBattleAcceptFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "onBattleAcceptFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c0Var.b().f318943g.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
    }

    public final void z1() {
        qi2.s1 w17 = w1();
        if (w17 != null) {
            lj2.c0 c0Var = (lj2.c0) w17;
            android.view.View view = c0Var.b().f318944h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "onBattleAcceptSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "onBattleAcceptSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c0Var.b().f318943g.setVisibility(0);
            qi2.s1.a(c0Var, null, 1, null);
        }
    }
}
