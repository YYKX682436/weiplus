package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public class h1 implements bi4.i0, android.view.View.OnClickListener, com.tencent.mm.modelbase.u0 {
    public final android.view.View A;
    public long A1;
    public final android.view.ViewGroup B;
    public final long B1;
    public final android.view.View C;
    public final com.tencent.mm.plugin.textstatus.ui.t0 C1;
    public final android.widget.TextView D;
    public long D1;
    public final android.view.View E;
    public long E1;
    public boolean F;
    public final android.view.View G;
    public final android.widget.TextView H;
    public final android.view.ViewGroup I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View f173920J;
    public final android.widget.TextView K;
    public final android.view.View L;
    public final com.tencent.mm.ui.widget.imageview.WeImageView M;
    public final android.widget.ImageView N;
    public final android.widget.LinearLayout P;
    public final android.view.View Q;
    public final android.widget.TextView R;
    public final android.widget.LinearLayout S;
    public final cj4.k1 T;
    public java.lang.String U;
    public boolean V;
    public boolean W;
    public com.tencent.mm.plugin.textstatus.ui.s0 X;
    public java.lang.String Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f173921d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f173922e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f173923f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f173924g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f173925h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f173926i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f173927l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f173928m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f173929n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f173930o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.RelativeLayout f173931p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f173932p0;

    /* renamed from: p1, reason: collision with root package name */
    public long f173933p1;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f173934q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f173935r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f173936s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f173937t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f173938u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f173939v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f173940w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f173941x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f173942x0;

    /* renamed from: x1, reason: collision with root package name */
    public final bi4.m0 f173943x1;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.ViewGroup f173944y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f173945y0;

    /* renamed from: y1, reason: collision with root package name */
    public bi4.u1 f173946y1;

    /* renamed from: z, reason: collision with root package name */
    public mj4.h f173947z;

    /* renamed from: z1, reason: collision with root package name */
    public final android.graphics.Rect f173948z1;

    public h1(android.content.Context context, android.widget.RelativeLayout relativeLayout, android.widget.LinearLayout linearLayout, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f173921d = relativeLayout;
        this.f173922e = linearLayout;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.TextStatus.MoreTabCardView@");
        sb6.append(relativeLayout != null ? relativeLayout.hashCode() : 0);
        this.f173923f = sb6.toString();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.czt, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f173924g = inflate;
        this.f173926i = context;
        new java.util.HashMap();
        bi4.k1 k1Var = new bi4.k1();
        k1Var.j(true);
        k1Var.q(true);
        k1Var.f21068h = false;
        k1Var.f21069i = true;
        k1Var.k(true);
        k1Var.f21067g = 5;
        cj4.a0 a0Var = new cj4.a0(k1Var);
        this.T = a0Var;
        a0Var.i(inflate);
        a0Var.f41969z1 = new com.tencent.mm.plugin.textstatus.ui.n0(this);
        this.f173925h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oq8);
        this.f173929n = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.opk);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.b0s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f173934q = inflate.findViewById(com.tencent.mm.R.id.hx6);
        this.f173935r = inflate.findViewById(com.tencent.mm.R.id.f485500hw3);
        this.f173936s = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.opx);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.h5z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.om8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.hxj);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f485286h60);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.om9);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        ((android.widget.TextView) findViewById6).setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3));
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.hxm);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.A = inflate.findViewById(com.tencent.mm.R.id.hxn);
        this.G = inflate.findViewById(com.tencent.mm.R.id.hxo);
        this.B = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hxp);
        this.C = inflate.findViewById(com.tencent.mm.R.id.owb);
        this.D = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ooj);
        this.E = inflate.findViewById(com.tencent.mm.R.id.owa);
        this.I = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hyp);
        this.H = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ooi);
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.onw);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.ooc);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById9;
        this.f173920J = inflate.findViewById(com.tencent.mm.R.id.ow_);
        this.f173930o = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ovl);
        this.f173931p = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.hvz);
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.hxi);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f173937t = findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.oku);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f173938u = (android.widget.TextView) findViewById11;
        i().setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3));
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.hvg);
        this.f173939v = findViewById12;
        this.f173940w = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.hls);
        this.f173941x = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485436ho2);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.b0y);
        this.f173944y = viewGroup;
        android.view.View findViewById13 = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.re_) : null;
        di4.i iVar = di4.i.f232782a;
        androidx.lifecycle.j0 j0Var = di4.i.f232783b;
        if (kotlin.jvm.internal.o.b(j0Var.getValue(), java.lang.Boolean.TRUE)) {
            j0Var.observeForever(new com.tencent.mm.plugin.textstatus.ui.o0(findViewById13));
            java.lang.Boolean bool = (java.lang.Boolean) j0Var.getValue();
            if (bool != null) {
                bool.booleanValue();
                j0Var.postValue(bool);
            }
        }
        if (viewGroup != null) {
            bk4.k1.b(viewGroup, 0L, null, new com.tencent.mm.plugin.textstatus.ui.p0(this, context), 3, null);
        }
        if (z65.c.a() && viewGroup != null) {
            viewGroup.setOnLongClickListener(new com.tencent.mm.plugin.textstatus.ui.q0(context));
        }
        t();
        this.M = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.ho_);
        this.N = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hoa);
        this.P = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f485517hy5);
        this.Q = inflate.findViewById(com.tencent.mm.R.id.owc);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.hyo);
        this.S = linearLayout2;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqo);
        this.R = textView;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3));
        }
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.hwc);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.L = findViewById14;
        imageView.setOutlineProvider(new bk4.e2(true, true, i65.a.a(context, 10.0f)));
        imageView.setClipToOutline(true);
        imageView2.setOutlineProvider(new bk4.e2(true, true, i65.a.a(context, 10.0f)));
        imageView2.setClipToOutline(true);
        inflate.setOnClickListener(this);
        com.tencent.mm.plugin.textstatus.ui.u0 u0Var = new com.tencent.mm.plugin.textstatus.ui.u0(this);
        if (findViewById12 != null) {
            bk4.k1.b(findViewById12, 0L, u0Var, null, 5, null);
        }
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.r0(this, context));
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        uj4.e eVar = (uj4.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(uj4.e.class);
        if (eVar != null) {
            eVar.f428418e = new java.lang.ref.WeakReference(this);
        }
        this.X = com.tencent.mm.plugin.textstatus.ui.s0.f174254d;
        this.Y = "";
        this.Z = "";
        this.f173932p0 = "";
        this.f173942x0 = "";
        this.f173945y0 = "";
        this.f173927l1 = "";
        this.f173933p1 = 12L;
        this.f173943x1 = new com.tencent.mm.plugin.textstatus.ui.b1(this);
        this.f173946y1 = new bi4.u1();
        this.f173948z1 = new android.graphics.Rect();
        this.B1 = 5000L;
        this.C1 = new com.tencent.mm.plugin.textstatus.ui.t0(this);
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        android.view.View view = this.f173924g;
        boolean z17 = true;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(view.getWidth() > 0 ? view.getGlobalVisibleRect(this.f173948z1) : true);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(this.f173923f, "[updateByStatusId] statusId:%s %s %s", str, valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        mj4.h t17 = ai4.m0.f5173a.G().t(str);
        if (t17 != null) {
            this.f173928m = ((mj4.k) t17).o();
        }
        l(t17);
        s();
        t();
        ((cj4.i1) this.T).A1 = this.f173943x1;
    }

    @Override // bi4.n0
    public void S5(long j17) {
        long c17 = c01.id.c();
        long j18 = this.D1;
        long j19 = c17 - j18;
        qj4.s.m(qj4.s.f363958a, this.f173926i, 2L, null, null, j17, (j19 < 0 || j18 == 0) ? 0L : j19, 0L, 0L, null, null, 0L, 1996, null);
    }

    @Override // bi4.i0
    public void W(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f173923f, "forceHideCardView: " + z17);
        this.W = z17;
        if (z17) {
            android.view.View view = this.f173924g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f173924g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "forceHideCardView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // bi4.q0
    public void a() {
        b4(this.f173928m);
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void b(int i17) {
        this.T.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    @Override // bi4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b4(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.h1.b4(java.lang.String):void");
    }

    @Override // bi4.q0
    public void c() {
        o();
        android.widget.RelativeLayout relativeLayout = this.f173921d;
        if (relativeLayout != null) {
            relativeLayout.removeView(this.f173924g);
        }
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        android.widget.LinearLayout linearLayout = this.f173922e;
        if (linearLayout != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), i65.a.b(this.f173926i, 40));
        }
    }

    @Override // bi4.q0
    public void d() {
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void e() {
        this.T.getClass();
    }

    public final void f() {
        com.tencent.mm.plugin.textstatus.ui.s0 s0Var;
        if (!android.text.TextUtils.equals(this.f173928m, en1.a.a()) || (s0Var = this.X) == com.tencent.mm.plugin.textstatus.ui.s0.f174254d || (s0Var == com.tencent.mm.plugin.textstatus.ui.s0.f174255e && this.V)) {
            java.util.Objects.toString(this.X);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (java.lang.Math.abs(currentTimeMillis - this.E1) < 1000) {
            return;
        }
        this.E1 = currentTimeMillis;
        java.lang.Object obj = this.T;
        if (obj != null) {
            ((cj4.i1) obj).a(this.f173926i, this.f173947z);
        }
        qj4.s.m(qj4.s.f363958a, this.f173926i, 31L, null, this.f173947z, 0L, 0L, 0L, 0L, null, null, 0L, com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_VIDEO_TIMESTAMP_ROLLBACK, null);
    }

    public final void g(android.view.View view) {
        int i17 = view.getAlpha() <= 0.0f ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "changeVisibilityByAlpha", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "changeVisibilityByAlpha", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // bi4.n0
    public android.view.View getView() {
        return this.f173924g;
    }

    public final java.lang.String h() {
        return qj4.b.f363906a.a(((cj4.i1) this.T).y(6), bi4.v1.d().f21091a, this.F);
    }

    public final android.widget.TextView i() {
        android.widget.TextView textView = this.f173938u;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("tvAddStatus");
        throw null;
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void j(int i17) {
        this.T.getClass();
    }

    public final void k() {
        boolean z17;
        int i17;
        int i18;
        java.lang.String sb6;
        boolean z18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        com.tencent.mm.plugin.textstatus.ui.s0 s0Var = this.X;
        com.tencent.mm.plugin.textstatus.ui.s0 s0Var2 = com.tencent.mm.plugin.textstatus.ui.s0.f174254d;
        java.lang.Object obj = this.T;
        java.lang.String str = this.f173923f;
        android.content.Context context = this.f173926i;
        if (s0Var == s0Var2) {
            ai4.m0 m0Var = ai4.m0.f5173a;
            hj4.b i38 = m0Var.i();
            int a17 = i38.a();
            int i39 = -2;
            int i47 = -1;
            android.view.View view = this.G;
            if (a17 == 1) {
                int i48 = i38.f281661b;
                android.widget.TextView textView = this.H;
                if (textView != null) {
                    textView.setText(context.getString(com.tencent.mm.R.string.jwa, java.lang.Integer.valueOf(i48)));
                }
                java.util.List<java.lang.String> K = m0Var.K();
                android.view.ViewGroup viewGroup = this.I;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                if (!com.tencent.mm.sdk.platformtools.t8.L0(K)) {
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                    }
                    if (K != null) {
                        int i49 = 0;
                        for (java.lang.String str2 : K) {
                            android.widget.ImageView imageView = new android.widget.ImageView(context);
                            if (viewGroup != null) {
                                viewGroup.addView(imageView);
                            }
                            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                            if (layoutParams2 != null) {
                                layoutParams2.width = i39;
                            }
                            if (layoutParams2 != null) {
                                layoutParams2.height = i47;
                            }
                            imageView.setAdjustViewBounds(true);
                            int b17 = i65.a.b(context, 1);
                            imageView.setPadding(b17, 0, b17, 0);
                            imageView.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
                            imageView.setOutlineProvider(new bk4.g2(0.5f));
                            imageView.setClipToOutline(true);
                            imageView.setImageResource(com.tencent.mm.R.raw.default_avatar);
                            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str2);
                            i49++;
                            if (i49 > 1 && layoutParams2 != null) {
                                layoutParams2.setMarginStart(i65.a.b(context, -4));
                            }
                            if (i49 >= 3) {
                                break;
                            }
                            i39 = -2;
                            i47 = -1;
                        }
                    }
                } else if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                boolean x17 = ai4.m0.f5173a.x();
                this.F = x17;
                if (obj != null) {
                    ((cj4.a0) obj).S1 = x17;
                }
                android.view.View view2 = this.E;
                if (view2 != null) {
                    int i57 = x17 ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i57));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyNoStatusV3", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyNoStatusV3", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view != null) {
                    view.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.x0(this));
                }
                if (view != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyNoStatusV3", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyNoStatusV3", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                z18 = true;
            } else {
                if (view != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyNoStatusV3", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyNoStatusV3", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                z18 = false;
            }
            android.widget.LinearLayout linearLayout = this.S;
            if (!z18) {
                java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
                ai4.m0 m0Var2 = ai4.m0.f5173a;
                int g17 = si4.a.g(m0Var2.G(), null, 1, null);
                com.tencent.mars.xlog.Log.i(str, "SquareEntry isOpenTopicSquare:true totalStatusNum:" + g17);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                this.f173946y1 = bi4.v1.d();
                if (g17 == 0) {
                    this.f173946y1 = new bi4.u1();
                }
                int i58 = this.f173946y1.f21091a;
                android.view.View view3 = this.Q;
                android.widget.ImageView imageView2 = this.N;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.M;
                android.widget.TextView textView2 = this.R;
                android.widget.LinearLayout linearLayout2 = this.P;
                if (i58 == 0) {
                    if (weImageView != null) {
                        weImageView.setVisibility(0);
                    }
                    if (imageView2 == null) {
                        i19 = 8;
                    } else {
                        i19 = 8;
                        imageView2.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(i19);
                    }
                    if (view3 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                } else if (i58 == 1) {
                    if (imageView2 == null) {
                        i27 = 0;
                    } else {
                        i27 = 0;
                        imageView2.setVisibility(0);
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(i27);
                    }
                    if (weImageView == null) {
                        i28 = 8;
                    } else {
                        i28 = 8;
                        weImageView.setVisibility(8);
                    }
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(i28);
                    }
                    if (view3 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    r85.c cVar = new r85.c(context);
                    java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.jxa, java.lang.Integer.valueOf(g17));
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    cVar.f393336b = string;
                    cVar.b(com.tencent.mm.R.dimen.f479628b3);
                    android.content.res.ColorStateList e17 = i65.a.e(context, com.tencent.mm.R.color.FG_1);
                    kotlin.jvm.internal.o.f(e17, "getColorStateList(...)");
                    cVar.f393338d = e17;
                    cVar.f393339e = 0;
                    android.text.SpannableString a18 = cVar.a();
                    if (textView2 != null) {
                        textView2.setText(a18, android.widget.TextView.BufferType.SPANNABLE);
                    }
                } else if (i58 == 2) {
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                    }
                    if (view3 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                        arrayList6.add(0);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntry", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    if (weImageView == null) {
                        i29 = 8;
                    } else {
                        i29 = 8;
                        weImageView.setVisibility(8);
                    }
                    if (imageView2 != null) {
                        imageView2.setVisibility(i29);
                    }
                    java.lang.String string2 = g17 <= 3 ? context.getResources().getString(com.tencent.mm.R.string.jxa, java.lang.Integer.valueOf(g17)) : context.getResources().getString(com.tencent.mm.R.string.jxb, java.lang.Integer.valueOf(g17));
                    kotlin.jvm.internal.o.d(string2);
                    android.widget.LinearLayout.LayoutParams layoutParams3 = null;
                    java.util.List<ai4.e> f17 = m0Var2.G().f(null, en1.a.a(), false);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(string2);
                    sb7.append('|');
                    if (f17 != null) {
                        int i59 = 0;
                        loop0: for (ai4.e eVar : f17) {
                            if (eVar.a()) {
                                java.util.Iterator it = eVar.f5135b.iterator();
                                while (it.hasNext()) {
                                    sb7.append(((mj4.k) ((mj4.h) it.next())).o());
                                    sb7.append(',');
                                    i59++;
                                    if (i59 >= 3) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                    java.lang.String sb8 = sb7.toString();
                    kotlin.jvm.internal.o.f(sb8, "toString(...)");
                    java.lang.Object tag = linearLayout2 != null ? linearLayout2.getTag() : null;
                    java.lang.String str3 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                    if (str3 == null || !kotlin.jvm.internal.o.b(str3, sb8)) {
                        r85.c cVar2 = new r85.c(context);
                        cVar2.f393336b = string2;
                        cVar2.b(com.tencent.mm.R.dimen.f479628b3);
                        android.content.res.ColorStateList e18 = i65.a.e(context, com.tencent.mm.R.color.FG_1);
                        kotlin.jvm.internal.o.f(e18, "getColorStateList(...)");
                        cVar2.f393338d = e18;
                        cVar2.f393339e = 0;
                        android.text.SpannableString a19 = cVar2.a();
                        if (textView2 != null) {
                            textView2.setText(a19, android.widget.TextView.BufferType.SPANNABLE);
                        }
                        if (linearLayout2 != null) {
                            linearLayout2.removeAllViews();
                        }
                        int i66 = 0;
                        for (ai4.e eVar2 : f17) {
                            if (eVar2.a()) {
                                for (mj4.h hVar : eVar2.f5135b) {
                                    android.widget.ImageView imageView3 = new android.widget.ImageView(context);
                                    if (linearLayout2 != null) {
                                        linearLayout2.addView(imageView3);
                                    }
                                    android.view.ViewGroup.LayoutParams layoutParams4 = imageView3.getLayoutParams();
                                    android.widget.LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : layoutParams3;
                                    if (layoutParams5 != null) {
                                        layoutParams5.width = -2;
                                    }
                                    if (layoutParams5 != null) {
                                        layoutParams5.height = -1;
                                    }
                                    imageView3.setAdjustViewBounds(true);
                                    int b18 = i65.a.b(context, 1);
                                    imageView3.setPadding(b18, b18, b18, b18);
                                    imageView3.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
                                    imageView3.setOutlineProvider(new bk4.g2(0.5f));
                                    imageView3.setClipToOutline(true);
                                    imageView3.setImageResource(com.tencent.mm.R.raw.default_avatar);
                                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView3, ((mj4.k) hVar).o());
                                    i66++;
                                    if (i66 > 1 && layoutParams5 != null) {
                                        layoutParams5.setMarginStart(i65.a.b(context, -4));
                                    }
                                    i37 = 3;
                                    if (i66 >= 3) {
                                        break;
                                    } else {
                                        layoutParams3 = null;
                                    }
                                }
                            }
                            i37 = 3;
                            if (i66 >= i37) {
                                break;
                            } else {
                                layoutParams3 = null;
                            }
                        }
                        if (linearLayout2 != null) {
                            linearLayout2.setTag(sb8);
                        }
                    }
                }
            } else if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            i17 = 0;
            i18 = 1;
        } else {
            ai4.m0 m0Var3 = ai4.m0.f5173a;
            hj4.b i67 = m0Var3.i();
            int a27 = i67.a();
            android.view.View view4 = this.f173920J;
            android.view.View view5 = this.C;
            android.view.ViewGroup viewGroup2 = this.B;
            if (a27 == 1) {
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                android.widget.TextView textView3 = this.D;
                if (textView3 != null) {
                    textView3.setText(context.getString(com.tencent.mm.R.string.jwa, java.lang.Integer.valueOf(i67.f281661b)));
                }
                if (textView3 != null) {
                    textView3.setTextSize(0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479628b3));
                }
                boolean x18 = m0Var3.x();
                this.F = x18;
                if (obj != null) {
                    ((cj4.a0) obj).S1 = x18;
                }
                if (view5 != null) {
                    int i68 = x18 ? 0 : 8;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList7.add(java.lang.Integer.valueOf(i68));
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyV3WithStatus", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyV3WithStatus", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (view5 != null && view5.getVisibility() == 0) {
                    if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
                        com.tencent.mars.xlog.Log.i(str, "handleNotifyV3WithStatus:  vRedDotIconStatus gone");
                        if (view4 != null) {
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                            arrayList8.add(8);
                            java.util.Collections.reverse(arrayList8);
                            yj0.a.d(view4, arrayList8.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyV3WithStatus", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                            yj0.a.f(view4, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleNotifyV3WithStatus", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                if (viewGroup2 != null) {
                    viewGroup2.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.y0(this));
                }
                z17 = true;
            } else {
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                z17 = false;
            }
            if (z17) {
                i17 = 0;
                i18 = 1;
                android.widget.TextView textView4 = this.f173936s;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                android.widget.TextView textView5 = this.f173929n;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
            } else {
                ((cj4.a0) obj).f0();
                cj4.i1 i1Var = (cj4.i1) obj;
                i1Var.getClass();
                bk4.s a28 = bk4.f1.f21474a.a();
                i1Var.B1 = a28;
                android.view.View view6 = i1Var.W;
                if (view6 == null) {
                    i18 = 1;
                } else {
                    i18 = 1;
                    boolean z19 = j62.e.g().c(new com.tencent.mm.repairer.config.textstatus.RepairerConfigTextStatusRedDot()) == 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusRedDotHelper", "isShowAfterMatchUnRead: switch:" + z19 + " isShow:" + a28.f21554a + " durationData:" + a28.f21555b);
                    int i69 = (a28.f21554a || z19) ? m0Var3.G().v() : false ? 0 : 8;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                    arrayList9.add(java.lang.Integer.valueOf(i69));
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view6, arrayList9.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "handleTopicSquareEntryWithStatusIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic", "handleTopicSquareEntryWithStatusIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (((view5 == null || view5.getVisibility() != 0) ? 0 : i18) != 0) {
                    if (((viewGroup2 == null || viewGroup2.getVisibility() != 0) ? 0 : i18) != 0) {
                        com.tencent.mars.xlog.Log.i(str, "handleTopicSquareEntryWithStatusIcon: vRedDotIconStatus gone");
                        if (view4 != null) {
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                            arrayList10.add(8);
                            java.util.Collections.reverse(arrayList10);
                            yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntryWithStatusIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i17 = 0;
                            view4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                            yj0.a.f(view4, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "handleTopicSquareEntryWithStatusIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                i17 = 0;
            }
        }
        mj4.h hVar2 = this.f173947z;
        if (hVar2 == null || !r26.n0.N(((mj4.k) hVar2).l())) {
            pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
            java.lang.String str4 = p0Var != null ? p0Var.f355236d : null;
            if (str4 == null) {
                return;
            }
            int i76 = ai4.m0.f5173a.i().f281661b;
            int i77 = (hVar2 != null ? ((mj4.k) hVar2).f327067b.field_LikeCount : i17) + (hVar2 != null ? ((mj4.k) hVar2).f327067b.field_referenceCount : i17);
            if (i76 == 0 && i77 == 0) {
                sb6 = "";
            } else {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(i77);
                sb9.append(';');
                sb9.append(i76);
                sb6 = sb9.toString();
            }
            long j17 = i76 > 0 ? 11L : 12L;
            java.lang.String l17 = hVar2 != null ? ((mj4.k) hVar2).l() : "";
            if (sb6 == null || r26.n0.N(sb6)) {
                i17 = i18;
            }
            if (i17 == 0 && kotlin.jvm.internal.o.b(str4, this.f173942x0) && kotlin.jvm.internal.o.b(sb6, this.f173945y0)) {
                kotlin.jvm.internal.o.b(l17, this.f173927l1);
            }
            this.f173942x0 = str4;
            this.f173945y0 = sb6;
            this.f173927l1 = l17;
            this.f173933p1 = j17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01ca  */
    /* JADX WARN: Type inference failed for: r10v20, types: [android.widget.RelativeLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v71, types: [com.tencent.mm.storage.n3] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.widget.ImageView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(mj4.h r36) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.h1.l(mj4.h):void");
    }

    public boolean n(android.view.View view, android.view.View view2) {
        return (kotlin.jvm.internal.o.b(view, this.f173921d) || kotlin.jvm.internal.o.b(view2, this.f173922e)) ? false : true;
    }

    public final void o() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        android.widget.TextView textView;
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView;
        android.content.Context context = this.f173926i;
        android.widget.LinearLayout linearLayout = this.f173922e;
        if (linearLayout != null && (noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) linearLayout.findViewById(com.tencent.mm.R.id.kbb)) != null) {
            noMeasuredTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        if (linearLayout != null && (textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.ouv)) != null) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
            textView.setAlpha(1.0f);
        }
        if (linearLayout != null && (weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout.findViewById(com.tencent.mm.R.id.leo)) != null) {
            weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.Link_100));
            weImageView2.post(new com.tencent.mm.plugin.textstatus.ui.d1(weImageView2));
        }
        if (linearLayout == null || (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout.findViewById(com.tencent.mm.R.id.a4f)) == null) {
            return;
        }
        weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
    }

    @Override // bi4.n0
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.Objects.toString(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.o4w) {
            f();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPostClose() {
        ((cj4.a0) this.T).onPostClose();
        this.V = false;
        s();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPostOpen(boolean z17) {
        ((cj4.a0) this.T).onPostOpen(z17);
        this.V = true;
        s();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPreClose() {
        android.view.View findViewById;
        ((cj4.a0) this.T).onPreClose();
        this.f173924g.setClickable(true);
        android.widget.RelativeLayout relativeLayout = this.f173921d;
        if (relativeLayout != null && (findViewById = relativeLayout.findViewById(com.tencent.mm.R.id.ovx)) != null) {
            findViewById.setOnTouchListener(null);
        }
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(null);
        }
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void onPreOpen() {
        qj4.s.l(qj4.s.f363958a, 17L, "1", null, 0L, null, 0L, 60, null);
        ((cj4.a0) this.T).onPreOpen();
        this.f173924g.setClickable(false);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void p() {
        this.T.getClass();
    }

    @Override // com.tencent.mm.ui.widget.listview.PullDownListView.IPullDownCallback
    public void q(int i17) {
        this.T.getClass();
    }

    @Override // bi4.b1
    public void r(float f17, float f18, float f19) {
        android.view.View view;
        ((cj4.a0) this.T).r(f17, f18, f19);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        android.view.View view2 = this.f173934q;
        if (view2 != null) {
            if (0.25f <= f17 && f17 <= 1.0f) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf((f17 - 0.25f) / (1 - 0.25f)));
                java.util.Collections.reverse(arrayList);
                view = view2;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                view = view2;
                if (f17 < 0.25f) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(valueOf);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            g(view);
        }
        android.view.View view3 = this.f173935r;
        if (view3 != null) {
            if (0.25f <= f17 && f17 <= 1.0f) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf((f17 - 0.25f) / (1 - 0.25f)));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else if (f17 < 0.25f) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(valueOf);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            g(view3);
        }
        android.view.ViewGroup viewGroup = this.f173944y;
        if (viewGroup != null) {
            viewGroup.setAlpha(f17 < 0.25f ? 1 - (f17 / 0.25f) : 0.0f);
            g(viewGroup);
        }
    }

    public final void s() {
        boolean z17 = true;
        boolean z18 = ai4.m0.f5173a.i().a() == 1;
        android.widget.TextView textView = this.f173936s;
        android.widget.TextView textView2 = this.f173929n;
        if (z18) {
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (textView2 != null && textView2.getVisibility() == 0) {
            java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
            if (text != null && !r26.n0.N(text)) {
                z17 = false;
            }
            if (!z17) {
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
                return;
            }
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.h1.t():void");
    }

    @Override // bi4.n0
    public void v3(boolean z17) {
    }

    @Override // bi4.n0
    public void v5(boolean z17) {
    }
}
