package com.tencent.mm.plugin.fts.ui;

@db5.a(3)
/* loaded from: classes12.dex */
public class FTSBaseMainUI extends com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI implements i11.c {
    public static final /* synthetic */ int W1 = 0;
    public int F1;
    public com.tencent.mm.plugin.fts.ui.q2 L1;
    public android.view.View M1;
    public android.view.View N1;
    public android.view.View O1;
    public android.widget.TextView P1;
    public android.view.View Q1;
    public android.view.View R1;
    public android.app.Dialog S1;
    public final com.tencent.mm.plugin.fts.ui.q0 G1 = new com.tencent.mm.plugin.fts.ui.q0(this, null);
    public boolean H1 = true;
    public final com.tencent.mm.plugin.fts.ui.widget.f0 I1 = new com.tencent.mm.plugin.fts.ui.widget.f0(this);
    public final com.tencent.mm.sdk.event.IListener J1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.1
        {
            this.__eventId = -1317958916;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent updateFtsSearchDataEvent) {
            if (updateFtsSearchDataEvent == null) {
                return false;
            }
            com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.this.s7();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainUI", "UpdateFtsSearchDataEvent");
            return false;
        }
    };
    public final com.tencent.mm.plugin.fts.ui.widget.k1 K1 = new com.tencent.mm.plugin.fts.ui.l0(this);
    public int T1 = -1;
    public com.tencent.mm.plugin.fts.ui.r0 U1 = null;
    public int V1 = 1;

    public static void v7(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI, java.lang.String str) {
        com.tencent.mm.ui.tools.o3 o3Var = fTSBaseMainUI.f137937y0.f210323h;
        if (o3Var != null) {
            if (o3Var instanceof com.tencent.mm.plugin.fts.ui.widget.v) {
                ((com.tencent.mm.plugin.fts.ui.widget.v) o3Var).setCursorVisible(true);
            } else if (o3Var instanceof com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView) {
                ((com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView) o3Var).setCursorVisible(true);
            }
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(fTSBaseMainUI).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        if (((z13.f) a17).f7()) {
            fTSBaseMainUI.f137937y0.q(fTSBaseMainUI.getString(com.tencent.mm.R.string.o4p));
        } else {
            fTSBaseMainUI.h7();
        }
        if (com.tencent.mm.plugin.fts.ui.n3.h()) {
            return;
        }
        fTSBaseMainUI.x7(true, b23.e.f17388d);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        super.P4(str);
        this.G1.f138146c = false;
        if (this.H1 != com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            this.H1 = K0;
            android.view.View view = this.f137917h;
            if (view != null) {
                int i17 = (!K0 || this.f137916g <= 0) ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.plugin.fts.ui.d0
    public void R3(int i17, boolean z17) {
        boolean z18;
        boolean z19;
        int i18;
        boolean z27;
        boolean z28;
        super.R3(i17, z17);
        java.util.List<t13.k> list = this.L1.f138152q;
        boolean z29 = false;
        if (list != null && !list.isEmpty()) {
            for (t13.k kVar : list) {
                if (kVar != null && kVar.e() > 0 && kVar.getType() != 256) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = true;
        if (z17) {
            com.tencent.mm.plugin.fts.ui.q0 q0Var = this.G1;
            q0Var.f138146c = true;
            if (!this.L1.f138053m.f138085b) {
                boolean n17 = o13.n.n(b7());
                boolean o17 = o13.n.o(b7());
                if (i17 <= 0) {
                    android.view.View view = this.O1;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    i18 = 8;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (n17 || o17) {
                    android.view.View view2 = this.O1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i18 = 8;
                } else {
                    i18 = 8;
                }
                if (n17 || o17) {
                    android.view.View view3 = this.N1;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchContactVisibleIfNeeded", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    g23.k kVar2 = this.L1.f138153r;
                    kVar2.f267955t = n17 ? 1 : 0;
                    kVar2.f267956u = o17 ? 1 : 0;
                    int i19 = n17 ? i18 : o17 ? 9 : 0;
                    p13.e eVar = new p13.e();
                    eVar.f351074b = kVar2.f267960y + 1;
                    eVar.f351079g = "SearchContactBar";
                    eVar.f351078f = c01.id.c() - kVar2.f267937b;
                    eVar.f351075c = i19;
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) kVar2.N;
                    if (!arrayList4.contains(eVar)) {
                        arrayList4.add(eVar);
                    }
                    android.view.View view4 = this.N1;
                    boolean z37 = view4 != null && view4.getVisibility() == 0;
                    q0Var.getClass();
                    if (z37) {
                        q0Var.a(new com.tencent.mm.plugin.fts.ui.v2(16385), null);
                    }
                    z19 = false;
                    this.H = !z18 && z19;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainUI", "onEnd: hasNoLocalResults=" + this.H + ", noLocalAdapterResult=" + z18 + ", noContactFooter=" + z19);
                }
            }
            z19 = true;
            this.H = !z18 && z19;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainUI", "onEnd: hasNoLocalResults=" + this.H + ", noLocalAdapterResult=" + z18 + ", noContactFooter=" + z19);
        } else {
            android.view.View view5 = this.N1;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "onEnd", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        boolean z38 = this.H;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[aisearch] onSearchEnd: hasLocalResult:" + z38);
        if (z38 && z17) {
            com.tencent.mm.plugin.fts.ui.widget.v vVar = fVar.f469399e;
            if (vVar != null) {
                if (vVar.f209962e.getLayout().getLineWidth(0) > vVar.f209962e.getWidth()) {
                    z28 = true;
                    z27 = true;
                } else {
                    z27 = false;
                    z28 = true;
                }
                if (z27 == z28) {
                    z29 = z28;
                }
            }
            if (z29) {
                com.tencent.mm.plugin.fts.ui.widget.v vVar2 = fVar.f469399e;
                if (vVar2 != null) {
                    vVar2.setLargeModeSwitchType(com.tencent.mm.plugin.fts.ui.widget.n1.f138307g);
                }
                com.tencent.mm.plugin.fts.ui.widget.v vVar3 = fVar.f469399e;
                if (vVar3 != null) {
                    vVar3.q();
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public com.tencent.mm.plugin.fts.ui.f0 W6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        com.tencent.mm.plugin.fts.ui.q2 q2Var = new com.tencent.mm.plugin.fts.ui.q2(w0Var, this.F1);
        this.L1 = q2Var;
        q2Var.f138153r.f267961z = 2;
        q2Var.f138056p = new com.tencent.mm.plugin.fts.ui.m0(this);
        return q2Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public java.util.List a7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.M1 == null) {
            android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.bcz, (android.view.ViewGroup) null, false);
            this.M1 = inflate;
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.mdo);
            this.N1 = findViewById;
            findViewById.setOnClickListener(new com.tencent.mm.plugin.fts.ui.o0(this));
            this.O1 = this.M1.findViewById(com.tencent.mm.R.id.mdn);
            this.P1 = (android.widget.TextView) this.M1.findViewById(com.tencent.mm.R.id.mdq);
        }
        arrayList.add(this.M1);
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            c23.c0 c0Var = (c23.c0) pf5.z.f353948a.a(this).a(c23.c0.class);
            android.widget.ListView parentView = this.f137919l1;
            c0Var.getClass();
            kotlin.jvm.internal.o.g(parentView, "parentView");
            if (c0Var.f38018t == null) {
                android.view.View inflate2 = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bcw, (android.view.ViewGroup) parentView, false);
                em.l0 l0Var = new em.l0(inflate2);
                c0Var.f38018t = l0Var;
                if (l0Var.f254532d == null) {
                    l0Var.f254532d = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.f486602uy1);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = l0Var.f254532d;
                if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
                    if (weImageView != null) {
                        weImageView.setVisibility(0);
                    }
                    if (weImageView != null) {
                        weImageView.setOnClickListener(new c23.x(c0Var));
                    }
                } else if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
            }
            em.l0 l0Var2 = c0Var.f38018t;
            android.view.View view = l0Var2 != null ? l0Var2.f254529a : null;
            if (view != null) {
                arrayList.add(view);
            }
        }
        if (this.Q1 == null) {
            android.view.View inflate3 = getLayoutInflater().inflate(com.tencent.mm.R.layout.bcc, (android.view.ViewGroup) null, false);
            this.Q1 = inflate3;
            this.R1 = inflate3.findViewById(com.tencent.mm.R.id.im7);
        }
        arrayList.add(this.Q1);
        return arrayList;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.fts.ui.n0(this), !getController().K() ? 0 : 100);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void g7() {
        int intExtra = getIntent().getIntExtra("from_tab_index", -1);
        if (intExtra == 0) {
            this.F1 = 1;
            return;
        }
        if (intExtra == 1) {
            this.F1 = 2;
            return;
        }
        if (intExtra == 2) {
            this.F1 = 3;
        } else if (intExtra != 3) {
            this.F1 = 0;
        } else {
            this.F1 = 4;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bcf;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void h7() {
        this.f137937y0.q((java.lang.String) ((jz5.n) this.I1.f138268c).getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j7() {
        /*
            r11 = this;
            super.j7()
            boolean r0 = com.tencent.mm.plugin.fts.ui.n3.g(r11)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2d
            pf5.z r0 = pf5.z.f353948a
            pf5.v r0 = r0.a(r11)
            java.lang.Class<z13.f> r3 = z13.f.class
            androidx.lifecycle.c1 r0 = r0.a(r3)
            java.lang.String r3 = "get(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            z13.f r0 = (z13.f) r0
            com.tencent.mm.plugin.fts.ui.widget.v r0 = r0.f469399e
            if (r0 == 0) goto L28
            boolean r0 = r0.D
            if (r0 != r1) goto L28
            r0 = r1
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L2d
            r0 = r1
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 != 0) goto L36
            b23.e r0 = b23.e.f17388d
            r11.x7(r1, r0)
            goto L3b
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.y7(r0)
        L3b:
            android.view.View r0 = r11.R1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
            java.util.Collections.reverse(r1)
            java.lang.Object[] r4 = r1.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI"
            java.lang.String r6 = "setEmptyQueryView"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI"
            java.lang.String r5 = "setEmptyQueryView"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.j7():void");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void k7() {
        super.k7();
        x7(false, b23.e.f17388d);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void l7() {
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void m7() {
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setFooterViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        super.n5(str);
        if (!this.G1.f138146c || android.text.TextUtils.isEmpty(b7()) || su4.r2.l()) {
            return false;
        }
        com.tencent.mm.plugin.fts.ui.q2 q2Var = this.L1;
        q2Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = q2Var.f138152q.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((t13.k) it.next()).g());
        }
        if (arrayList.size() == 0 && android.text.TextUtils.isEmpty(this.P1.getText())) {
            com.tencent.mm.autogen.mmdata.rpt.localSearchComfirmActionStruct localsearchcomfirmactionstruct = new com.tencent.mm.autogen.mmdata.rpt.localSearchComfirmActionStruct();
            localsearchcomfirmactionstruct.f63121d = 1L;
            localsearchcomfirmactionstruct.f63122e = 1L;
            localsearchcomfirmactionstruct.f63123f = localsearchcomfirmactionstruct.b("query", b7(), true);
            localsearchcomfirmactionstruct.k();
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.localSearchComfirmActionStruct localsearchcomfirmactionstruct2 = new com.tencent.mm.autogen.mmdata.rpt.localSearchComfirmActionStruct();
        localsearchcomfirmactionstruct2.f63121d = 1L;
        localsearchcomfirmactionstruct2.f63122e = 2L;
        localsearchcomfirmactionstruct2.f63123f = localsearchcomfirmactionstruct2.b("query", b7(), true);
        localsearchcomfirmactionstruct2.k();
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void o7() {
        super.o7();
        x7(false, b23.e.f17388d);
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f137919l1.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.Object bounceView = getBounceView();
        if (bounceView != null) {
            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).c(new com.tencent.mm.plugin.fts.ui.i0(this));
        }
        h7();
        com.tencent.mm.ui.tools.o3 o3Var = this.f137937y0.f210323h;
        if (o3Var != null) {
            o3Var.setImeScene(4);
        }
        y7(java.lang.Boolean.TRUE);
        hideActionbarLine();
        o13.p.f342250c = o13.n.g(3);
        int i17 = this.F1;
        java.lang.String b76 = z13.f.Y6(getContext()).b7();
        if (!com.tencent.mm.plugin.fts.ui.x2.d(1L)) {
            com.tencent.mm.autogen.mmdata.rpt.UniverSearchStruct univerSearchStruct = new com.tencent.mm.autogen.mmdata.rpt.UniverSearchStruct();
            univerSearchStruct.f61422d = i17;
            univerSearchStruct.s(java.lang.String.valueOf(o13.p.f342250c));
            univerSearchStruct.f61424e = 1L;
            univerSearchStruct.H = 1L;
            univerSearchStruct.Y = o13.p.f342250c;
            univerSearchStruct.f61435j0 = c01.id.c();
            univerSearchStruct.p(b76);
            univerSearchStruct.k();
        }
        if (((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj() == null) {
            finish();
            return;
        }
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c = true;
        su4.o2.f(null, 3, 0L, null, false);
        this.J1.alive();
        ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).aj(3, 0);
        if (com.tencent.mm.plugin.fts.ui.n3.g(this)) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            z13.f fVar = (z13.f) a17;
            yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.fts.ui.FTSBaseMainUI$$a
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    int i18 = com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.W1;
                    com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI = com.tencent.mm.plugin.fts.ui.FTSBaseMainUI.this;
                    if (fTSBaseMainUI.T) {
                        fTSBaseMainUI.x7(!bool.booleanValue(), b23.e.f17389e);
                        fTSBaseMainUI.y7(java.lang.Boolean.TRUE);
                        if (bool.booleanValue()) {
                            fTSBaseMainUI.f137937y0.q(fTSBaseMainUI.getString(com.tencent.mm.R.string.o4p));
                            com.tencent.mm.plugin.fts.ui.widget.m1 m1Var = fTSBaseMainUI.f137937y0;
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            com.tencent.mm.ui.tools.o3 o3Var2 = m1Var.f210323h;
                            if (o3Var2 != null) {
                                o3Var2.c(bool2);
                            }
                        } else {
                            fTSBaseMainUI.f137937y0.q(fTSBaseMainUI.getString(com.tencent.mm.R.string.o4_));
                        }
                    } else {
                        fTSBaseMainUI.s7();
                    }
                    return jz5.f0.f302826a;
                }
            };
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAISearchManagerUIC", "[aisearch] setOnAISearchCheckedListener " + fVar.f469399e);
            fVar.f469400f = lVar;
            com.tencent.mm.plugin.fts.ui.widget.v vVar = fVar.f469399e;
            if (vVar != null) {
                vVar.C = lVar;
            }
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        h7();
        com.tencent.mm.plugin.fts.ui.widget.m1 m1Var = this.f137937y0;
        com.tencent.mm.plugin.fts.ui.j0 j0Var = new com.tencent.mm.plugin.fts.ui.j0(this);
        com.tencent.mm.ui.tools.o3 o3Var = m1Var.f210323h;
        if (o3Var != null) {
            o3Var.setFocusChangeListener(j0Var);
        }
        if ((com.tencent.mm.sdk.platformtools.m2.j() || com.tencent.mm.sdk.platformtools.m2.d().equals("en")) && com.tencent.mm.plugin.fts.ui.n3.h()) {
            this.f137937y0.f138303t = new com.tencent.mm.plugin.fts.ui.k0(this);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((ku5.t0) ku5.t0.f312615d).A("FTSMainUI.GetLocation");
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        if (((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj() != null) {
            ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).b();
        }
        o13.p.f342252e = "";
        com.tencent.mm.plugin.fts.ui.q2 q2Var = this.L1;
        if (q2Var != null) {
            q2Var.f138056p = null;
        }
        this.J1.dead();
        super.onDestroy();
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainUI", "onGetLocation %b %f|%f", java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4) {
                return false;
            }
            onBackPressed();
            return false;
        }
        if (!this.G1.f138146c || this.L1.getCount() != 0 || com.tencent.mm.sdk.platformtools.t8.K0(b7())) {
            return false;
        }
        j75.f stateCenter = getStateCenter();
        java.lang.String b76 = b7();
        long j17 = o13.p.f342251d;
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        stateCenter.B3(new fi0.b(b76, j17, k23.s2.a(((z13.f) a17).f469406o), true));
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
        updateSearchIndexAtOnceEvent.e();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            this.B1 = null;
            this.T = com.tencent.mm.sdk.platformtools.t8.K0(null);
        }
        su4.r2.o();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        hideVKB();
        super.onStop();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void p7() {
        x7(false, b23.e.f17388d);
        android.view.View view = this.R1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "setSearchLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void q7(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(str);
        u1Var.a(true);
        u1Var.c(null, null);
        u1Var.q(false);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void s7() {
        super.s7();
        ((java.util.ArrayList) this.G1.f138144a).clear();
        this.H = false;
        android.view.View view = this.O1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.N1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSBaseMainUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.V1 = 1;
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(z13.f.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            z13.f fVar = (z13.f) a17;
            getStateCenter().B3(new fi0.k(b7(), o13.p.f342251d, k23.s2.a(fVar.f469406o), fVar.i7()));
        }
        java.lang.CharSequence charSequence = o13.n.n(b7()) ? o13.q.d(getString(com.tencent.mm.R.string.ffm), "", p13.i.a(b7(), b7(), false, false)).f351105a : o13.n.o(b7()) ? o13.q.d(getString(com.tencent.mm.R.string.ffn), "", p13.i.a(b7(), b7(), false, false)).f351105a : null;
        android.widget.TextView textView = this.P1;
        if (textView != null) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(textView, "search_for_phoneAndQQ");
            aVar.ik(textView, 40, 33926);
        }
        this.P1.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(getContext(), charSequence, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479897ia)));
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void t7() {
        super.t7();
        this.V1 = 1;
        getStateCenter().B3(new fi0.m(b7(), o13.p.f342251d));
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI
    public void u7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(b7())) {
            return;
        }
        getStateCenter().B3(new fi0.b(b7(), o13.p.f342251d, true, false));
    }

    @Override // com.tencent.mm.plugin.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }

    public final void x7(boolean z17, b23.e eVar) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = z17 ? "true" : "false";
        objArr[1] = java.lang.Integer.valueOf(eVar.ordinal());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSMainUI", "setEducationPageVisible, visible: %s, sourceType: %d", objArr);
        getStateCenter().B3(new b23.f(z17, eVar));
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        if (z17) {
            if (!(fVar.f469401g.length() > 0)) {
                com.tencent.mm.plugin.fts.ui.widget.v vVar = fVar.f469399e;
                if (vVar != null) {
                    vVar.x();
                }
                com.tencent.mm.plugin.fts.ui.widget.v vVar2 = fVar.f469399e;
                if (vVar2 != null) {
                    vVar2.y();
                }
            }
        } else {
            com.tencent.mm.plugin.fts.ui.widget.v vVar3 = fVar.f469399e;
            if (vVar3 != null) {
                vVar3.t();
            }
        }
        y7(java.lang.Boolean.valueOf(z17));
    }

    public void y7(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSMainUI", "[fts] setFTSBackgroundColorKt in isFinishing");
            return;
        }
        if (!com.tencent.mm.plugin.fts.ui.n3.g(this)) {
            int color = getResources().getColor(com.tencent.mm.R.color.a07);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.tyv);
            if (findViewById != null) {
                findViewById.setBackgroundColor(color);
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.mfg);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(color);
            }
            setActionbarColor(color);
            return;
        }
        int color2 = getResources().getColor(com.tencent.mm.R.color.akw);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.u8q);
        if (findViewById3 != null) {
            findViewById3.setBackgroundColor(color2);
        }
        setActionbarColor(color2);
        if (!booleanValue) {
            color2 = getResources().getColor(com.tencent.mm.R.color.f479155al0);
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.tyv);
        if (findViewById4 != null) {
            findViewById4.setBackgroundColor(color2);
        }
        ul5.k bounceView = getBounceView();
        if (bounceView != null) {
            bounceView.setBgColor(color2);
        }
        setNavigationbarColor(color2);
        this.f137937y0.f210328m = true;
    }
}
