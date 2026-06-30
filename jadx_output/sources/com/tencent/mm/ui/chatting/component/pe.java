package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.z0.class)
/* loaded from: classes9.dex */
public class pe extends com.tencent.mm.ui.chatting.component.a implements sb5.z0 {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f199684e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f199685f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f199687h;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.j f199692p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f199693q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.pf f199694r;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f199686g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f199688i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f199689m = 0;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContainer f199690n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.zb f199691o = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199695s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f199696t = false;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.bc f199697u = new com.tencent.mm.ui.chatting.component.qf(this);

    /* renamed from: v, reason: collision with root package name */
    public final e01.b f199698v = new com.tencent.mm.ui.chatting.component.df(this);

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Runnable f199699w = null;

    /* renamed from: x, reason: collision with root package name */
    public final kv.e0 f199700x = new com.tencent.mm.ui.chatting.component.ff(this);

    /* renamed from: y, reason: collision with root package name */
    public final l75.q0 f199701y = new com.tencent.mm.ui.chatting.component.gf(this);

    /* renamed from: z, reason: collision with root package name */
    public final e01.g f199702z = new com.tencent.mm.ui.chatting.component.Cif(this);
    public final e01.g A = new com.tencent.mm.ui.chatting.component.kf(this);
    public final android.view.View.OnClickListener B = new com.tencent.mm.ui.chatting.component.nf(this);
    public final android.view.View.OnClickListener C = new com.tencent.mm.ui.chatting.component.of(this);
    public final android.view.MenuItem.OnMenuItemClickListener D = new com.tencent.mm.ui.chatting.component.qe(this);
    public android.view.View E = null;

    public static void m0(com.tencent.mm.ui.chatting.component.pe peVar) {
        peVar.getClass();
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        android.app.Activity g17 = peVar.f198580d.g();
        java.lang.String username = peVar.f198580d.u().d1();
        kotlin.jvm.internal.o.g(username, "username");
        boolean z17 = false;
        ((we0.j1) l0Var).sj(g17, new bi4.h1(username, 3, 151L, false, false, null, new bi4.i1(0.0f, 0, 3, null), null));
        yb5.d dVar = peVar.f198580d;
        if (dVar != null && dVar.D()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(peVar.f198580d.u().d1(), 2L);
        xe0.l0 l0Var2 = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String d17 = peVar.f198580d.u().d1();
        ((we0.j1) l0Var2).mj("single_status_icon", "view_clk", new xe0.n0(d17, d17, d17, d17));
    }

    public void A0(int i17) {
        B0(this.f198580d.s().getString(i17));
    }

    public void B0(java.lang.CharSequence charSequence) {
        android.view.View findViewById;
        if (com.tencent.mm.storage.z3.q4(this.f198580d.x()) || ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) this.f198580d.f460708c.a(sb5.n.class))).t0()) {
            this.f199692p.g(charSequence);
            yb5.d dVar = this.f198580d;
            dVar.f460717l.updateDescription(dVar.g().getString(com.tencent.mm.R.string.f490850b13, charSequence));
            return;
        }
        if (!com.tencent.mm.storage.z3.m4(this.f198580d.u().d1())) {
            android.text.SpannableString bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this.f198580d.g(), charSequence, i65.a.h(this.f198580d.g(), com.tencent.mm.R.dimen.f479568k));
            this.f199692p.g(bj6);
            if (!com.tencent.mm.storage.z3.R4(this.f198580d.x()) && (findViewById = this.f198580d.f460717l.findViewById(com.tencent.mm.R.id.obp)) != null) {
                findViewById.setOnClickListener(this.B);
            }
            yb5.d dVar2 = this.f198580d;
            dVar2.f460717l.updateDescription(dVar2.g().getString(com.tencent.mm.R.string.f490850b13, bj6));
            return;
        }
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String charSequence2 = charSequence.toString();
        this.f198580d.u().Q0();
        i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479568k);
        ((l41.q2) b0Var).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence2);
        this.f199692p.g(i17);
        yb5.d dVar3 = this.f198580d;
        dVar3.f460717l.updateDescription(dVar3.g().getString(com.tencent.mm.R.string.f490850b13, i17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0276, code lost:
    
        if (r10 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03d2, code lost:
    
        if (((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).c(r18.f198580d.x()) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0514, code lost:
    
        if (((r3 == null || r3.u() == null) ? false : r1.f198580d.u().m2()) != false) goto L172;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C() {
        /*
            Method dump skipped, instructions count: 2336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.pe.C():void");
    }

    public void C0(boolean z17, android.view.View.OnClickListener onClickListener, java.lang.String str) {
        com.tencent.mm.ui.j jVar = this.f199692p;
        if (onClickListener == null) {
            jVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.ActionBarCustomArea", "setMMTitleGotoBtn, onClickListener is null");
            return;
        }
        android.widget.TextView textView = jVar.f208971d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = jVar.f208975h;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = jVar.f208978k;
        android.view.ViewGroup viewGroup = jVar.f208974g;
        android.view.ViewGroup viewGroup2 = jVar.f208977j;
        if (z17) {
            weImageView2.setVisibility(0);
            weImageView2.setIconColor(jVar.f208976i.getCurrentTextColor());
            weImageView2.setContentDescription(str);
            viewGroup2.setOnClickListener(onClickListener);
            com.tencent.mm.ui.tools.d8.a(viewGroup2);
            weImageView.setVisibility(8);
            viewGroup.setOnClickListener(null);
            viewGroup.setClickable(false);
            viewGroup.setFocusable(true);
            viewGroup.setOnTouchListener(null);
        } else {
            weImageView.setVisibility(0);
            weImageView.setIconColor(textView.getCurrentTextColor());
            weImageView.setContentDescription(str);
            viewGroup.setOnClickListener(onClickListener);
            com.tencent.mm.ui.tools.d8.a(viewGroup);
            weImageView2.setVisibility(8);
            viewGroup2.setOnClickListener(null);
            viewGroup2.setClickable(false);
            viewGroup2.setFocusable(true);
            viewGroup2.setOnTouchListener(null);
        }
        if (z17) {
            textView.post(new com.tencent.mm.ui.i(jVar));
        } else {
            textView.post(new com.tencent.mm.ui.h(jVar));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        J0(true);
        if (((com.tencent.mm.ui.chatting.component.u7) ((sb5.h0) this.f198580d.f460708c.a(sb5.h0.class))).G()) {
            C();
            ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(this.f198580d.x(), 5);
            bi4.w0 w0Var = (bi4.w0) i95.n0.c(bi4.w0.class);
            android.app.Activity context = this.f198580d.g();
            java.lang.String x17 = this.f198580d.x();
            ki4.x xVar = (ki4.x) w0Var;
            xVar.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            mj4.w Ai = xVar.Ai(x17);
            ki4.g0 g0Var = ki4.g0.f308132a;
            java.lang.String str = Ai != null ? Ai.field_userName : null;
            if (str == null) {
                str = "";
            }
            g0Var.c(context, kz5.b0.c(str), "chat");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x055f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E0() {
        /*
            Method dump skipped, instructions count: 1543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.pe.E0():void");
    }

    public void F0(int i17) {
        if (com.tencent.mm.storage.z3.j4(this.f198580d.x()) || com.tencent.mm.storage.z3.B3(this.f198580d.x()) || com.tencent.mm.storage.z3.F4(this.f198580d.x())) {
            com.tencent.mm.ui.j jVar = this.f199692p;
            jVar.getClass();
            jVar.f208979l.setVisibility(8);
            return;
        }
        if (((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) this.f198580d.f460708c.a(sb5.p.class))).f200273m) {
            com.tencent.mm.ui.j jVar2 = this.f199692p;
            jVar2.getClass();
            jVar2.f208979l.setVisibility(8);
            return;
        }
        com.tencent.mm.storage.z3 u17 = this.f198580d.u();
        if (u17 != null && u17.m2() && !u17.w2()) {
            com.tencent.mm.ui.j jVar3 = this.f199692p;
            jVar3.getClass();
            jVar3.f208979l.setVisibility(8);
        } else {
            com.tencent.mm.ui.j jVar4 = this.f199692p;
            boolean z17 = i17 == 0;
            jVar4.getClass();
            jVar4.f208979l.setVisibility(z17 ? 0 : 8);
        }
    }

    public void G0(int i17) {
        com.tencent.mm.ui.j jVar = this.f199692p;
        boolean z17 = i17 == 0;
        jVar.getClass();
        jVar.f208981n.setVisibility(z17 ? 0 : 8);
    }

    public void H0(int i17) {
        com.tencent.mm.ui.j jVar = this.f199692p;
        boolean z17 = i17 == 0;
        android.widget.ImageView imageView = jVar.f208983p;
        if (!z17) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.chat_reject_title_icon : com.tencent.mm.R.raw.chat_reject_icon);
            imageView.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        I0();
    }

    public final void I0() {
        if (gm0.j1.b().m()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().q(this.f199700x);
            c01.d9.b().l().remove(this.f199701y);
        }
        this.f198580d.q().removeCallbacks(this.f199699w);
        java.util.Map map = c01.v1.f37519a;
        rn3.m.f397960a.remove("30001001_1");
        if (this.f199694r != null) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(this.f199694r);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        android.widget.LinearLayout linearLayout;
        if (this.f198580d.D() && (linearLayout = this.f199685f) != null && linearLayout.getVisibility() == 0) {
            c01.v1.F(this.f198580d.u().d1());
        }
        if (com.tencent.mm.storage.z3.S4(this.f198580d.x())) {
            this.f198580d.f460717l.removeOptionMenu(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J0(boolean r10) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.pe.J0(boolean):void");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mm.plugin.textstatus.ui.e0 e0Var;
        I0();
        w0();
        java.lang.ref.WeakReference weakReference = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).f445130d;
        if (weakReference == null || (e0Var = (com.tencent.mm.plugin.textstatus.ui.e0) weakReference.get()) == null) {
            return;
        }
        e0Var.dismiss();
    }

    public void K0(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        L0(i17, i18, i19, "", onMenuItemClickListener);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        if (this.f198580d.f460717l.isSupportNavigationSwipeBack()) {
            com.tencent.mm.ui.zb zbVar = new com.tencent.mm.ui.zb();
            this.f199691o = zbVar;
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
            zbVar.f212616y0 = baseChattingUIFragment;
            zbVar.A0 = new ma5.e(baseChattingUIFragment.thisActivity(), zbVar);
            this.f198580d.f460717l.setActivityController(this.f199691o);
        }
    }

    public final void L0(int i17, int i18, int i19, java.lang.String str, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        com.tencent.mm.ui.eb findMenuInfo = this.f198580d.f460717l.findMenuInfo(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (findMenuInfo == null) {
                this.f198580d.f460717l.addIconOptionMenu(i17, i18, i19, onMenuItemClickListener);
                return;
            } else {
                this.f198580d.f460717l.updateOptionMenu(i17, i18, i19, onMenuItemClickListener);
                return;
            }
        }
        if (findMenuInfo == null) {
            this.f198580d.f460717l.addIconOptionMenu(i17, i18, i19, onMenuItemClickListener);
            findMenuInfo = this.f198580d.f460717l.findMenuInfo(i17);
        } else {
            this.f198580d.f460717l.updateOptionMenu(i17, i18, i19, onMenuItemClickListener);
        }
        if (findMenuInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.HeaderComponent", "updateMenuInfo menuInfo == null");
            return;
        }
        this.f199694r = new com.tencent.mm.ui.chatting.component.pf(this, i17, str, findMenuInfo);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f199694r);
        com.tencent.mm.plugin.newtips.model.i.a(this.f199694r);
        if (findMenuInfo.f208387m) {
            com.tencent.mm.ui.chatting.component.pf pfVar = this.f199694r;
            com.tencent.mm.plugin.newtips.model.r rVar = com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT;
            pfVar.getClass();
            com.tencent.mm.plugin.newtips.model.i.b(pfVar, rVar, true);
        }
    }

    public void M0() {
        if (this.f198580d.g() instanceof com.tencent.mm.ui.conversation.EnterpriseConversationUI) {
            this.f199692p.h(this.f199689m);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "unreadSum:%s", java.lang.Integer.valueOf(this.f199689m));
            return;
        }
        if (!(this.f198580d.g() instanceof com.tencent.mm.ui.LauncherUI) && !(this.f198580d.g() instanceof com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI)) {
            android.widget.TextView textView = this.f199692p.f208972e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.chatting.component.mf mfVar = new com.tencent.mm.ui.chatting.component.mf(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(mfVar, 200L, "setChattingConversationUnread");
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        int i17 = this.f198580d.s().getConfiguration().orientation;
        int i18 = configuration.orientation;
        this.f198580d.s().getConfiguration().orientation = configuration.orientation;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "[dealOrientationChange] %s", ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e.getContext().getResources().getConfiguration());
        if ((this.f199690n != null) & (this.f199693q != null)) {
            int c17 = fp.a.c(this.f198580d.g());
            this.f199693q.setMinimumHeight(c17);
            android.view.ViewGroup.LayoutParams layoutParams = this.f199693q.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            }
            layoutParams.height = c17;
            this.f199693q.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f199690n.getLayoutParams();
            layoutParams2.height = c17;
            this.f199690n.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.ui.zb zbVar = this.f199691o;
        if (zbVar != null) {
            zbVar.A0.f325232e.r(configuration);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        t0();
    }

    public void n0() {
        if (this.f198580d.f460717l.hasDestory) {
            return;
        }
        u0();
        androidx.appcompat.app.b supportActionBar = ((androidx.appcompat.app.AppCompatActivity) this.f198580d.g()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.G(0.0f);
        }
        if (this.f199685f == null) {
            com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.p2p);
            this.f199685f = (android.widget.LinearLayout) this.f198580d.g().findViewById(com.tencent.mm.R.id.g7j);
        }
        this.f199685f.removeAllViews();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f198580d.g().getLayoutInflater().inflate(com.tencent.mm.R.layout.f488575xp, (android.view.ViewGroup) null);
        this.f199685f.addView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -2));
        this.f199685f.setVisibility(0);
        linearLayout.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f199687h)) {
            this.f198580d.u().getClass();
        }
        android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.bhf);
        if (((com.tencent.mm.ui.chatting.component.pg) ((sb5.b1) this.f198580d.f460708c.a(sb5.b1.class))).f199710e) {
            sb5.b1 b1Var = (sb5.b1) this.f198580d.f460708c.a(sb5.b1.class);
            android.widget.LinearLayout linearLayout2 = this.f199685f;
            com.tencent.mm.ui.chatting.component.pg pgVar = (com.tencent.mm.ui.chatting.component.pg) b1Var;
            if (pgVar.f199711f == null) {
                com.tencent.mm.storage.t8 D0 = r21.w.Bi().D0(pgVar.f199713h, 1);
                if (D0 != null) {
                    ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f482697ll)).setText(D0.field_sayhicontent);
                    ((android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.bhf)).setText(com.tencent.mm.R.string.b3h);
                } else {
                    linearLayout2.setVisibility(8);
                }
            } else if (pgVar.f199712g) {
                ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f482697ll)).setText(com.tencent.mm.R.string.b3j);
                button.setVisibility(8);
            } else {
                ((android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f482697ll)).setText(com.tencent.mm.R.string.b3k);
                ((android.widget.Button) linearLayout.findViewById(com.tencent.mm.R.id.bhf)).setText(com.tencent.mm.R.string.b3i);
            }
        }
        linearLayout.setOnClickListener(new com.tencent.mm.ui.chatting.component.ue(this));
        button.setOnClickListener(new com.tencent.mm.ui.chatting.component.ye(this, linearLayout));
        android.view.View decorView = this.f198580d.g().getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.chatting.component.ze(this, decorView));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11004, this.f199687h, 1);
    }

    public final void o0() {
        android.widget.LinearLayout linearLayout;
        if (this.f198580d.g() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.HeaderComponent", "getActivity is null");
            return;
        }
        w0();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f198580d.g().findViewById(com.tencent.mm.R.id.bk8);
        s35.a a17 = com.tencent.mm.ui.conversation.banner.j.a(this.f198580d.g(), com.tencent.mm.ui.conversation.banner.i.CHATTING_MONITORED_HINT, new java.lang.Object[]{e01.c.Chatting});
        if (viewGroup == null || a17 == null || (linearLayout = ((s35.b) a17).f402843h) == null || this.E != null) {
            return;
        }
        this.E = linearLayout;
        viewGroup.addView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -2));
    }

    public final void p0() {
        s35.a aVar;
        android.widget.LinearLayout linearLayout;
        if (this.f198580d.D() || this.f199684e == null) {
            u0();
            return;
        }
        u0();
        if (this.f199684e.getTag() == null) {
            aVar = com.tencent.mm.ui.conversation.banner.j.a(this.f198580d.g(), com.tencent.mm.ui.conversation.banner.i.CHATTING_RECOMMEND_BANNER, new java.lang.Object[]{this.f198580d.x(), this.f198580d.w()});
            if (aVar != null && (linearLayout = ((s35.b) aVar).f402843h) != null) {
                this.f199684e.addView(linearLayout, new android.view.ViewGroup.LayoutParams(-1, -2));
            }
        } else {
            aVar = (s35.a) this.f199684e.getTag();
        }
        if (aVar != null) {
            this.f199684e.setVisibility(0);
            this.f199684e.setTag(aVar);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11003, this.f198580d.x(), 1, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (c01.e2.N(r8.f198580d.x()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0() {
        /*
            r8 = this;
            yb5.d r0 = r8.f198580d
            java.lang.String r0 = r0.x()
            boolean r0 = com.tencent.mm.storage.z3.S4(r0)
            r1 = 3
            com.tencent.mm.ui.bc r7 = r8.f199697u
            if (r0 == 0) goto L3f
            com.tencent.mm.plugin.newtips.model.e r0 = rn3.i.Ai()
            boolean r0 = r0.e(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "MicroMsg.ChattingUI.HeaderComponent"
            java.lang.String r2 = "clicfg_android_open_wxpay_search is open"
            com.tencent.mars.xlog.Log.i(r1, r2)
            r1 = 2131689491(0x7f0f0013, float:1.9007999E38)
            r2 = 4
            r3 = 2131778277(0x7f105ae5, float:1.9188078E38)
            r8.K0(r2, r3, r1, r7)
            yb5.d r1 = r8.f198580d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r1.f460717l
            r3 = 0
            r4 = 2131755190(0x7f1000b6, float:1.9141252E38)
            r5 = 2131689503(0x7f0f001f, float:1.9008023E38)
            boolean r6 = r0.booleanValue()
            r2.addIconOptionMenu(r3, r4, r5, r6, r7)
            goto La0
        L3f:
            yb5.d r0 = r8.f198580d
            java.lang.String r0 = r0.x()
            boolean r0 = com.tencent.mm.storage.z3.D4(r0)
            if (r0 != 0) goto L82
            yb5.d r0 = r8.f198580d
            java.lang.String r0 = r0.x()
            boolean r0 = com.tencent.mm.storage.z3.U4(r0)
            if (r0 != 0) goto L82
            yb5.d r0 = r8.f198580d
            java.lang.String r0 = r0.x()
            boolean r0 = com.tencent.mm.storage.z3.P4(r0)
            if (r0 != 0) goto L82
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r2 = e42.d0.clicfg_minishop_plugin_enabled
            h62.d r0 = (h62.d) r0
            r3 = 1
            int r0 = r0.Ni(r2, r3)
            if (r3 != r0) goto La0
            yb5.d r0 = r8.f198580d
            java.lang.String r0 = r0.x()
            boolean r0 = c01.e2.N(r0)
            if (r0 == 0) goto La0
        L82:
            com.tencent.mm.plugin.newtips.model.e r0 = rn3.i.Ai()
            boolean r0 = r0.e(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            yb5.d r1 = r8.f198580d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r1.f460717l
            r3 = 0
            r4 = 2131755190(0x7f1000b6, float:1.9141252E38)
            r5 = 2131689503(0x7f0f001f, float:1.9008023E38)
            boolean r6 = r0.booleanValue()
            r2.addIconOptionMenu(r3, r4, r5, r6, r7)
        La0:
            r8.M0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.pe.q0():void");
    }

    public int r0() {
        android.widget.LinearLayout linearLayout = this.f199684e;
        if (linearLayout == null || !linearLayout.isShown()) {
            return 0;
        }
        return 0 + this.f199684e.getHeight();
    }

    public final void s0(int i17) {
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.t8.K0(this.f199687h) ? this.f198580d.u().d1() : this.f199687h;
        if (d17 == null || d17.equals("")) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", d17);
        intent.putExtra("Contact_Encryptusername", true);
        intent.putExtra("chat_from_scene", this.f198580d.f460717l.getIntExtra("chat_from_scene", 0));
        intent.putExtra("chat_session", this.f198580d.f460722q);
        if (((com.tencent.mm.ui.chatting.component.pg) ((sb5.b1) this.f198580d.f460708c.a(sb5.b1.class))).f199710e) {
            ((com.tencent.mm.ui.chatting.component.pg) ((sb5.b1) this.f198580d.f460708c.a(sb5.b1.class))).getClass();
            intent.putExtra("Contact_IsLBSFriend", true);
            intent.putExtra("Contact_IsLbsChattingProfile", true);
            intent.putExtra("Contact_Scene", 18);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11004, this.f199687h, 2);
        }
        if (i17 != -1) {
            intent.putExtra("Contact_Scene", i17);
        }
        intent.putExtra("CONTACT_INFO_UI_SOURCE", this.f198580d.D() ? 3 : 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "gotoContactInfoUI() called with: addContactScene = [" + i17 + "]");
        j45.l.j(this.f198580d.g(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public void t0() {
        androidx.appcompat.app.b N;
        boolean z17 = this.f198580d.f460717l.isCurrentActivity;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "handleActionBar isCurrentActivity=" + z17 + " isSupportCustomActionBar=" + this.f198580d.f460717l.isSupportNavigationSwipeBack());
        if (z17 || !this.f198580d.f460717l.isSupportNavigationSwipeBack()) {
            N = al5.p0.N(((androidx.appcompat.app.AppCompatActivity) this.f198580d.g()).getSupportActionBar());
            android.view.View v07 = v0(null);
            N.y(v07);
            this.f199692p = new com.tencent.mm.ui.j(v07);
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f199690n.findViewById(com.tencent.mm.R.id.f482432ef);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "mActionBarContainer %s", this.f199690n);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "ctxView %s", this.f199690n.findViewById(com.tencent.mm.R.id.f482459f3));
            viewGroup.setVisibility(0);
            N = al5.p0.N(this.f199691o.F());
            android.view.View v08 = v0(viewGroup);
            N.y(v08);
            this.f199692p = new com.tencent.mm.ui.j(v08);
            int l17 = N.l();
            if (l17 == 0) {
                android.util.DisplayMetrics displayMetrics = this.f198580d.s().getDisplayMetrics();
                l17 = displayMetrics.widthPixels > displayMetrics.heightPixels ? this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax) : this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
            }
            android.view.View findViewById = v08.findViewById(com.tencent.mm.R.id.nqs);
            if (findViewById != null) {
                if (((com.tencent.mm.ui.chatting.component.h3) ((sb5.s) this.f198580d.f460708c.a(sb5.s.class))).u()) {
                    l17 = this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479784f5);
                    int dimensionPixelSize = this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                    findViewById.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    viewGroup.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
                } else {
                    findViewById.setPadding(0, 0, 0, 0);
                    viewGroup.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay)));
                }
            }
            v08.setMinimumHeight(l17);
            android.view.ViewGroup.LayoutParams layoutParams = v08.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            }
            layoutParams.height = l17;
            layoutParams.width = -1;
            v08.setLayoutParams(layoutParams);
        }
        boolean C = com.tencent.mm.ui.bk.C();
        if (N.j() != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) N.j().findViewById(com.tencent.mm.R.id.a4p);
            if (imageView != null && C) {
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
                } else {
                    imageView.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
                }
            }
            android.widget.TextView textView = (android.widget.TextView) N.j().findViewById(com.tencent.mm.R.id.obn);
            if (textView != null) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                if (C) {
                    textView.setTextColor(this.f198580d.s().getColor(com.tencent.mm.R.color.by));
                }
            }
            android.widget.TextView textView2 = (android.widget.TextView) N.j().findViewById(com.tencent.mm.R.id.nqs);
            if (textView2 != null && C) {
                textView2.setTextColor(this.f198580d.s().getColor(com.tencent.mm.R.color.by));
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) N.j().findViewById(com.tencent.mm.R.id.f486060k10);
            if (imageView2 != null && C) {
                if (imageView2.getDrawable() != null) {
                    imageView2.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
                } else {
                    imageView2.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
                }
            }
            android.widget.ImageView imageView3 = (android.widget.ImageView) N.j().findViewById(com.tencent.mm.R.id.f486298ku4);
            if (imageView3 != null && C) {
                if (imageView3.getDrawable() != null) {
                    imageView3.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
                } else {
                    imageView3.setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
                }
            }
        }
        com.tencent.mm.ui.j jVar = this.f199692p;
        jVar.getClass();
        jVar.f208982o.setVisibility(8);
        N.C((N.k() | 16) & (-5) & (-3) & (-9));
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f199686g;
        linkedList.clear();
        linkedList.add(this.f198580d.f460717l.getStringExtra("Chat_User"));
        if (!this.f198580d.f460717l.getBooleanExtra("key_record_msg_select", false).booleanValue()) {
            x0(this.D);
            return;
        }
        this.f199692p.b(com.tencent.mm.R.string.f490347sg);
        android.widget.TextView textView3 = this.f199692p.f208972e;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        this.f199692p.f208988u = false;
    }

    public final void u0() {
        this.f199684e.setVisibility(8);
        android.widget.LinearLayout linearLayout = this.f199685f;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final android.view.View v0(android.view.ViewGroup viewGroup) {
        android.view.View view = this.f199693q;
        if (view == null) {
            if (viewGroup == null) {
                this.f199693q = com.tencent.mm.ui.id.b(this.f198580d.g()).inflate(com.tencent.mm.R.layout.f487908ba, (android.view.ViewGroup) null);
            } else {
                this.f199693q = com.tencent.mm.ui.id.b(this.f198580d.g()).inflate(com.tencent.mm.R.layout.f487908ba, viewGroup, false);
            }
            return this.f199693q;
        }
        if (view.getParent() == null) {
            return this.f199693q;
        }
        if (this.f199693q.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) this.f199693q.getParent()).removeView(this.f199693q);
            return this.f199693q;
        }
        if (viewGroup == null) {
            this.f199693q = com.tencent.mm.ui.id.b(this.f198580d.g()).inflate(com.tencent.mm.R.layout.f487908ba, (android.view.ViewGroup) null);
        } else {
            this.f199693q = com.tencent.mm.ui.id.b(this.f198580d.g()).inflate(com.tencent.mm.R.layout.f487908ba, viewGroup, false);
        }
        return this.f199693q;
    }

    public final void w0() {
        android.view.View view;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f198580d.g().findViewById(com.tencent.mm.R.id.bk8);
        if (viewGroup == null || (view = this.E) == null) {
            return;
        }
        viewGroup.removeView(view);
        this.E = null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        c01.d9.b().n().a(this.f199702z);
        c01.d9.b().o().a(this.A);
        e01.d m17 = c01.d9.b().m();
        e01.b bVar = this.f199698v;
        m17.getClass();
        synchronized (e01.d.class) {
            m17.f245844a.add(bVar);
        }
        if (!this.f199696t) {
            q0();
        }
        this.f199696t = false;
    }

    public void x0(final android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.chatting.component.pe$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.ui.chatting.component.pe peVar = com.tencent.mm.ui.chatting.component.pe.this;
                peVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener2 = onMenuItemClickListener;
                arrayList.add(onMenuItemClickListener2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/chatting/component/HeaderComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", peVar, array);
                if (!peVar.f198580d.f460717l.isScreenEnable()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.HeaderComponent", "Actionbar customView onclick screen not enable");
                    yj0.a.h(peVar, "com/tencent/mm/ui/chatting/component/HeaderComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                view.setSelected(false);
                view.setPressed(false);
                view.clearFocus();
                view.invalidate();
                view.post(new com.tencent.mm.ui.chatting.component.af(peVar, onMenuItemClickListener2));
                com.tencent.mm.ui.chatting.component.ej ejVar = (com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) peVar.f198580d.f460708c.a(sb5.p1.class));
                if (!ejVar.f198982m && !ejVar.n0()) {
                    a14.a.a().f582a.f60361h = ejVar.m0();
                }
                yj0.a.h(peVar, "com/tencent/mm/ui/chatting/component/HeaderComponent", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        if (this.f198580d.l() == null || !this.f198580d.l().f7(this, onClickListener)) {
            this.f199692p.c(onClickListener);
            com.tencent.mm.ui.chatting.component.y2 y2Var = (com.tencent.mm.ui.chatting.component.y2) ((sb5.p) this.f198580d.f460708c.a(sb5.p.class));
            y2Var.m0();
            int i17 = y2Var.f200268e.booleanValue() ? y2Var.f200273m ? com.tencent.mm.R.drawable.bu9 : com.tencent.mm.R.drawable.f481878ah0 : 0;
            if (i17 > 0) {
                this.f199692p.a(i17);
            } else {
                this.f199692p.a(0);
            }
            if (this.f198580d.f460717l.getIntExtra("Chat_BackBtnStyle", 0) == 1) {
                this.f199692p.b(com.tencent.mm.R.string.f490356so);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (gm0.j1.b().m()) {
            e01.e n17 = c01.d9.b().n();
            ((java.util.ArrayList) n17.f245838a).remove(this.f199702z);
            e01.f o17 = c01.d9.b().o();
            ((java.util.ArrayList) o17.f245838a).remove(this.A);
            e01.d m17 = c01.d9.b().m();
            e01.b bVar = this.f199698v;
            m17.getClass();
            synchronized (e01.d.class) {
                m17.f245844a.remove(bVar);
            }
        }
    }

    public void y0(java.lang.String str) {
        bi4.c cVar;
        java.lang.String str2;
        boolean z17;
        this.f199692p.e(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(this.f198580d.g(), str, i65.a.h(this.f198580d.g(), com.tencent.mm.R.dimen.f479853h2)));
        if (((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(this.f198580d.u().d1())) {
            if (!com.tencent.mm.storage.z3.R4(this.f198580d.x())) {
                int b17 = i65.a.b(this.f198580d.g(), 14);
                xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
                android.widget.TextView textView = this.f199692p.f208976i;
                java.lang.String x17 = this.f198580d.x();
                bi4.c cVar2 = bi4.c.CONVERSATION_LIST;
                bi4.d dVar = bi4.d.OUTLINED;
                int b18 = i65.a.b(this.f198580d.g(), 16);
                xe0.r0 a17 = new xe0.r0().a().a();
                a17.f453773a = b18;
                a17.f453778f = true;
                a17.f453780h = xe0.p0.f453768e;
                xe0.u0 a18 = a17.a();
                ((we0.j1) l0Var).getClass();
                if (textView != null && !r26.n0.N(x17) && ze0.a.f471753a.b(cVar2, x17)) {
                    if (di4.i.d()) {
                        cVar = cVar2;
                        str2 = x17;
                        ze0.f.f471758a.b(textView, x17, cVar2, dVar, true, b17, a18, null);
                        z17 = true;
                    } else {
                        z17 = false;
                        cVar = cVar2;
                        str2 = x17;
                    }
                    if (!z17) {
                        new ej4.z(str2, textView, b17, dVar, cVar);
                    }
                }
                android.widget.TextView textView2 = this.f199692p.f208976i;
                if (textView2 != null) {
                    ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
                    if (di4.i.d()) {
                        textView2.setPadding(0, i65.a.b(this.f198580d.g(), 1), 0, i65.a.b(this.f198580d.g(), 2));
                    }
                    textView2.requestLayout();
                }
                android.view.View findViewById = this.f198580d.f460717l.findViewById(com.tencent.mm.R.id.nqu);
                if (findViewById != null) {
                    findViewById.setOnClickListener(this.C);
                }
                com.tencent.mm.ui.chatting.component.jg jgVar = (com.tencent.mm.ui.chatting.component.jg) this.f198580d.f460708c.a(com.tencent.mm.ui.chatting.component.jg.class);
                if (jgVar != null) {
                    java.lang.String x18 = this.f198580d.x();
                    com.tencent.mm.ui.chatting.component.w7 w7Var = (com.tencent.mm.ui.chatting.component.w7) jgVar;
                    xe0.l0 l0Var2 = (xe0.l0) i95.n0.c(xe0.l0.class);
                    if (l0Var2 == null || !di4.i.d()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "attachWatch skip: iconStyleUpgrade=false");
                    } else {
                        if (x18.length() == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "attachWatch skip: username null/empty");
                        } else if (com.tencent.mm.storage.z3.R4(x18)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "attachWatch skip: chatroom username=".concat(x18));
                        } else if (!kotlin.jvm.internal.o.b(w7Var.f200158f, x18) || w7Var.f200157e == null) {
                            if (w7Var.f200157e != null) {
                                w7Var.m0("attachWatch_switch_talker");
                            }
                            w7Var.f200158f = x18;
                            w7Var.f200159g = ((we0.j1) l0Var2).aj(x18);
                            w7Var.f200157e = new com.tencent.mm.ui.chatting.component.v7(w7Var, x18);
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingTextStatusHeaderComponent", "attachWatch register username=" + x18 + " initHasStatus=" + w7Var.f200159g);
                        }
                    }
                }
            }
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.textstatus.flutter.RepairerConfigTextStatusShowDialogOnFlutter())) {
                we0.u0 u0Var = (we0.u0) ((xe0.c0) i95.n0.c(xe0.c0.class));
                u0Var.getClass();
                boolean Vi = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Vi();
                if (u0Var.f445171f || Vi) {
                    return;
                }
                com.tencent.mars.xlog.Log.i(u0Var.f445169d, "openStatusPage: ready preloadEngineGroup");
                u0Var.f445171f = true;
                kotlinx.coroutines.l.d(u0Var.f445170e, null, null, new we0.t0(null), 3, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f199688i = this.f198580d.f460717l.getIntExtra("add_scene", 0);
        this.f199689m = this.f198580d.f460717l.getIntExtra("key_chat_unread", 0);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this.f199700x);
        c01.d9.b().l().add(this.f199701y);
        x0(this.D);
        q0();
        C();
        M0();
        E0();
        u0();
        this.f199696t = true;
        java.lang.String x17 = this.f198580d.x();
        com.tencent.mm.ui.chatting.component.bf bfVar = new com.tencent.mm.ui.chatting.component.bf(this);
        if (c01.v1.w() && !com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            if (com.tencent.mm.sdk.platformtools.o4.M("room_upgrade_to_wework").getBoolean(x17, false)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom %s member isHandle", x17);
                return;
            }
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(x17);
            if (z07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "handleAssociateOpenImChatroom %s member is null", x17);
            } else {
                c01.v1.s(x17, z07.field_roomowner, z07.field_memberCount, z07.field_chatroomStatus, bfVar);
            }
        }
    }
}
