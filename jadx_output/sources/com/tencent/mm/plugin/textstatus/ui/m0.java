package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class m0 implements bi4.n0, bi4.p0, android.view.View.OnClickListener {
    public final android.widget.FrameLayout A;
    public final android.view.View.OnAttachStateChangeListener B;
    public final com.tencent.mm.plugin.textstatus.ui.MiniStatusCardView$likeUIChangeEvent$1 C;
    public java.lang.String D;
    public java.lang.String E;
    public long F;
    public final bi4.m0 G;
    public pj4.o0 H;
    public al5.a0 I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View.OnClickListener f174063J;
    public bi4.m0 K;

    /* renamed from: d, reason: collision with root package name */
    public final bi4.k1 f174064d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f174065e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f174066f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f174067g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f174068h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f174069i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f174070m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f174071n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f174072o;

    /* renamed from: p, reason: collision with root package name */
    public mj4.h f174073p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.FrameLayout f174074q;

    /* renamed from: r, reason: collision with root package name */
    public final cj4.l1 f174075r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f174076s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f174077t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewGroup f174078u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f174079v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f174080w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f174081x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.ViewGroup f174082y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f174083z;

    /* JADX WARN: Type inference failed for: r7v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.textstatus.ui.MiniStatusCardView$likeUIChangeEvent$1] */
    public m0(final android.content.Context context, bi4.k1 showParam) {
        android.view.View view;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(showParam, "showParam");
        this.f174064d = showParam;
        this.f174065e = "MicroMsg.TextStatus.MiniStatusCardView@" + hashCode();
        jz5.h.b(com.tencent.mm.plugin.textstatus.ui.h0.f173919d);
        jz5.h.b(com.tencent.mm.plugin.textstatus.ui.i0.f173970d);
        jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.j0(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.don, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f174066f = inflate;
        this.f174067g = context;
        com.tencent.mm.plugin.textstatus.ui.g0 g0Var = new com.tencent.mm.plugin.textstatus.ui.g0(this);
        this.B = g0Var;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r76 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusLikeUIChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.MiniStatusCardView$likeUIChangeEvent$1
            {
                this.__eventId = 779616605;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusLikeUIChangeEvent statusLikeUIChangeEvent) {
                com.tencent.mm.autogen.events.StatusLikeUIChangeEvent event = statusLikeUIChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.textstatus.ui.m0 m0Var = com.tencent.mm.plugin.textstatus.ui.m0.this;
                mj4.h hVar = m0Var.f174073p;
                if (hVar == null) {
                    return false;
                }
                mj4.k kVar = (mj4.k) hVar;
                if (!en1.a.a().equals(kVar.o())) {
                    am.yx yxVar = event.f54868g;
                    java.lang.String str = yxVar.f8489b;
                    java.lang.String str2 = yxVar.f8490c;
                    if (!str.equals(kVar.o())) {
                        return false;
                    }
                    if (str2 == null || r26.n0.N(str2)) {
                        com.tencent.mars.xlog.Log.i(m0Var.f174065e, "likeUIChangeEvent: failed, ".concat(str));
                        return false;
                    }
                    boolean b17 = kotlin.jvm.internal.o.b(str2, kVar.l());
                    android.content.Context context2 = context;
                    if (!b17) {
                        if (yxVar.f8488a) {
                            kotlin.jvm.internal.o.g(context2, "context");
                            pf5.z zVar = pf5.z.f353948a;
                            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            ((com.tencent.mm.plugin.textstatus.ui.kd) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).O6(str2);
                            return false;
                        }
                        kotlin.jvm.internal.o.g(context2, "context");
                        pf5.z zVar2 = pf5.z.f353948a;
                        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        ((com.tencent.mm.plugin.textstatus.ui.kd) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).P6(str2);
                        return false;
                    }
                    boolean z17 = yxVar.f8488a;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = m0Var.f174070m;
                    if (z17) {
                        if (weImageView != null) {
                            weImageView.setImageResource(com.tencent.mm.R.raw.icon_filled_awesome_status);
                        }
                        if (weImageView != null) {
                            weImageView.setIconColor(i65.a.d(context2, com.tencent.mm.R.color.Red_100));
                        }
                    } else {
                        if (weImageView != null) {
                            weImageView.setImageResource(com.tencent.mm.R.raw.icon_filled_awesome_status);
                        }
                        if (weImageView != null) {
                            weImageView.setIconColor(i65.a.d(context2, com.tencent.mm.R.color.f478553an));
                        }
                    }
                    if (yxVar.f8488a) {
                        kotlin.jvm.internal.o.g(context2, "context");
                        pf5.z zVar3 = pf5.z.f353948a;
                        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        ((com.tencent.mm.plugin.textstatus.ui.kd) zVar3.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).O6(str2);
                        if (weImageView != null) {
                            weImageView.setTag(java.lang.Boolean.TRUE);
                        }
                    } else {
                        kotlin.jvm.internal.o.g(context2, "context");
                        pf5.z zVar4 = pf5.z.f353948a;
                        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        ((com.tencent.mm.plugin.textstatus.ui.kd) zVar4.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.textstatus.ui.kd.class)).P6(str2);
                        if (weImageView != null) {
                            weImageView.setTag(java.lang.Boolean.FALSE);
                        }
                    }
                }
                return true;
            }
        };
        this.C = r76;
        cj4.k kVar = new cj4.k(showParam);
        this.f174075r = kVar;
        kVar.i(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.opk);
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3));
        }
        this.f174070m = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.b0s);
        this.f174071n = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h7m);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ope);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        this.f174082y = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.r7i);
        this.f174083z = inflate.findViewById(com.tencent.mm.R.id.f487532ow3);
        this.f174074q = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hyw);
        this.f174068h = inflate.findViewById(com.tencent.mm.R.id.hvz);
        this.f174069i = inflate.findViewById(com.tencent.mm.R.id.hvp);
        this.A = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.hyc);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f483487b03);
        this.f174076s = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.b0y);
        this.f174077t = findViewById2;
        this.f174072o = inflate.findViewById(com.tencent.mm.R.id.owd);
        this.f174078u = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hye);
        this.f174079v = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487433om5);
        this.f174080w = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqx);
        this.f174081x = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hxg);
        if (showParam.l(128)) {
            inflate.setOutlineProvider(new bk4.e2(true, true, i65.a.a(context, 12.0f)));
            inflate.setClipToOutline(true);
        }
        if (findViewById == null) {
            view = findViewById2;
        } else {
            int i17 = showParam.l(512) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            view = findViewById2;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (showParam.l(65536)) {
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            android.view.View view3 = view;
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/StatusShowParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.f0(this));
        }
        inflate.addOnAttachStateChangeListener(g0Var);
        r76.alive();
        this.D = "";
        this.E = "";
        this.G = new com.tencent.mm.plugin.textstatus.ui.k0(this);
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        boolean z17 = str == null || r26.n0.N(str);
        java.lang.String str2 = this.f174065e;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str2, "updateByStatusId: failed");
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "updateByStatusId: " + str);
        mj4.h t17 = ai4.m0.f5173a.G().t(str);
        this.f174073p = t17;
        bi4.p0.U2(this, t17 != null ? ((mj4.k) t17).o() : "", this.f174073p, null, 4, null);
    }

    @Override // bi4.n0
    public void S5(long j17) {
        long c17 = c01.id.c();
        long j18 = this.F;
        long j19 = c17 - j18;
        qj4.s.m(qj4.s.f363958a, this.f174067g, 2L, null, this.f174073p, j17, (j19 < 0 || j18 == 0) ? 0L : j19, 0L, 0L, null, null, 0L, 1988, null);
    }

    @Override // bi4.q0
    public void a() {
        java.lang.String str = this.f174065e;
        com.tencent.mars.xlog.Log.i(str, "[onStatusShowResume]");
        al5.a0 a0Var = this.I;
        boolean z17 = false;
        boolean e17 = a0Var != null ? a0Var.e() : false;
        if (this.f174064d.l(32) && !e17) {
            z17 = true;
        }
        if (z17 && b21.m.c()) {
            b21.m.j();
        }
        al5.a0 a0Var2 = this.I;
        if (a0Var2 != null) {
            a0Var2.j();
        }
        al5.a0 a0Var3 = this.I;
        if (a0Var3 != null) {
            a0Var3.h();
        }
        com.tencent.mars.xlog.Log.i(str, "playVideo() called textureView:null");
        ((cj4.k) this.f174075r).v();
        si4.a G = ai4.m0.f5173a.G();
        mj4.h hVar = this.f174073p;
        java.lang.String o17 = hVar != null ? ((mj4.k) hVar).o() : null;
        mj4.h hVar2 = this.f174073p;
        si4.a.k(G, o17, hVar2 != null ? ((mj4.k) hVar2).l() : null, false, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if ((r5 != null && com.tencent.mm.plugin.textstatus.ui.c.b(r5, r10)) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(mj4.h r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.m0.b(mj4.h):void");
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f174065e, "update: " + str);
        mj4.h M = ai4.m0.f5173a.M(str);
        this.f174073p = M;
        bi4.p0.U2(this, str, M, null, 4, null);
    }

    @Override // bi4.q0
    public void c() {
        com.tencent.mars.xlog.Log.i(this.f174065e, "[onStatusShowDestroy]");
        android.widget.FrameLayout frameLayout = this.f174074q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        cj4.l1 l1Var = this.f174075r;
        ((cj4.k) l1Var).o();
        l1Var.getClass();
        al5.a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.I;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        al5.a0 a0Var3 = this.I;
        if (a0Var3 != null) {
            a0Var3.onDestroy();
        }
        this.I = null;
        this.H = null;
        dead();
    }

    @Override // bi4.q0
    public void d() {
        java.lang.String str = this.f174065e;
        com.tencent.mars.xlog.Log.i(str, "[onStatusShowPause]");
        al5.a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.i();
        }
        al5.a0 a0Var2 = this.I;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        com.tencent.mars.xlog.Log.i(str, "pauseVideo() called textureView:null state:null ");
        ((cj4.k) this.f174075r).l();
    }

    @Override // bi4.n0
    public android.view.View getView() {
        return this.f174066f;
    }

    @Override // bi4.p0
    public void m(java.lang.String username, mj4.h hVar, pj4.u0 u0Var) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i(this.f174065e, "update() called with: username = " + username + ", info = " + hVar + ", extraParam = " + u0Var);
        this.f174073p = hVar;
        if (hVar == null) {
            android.view.View view = this.f174066f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        mj4.k kVar = (mj4.k) hVar;
        new ej4.a0(username, this, kVar.l());
        md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
        android.content.Context context = this.f174067g;
        pj4.p0 p0Var = (pj4.p0) eVar.Ui(context, 9, pj4.p0.class);
        bi4.k1 k1Var = this.f174064d;
        if (p0Var != null) {
            p0Var.f355237e = username;
            p0Var.f355242m = k1Var.f21067g;
        }
        if (k1Var.f21067g == 3) {
            si4.a.k(ai4.m0.f5173a.G(), kVar.o(), kVar.l(), false, 4, null);
        }
        cj4.l1 l1Var = this.f174075r;
        cj4.k kVar2 = (cj4.k) l1Var;
        if (!kVar2.m(username, hVar, u0Var)) {
            android.view.View view2 = this.f174066f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f174066f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean l17 = k1Var.l(32768);
        android.view.View view4 = this.f174083z;
        if (!l17 || com.tencent.mm.plugin.textstatus.ui.c.d(this.f174073p, ((cj4.k) l1Var).d())) {
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view4 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "updateMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = this.f174071n;
        if (imageView != null) {
            imageView.getVisibility();
        }
        android.view.View view5 = this.f174066f;
        view5.setOnClickListener(this);
        android.view.ViewGroup viewGroup = this.f174082y;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.l0(hVar, this));
        }
        pj4.p0 p0Var2 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
        if (p0Var2 != null) {
            if (android.text.TextUtils.equals(p0Var2.f355236d, this.D) && android.text.TextUtils.equals(this.E, kVar.l())) {
                return;
            }
            if (!k1Var.l(16384)) {
                pj4.p0 p0Var3 = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
                if (p0Var3 != null) {
                    java.lang.Object tag = view5.getTag(com.tencent.mm.R.id.nwq);
                    java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
                    p0Var3.f355244o = num != null ? num.intValue() : 0;
                    qj4.s.m(qj4.s.f363958a, this.f174067g, 1L, null, this.f174073p, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
                }
                this.F = c01.id.c();
            }
            this.D = p0Var2.f355236d;
            this.E = kVar.l();
        }
        long j17 = kVar.f327067b.field_CreateTime * 1000;
        boolean l18 = k1Var.l(131072);
        android.view.ViewGroup viewGroup2 = this.f174078u;
        android.view.ViewGroup viewGroup3 = this.f174081x;
        if (l18) {
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            android.widget.TextView textView = this.f174079v;
            if (textView != null) {
                textView.setText(android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.juz), j17).toString());
            }
            android.widget.TextView textView2 = this.f174080w;
            if (textView2 != null) {
                textView2.setText(android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.jxk), j17).toString());
            }
        } else {
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        try {
            b(hVar);
        } catch (java.lang.Throwable unused) {
        }
        kVar2.V = this.G;
    }

    @Override // bi4.n0
    public void onBackPressed() {
        al5.a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick() called with: v = ");
        sb6.append(view);
        sb6.append(' ');
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.tencent.mars.xlog.Log.i(this.f174065e, sb6.toString());
        android.view.View.OnClickListener onClickListener = this.f174063J;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null) {
            valueOf.intValue();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MiniStatusCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // bi4.b1
    public void r(float f17, float f18, float f19) {
    }

    @Override // bi4.n0
    public void v3(boolean z17) {
        qj4.s sVar = qj4.s.f363958a;
        if (z17) {
            qj4.s.m(sVar, this.f174067g, 72L, null, this.f174073p, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        } else {
            qj4.s.m(sVar, this.f174067g, 71L, null, this.f174073p, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
        }
    }

    @Override // bi4.n0
    public void v5(boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.View view = this.f174072o;
        if (z17) {
            if (view == null || (layoutParams2 = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams2.height = -2;
            return;
        }
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = 0;
        if (view == null) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }
}
