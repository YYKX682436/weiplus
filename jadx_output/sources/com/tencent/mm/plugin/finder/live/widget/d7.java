package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d7 extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener {
    public final gk2.e H;
    public final te2.j0 I;

    /* renamed from: J, reason: collision with root package name */
    public final te2.k0 f118079J;
    public final java.lang.String K;
    public final int L;
    public android.view.View M;
    public android.view.View N;
    public android.view.View P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public android.view.View U;
    public com.google.android.material.appbar.AppBarLayout V;
    public boolean W;
    public int X;
    public android.view.View Y;
    public android.widget.SeekBar Z;

    /* renamed from: l1, reason: collision with root package name */
    public final rl5.r f118080l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f118081p0;

    /* renamed from: p1, reason: collision with root package name */
    public final int[] f118082p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.ProgressBar f118083x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f118084y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(android.content.Context context, gk2.e liveData, te2.j0 j0Var, te2.k0 k0Var) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.H = liveData;
        this.I = j0Var;
        this.f118079J = k0Var;
        this.K = "FinderLiveAnchorMusicViewCallback";
        this.L = 1;
        this.f118080l1 = new rl5.r(context);
        this.f118082p1 = new int[2];
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.amk;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i(this.K, "initView");
        this.M = rootView.findViewById(com.tencent.mm.R.id.elx);
        rootView.setOnClickListener(this);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.fcp);
        this.N = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.P = rootView.findViewById(com.tencent.mm.R.id.jxw);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.jg_);
        this.Q = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f487627p85);
        this.R = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.f482686l9);
        this.S = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this);
        }
        this.T = rootView.findViewById(com.tencent.mm.R.id.jyx);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.qg8)).getPaint(), 0.8f);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.jyv);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.U = rootView.findViewById(com.tencent.mm.R.id.jyd);
        com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) rootView.findViewById(com.tencent.mm.R.id.k0r);
        this.V = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.a(new com.tencent.mm.plugin.finder.live.widget.w6(this, appBarLayout));
            androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(-1, -2);
            android.content.Context context = appBarLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            cVar.b(new com.tencent.mm.plugin.finder.live.widget.FinderLiveMusicScrollViewBehavior(context, null));
            appBarLayout.setLayoutParams(cVar);
        }
        this.Y = rootView.findViewById(com.tencent.mm.R.id.k0s);
        this.Z = (android.widget.SeekBar) rootView.findViewById(com.tencent.mm.R.id.k0t);
        this.f118081p0 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.k0u);
        android.widget.SeekBar seekBar = this.Z;
        gk2.e eVar = this.H;
        if (seekBar != null) {
            seekBar.setProgress(((mm2.c1) eVar.a(mm2.c1.class)).F4 ? 5 : ((mm2.c1) eVar.a(mm2.c1.class)).E4);
        }
        te2.j0 j0Var = this.I;
        if (j0Var != null) {
            android.widget.SeekBar seekBar2 = this.Z;
            ((te2.p1) j0Var).q(seekBar2 != null ? seekBar2.getProgress() : ((mm2.c1) eVar.a(mm2.c1.class)).E4, false);
        }
        android.widget.SeekBar seekBar3 = this.Z;
        if (seekBar3 != null) {
            seekBar3.setOnSeekBarChangeListener(this);
        }
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.elr);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = new com.tencent.mm.plugin.finder.live.widget.r7((android.view.ViewGroup) findViewById5, j0Var, null, new com.tencent.mm.plugin.finder.live.widget.x6(this)).f119584e;
        this.f118084y0 = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.P(new com.tencent.mm.plugin.finder.live.widget.y6(this));
        }
        this.f118083x0 = (android.widget.ProgressBar) rootView.findViewById(com.tencent.mm.R.id.jz9);
        android.view.View view = this.Y;
        android.widget.SeekBar seekBar4 = this.Z;
        if (view != null && seekBar4 != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            view.setOnTouchListener(new zl2.l3(seekBar4, ((java.lang.Number) ((jz5.n) zl2.r4.f473958i).getValue()).intValue()));
        }
        if (!zl2.r4.f473950a.Y1(this.f118183e)) {
            rootView.post(new com.tencent.mm.plugin.finder.live.widget.z6(this, rootView));
        }
        bm2.m mVar = j0Var != null ? ((te2.p1) j0Var).f418291i : null;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f118084y0;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(mVar);
            wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView2.getContext()));
        }
        android.widget.SeekBar seekBar5 = this.Z;
        if (seekBar5 == null) {
            return;
        }
        seekBar5.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ewj));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    public final void e0(boolean z17) {
        this.W = false;
        this.X = 2;
        android.view.View view = this.R;
        if (view != null) {
            view.setBackground(null);
        }
        com.google.android.material.appbar.AppBarLayout appBarLayout = this.V;
        if (appBarLayout != null) {
            appBarLayout.d(false, z17, true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.widget.h7 h7Var;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.live.widget.h7 h7Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = false;
        te2.k0 k0Var = this.f118079J;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.ely) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            if (k0Var != null && (h7Var2 = ((te2.q1) k0Var).f418351m) != null) {
                h7Var2.g0(false, null);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fcp) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
        } else {
            if ((valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jyv) || (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f482686l9)) {
                z17 = true;
            }
            te2.d4 d4Var = te2.d4.f417948a;
            gk2.e eVar = this.H;
            te2.j0 j0Var = this.I;
            if (z17) {
                if (j0Var != null) {
                    te2.p1 p1Var = (te2.p1) j0Var;
                    sf2.e0 e0Var = (sf2.e0) p1Var.f418289g.U0(sf2.e0.class);
                    if (e0Var != null) {
                        e0Var.f407115q = p1Var.f418297r;
                        com.tencent.mm.plugin.finder.live.widget.i8 i8Var = e0Var.f407111m;
                        if (i8Var != null) {
                            com.tencent.mm.plugin.finder.live.widget.e0.W(i8Var, null, false, 0, 7, null);
                            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = i8Var.M;
                            if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
                                adapter.notifyDataSetChanged();
                            }
                            if (i8Var.V) {
                                androidx.viewpager.widget.ViewPager viewPager = i8Var.Q;
                                if (viewPager == null) {
                                    kotlin.jvm.internal.o.o("viewPager");
                                    throw null;
                                }
                                i8Var.i0(viewPager.getCurrentItem());
                            }
                        }
                    }
                }
                boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr = ml2.u2.f328109d;
                d4Var.a(a86, 1, "0", j0Var != null ? ((te2.p1) j0Var).f418297r : null);
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jg_) {
                if (k0Var != null && (h7Var = ((te2.q1) k0Var).f418351m) != null) {
                    h7Var.g0(true, this);
                }
                boolean a87 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr2 = ml2.u2.f328109d;
                d4Var.a(a87, 5, "0", j0Var != null ? ((te2.p1) j0Var).f418297r : null);
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f487627p85) {
                com.tencent.mars.xlog.Log.i(this.K, "doVolumeAction appBarVisible:" + this.W + ", volumeState:" + this.X);
                if (this.W) {
                    e0(true);
                } else {
                    this.W = true;
                    this.X = 1;
                    com.google.android.material.appbar.AppBarLayout appBarLayout = this.V;
                    if (appBarLayout != null) {
                        appBarLayout.d(true, true, true);
                    }
                    android.view.View view2 = this.R;
                    if (view2 != null) {
                        view2.setBackground(this.f118183e.getResources().getDrawable(com.tencent.mm.R.drawable.f481775a80));
                    }
                    android.widget.TextView textView = this.f118081p0;
                    if (textView != null) {
                        android.widget.SeekBar seekBar = this.Z;
                        textView.setText(seekBar != null ? java.lang.Integer.valueOf(seekBar.getProgress()).toString() : null);
                    }
                }
                boolean a88 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr3 = ml2.u2.f328109d;
                d4Var.a(a88, 3, "0", j0Var != null ? ((te2.p1) j0Var).f418297r : null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.K, "onProgressChanged progress:" + i17 + ",fromUser:" + z17);
        te2.j0 j0Var = this.I;
        if (j0Var != null) {
            ((te2.p1) j0Var).q(i17, true);
        }
        android.widget.TextView textView = this.f118081p0;
        if (textView == null) {
            return;
        }
        textView.setText(java.lang.String.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStopTrackingTouch inMiniVolumeState:");
        gk2.e eVar = this.H;
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).F4);
        sb6.append(", recoveryVolume:");
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).E4);
        sb6.append(", progress:");
        sb6.append(seekBar != null ? java.lang.Integer.valueOf(seekBar.getProgress()) : null);
        com.tencent.mars.xlog.Log.i(this.K, sb6.toString());
        ((mm2.c1) eVar.a(mm2.c1.class)).F4 = false;
        mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
        if (seekBar != null) {
            c1Var.E4 = seekBar.getProgress();
        }
    }
}
