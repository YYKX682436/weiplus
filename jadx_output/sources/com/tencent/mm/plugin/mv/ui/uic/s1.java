package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s1 extends com.tencent.mm.ui.component.UIComponent {
    public boolean A;
    public boolean B;
    public final com.tencent.mm.sdk.platformtools.n3 C;
    public final com.tencent.mm.plugin.mv.ui.uic.i1 D;
    public final com.tencent.mm.plugin.mv.ui.uic.j1 E;
    public final com.tencent.mm.plugin.mv.ui.uic.f1 F;
    public final com.tencent.mm.plugin.mv.ui.uic.l1 G;
    public final android.view.GestureDetector H;
    public int I;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f151413d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f151414e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f151415f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f151416g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f151417h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f151418i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f151419m;

    /* renamed from: n, reason: collision with root package name */
    public ll3.h1 f151420n;

    /* renamed from: o, reason: collision with root package name */
    public int f151421o;

    /* renamed from: p, reason: collision with root package name */
    public int f151422p;

    /* renamed from: q, reason: collision with root package name */
    public uq5.b f151423q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f151424r;

    /* renamed from: s, reason: collision with root package name */
    public long f151425s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f151426t;

    /* renamed from: u, reason: collision with root package name */
    public fm3.u f151427u;

    /* renamed from: v, reason: collision with root package name */
    public long f151428v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView f151429w;

    /* renamed from: x, reason: collision with root package name */
    public long f151430x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f151431y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f151432z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151413d = "MicroMsg.MusicMvLyricUIC";
        this.f151415f = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.g1(activity));
        this.f151416g = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.k1(activity));
        this.f151418i = new java.util.ArrayList();
        this.f151419m = new java.util.ArrayList();
        this.f151422p = -1;
        new java.util.HashMap();
        this.C = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.D = new com.tencent.mm.plugin.mv.ui.uic.i1(this);
        this.E = new com.tencent.mm.plugin.mv.ui.uic.j1(this, activity);
        this.F = new com.tencent.mm.plugin.mv.ui.uic.f1(this);
        this.G = new com.tencent.mm.plugin.mv.ui.uic.l1(this);
        this.H = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.mv.ui.uic.h1(this));
    }

    public static final void O6(com.tencent.mm.plugin.mv.ui.uic.s1 s1Var, android.view.View view) {
        java.lang.String str = s1Var.f151413d;
        com.tencent.mars.xlog.Log.i(str, "_onViewAdded");
        androidx.recyclerview.widget.RecyclerView recyclerView = view != null ? (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.j7o) : null;
        if (recyclerView == null) {
            return;
        }
        java.util.ArrayList arrayList = s1Var.f151418i;
        if (arrayList.contains(recyclerView)) {
            return;
        }
        arrayList.add(recyclerView);
        com.tencent.mars.xlog.Log.i(str, "lyricList size:%d", java.lang.Integer.valueOf(arrayList.size()));
        if (((km3.d) recyclerView.getAdapter()) == null) {
            com.tencent.mars.xlog.Log.i(str, "new MusicLyricAdapter");
            km3.d dVar = new km3.d(s1Var.D);
            dVar.x(s1Var.f151419m);
            recyclerView.setAdapter(dVar);
        }
        if (((androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
            int i17 = s1Var.f151422p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = recyclerView;
            yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "_onViewAdded", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "_onViewAdded", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    public static final void P6(com.tencent.mm.plugin.mv.ui.uic.s1 s1Var, android.view.View view) {
        com.tencent.mars.xlog.Log.i(s1Var.f151413d, "_onViewRemoved");
        androidx.recyclerview.widget.RecyclerView recyclerView = view != null ? (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.j7o) : null;
        if (recyclerView == null) {
            return;
        }
        s1Var.f151418i.remove(recyclerView);
    }

    public static final void Q6(com.tencent.mm.plugin.mv.ui.uic.s1 s1Var, int i17) {
        com.tencent.mars.xlog.Log.i(s1Var.f151413d, "reportLyricsClickAction:%d", java.lang.Integer.valueOf(i17));
        android.app.Activity context = s1Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        android.app.Activity context2 = s1Var.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.hf2 hf2Var = ((com.tencent.mm.plugin.mv.ui.uic.n0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151310i;
        if (s1Var.f151427u != null) {
            fm3.j0 j0Var = fm3.j0.f264078a;
            android.app.Activity context3 = s1Var.getContext();
            fm3.u uVar = s1Var.f151427u;
            kotlin.jvm.internal.o.d(uVar);
            fm3.j0.g(j0Var, context3, hf2Var, uVar, i17, 1, 2, 0, n0Var.Q6(), n0Var.O6(), n0Var.P6(), n0Var.E, 64, null);
        }
    }

    public final com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R6() {
        return (com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView) ((jz5.n) this.f151415f).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if ((r4 != null && r4.getVisibility() == 0) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.s1.S6():void");
    }

    public final void T6() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) a17;
        android.view.View view = this.f151414e;
        if (view != null) {
            com.tencent.mm.plugin.mv.ui.uic.m8.f151301c.a(view, kz5.c0.k(java.lang.Integer.valueOf(com.tencent.mm.R.id.j7o), java.lang.Integer.valueOf(com.tencent.mm.R.id.f486071k22), java.lang.Integer.valueOf(com.tencent.mm.R.id.gbk), java.lang.Integer.valueOf(com.tencent.mm.R.id.gyy), java.lang.Integer.valueOf(com.tencent.mm.R.id.os8)), 8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f151417h;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R6 = R6();
        if (R6 != null) {
            R6.setVisibility(4);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R62 = R6();
        if (R62 != null) {
            R62.setAlpha(0.0f);
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.mv.ui.uic.e1) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.e1.class)).f151109g.a();
        android.view.View view2 = this.f151414e;
        if (view2 != null) {
            view2.post(new com.tencent.mm.plugin.mv.ui.uic.n1(this));
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity3 : null;
        if (mMFragmentActivity != null && (swipeBackLayout = mMFragmentActivity.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        pk4.c cVar = musicMvMainUIC.f150983p;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = cVar != null ? cVar.getEffectManager() : null;
        if (effectManager != null) {
            uq5.b bVar = (uq5.b) effectManager.g(uq5.k.BlurEffect);
            this.f151423q = bVar;
            if (bVar != null) {
                bVar.d(20.0f);
            }
            effectManager.c(this.f151423q);
        }
        pk4.c cVar2 = musicMvMainUIC.f150983p;
        if (cVar2 != null) {
            gk4.r rVar = ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).f174566f;
            um5.i0 i0Var = rVar.f272603h;
            long j17 = rVar.f272612q;
            i0Var.getClass();
            i0Var.f(new um5.t(i0Var, j17));
        }
        android.view.View view3 = this.f151414e;
        if (view3 != null) {
            view3.post(new com.tencent.mm.plugin.mv.ui.uic.p1(this));
        }
        this.f151424r = true;
    }

    public final void U6(android.view.View view, fm3.u musicMv) {
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        java.lang.String str = this.f151413d;
        com.tencent.mars.xlog.Log.i(str, "selectView");
        this.f151414e = view;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R6 = R6();
        if (R6 != null) {
            R6.setEventListener(null);
        }
        this.f151417h = view != null ? (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.j7o) : null;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R62 = R6();
        if (R62 != null) {
            R62.setEventListener(this.E);
        }
        this.f151427u = musicMv;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = view != null ? (com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView) view.findViewById(com.tencent.mm.R.id.j7n) : null;
        this.f151429w = musicMvLyricPreludeView;
        if (musicMvLyricPreludeView != null) {
            musicMvLyricPreludeView.setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.q1(this));
        }
        if (this.f151431y) {
            com.tencent.mars.xlog.Log.i(str, "show prelude lyric, hide lyricRV");
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f151417h;
            if (recyclerView != null) {
                recyclerView.setVisibility(4);
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView2 = this.f151429w;
            if (musicMvLyricPreludeView2 != null) {
                musicMvLyricPreludeView2.setVisibility(0);
                return;
            }
            return;
        }
        if (!this.f151432z || this.A) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "in 3 second, hide lyricRV");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f151417h;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setVisibility(4);
    }

    public final void V6(r45.hf2 hf2Var, ll3.h1 h1Var, boolean z17) {
        ll3.f1 d17;
        java.lang.String string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSongInfo lyricObj.sentenceSize :");
        java.lang.Long l17 = null;
        sb6.append(h1Var != null ? java.lang.Integer.valueOf(h1Var.e()) : null);
        sb6.append(", lyricList size:");
        java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> arrayList = this.f151418i;
        sb6.append(arrayList.size());
        sb6.append(", isFromFilterLyric:");
        sb6.append(z17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f151413d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (hf2Var != null && (string = hf2Var.getString(0)) != null) {
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R6 = R6();
            java.lang.String string2 = hf2Var.getString(1);
            java.lang.String string3 = hf2Var.getString(8);
            R6.getClass();
            com.tencent.mm.plugin.mv.ui.view.a3 a3Var = R6.f151697w;
            a3Var.getClass();
            a3Var.f151777a = string;
            if (string2 == null) {
                string2 = "";
            }
            a3Var.f151778b = string2;
            if (string3 == null) {
                string3 = "";
            }
            a3Var.f151779c = string3;
            R6.b();
        }
        boolean z18 = this.B;
        java.util.ArrayList arrayList2 = this.f151419m;
        if (z18 && arrayList2.size() >= 0) {
            com.tencent.mars.xlog.Log.i(str, "current lyrics is filter lyric, not to update");
            return;
        }
        this.B = z17;
        arrayList2.clear();
        this.f151420n = h1Var;
        if (h1Var != null) {
            int e17 = h1Var.e();
            for (int i17 = 0; i17 < e17; i17++) {
                java.lang.String str2 = h1Var.d(i17).f319168b;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(str2);
            }
        }
        R6().setLyricObj(h1Var);
        this.f151430x = 0L;
        if (arrayList2.size() > 0) {
            ll3.h1 h1Var2 = this.f151420n;
            if (h1Var2 != null && (d17 = h1Var2.d(0)) != null) {
                l17 = java.lang.Long.valueOf(d17.f319167a);
            }
            kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Long");
            this.f151430x = l17.longValue();
            com.tencent.mars.xlog.Log.i(str, "setSongInfo preludeLen:" + this.f151430x + " ms");
            if (this.f151430x >= 3000) {
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f151417h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                this.f151431y = true;
                com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = this.f151429w;
                if (musicMvLyricPreludeView != null) {
                    musicMvLyricPreludeView.setVisibility(0);
                    musicMvLyricPreludeView.f(0L);
                    com.tencent.mars.xlog.Log.i(str, "setSongInfo startAnim:" + this.f151430x + " ms");
                }
            }
        }
        if (!this.B && !this.f151432z) {
            com.tencent.mars.xlog.Log.i(str, "set timeout");
            this.f151432z = true;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f151417h;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(4);
            }
            this.C.postDelayed(new com.tencent.mm.plugin.mv.ui.uic.r1(this), 3000L);
        }
        for (androidx.recyclerview.widget.RecyclerView recyclerView3 : arrayList) {
            com.tencent.mars.xlog.Log.i(str, "update lyricLines:%d", java.lang.Integer.valueOf(arrayList2.size()));
            km3.d dVar = (km3.d) recyclerView3.getAdapter();
            if (dVar != null) {
                dVar.x(arrayList2);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R6 = R6();
        boolean z17 = false;
        if (R6 != null && R6.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17) {
            return super.onBackPressed();
        }
        S6();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        com.tencent.mars.xlog.Log.i(this.f151413d, "onCreateAfter");
        com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv = R6().getLyricRv();
        if (lyricRv != null) {
            lyricRv.setOnTouchListener(new com.tencent.mm.plugin.mv.ui.uic.m1(this));
        }
        jz5.g gVar = this.f151416g;
        com.tencent.mm.plugin.mv.ui.view.MusicMvWxRecyclerView musicMvWxRecyclerView = (com.tencent.mm.plugin.mv.ui.view.MusicMvWxRecyclerView) ((jz5.n) gVar).getValue();
        if (musicMvWxRecyclerView != null) {
            musicMvWxRecyclerView.setOnHierarchyChangeListener(this.F);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvWxRecyclerView musicMvWxRecyclerView2 = (com.tencent.mm.plugin.mv.ui.view.MusicMvWxRecyclerView) ((jz5.n) gVar).getValue();
        if (musicMvWxRecyclerView2 == null) {
            return;
        }
        musicMvWxRecyclerView2.setChangeListener(this.G);
    }
}
