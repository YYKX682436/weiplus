package mi2;

/* loaded from: classes10.dex */
public class h extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {
    public com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.view.View P;
    public android.view.ViewGroup Q;
    public y.f2 R;
    public int S;
    public int T;
    public long U;
    public boolean V;
    public android.view.View W;
    public android.view.View X;
    public android.view.View Y;
    public com.tencent.mm.ui.widget.imageview.WeImageView Z;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.c f326753h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f326754i;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.ArrayList f326755l1;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f326756m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f326757n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f326758o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f326759p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f326760p0;

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f326761p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f326762q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f326763r;

    /* renamed from: s, reason: collision with root package name */
    public long f326764s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f326765t;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f326766x0;

    /* renamed from: y0, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f326767y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, zh2.c pluginAbility, yz5.p dismiss) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(dismiss, "dismiss");
        this.f326753h = pluginAbility;
        this.f326754i = dismiss;
        this.f326756m = z();
        boolean z17 = true;
        this.f326765t = true;
        this.T = 1;
        this.f326755l1 = new java.util.ArrayList();
        this.f326761p1 = jz5.h.b(new y.i2(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.f118384g.f444837d.getLayoutParams();
        if (layoutParams != null) {
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                z17 = false;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z17) {
                i18 = i18 >= i17 ? i18 : i17;
            }
            layoutParams.height = i18 / 2;
        }
        this.f118384g.f444837d.setBackgroundResource(com.tencent.mm.R.drawable.a0m);
    }

    public void F() {
        android.view.ViewPropertyAnimator animate;
        r45.il4 il4Var = ((mm2.o4) this.f326753h.g().a(mm2.o4.class)).U;
        long j17 = il4Var != null ? il4Var.f377129d : 0L;
        w();
        W(j17);
        V(j17);
        this.f326765t = true;
        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout = this.L;
        if (finderLiveInterceptRelativeLayout != null) {
            android.view.ViewPropertyAnimator animate2 = finderLiveInterceptRelativeLayout.animate();
            if (animate2 != null) {
                animate2.cancel();
            }
            android.view.View view = this.M;
            if (view != null && (animate = view.animate()) != null) {
                animate.cancel();
            }
            X(false);
            finderLiveInterceptRelativeLayout.setVisibility(8);
            finderLiveInterceptRelativeLayout.setTranslationX(0.0f);
            L();
        }
        this.f326764s = j17;
    }

    public final void L() {
        android.view.View view = this.M;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
        android.view.ViewGroup viewGroup = this.Q;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.f326760p0 = null;
        this.f326767y0 = null;
        this.f326755l1.clear();
        this.R = null;
        this.V = false;
    }

    public void M() {
        android.view.View view;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout = this.L;
        if (finderLiveInterceptRelativeLayout == null || (view = this.M) == null || finderLiveInterceptRelativeLayout.getVisibility() != 0) {
            return;
        }
        float width = finderLiveInterceptRelativeLayout.getWidth();
        X(true);
        android.view.ViewPropertyAnimator animate = view.animate();
        if (animate == null || (translationX = animate.translationX(width)) == null || (duration = translationX.setDuration(300L)) == null || (withEndAction = duration.withEndAction(new y.h2(this, finderLiveInterceptRelativeLayout))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void N() {
        y.f2 f2Var = this.R;
        int i17 = f2Var == null ? -1 : y.g2.f458354a[f2Var.ordinal()];
        zh2.c cVar = this.f326753h;
        if (i17 == 1) {
            int i18 = this.S;
            long j17 = i18;
            if (((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377129d != j17) {
                ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377129d = j17;
            }
            cVar.e(i18);
            dk2.xf k17 = cVar.k();
            if (k17 != null) {
                ((dk2.r4) k17).q0(((mm2.e1) cVar.g().a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) cVar.g().a(mm2.e1.class)).f328983m, j17, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377131f, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377132g, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377133h, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377134i, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377135m, new mi2.g(this));
                return;
            }
            return;
        }
        if (i17 == 2 && this.V) {
            int i19 = (int) this.U;
            cVar.e(i19);
            pm0.v.X(new mi2.e(this, i19));
            dk2.xf k18 = cVar.k();
            if (k18 != null) {
                ((dk2.r4) k18).q0(((mm2.e1) cVar.g().a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) cVar.g().a(mm2.e1.class)).f328983m, i19, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377131f, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377132g, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377133h, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377134i, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377135m, new mi2.f(this));
            }
        }
    }

    public void O() {
        N();
    }

    public long P() {
        return ((mm2.o4) this.f326753h.g().a(mm2.o4.class)).U.f377129d;
    }

    public void Q(int i17) {
    }

    public void R(long j17) {
    }

    public void S() {
        N();
        M();
    }

    public void T(y.f2 type) {
        android.view.View view;
        android.view.ViewGroup viewGroup;
        java.lang.String string;
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout = this.L;
        android.content.Context context = this.f118381d;
        if (finderLiveInterceptRelativeLayout == null) {
            android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
            wd2.g gVar = this.f118384g;
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f489659gb, (android.view.ViewGroup) gVar.f444839f, false);
            com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout2 = inflate instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout) inflate : null;
            if (finderLiveInterceptRelativeLayout2 != null) {
                this.L = finderLiveInterceptRelativeLayout2;
                this.M = finderLiveInterceptRelativeLayout2.findViewById(com.tencent.mm.R.id.a4v);
                android.widget.TextView textView = (android.widget.TextView) finderLiveInterceptRelativeLayout2.findViewById(com.tencent.mm.R.id.a4y);
                this.N = textView;
                if (textView != null) {
                    com.tencent.mm.ui.fk.b(textView);
                }
                this.P = finderLiveInterceptRelativeLayout2.findViewById(com.tencent.mm.R.id.f487800zs);
                this.Q = (android.view.ViewGroup) finderLiveInterceptRelativeLayout2.findViewById(com.tencent.mm.R.id.f487801zu);
                android.view.View view2 = this.P;
                if (view2 != null) {
                    view2.setOnClickListener(new y.j2(this));
                }
                gVar.f444839f.addView(finderLiveInterceptRelativeLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout3 = this.L;
        if (finderLiveInterceptRelativeLayout3 == null || (view = this.M) == null || (viewGroup = this.Q) == null) {
            return;
        }
        this.R = type;
        android.widget.TextView textView2 = this.N;
        if (textView2 != null) {
            int ordinal = type.ordinal();
            if (ordinal == 0) {
                string = context.getResources().getString(com.tencent.mm.R.string.dvv);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                string = context.getResources().getString(com.tencent.mm.R.string.dut);
            }
            textView2.setText(string);
        }
        viewGroup.removeAllViews();
        long P = P();
        int ordinal2 = type.ordinal();
        if (ordinal2 == 0) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489656fa, viewGroup, false);
            viewGroup.addView(inflate2);
            this.W = inflate2;
            this.X = inflate2.findViewById(com.tencent.mm.R.id.f482984tk);
            this.Y = inflate2.findViewById(com.tencent.mm.R.id.a99);
            this.Z = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.f482774nm);
            this.f326760p0 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.a98);
            int i17 = (int) P;
            this.S = i17;
            this.T = pm0.v.z(i17, 16) ? 2 : 1;
            U();
            android.view.View view3 = this.X;
            if (view3 != null) {
                view3.setOnClickListener(new y.p2(this));
            }
            android.view.View view4 = this.Y;
            if (view4 != null) {
                view4.setOnClickListener(new y.q2(this));
            }
        } else if (ordinal2 == 1) {
            android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489657g9, viewGroup, false);
            viewGroup.addView(inflate3);
            this.f326766x0 = inflate3;
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) inflate3.findViewById(com.tencent.mm.R.id.f_m);
            this.f326767y0 = recyclerView;
            jz5.g gVar2 = this.f326761p1;
            if (recyclerView != null) {
                recyclerView.setAdapter((y.c2) ((jz5.n) gVar2).getValue());
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f326767y0;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
            }
            this.U = P;
            this.V = false;
            zh2.c cVar = this.f326753h;
            long j17 = ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f377130e;
            zl2.r4 r4Var = zl2.r4.f473950a;
            int i18 = (int) j17;
            boolean z17 = !pm0.v.z(i18, 4);
            r45.eq1 eq1Var = ((mm2.n2) cVar.g().a(mm2.n2.class)).f329279g;
            boolean z18 = eq1Var != null && eq1Var.getBoolean(10);
            boolean z19 = !pm0.v.z(i18, 16);
            int i19 = (z19 && z18) ? 1 : 0;
            com.tencent.mars.xlog.Log.i(this.f326756m, "prepareConditionData isSuperFansClub:" + z18 + " superFansFlag:" + z19 + " buyProductSwitchEnable:" + z17);
            java.lang.String a17 = ei2.f.a(P);
            java.util.ArrayList arrayList = this.f326755l1;
            arrayList.clear();
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.duo);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            y.d2 d2Var = new y.d2(string2, false, 2, null);
            d2Var.f458329b = kotlin.jvm.internal.o.b(d2Var.f458328a, a17);
            arrayList.add(d2Var);
            java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.duu);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            y.d2 d2Var2 = new y.d2(string3, false, 2, null);
            d2Var2.f458329b = kotlin.jvm.internal.o.b(d2Var2.f458328a, a17);
            arrayList.add(d2Var2);
            java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.dur);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            y.d2 d2Var3 = new y.d2(string4, false, 2, null);
            d2Var3.f458329b = kotlin.jvm.internal.o.b(d2Var3.f458328a, a17);
            arrayList.add(d2Var3);
            if (z17) {
                java.lang.String string5 = context.getResources().getString(com.tencent.mm.R.string.dup);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                y.d2 d2Var4 = new y.d2(string5, false, 2, null);
                d2Var4.f458329b = kotlin.jvm.internal.o.b(d2Var4.f458328a, a17);
                arrayList.add(d2Var4);
            }
            if (i19 != 0) {
                java.lang.String string6 = context.getResources().getString(com.tencent.mm.R.string.lz6);
                kotlin.jvm.internal.o.f(string6, "getString(...)");
                y.d2 d2Var5 = new y.d2(string6, false, 2, null);
                d2Var5.f458329b = kotlin.jvm.internal.o.b(d2Var5.f458328a, a17);
                arrayList.add(d2Var5);
            }
            ((y.c2) ((jz5.n) gVar2).getValue()).notifyDataSetChanged();
        }
        finderLiveInterceptRelativeLayout3.setVisibility(0);
        finderLiveInterceptRelativeLayout3.setTranslationX(0.0f);
        y.o2 o2Var = new y.o2(view, finderLiveInterceptRelativeLayout3, this);
        if (finderLiveInterceptRelativeLayout3.getWidth() != 0) {
            o2Var.invoke();
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = finderLiveInterceptRelativeLayout3.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new y.m2(finderLiveInterceptRelativeLayout3, o2Var));
        }
    }

    public final void U() {
        if (this.T == 2) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f326760p0;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.Z;
            if (weImageView2 == null) {
                return;
            }
            weImageView2.setVisibility(8);
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f326760p0;
        if (weImageView3 != null) {
            weImageView3.setVisibility(8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.Z;
        if (weImageView4 == null) {
            return;
        }
        weImageView4.setVisibility(0);
    }

    public final void V(long j17) {
        android.widget.TextView textView = this.f326763r;
        if (textView == null) {
            kotlin.jvm.internal.o.o("micWayText");
            throw null;
        }
        boolean z17 = pm0.v.z((int) j17, 16);
        android.content.Context context = this.f118381d;
        textView.setText(z17 ? context.getResources().getString(com.tencent.mm.R.string.duk) : context.getResources().getString(com.tencent.mm.R.string.dui));
    }

    public final void W(long j17) {
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean x27 = r4Var.x2(j17);
        android.content.Context context = this.f118381d;
        if (x27) {
            android.widget.TextView textView = this.f326762q;
            if (textView != null) {
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.dur));
                return;
            } else {
                kotlin.jvm.internal.o.o("micConditionText");
                throw null;
            }
        }
        if (r4Var.y2(j17)) {
            android.widget.TextView textView2 = this.f326762q;
            if (textView2 != null) {
                textView2.setText(context.getResources().getString(com.tencent.mm.R.string.duu));
                return;
            } else {
                kotlin.jvm.internal.o.o("micConditionText");
                throw null;
            }
        }
        if (r4Var.w2(j17)) {
            android.widget.TextView textView3 = this.f326762q;
            if (textView3 != null) {
                textView3.setText(context.getResources().getString(com.tencent.mm.R.string.dup));
                return;
            } else {
                kotlin.jvm.internal.o.o("micConditionText");
                throw null;
            }
        }
        if (r4Var.z2(j17)) {
            android.widget.TextView textView4 = this.f326762q;
            if (textView4 != null) {
                textView4.setText(context.getResources().getString(com.tencent.mm.R.string.lz6));
                return;
            } else {
                kotlin.jvm.internal.o.o("micConditionText");
                throw null;
            }
        }
        android.widget.TextView textView5 = this.f326762q;
        if (textView5 != null) {
            textView5.setText(context.getResources().getString(com.tencent.mm.R.string.duo));
        } else {
            kotlin.jvm.internal.o.o("micConditionText");
            throw null;
        }
    }

    public final void X(boolean z17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout = this.L;
        if (finderLiveInterceptRelativeLayout == null) {
            return;
        }
        finderLiveInterceptRelativeLayout.setNeedInterceptTouchEvent(z17);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f489658ga;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.dvw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.View view2 = this.f326758o;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("finderLiveAnchorLinkWayLayout");
            throw null;
        }
        int id6 = view2.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            this.f326765t = false;
            T(y.f2.f458345d);
        } else {
            android.view.View view3 = this.f326759p;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("finderLiveAnchorLinkConditionLayout");
                throw null;
            }
            int id7 = view3.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                this.f326765t = false;
                fj2.s.c(fj2.s.f263183a, ml2.q2.f327843z, null, null, 0, 0, 30, null);
                T(y.f2.f458346e);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f326757n = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484548el5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f326758o = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f484539ek0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f326759p = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.jiv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f326762q = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.jjq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f326763r = (android.widget.TextView) findViewById4;
        android.view.View view = this.f326758o;
        if (view == null) {
            kotlin.jvm.internal.o.o("finderLiveAnchorLinkWayLayout");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.f326759p;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("finderLiveAnchorLinkConditionLayout");
            throw null;
        }
        view2.setOnClickListener(this);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f487799zr);
        if (textView != null) {
            textView.setText(o());
        }
        if (textView != null) {
            com.tencent.mm.ui.fk.b(textView);
        }
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.f487797zp);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new y.k2(this));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.f487798zq);
        android.view.View view3 = this.f118383f;
        if (view3 != null) {
            android.view.ViewParent parent = view3.getParent();
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view3);
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 8388629);
            if (viewGroup != null) {
                viewGroup.addView(view3, layoutParams);
            }
            view3.setOnClickListener(new y.l2(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void s() {
        O();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        this.f326754i.invoke(java.lang.Boolean.valueOf(this.f326765t), java.lang.Boolean.valueOf(this.f326764s != ((mm2.o4) this.f326753h.g().a(mm2.o4.class)).U.f377129d));
    }

    public java.lang.String z() {
        return "FinderLiveMicMoreActionWidget";
    }
}
