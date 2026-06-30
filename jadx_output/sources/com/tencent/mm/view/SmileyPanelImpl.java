package com.tencent.mm.view;

/* loaded from: classes15.dex */
public class SmileyPanelImpl extends com.tencent.mm.api.SmileyPanel implements androidx.lifecycle.v {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.manager.d f213462f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f213463g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f213464h;

    public SmileyPanelImpl(android.content.Context context, boolean z17) {
        this(context, null, z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void a() {
        if (this.f213464h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "destroy: has destroyed");
            return;
        }
        this.f213464h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "destroy: ");
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.Z.dead();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onDestroy %s", dVar);
        dVar.c();
        dVar.E.a();
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().a();
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().onDestroy();
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void b() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void c() {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.g(false, false);
        dVar.f(false, false);
        dVar.j(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void d(boolean z17) {
        this.f213462f.i(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void e(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "hideSmiley: %B, hideEmojiSmiley: %B", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void f(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f213462f.f213630f;
        if (recyclerView instanceof com.tencent.mm.emoji.panel.EmojiPanelGroupView) {
            ((com.tencent.mm.emoji.panel.EmojiPanelGroupView) recyclerView).f64899d2 = z17;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void g(int i17, boolean z17) {
        androidx.appcompat.app.n nVar = this.f213462f.F;
        if (nVar instanceof com.tencent.mm.ui.tools.c5) {
            ((com.tencent.mm.ui.tools.c5) nVar).w2(i17, z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public com.tencent.mm.pluginsdk.ui.h1 getPanelSlideIndicator() {
        return this.f213462f.f213635k;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onPause");
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().a();
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "saveSelectedTab: %s", dVar.f213627c);
        gr.t g17 = gr.t.g();
        g17.f274694m = dVar.f213627c;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.u().c().w(-29414086, g17.f274694m);
        } else {
            h65.c.f279320b.a(-29414086, g17.f274694m);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onResume");
        boolean z17 = this.f213463g;
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        if (!z17) {
            this.f213463g = true;
            dVar.f213643s.b();
            dVar.f213642r.getClass();
        }
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onResumeAgain");
        if (dVar.f213626b) {
            dVar.b(dVar.f213624a);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void j() {
        this.f213462f.a();
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void k() {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.getClass();
        dVar.f213642r.f293852k = gr.v.f274696a.c();
        dVar.f213643s.b();
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void l() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void m() {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.getClass();
        boolean z17 = !((se0.e) ((te0.e) i95.n0.c(te0.e.class))).isTeenMode();
        ir.h hVar = dVar.f213642r;
        hVar.f293843b = z17;
        hVar.f293844c = true;
        hVar.f293845d = true;
        hVar.f293846e = true;
        hVar.f293848g = true;
        hVar.f293850i = true;
        hVar.f293856o = null;
        hVar.f293849h = true;
        hVar.f293847f = true;
        hVar.f293852k = gr.v.f274696a.c();
        dVar.f213643s.b();
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void n() {
        this.f213462f.e(0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void o(boolean z17, boolean z18) {
        this.f213462f.f(z17, z18);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onActivityDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onActivityDestroy:%s", getContext());
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onAttachedToWindow");
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        if (dVar.f213629e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "listener added %s", dVar);
            return;
        }
        dVar.f213629e = true;
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().f(dVar.T);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().b(dVar.U);
        dVar.V.alive();
        dVar.W.alive();
        pr.z zVar = pr.k0.f357723q;
        pr.b1 b17 = zVar.b(false);
        pr.e0 e0Var = dVar.f213625a0;
        b17.f(e0Var);
        zVar.a(false).f(e0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "SmileyPanelManager add listener. %s", dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onDetachedFromWindow");
        this.f213462f.c();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.pluginsdk.ui.g1 g1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "onSizeChanged: %s, %s; %s, %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        if (dVar != null) {
            android.content.Context context = dVar.f213624a;
            boolean z17 = context.getResources().getConfiguration().orientation == 1;
            lr.a1 a1Var = dVar.B;
            a1Var.d(i17);
            lr.b0 b0Var = dVar.A;
            b0Var.d(i17);
            int i28 = a1Var.f320561b;
            ir.h hVar = dVar.f213642r;
            hVar.f293860s = i28;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.w_);
            android.view.ViewGroup.LayoutParams layoutParams = dVar.f213639o.getLayoutParams();
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "updateViewSize: %s, %s, %s, canShowIntro:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(dimensionPixelSize), java.lang.Boolean.valueOf(z17));
            if (i18 >= dimensionPixelSize * 4) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480378w9);
            }
            if (layoutParams.height != dimensionPixelSize) {
                layoutParams.height = dimensionPixelSize;
                dVar.f213639o.setLayoutParams(layoutParams);
                dVar.f213639o.post(new com.tencent.mm.view.manager.l(dVar));
            }
            if (hVar.f293851j != z17) {
                hVar.f293851j = z17;
                dVar.f213643s.b();
            }
            dVar.O.f339037d = a1Var.f320561b;
            dVar.Q.f339059g = b0Var.f320561b;
            ym5.f0 f0Var = dVar.f213635k;
            if (f0Var == null || (g1Var = f0Var.f463278d) == null) {
                return;
            }
            g1Var.c(i19, i27, i17, i18);
        }
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void p(boolean z17, boolean z18) {
        this.f213462f.g(z17, z18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void q(android.content.Context context, int i17, java.lang.Runnable runnable) {
        this.f213462f.l(context, i17, runnable);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setCallback(com.tencent.mm.pluginsdk.ui.chat.j6 j6Var) {
        super.setCallback(j6Var);
        com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = (com.tencent.mm.pluginsdk.ui.chat.v9) j6Var;
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.C = v9Var;
        dVar.f213634j.f320568d = v9Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setDefaultEmojiByDetail(java.lang.String str) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.d(str);
        dVar.Z.alive();
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setEmojiPanelBackground(int i17) {
        this.f213462f.f213640p.setBackgroundResource(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r3 != 3) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEntranceScene(int r7) {
        /*
            r6 = this;
            com.tencent.mm.view.manager.d r0 = r6.f213462f
            nr.j r1 = r0.Q
            r1.f339055c = r7
            nr.c r1 = r0.O
            r1.f339036c = r7
            nr.h r1 = r0.R
            r1.f339048b = r7
            nr.i r1 = r0.P
            r1.f339051b = r7
            ir.h r1 = r0.f213642r
            int r2 = r1.f293842a
            r1.f293842a = r7
            int r3 = r0.f213623J
            java.lang.Class<k12.s> r4 = k12.s.class
            i95.m r4 = i95.n0.c(r4)
            k12.s r4 = (k12.s) r4
            g30.h r4 = (g30.h) r4
            s25.b r4 = r4.Bi()
            boolean r4 = r4.p()
            if (r4 == 0) goto L3a
            r4 = 1
            if (r7 == r4) goto L3b
            if (r3 == r4) goto L3b
            r5 = 2
            if (r3 == r5) goto L3b
            r5 = 3
            if (r3 != r5) goto L3a
            goto L3b
        L3a:
            r4 = 0
        L3b:
            r1.f293849h = r4
            if (r2 == r7) goto L44
            ir.o r1 = r0.f213643s
            r1.b()
        L44:
            lr.p r1 = r0.f213634j
            r1.f320565a = r7
            r0.G = r7
            nr.e r7 = r0.N
            r7.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.SmileyPanelImpl.setEntranceScene(int):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setExpandedForReport(boolean z17) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        nr.j jVar = dVar.Q;
        jVar.getClass();
        jVar.f339063k = z17 ? 1 : 2;
        nr.c cVar = dVar.O;
        cVar.getClass();
        cVar.f339039f = z17 ? 1 : 2;
    }

    @Override // com.tencent.mm.api.SmileyPanel
    public void setExtraInfoForReport(java.lang.String str) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        nr.i iVar = dVar.P;
        iVar.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        iVar.f339052c = str;
        dVar.O.f339040g = str;
        dVar.Q.f339060h = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setFinishButtonTitle(java.lang.String value) {
        ir.h hVar = this.f213462f.f213642r;
        hVar.getClass();
        kotlin.jvm.internal.o.g(value, "value");
        hVar.f293857p = value;
        java.util.Iterator it = hVar.f293861t.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setHBScene(int i17) {
        this.f213462f.f213623J = i17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setHideSearchJumpMoreEntrance(boolean z17) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setHideSearchDialogJumpMoreEntrance: %b", java.lang.Boolean.valueOf(z17));
        dVar.f213648x = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setInitSelectTab(java.lang.String str) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setInitSelectTab: %s", str);
        dVar.K = str;
        dVar.d(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setOnEmojiSelectTabChangeListener(com.tencent.mm.pluginsdk.ui.j0 j0Var) {
        super.setOnEmojiSelectTabChangeListener(j0Var);
        this.f213462f.L = j0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setOnTextOperationListener(com.tencent.mm.pluginsdk.ui.k0 k0Var) {
        super.setOnTextOperationListener(k0Var);
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.D = k0Var;
        dVar.f213634j.f320569e = k0Var;
        dVar.f213631g.f320609p = k0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setPanelBackgroundColor(int i17) {
        this.f213462f.f213640p.setBackgroundColor(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setPanelForeground(android.graphics.drawable.Drawable drawable) {
        this.f213462f.f213640p.setForeground(drawable);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setPortHeightPx(int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setSearchDialogForceDarkMode(boolean z17) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setSearchDialogForceDarkMode: %b", java.lang.Boolean.valueOf(z17));
        dVar.f213647w = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setSearchIncludeCustom(boolean z17) {
        this.f213462f.I = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setSearchSource(int i17) {
        this.f213462f.H = i17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setSendButtonEnable(boolean z17) {
        ir.h hVar = this.f213462f.f213642r;
        hVar.f293859r = z17;
        java.util.Iterator it = hVar.f293861t.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setShowClose(boolean z17) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.f213638n.setVisibility(z17 ? 0 : 8);
        if (z17) {
            dVar.f213637m.setBackgroundResource(com.tencent.mm.R.drawable.emoji_panel_tab_bg_corner);
            return;
        }
        android.view.View view = dVar.f213637m;
        kotlin.jvm.internal.o.g(view, "<this>");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        view.getContext().getTheme().resolveAttribute(com.tencent.mm.R.attr.f478246en, typedValue, true);
        dVar.f213637m.setBackgroundResource(typedValue.resourceId);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setShowGame(boolean z17) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        ir.h hVar = dVar.f213642r;
        boolean z18 = z17 != hVar.f293846e;
        hVar.f293846e = z17;
        if (z18) {
            dVar.f213643s.b();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setShowSearch(boolean z17) {
        boolean isTeenMode = ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).isTeenMode();
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        if (!isTeenMode) {
            dVar.h(z17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "is teenMode, not show search");
            dVar.h(false);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setShowSend(boolean z17) {
        this.f213462f.i(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setShowSmiley(boolean z17) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "setShowSmiley: %s", java.lang.Boolean.valueOf(z17));
        dVar.f213642r.f293844c = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setShowStore(boolean z17) {
        this.f213462f.j(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setSmileyPanelExpandable(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanel", "setSmileyPanelExpandable: %s", java.lang.String.valueOf(z17));
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        ir.h hVar = dVar.f213642r;
        if (z17 != hVar.f293854m) {
            hVar.f293854m = z17;
            dVar.f213631g.notifyDataSetChanged();
        }
        ym5.f0 f0Var = dVar.f213635k;
        if (f0Var == null) {
            return;
        }
        if (z17) {
            f0Var.f463287m = null;
            f0Var.f463288n = true;
            return;
        }
        if (!f0Var.c()) {
            f0Var.f463288n = false;
            return;
        }
        f0Var.f463287m = new ym5.c0(f0Var);
        com.tencent.mm.pluginsdk.ui.g1 g1Var = f0Var.f463278d;
        if (g1Var != null) {
            g1Var.d();
        }
        com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardExpandStruct emoticonBoardExpandStruct = new com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardExpandStruct();
        emoticonBoardExpandStruct.f56005d = java.lang.System.currentTimeMillis();
        f0Var.f(0, 500);
        emoticonBoardExpandStruct.f56006e = 2L;
        emoticonBoardExpandStruct.f56007f = (f0Var.f463294t != null ? r3.f339043a : 0) + 1;
        emoticonBoardExpandStruct.k();
        com.tencent.mm.pluginsdk.ui.g1 g1Var2 = f0Var.f463278d;
        if (g1Var2 != null) {
            g1Var2.f(f0Var.f463293s == f0Var.f463290p);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setSmileyPanelExpandableOnSimpleMode(boolean z17) {
        setSmileyPanelExpandable(z17);
        ym5.f0 f0Var = this.f213462f.f213635k;
        if (f0Var != null) {
            if (z17) {
                f0Var.f463278d = new com.tencent.mm.view.manager.c(f0Var, this);
            } else {
                f0Var.f463278d = null;
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setTabBackgroundColor(int i17) {
        this.f213462f.f213637m.setBackgroundColor(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setTabBackgroundResource(int i17) {
        this.f213462f.f213637m.setBackgroundResource(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setTalkerName(java.lang.String str) {
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        dVar.f213645u = str;
        dVar.f213634j.f320570f = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.K0(str) || !(com.tencent.mm.storage.z3.m4(str) || com.tencent.mm.storage.z3.q4(str) || com.tencent.mm.storage.z3.L3(str));
        ir.h hVar = dVar.f213642r;
        boolean z18 = hVar.f293846e;
        ir.o oVar = dVar.f213643s;
        if (z18 != z17) {
            hVar.f293846e = z17;
            oVar.b();
        }
        if (com.tencent.mm.storage.z3.a4(dVar.f213645u) && hVar.f293848g) {
            hVar.f293848g = false;
            oVar.b();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel
    public void setToSendText(java.lang.String str) {
        this.f213462f.f213646v = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel, android.view.View
    public void setVisibility(int i17) {
        int i18;
        super.setVisibility(i17);
        com.tencent.mm.view.manager.d dVar = this.f213462f;
        if (i17 == 0) {
            dVar.a();
            dVar.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            nr.c cVar = dVar.O;
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("EmojiClickReport", "panelShow");
            cVar.f339034a = currentTimeMillis;
            cVar.f339035b = 1;
            nr.j jVar = dVar.Q;
            jVar.f339053a = currentTimeMillis;
            jVar.f339054b = 1;
            nr.h hVar = dVar.R;
            hVar.f339047a = currentTimeMillis;
            hVar.f339049c = 1;
            nr.i iVar = dVar.P;
            iVar.f339050a = currentTimeMillis;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(dVar.f213644t == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "panelData is null: %b", objArr);
            ir.j0 j0Var = dVar.f213644t;
            if (j0Var != null && (i18 = dVar.f213628d) >= 0 && i18 < ((ir.q) j0Var).f293891b.size()) {
                ir.j0 j0Var2 = dVar.f213644t;
                int i19 = dVar.f213628d;
                ir.q qVar = (ir.q) j0Var2;
                iVar.a(qVar.f293893d + i19, ((ir.r) qVar.f293891b.get(i19)).c());
            }
        } else {
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "onPause: ");
            dVar.f213626b = false;
            dVar.E.a();
            if (!com.tencent.mm.smiley.c0.f193232h) {
                com.tencent.mm.smiley.c0.f193232h = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "pause");
                kotlinx.coroutines.l.d(com.tencent.mm.smiley.c0.f193227c, null, null, new com.tencent.mm.smiley.u(null), 3, null);
            }
        }
        ym5.f0 f0Var = dVar.f213635k;
        if (f0Var != null) {
            boolean z17 = i17 == 0;
            com.tencent.mm.pluginsdk.ui.g1 g1Var = f0Var.f463278d;
            if (g1Var != null) {
                g1Var.e(z17);
            }
        }
    }

    public SmileyPanelImpl(android.content.Context context, android.util.AttributeSet attributeSet, boolean z17) {
        super(new com.tencent.mm.ui.xb(context, z17 ? com.tencent.mm.R.style.f494156fo : com.tencent.mm.R.style.f494155fn), attributeSet);
        this.f213463g = false;
        this.f213464h = false;
        final com.tencent.mm.view.manager.d dVar = new com.tencent.mm.view.manager.d(getContext());
        this.f213462f = dVar;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a77, this);
        ym5.f0 f0Var = dVar.f213635k;
        f0Var.f463276b = inflate;
        dVar.f213630f = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.dcv);
        dVar.f213640p = (com.tencent.mm.ui.widget.pulldown.NestedBounceView) inflate.findViewById(com.tencent.mm.R.id.dcb);
        lr.p pVar = new lr.p(dVar.f213642r.f293842a, dVar.Q, dVar.O);
        dVar.f213634j = pVar;
        pVar.f320572h = dVar.f213623J;
        lr.x xVar = dVar.f213631g;
        xVar.f320608o = pVar;
        dVar.f213630f.setLayoutManager(dVar.f213632h);
        dVar.f213630f.setAdapter(xVar);
        dVar.f213630f.setHasFixedSize(true);
        dVar.f213630f.setFocusable(false);
        mr.i iVar = dVar.f213633i;
        iVar.f330826n = new mr.a() { // from class: com.tencent.mm.view.manager.d$$b
            @Override // mr.a
            public final void onPageSelected(int i17) {
                com.tencent.mm.view.manager.d.this.k(i17, true);
            }
        };
        iVar.b(dVar.f213630f);
        dVar.f213636l = inflate.findViewById(com.tencent.mm.R.id.t7s);
        dVar.f213639o = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.n0t);
        lr.c1 onItemClickListener = dVar.X;
        lr.f1 f1Var = dVar.f213641q;
        f1Var.getClass();
        kotlin.jvm.internal.o.g(onItemClickListener, "onItemClickListener");
        f1Var.f320518f = onItemClickListener;
        androidx.recyclerview.widget.RecyclerView recyclerView = dVar.f213639o;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
        dVar.f213639o.setAdapter(f1Var);
        dVar.f213639o.setItemAnimator(null);
        dVar.f213639o.i(dVar.Y);
        dVar.f213637m = inflate.findViewById(com.tencent.mm.R.id.dcy);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dcc);
        dVar.f213638n = imageView;
        imageView.setOnClickListener(new com.tencent.mm.view.manager.j(dVar));
        f0Var.f463294t = dVar.N;
        pVar.f320571g = new yz5.a() { // from class: com.tencent.mm.view.manager.d$$c
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.view.manager.d dVar2 = com.tencent.mm.view.manager.d.this;
                java.lang.String str = dVar2.f213627c;
                ir.h hVar = dVar2.f213642r;
                hVar.f293856o = str;
                hVar.f293852k = gr.v.f274696a.c();
                dVar2.f213643s.b();
                return jz5.f0.f302826a;
            }
        };
        if (context instanceof androidx.fragment.app.FragmentActivity) {
            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
            fragmentActivity.runOnUiThread(new ym5.d5(this, fragmentActivity));
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            pr.z zVar = pr.k0.f357723q;
            zVar.b(false).b(true);
            zVar.a(false).b(true);
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                pm0.v.L("EmojiPackSyncManager_checkStart", true, pr.l.f357744d);
            }
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                pm0.v.L("EmojiSuggestWordsSync_checkWordListUpdate", true, jr.k.f301309d);
            }
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().b();
        }
    }
}
