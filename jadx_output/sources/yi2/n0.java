package yi2;

/* loaded from: classes10.dex */
public final class n0 extends yi2.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.view.View root, xi2.e server) {
        super(root, server);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(server, "server");
    }

    @Override // yi2.o0
    public void a(int i17, boolean z17) {
        this.f462578r.setVisibility(8);
        t();
        android.view.View view = this.f462580t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462581u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f462579s;
        textView.setVisibility(0);
        android.view.View view3 = this.f462561a;
        if (i17 < 10) {
            textView.setText(view3.getContext().getResources().getString(com.tencent.mm.R.string.lzu) + " 0" + i17);
        } else {
            textView.setText(view3.getContext().getResources().getString(com.tencent.mm.R.string.lzu) + ' ' + i17);
        }
        if (z17) {
            u();
        }
    }

    @Override // yi2.p, yi2.o0
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd curBattle:");
        xi2.e eVar = this.f462562b;
        sb6.append(((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z);
        com.tencent.mars.xlog.Log.i(this.f462563c, sb6.toString());
        this.f462579s.setText(no0.m.f338730a.b(0, ":"));
        this.A.d();
        if (((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z != null) {
            h();
        }
    }

    @Override // yi2.p, yi2.o0
    public void d() {
        super.d();
        pm0.v.X(new yi2.m0(this));
    }

    @Override // yi2.p
    public void h() {
        super.h();
        setVisible(0);
        com.tencent.mm.plugin.finder.live.widget.p8 p8Var = (com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b;
        dk2.u4 u4Var = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var != null && u4Var.h()) {
            android.view.View view = this.f462570j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showPkBarGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showPkBarGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            t();
        }
        qo0.c cVar = p8Var.f119370a.f119591b;
        qo0.b bVar = qo0.b.W3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_BATTLE_BAT_IS_SHOW", this.f462570j.getVisibility() == 0);
        cVar.statusChange(bVar, bundle);
    }

    @Override // yi2.o0
    public void i(boolean z17) {
        android.view.View view = this.f462570j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.A;
        b4Var.d();
        b4Var.c(1000L, 1000L);
        no0.l lVar = no0.m.f338730a;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
        this.f462579s.setText(lVar.b(u4Var != null ? u4Var.f234156c : 0, ":"));
        g(false);
        h();
        android.view.View view2 = this.f462581u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f462580t;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            android.view.View view4 = this.f462576p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = this.f462576p;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        v();
        if (z17) {
            android.view.View view6 = this.f462576p;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(4);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f462578r.setVisibility(0);
        setVisible(0);
    }

    @Override // yi2.p
    public java.lang.Long l() {
        java.util.LinkedList list;
        r45.wk6 wk6Var;
        java.util.LinkedList list2;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
        java.lang.Object obj = null;
        if (u4Var == null) {
            return null;
        }
        boolean z17 = true;
        r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f234163j, 1);
        long j17 = 0;
        if (!u4Var.g()) {
            int integer = (r22Var == null || (list = r22Var.getList(0)) == null || (wk6Var = (r45.wk6) kz5.n0.a0(list, 0)) == null) ? 1 : wk6Var.getInteger(2);
            if (integer != 4 && integer != 5 && integer != 8 && integer != 9) {
                z17 = false;
            }
            if (z17) {
                if (r22Var != null) {
                    return java.lang.Long.valueOf(r22Var.getLong(3));
                }
                return 0L;
            }
            r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f234163j, 0);
            if (r22Var2 != null) {
                return java.lang.Long.valueOf(r22Var2.getLong(3));
            }
            return 0L;
        }
        if (r22Var != null && (list2 = r22Var.getList(0)) != null) {
            synchronized (list2) {
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) next).getString(0), ((mm2.c1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.c1.class)).f328852o)) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (r45.wk6) obj;
        }
        if (obj != null) {
            r45.r22 r22Var3 = (r45.r22) kz5.n0.a0(u4Var.f234163j, 0);
            if (r22Var3 != null) {
                j17 = r22Var3.getLong(3);
            }
        } else if (r22Var != null) {
            j17 = r22Var.getLong(3);
        }
        return java.lang.Long.valueOf(j17);
    }

    @Override // yi2.p
    public java.lang.Long m() {
        java.util.LinkedList list;
        r45.wk6 wk6Var;
        java.util.LinkedList list2;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.o4.class)).Z;
        java.lang.Object obj = null;
        if (u4Var == null) {
            return null;
        }
        r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f234163j, 0);
        long j17 = 0;
        if (!u4Var.g()) {
            if (((mm2.y2) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.y2.class)).b7((r22Var == null || (list = r22Var.getList(0)) == null || (wk6Var = (r45.wk6) kz5.n0.a0(list, 0)) == null) ? 1 : wk6Var.getInteger(2))) {
                if (r22Var != null) {
                    return java.lang.Long.valueOf(r22Var.getLong(3));
                }
                return 0L;
            }
            r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f234163j, 1);
            if (r22Var2 != null) {
                return java.lang.Long.valueOf(r22Var2.getLong(3));
            }
            return 0L;
        }
        if (r22Var != null && (list2 = r22Var.getList(0)) != null) {
            synchronized (list2) {
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) next).getString(0), ((mm2.c1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.c1.class)).f328852o)) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (r45.wk6) obj;
        }
        if (obj == null) {
            r45.r22 r22Var3 = (r45.r22) kz5.n0.a0(u4Var.f234163j, 1);
            if (r22Var3 != null) {
                j17 = r22Var3.getLong(3);
            }
        } else if (r22Var != null) {
            j17 = r22Var.getLong(3);
        }
        return java.lang.Long.valueOf(j17);
    }

    @Override // yi2.p
    public java.lang.String n() {
        return "FinderLiveVisitorTeamBattleBarWidget";
    }

    @Override // yi2.p
    public boolean o() {
        xi2.e eVar = this.f462562b;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z;
        if (!(u4Var != null && u4Var.f234158e == 2)) {
            dk2.u4 u4Var2 = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z;
            if (!(u4Var2 != null && u4Var2.f234158e == 8)) {
                return true;
            }
        }
        return false;
    }

    @Override // yi2.p, yi2.o0
    public void reset() {
        super.reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r1.g() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r19 = this;
            r0 = r19
            xi2.e r1 = r0.f462562b
            r2 = r1
            com.tencent.mm.plugin.finder.live.widget.p8 r2 = (com.tencent.mm.plugin.finder.live.widget.p8) r2
            gk2.e r2 = r2.a()
            java.lang.Class<mm2.e1> r3 = mm2.e1.class
            androidx.lifecycle.c1 r2 = r2.a(r3)
            mm2.e1 r2 = (mm2.e1) r2
            boolean r2 = r2.g7()
            r3 = 0
            if (r2 != 0) goto L80
            com.tencent.mm.plugin.finder.live.widget.p8 r1 = (com.tencent.mm.plugin.finder.live.widget.p8) r1
            gk2.e r1 = r1.a()
            java.lang.Class<mm2.o4> r2 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            mm2.o4 r1 = (mm2.o4) r1
            dk2.u4 r1 = r1.Z
            if (r1 == 0) goto L34
            boolean r1 = r1.g()
            r2 = 1
            if (r1 != r2) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            if (r2 == 0) goto L38
            goto L80
        L38:
            android.view.View r1 = r0.f462570j
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f473285a
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.add(r4)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r5 = r2.toArray()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget"
            java.lang.String r7 = "onBattleBarGroupInvisible"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            yj0.a.d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget"
            java.lang.String r6 = "onBattleBarGroupInvisible"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r1
            yj0.a.f(r4, r5, r6, r7, r8, r9, r10)
            goto Lc8
        L80:
            android.view.View r1 = r0.f462570j
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f473285a
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.add(r4)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r12 = r2.toArray()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget"
            java.lang.String r14 = "onBattleBarGroupInvisible"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            yj0.a.d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget"
            java.lang.String r13 = "onBattleBarGroupInvisible"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r11 = r1
            yj0.a.f(r11, r12, r13, r14, r15, r16, r17)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.n0.t():void");
    }

    public final void u() {
        this.A.d();
        android.view.View view = this.f462580t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showInOnCreateMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showInOnCreateMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462581u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showInOnCreateMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showInOnCreateMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f462576p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showInOnCreateMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorTeamBattleBarWidget", "showInOnCreateMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h();
        this.f462578r.setVisibility(8);
        t();
        this.f462579s.setText("PK" + this.f462561a.getContext().getResources().getString(com.tencent.mm.R.string.lzt));
        setVisible(0);
        v();
    }

    public final void v() {
        boolean g76 = ((mm2.e1) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462562b).a().a(mm2.e1.class)).g7();
        android.view.View view = this.f462576p;
        if (g76) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.crz);
        } else {
            view.setBackgroundResource(com.tencent.mm.R.drawable.cik);
        }
    }
}
