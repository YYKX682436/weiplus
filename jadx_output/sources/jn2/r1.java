package jn2;

/* loaded from: classes10.dex */
public final class r1 extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener, gn2.a {
    public mm2.j6 A1;
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f300682J;
    public final int K;
    public android.widget.TextView L;
    public android.widget.LinearLayout M;
    public android.view.View N;
    public android.view.View P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public android.view.View U;
    public com.tencent.mm.view.recyclerview.WxRecyclerView V;
    public android.widget.FrameLayout W;
    public androidx.constraintlayout.widget.ConstraintLayout X;
    public androidx.constraintlayout.widget.ConstraintLayout Y;
    public android.widget.TextView Z;

    /* renamed from: l1, reason: collision with root package name */
    public jn2.m0 f300683l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ProgressBar f300684p0;

    /* renamed from: p1, reason: collision with root package name */
    public final rl5.r f300685p1;

    /* renamed from: x0, reason: collision with root package name */
    public jn2.z1 f300686x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int[] f300687x1;

    /* renamed from: y0, reason: collision with root package name */
    public jn2.j f300688y0;

    /* renamed from: y1, reason: collision with root package name */
    public jn2.d1 f300689y1;

    /* renamed from: z1, reason: collision with root package name */
    public kotlinx.coroutines.r2 f300690z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f300682J = "FinderLiveAnchorSingSongListPanel";
        this.K = 1;
        this.f300685p1 = new rl5.r(context);
        this.f300687x1 = new int[2];
        this.f300689y1 = jn2.d1.f300581g;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e8q;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        android.widget.FrameLayout frameLayout;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        com.tencent.mars.xlog.Log.i(this.f300682J, "initView");
        android.content.Context context = this.f118183e;
        sf2.x xVar = this.I;
        gk2.e eVar = this.H;
        this.f300686x0 = new jn2.z1(eVar, context, xVar);
        this.L = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.emp);
        this.M = (android.widget.LinearLayout) rootView.findViewById(com.tencent.mm.R.id.emq);
        android.widget.TextView textView = this.L;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        this.W = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.mxx);
        this.X = (androidx.constraintlayout.widget.ConstraintLayout) rootView.findViewById(com.tencent.mm.R.id.mxv);
        this.f300684p0 = (android.widget.ProgressBar) rootView.findViewById(com.tencent.mm.R.id.mxy);
        rootView.setOnClickListener(this);
        this.S = rootView.findViewById(com.tencent.mm.R.id.emo);
        this.T = rootView.findViewById(com.tencent.mm.R.id.emw);
        this.N = rootView.findViewById(com.tencent.mm.R.id.f486931mx2);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f485904ug0);
        this.P = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.jg_);
        this.Q = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f482686l9);
        this.R = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        this.Y = (androidx.constraintlayout.widget.ConstraintLayout) rootView.findViewById(com.tencent.mm.R.id.mxn);
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxk);
        this.Z = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        this.U = rootView.findViewById(com.tencent.mm.R.id.mx9);
        android.view.View view = this.P;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) view : null;
        if (weImageView != null) {
            weImageView.setImageResource(this.f300689y1.f300584d);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.V;
        java.lang.Object adapter = wxRecyclerView != null ? wxRecyclerView.getAdapter() : null;
        jn2.z1 z1Var = adapter instanceof jn2.z1 ? (jn2.z1) adapter : null;
        if (((z1Var == null || (arrayList = z1Var.f300769h) == null) ? 0 : arrayList.size()) >= 10) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.X;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        } else {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.X;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.tgh);
        this.V = wxRecyclerView2;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.P(new jn2.f1(this));
        }
        if (!((mm2.c1) eVar.a(mm2.c1.class)).a8() && (frameLayout = this.W) != null) {
            frameLayout.setVisibility(8);
        }
        jn2.z1 z1Var2 = this.f300686x0;
        if (z1Var2 != null) {
            z1Var2.f300773o = new jn2.g1(z1Var2, this);
            z1Var2.f300771m = new jn2.h1(z1Var2, this);
            z1Var2.f300772n = new jn2.i1(this);
            z1Var2.f300770i = new jn2.j1(this, z1Var2);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.V;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setAdapter(z1Var2);
            wxRecyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView3.getContext()));
            jn2.z1 z1Var3 = this.f300686x0;
            if (z1Var3 != null) {
                z1Var3.f300774p = wxRecyclerView3;
            }
        }
        e0();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean O() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // gn2.a
    public void b(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        jn2.z1 z1Var = this.f300686x0;
        if (z1Var != null) {
            java.util.ArrayList arrayList = z1Var.f300769h;
            arrayList.clear();
            gk2.e eVar = z1Var.f300765d;
            arrayList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f329249q.f234085a);
            mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.getValue();
            java.lang.String str = j7Var != null ? j7Var.f329184b : null;
            z1Var.notifyDataSetChanged();
            int i17 = 0;
            if (str == null || str.length() == 0) {
                return;
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((r45.z22) it.next()).f391629f, str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0 && (recyclerView = z1Var.f300774p) != null) {
                recyclerView.post(new jn2.y1(z1Var, i17));
            }
            ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.postValue(null);
        }
    }

    @Override // gn2.a
    public void c(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        android.view.View view = this.N;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.U;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.V;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(8);
        }
        android.widget.ProgressBar progressBar = this.f300684p0;
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
        android.view.View view = this.N;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        android.view.View view3 = this.U;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = this.f300684p0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = this.W;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
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
        e0();
        gk2.e eVar = this.H;
        int size = ((mm2.m6) eVar.a(mm2.m6.class)).f329249q.f234085a.size();
        com.tencent.mars.xlog.Log.i(this.f300682J, "showMusicView size:" + size);
        if (size == 0) {
            d(true);
            return;
        }
        if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
            android.widget.FrameLayout frameLayout = this.W;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.W;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setText(this.f118183e.getResources().getString(com.tencent.mm.R.string.eiu, java.lang.String.valueOf(size)));
        }
        android.view.View view = this.N;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        android.view.View view2 = this.T;
        if (view2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.U;
        if (view3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "showMusicView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.V;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.ProgressBar progressBar = this.f300684p0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.V;
        androidx.recyclerview.widget.f2 adapter = wxRecyclerView2 != null ? wxRecyclerView2.getAdapter() : null;
        jn2.z1 z1Var = adapter instanceof jn2.z1 ? (jn2.z1) adapter : null;
        if (((z1Var == null || (arrayList = z1Var.f300769h) == null) ? 0 : arrayList.size()) >= 10) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.X;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(0);
            }
        } else {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.X;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.V;
        if (wxRecyclerView3 == null || (viewTreeObserver = wxRecyclerView3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new jn2.o1(this));
    }

    public final void e0() {
        kotlinx.coroutines.r2 r2Var = this.f300690z1;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.A1 = null;
        kotlinx.coroutines.y0 y0Var = this.E;
        this.f300690z1 = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new jn2.l1(this, null), 3, null) : null;
    }

    public final void f0() {
        if (this.f300688y0 == null) {
            this.f300688y0 = new jn2.j(this.f118183e, this.H, this.I);
        }
        jn2.j jVar = this.f300688y0;
        if (jVar != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(jVar, this, false, 0, 6, null);
        }
    }

    @Override // gn2.a
    public void j() {
        s(true);
    }

    @Override // gn2.a
    public void k(int i17) {
        android.widget.TextView textView = this.L;
        if (textView == null) {
            return;
        }
        android.content.Context context = this.f118183e;
        textView.setText(i17 > 0 ? context.getResources().getString(com.tencent.mm.R.string.eiu, java.lang.String.valueOf(i17)) : context.getResources().getString(com.tencent.mm.R.string.eiu, "-"));
    }

    @Override // gn2.a
    public int m() {
        jn2.z1 z1Var = this.f300686x0;
        if (z1Var != null) {
            return z1Var.getItemCount();
        }
        return 0;
    }

    @Override // gn2.a
    public void n(int i17) {
        jn2.z1 z1Var = this.f300686x0;
        if (z1Var != null) {
            java.util.ArrayList arrayList = z1Var.f300769h;
            if (i17 >= 0 && i17 < arrayList.size()) {
                arrayList.remove(i17);
                z1Var.notifyItemRemoved(i17);
                com.tencent.mars.xlog.Log.i(z1Var.f300768g, "deleteSongItem pos:" + i17 + ", remaining size:" + arrayList.size());
            }
        }
    }

    @Override // gn2.a
    public void o(boolean z17) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        jn2.d1 d1Var;
        mm2.k6 k6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        te2.a9 a9Var = te2.a9.f417883a;
        sf2.x xVar = this.I;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mxk) {
            te2.a9.f(a9Var, xVar.h7(), 1, null, null, 12, null);
            f0();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f482686l9) {
            te2.a9.f(a9Var, xVar.h7(), 1, null, null, 12, null);
            f0();
        } else {
            android.content.Context context = this.f118183e;
            gk2.e eVar = this.H;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.jg_) {
                te2.a9.f(a9Var, xVar.h7(), 5, null, null, 12, null);
                if (this.f300683l1 == null) {
                    this.f300683l1 = new jn2.m0(context, eVar, xVar);
                }
                jn2.m0 m0Var = this.f300683l1;
                if (m0Var != null) {
                    com.tencent.mm.plugin.finder.live.widget.e0.W(m0Var, this, false, 0, 6, null);
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f485904ug0) {
                int ordinal = this.f300689y1.ordinal();
                if (ordinal == 0) {
                    d1Var = jn2.d1.f300581g;
                } else if (ordinal == 1) {
                    d1Var = jn2.d1.f300582h;
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    d1Var = jn2.d1.f300580f;
                }
                this.f300689y1 = d1Var;
                android.view.View view2 = this.P;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view2 instanceof com.tencent.mm.ui.widget.imageview.WeImageView ? (com.tencent.mm.ui.widget.imageview.WeImageView) view2 : null;
                if (weImageView != null) {
                    weImageView.setImageResource(d1Var.f300584d);
                }
                int ordinal2 = this.f300689y1.ordinal();
                if (ordinal2 == 0) {
                    k6Var = mm2.k6.f329200e;
                } else if (ordinal2 == 1) {
                    k6Var = mm2.k6.f329199d;
                } else {
                    if (ordinal2 != 2) {
                        throw new jz5.j();
                    }
                    k6Var = mm2.k6.f329201f;
                }
                xVar.getClass();
                te2.a9.f(a9Var, xVar.h7(), 10, null, k6Var, 4, null);
                ((kotlinx.coroutines.flow.h3) ((mm2.m6) eVar.a(mm2.m6.class)).f329252t).k(k6Var);
                java.lang.String string = context.getString(this.f300689y1.f300585e);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.oto, string);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                db5.t7.m(context, string2);
                com.tencent.mars.xlog.Log.i(this.f300682J, "switchLoopMode: " + this.f300689y1 + " -> " + k6Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // gn2.a
    public java.util.ArrayList p(java.lang.String str) {
        r45.ay1 ay1Var;
        jn2.z1 z1Var = this.f300686x0;
        if (z1Var == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = z1Var.f300769h.iterator();
        while (it.hasNext()) {
            r45.by1 by1Var = ((r45.z22) it.next()).f391631h;
            java.lang.String str2 = (by1Var == null || (ay1Var = by1Var.f371143d) == null) ? null : ay1Var.f370351e;
            if (str2 == null) {
                str2 = "";
            }
            if ((str2.length() > 0) && !kotlin.jvm.internal.o.b(str, str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void s(boolean z17) {
        android.os.IBinder windowToken;
        super.s(z17);
        android.view.View view = this.S;
        if (view == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        java.lang.Object systemService = this.f118183e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return true;
    }
}
