package in2;

/* loaded from: classes10.dex */
public final class s extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener, gn2.a {
    public final in2.n0 A1;
    public final rl5.r B1;
    public final int[] C1;
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f292888J;
    public final int K;
    public final int L;
    public android.view.View M;
    public android.widget.FrameLayout N;
    public com.tencent.mm.ui.widget.MMSwitchBtn P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.LinearLayout S;
    public android.view.View T;
    public android.view.View U;
    public android.view.View V;
    public android.view.View W;
    public android.view.View X;
    public androidx.constraintlayout.widget.ConstraintLayout Y;
    public android.widget.TextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f292889l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.FrameLayout f292890p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f292891p1;

    /* renamed from: x0, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f292892x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.t7 f292893x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ProgressBar f292894y0;

    /* renamed from: y1, reason: collision with root package name */
    public in2.a1 f292895y1;

    /* renamed from: z1, reason: collision with root package name */
    public final in2.v0 f292896z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f292888J = "FinderLiveAnchorMusicSingSongViewCallback";
        this.K = 1;
        this.L = 2;
        this.f292896z1 = controller.f407345n;
        this.A1 = controller.f407346o;
        this.B1 = new rl5.r(context);
        this.C1 = new int[2];
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.anb;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i(this.f292888J, "initView");
        this.f292895y1 = new in2.a1(this.H, this.f118183e);
        this.M = rootView.findViewById(com.tencent.mm.R.id.emw);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.v5y);
        if (textView != null) {
            textView.setText(com.tencent.mm.R.string.ojx);
        }
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.v5x);
        if (textView2 != null) {
            textView2.setText(com.tencent.mm.R.string.p0x);
        }
        android.widget.TextView textView3 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.v5r);
        if (textView3 != null) {
            textView3.setText(com.tencent.mm.R.string.p1s);
        }
        android.widget.TextView textView4 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.v5u);
        if (textView4 != null) {
            textView4.setText(com.tencent.mm.R.string.p1v);
        }
        android.widget.TextView textView5 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxl);
        if (textView5 != null) {
            textView5.setText(com.tencent.mm.R.string.f493750ox0);
        }
        android.widget.TextView textView6 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxm);
        if (textView6 != null) {
            textView6.setText(com.tencent.mm.R.string.owz);
        }
        android.widget.TextView textView7 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxk);
        if (textView7 != null) {
            textView7.setText(com.tencent.mm.R.string.p1q);
        }
        this.N = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.if7);
        this.P = (com.tencent.mm.ui.widget.MMSwitchBtn) rootView.findViewById(com.tencent.mm.R.id.f485631if5);
        this.Q = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.if6);
        e0();
        this.R = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.emp);
        this.S = (android.widget.LinearLayout) rootView.findViewById(com.tencent.mm.R.id.emq);
        android.widget.TextView textView8 = this.R;
        if (textView8 != null) {
            com.tencent.mm.ui.fk.a(textView8);
        }
        android.widget.TextView textView9 = this.R;
        if (textView9 != null) {
            textView9.setText(com.tencent.mm.R.string.f493783p21);
        }
        this.f292890p0 = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.mxx);
        this.f292892x0 = (androidx.constraintlayout.widget.ConstraintLayout) rootView.findViewById(com.tencent.mm.R.id.mxv);
        this.f292894y0 = (android.widget.ProgressBar) rootView.findViewById(com.tencent.mm.R.id.mxy);
        rootView.setOnClickListener(this);
        this.T = rootView.findViewById(com.tencent.mm.R.id.emo);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.fm6);
        this.U = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        this.V = rootView.findViewById(com.tencent.mm.R.id.f486931mx2);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.jg_);
        this.W = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f482686l9);
        this.X = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        this.Y = (androidx.constraintlayout.widget.ConstraintLayout) rootView.findViewById(com.tencent.mm.R.id.mxn);
        android.widget.TextView textView10 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxk);
        this.Z = textView10;
        if (textView10 != null) {
            textView10.setOnClickListener(this);
        }
        this.f292889l1 = rootView.findViewById(com.tencent.mm.R.id.mx9);
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.emo);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f292893x1 = new com.tencent.mm.plugin.finder.live.widget.t7((android.view.ViewGroup) findViewById4, in2.a.f292789d);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f292891p1;
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView != null ? wxRecyclerView.getAdapter() : null;
        in2.a1 a1Var = adapter instanceof in2.a1 ? (in2.a1) adapter : null;
        if (((a1Var == null || (arrayList = a1Var.f292798h) == null) ? 0 : arrayList.size()) >= 10) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f292892x0;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        } else {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f292892x0;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView11 = this.Q;
        if (textView11 != null) {
            textView11.setOnClickListener(new in2.d(this, rootView));
        }
        com.tencent.mm.plugin.finder.live.widget.t7 t7Var = this.f292893x1;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = t7Var != null ? t7Var.f119873a : null;
        this.f292891p1 = wxRecyclerView2;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.P(new in2.e(this));
        }
        if (!f0() && (frameLayout = this.f292890p0) != null) {
            frameLayout.setVisibility(8);
        }
        in2.a1 a1Var2 = this.f292895y1;
        if (a1Var2 != null) {
            a1Var2.f292801n = new in2.f(this, a1Var2);
            a1Var2.f292799i = new in2.g(this, a1Var2);
            a1Var2.f292800m = new in2.h(this);
            a1Var2.f292802o = new in2.i(this);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f292891p1;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setAdapter(a1Var2);
            wxRecyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView3.getContext()));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean O() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return !zl2.r4.f473950a.Y1(this.f118183e);
    }

    @Override // gn2.a
    public void b(boolean z17) {
        yz5.l lVar;
        in2.a1 a1Var = this.f292895y1;
        if (a1Var != null) {
            java.util.ArrayList arrayList = a1Var.f292798h;
            arrayList.clear();
            gk2.e eVar = a1Var.f292794d;
            arrayList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f329241f.f234053b);
            if (z17) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((dk2.yg) it.next()).f234398f = false;
                }
            }
            mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.getValue();
            java.lang.String str = j7Var != null ? j7Var.f329183a : null;
            if (!(str == null || str.length() == 0)) {
                java.util.Iterator it6 = arrayList.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(((dk2.yg) next).f234393a, str) && (lVar = a1Var.f292802o) != null) {
                        lVar.invoke(java.lang.Integer.valueOf(i17));
                    }
                    i17 = i18;
                }
                ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.postValue(null);
            }
            java.lang.Boolean bool = (java.lang.Boolean) ((mm2.m6) eVar.a(mm2.m6.class)).f329245m.getValue();
            a1Var.B(bool != null ? bool.booleanValue() : false);
            java.util.LinkedList linkedList = ((mm2.m6) eVar.a(mm2.m6.class)).f329247o;
            java.util.Iterator it7 = arrayList.iterator();
            int i19 = 0;
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                dk2.yg ygVar = (dk2.yg) next2;
                if (linkedList.contains(ygVar.f234393a)) {
                    ygVar.f234397e = false;
                    ygVar.f234394b = 0L;
                    ygVar.f234400h = "";
                    if (ygVar.f234395c == 4) {
                        a1Var.z(i19, ygVar);
                    }
                }
                i19 = i27;
            }
            a1Var.notifyDataSetChanged();
            dk2.yg ygVar2 = (dk2.yg) kz5.n0.Z(arrayList);
            if (ygVar2 != null && ygVar2.f234395c == 4) {
                a1Var.f292805r = 1;
            } else {
                a1Var.f292805r = 0;
            }
            a1Var.notifyDataSetChanged();
        }
    }

    @Override // gn2.a
    public void c(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        android.view.View view = this.V;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        android.view.View view2 = this.f292889l1;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.N;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f292891p1;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f292894y0;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(0);
    }

    @Override // gn2.a
    public void d(boolean z17) {
        android.widget.TextView textView;
        android.view.ViewGroup.LayoutParams layoutParams;
        if (z17) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        }
        android.view.View view = this.V;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.N;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        android.view.View view2 = this.f292889l1;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f292894y0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.content.Context context = this.f118183e;
        if (context.getResources().getConfiguration().orientation != 2 || (textView = this.Z) == null) {
            return;
        }
        if (textView == null || (layoutParams = textView.getLayoutParams()) == null) {
            layoutParams = null;
        } else {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, i65.a.f(context, com.tencent.mm.R.dimen.f479718db));
        }
        textView.setLayoutParams(layoutParams);
    }

    @Override // gn2.a
    public void e() {
        android.view.ViewTreeObserver viewTreeObserver;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        int size = ((mm2.m6) this.H.a(mm2.m6.class)).f329241f.f234053b.size();
        com.tencent.mars.xlog.Log.i(this.f292888J, "showMusicView size:" + size);
        if (size == 0) {
            d(true);
            return;
        }
        if (f0()) {
            android.widget.FrameLayout frameLayout = this.f292890p0;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.f292890p0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView = this.R;
        if (textView != null) {
            textView.setText(this.f118183e.getResources().getString(com.tencent.mm.R.string.p2f, java.lang.String.valueOf(size)));
        }
        e0();
        android.view.View view = this.V;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        android.view.View view2 = this.f292889l1;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout3 = this.N;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f292891p1;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f292894y0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f292891p1;
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView2 != null ? wxRecyclerView2.getAdapter() : null;
        in2.a1 a1Var = adapter instanceof in2.a1 ? (in2.a1) adapter : null;
        if (((a1Var == null || (arrayList = a1Var.f292798h) == null) ? 0 : arrayList.size()) >= 10) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f292892x0;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
        } else {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.f292892x0;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f292891p1;
        if (wxRecyclerView3 == null || (viewTreeObserver = wxRecyclerView3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new in2.p(this));
    }

    public final void e0() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.P;
        gk2.e eVar = this.H;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(zl2.r4.f473950a.h2(eVar));
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        o(r4Var.h2(eVar));
        ((mm2.m6) eVar.a(mm2.m6.class)).f329245m.postValue(java.lang.Boolean.valueOf(r4Var.h2(eVar)));
    }

    public final boolean f0() {
        return ((mm2.c1) this.H.a(mm2.c1.class)).a8();
    }

    @Override // gn2.a
    public void j() {
        s(true);
    }

    @Override // gn2.a
    public void k(int i17) {
        android.widget.TextView textView = this.R;
        if (textView == null) {
            return;
        }
        android.content.Context context = this.f118183e;
        textView.setText(i17 > 0 ? context.getResources().getString(com.tencent.mm.R.string.p2f, java.lang.String.valueOf(i17)) : context.getResources().getString(com.tencent.mm.R.string.p2f, "-"));
    }

    @Override // gn2.a
    public int m() {
        in2.a1 a1Var = this.f292895y1;
        if (a1Var != null) {
            return a1Var.getItemCount();
        }
        return 0;
    }

    @Override // gn2.a
    public void n(int i17) {
        in2.a1 a1Var = this.f292895y1;
        if (a1Var != null) {
            a1Var.f292798h.remove(i17);
            a1Var.notifyDataSetChanged();
        }
    }

    @Override // gn2.a
    public void o(boolean z17) {
        in2.a1 a1Var = this.f292895y1;
        if (a1Var != null) {
            a1Var.B(z17);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        in2.v0 v0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fm6) {
            s(true);
        } else {
            in2.n0 n0Var = this.A1;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mxk) {
                boolean f07 = f0();
                sf2.x xVar = this.I;
                if (f07) {
                    xVar.q7(true);
                    xVar.n7(true, new in2.o(this));
                } else {
                    if (n0Var != null) {
                        com.tencent.mm.plugin.finder.live.widget.e0.W(n0Var, this, false, 0, 6, null);
                    }
                    com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.P;
                    if (mMSwitchBtn != null) {
                        mMSwitchBtn.setCheck(true);
                    }
                    ((mm2.m6) this.H.a(mm2.m6.class)).f329245m.postValue(java.lang.Boolean.TRUE);
                    xVar.q7(true);
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f482686l9) {
                if (n0Var != null) {
                    com.tencent.mm.plugin.finder.live.widget.e0.W(n0Var, this, false, 0, 6, null);
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jg_ && (v0Var = this.f292896z1) != null) {
                com.tencent.mm.plugin.finder.live.widget.e0.W(v0Var, this, false, 0, 6, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorMusicSingSongContentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // gn2.a
    public java.util.ArrayList p(java.lang.String str) {
        in2.a1 a1Var = this.f292895y1;
        if (a1Var == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = a1Var.f292798h.iterator();
        while (it.hasNext()) {
            dk2.yg ygVar = (dk2.yg) it.next();
            if ((ygVar.f234393a.length() > 0) && !kotlin.jvm.internal.o.b(str, ygVar.f234393a)) {
                arrayList.add(ygVar.f234393a);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void s(boolean z17) {
        android.os.IBinder windowToken;
        super.s(z17);
        android.view.View view = this.T;
        if (view == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        java.lang.Object systemService = this.f118183e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
    }
}
