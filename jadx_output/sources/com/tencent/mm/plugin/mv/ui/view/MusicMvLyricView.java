package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\b=>?@AB\u0013CB!\u0012\u0006\u00106\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u00109\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;B\u0019\b\u0016\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b:\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006D"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvLyricView;", "Landroid/widget/RelativeLayout;", "Landroidx/transition/AutoTransition;", "getTransition", "", "visibility", "Ljz5/f0;", "setVisibility", "Lll3/h1;", "lyricObj", "setLyricObj", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "d", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getLyricRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setLyricRv", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "lyricRv", "Lcom/tencent/mm/plugin/mv/ui/view/z2;", "t", "Lcom/tencent/mm/plugin/mv/ui/view/z2;", "getEventListener", "()Lcom/tencent/mm/plugin/mv/ui/view/z2;", "setEventListener", "(Lcom/tencent/mm/plugin/mv/ui/view/z2;)V", "eventListener", "", "B", "Z", "isShowLyricPrelude", "()Z", "setShowLyricPrelude", "(Z)V", "", "F", "[I", "getFirstVisibleItemPos", "()[I", "setFirstVisibleItemPos", "([I)V", "firstVisibleItemPos", "G", "getLastVisibleItemPos", "setLastVisibleItemPos", "lastVisibleItemPos", "H", "I", "getShowPreludeLenNum", "()I", "setShowPreludeLenNum", "(I)V", "showPreludeLenNum", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/mv/ui/view/r2", "com/tencent/mm/plugin/mv/ui/view/s2", "com/tencent/mm/plugin/mv/ui/view/u2", "com/tencent/mm/plugin/mv/ui/view/v2", "com/tencent/mm/plugin/mv/ui/view/w2", "com/tencent/mm/plugin/mv/ui/view/y2", "com/tencent/mm/plugin/mv/ui/view/a3", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvLyricView extends android.widget.RelativeLayout {
    public static final int I = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);

    /* renamed from: J, reason: collision with root package name */
    public static final int f151680J = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mapsdk.internal.km.f50100e);
    public static final int K = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24);
    public static final float L = 0.4f;
    public long A;

    /* renamed from: B, reason: from kotlin metadata */
    public boolean isShowLyricPrelude;
    public boolean C;
    public java.util.concurrent.Future D;
    public androidx.recyclerview.widget.o1 E;

    /* renamed from: F, reason: from kotlin metadata */
    public int[] firstVisibleItemPos;

    /* renamed from: G, reason: from kotlin metadata */
    public int[] lastVisibleItemPos;

    /* renamed from: H, reason: from kotlin metadata */
    public int showPreludeLenNum;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f151682e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f151683f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f151684g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f151685h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f151686i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f151687m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f151688n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.FrameLayout f151689o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.LyricFadeLayout f151690p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.animation.AccelerateDecelerateInterpolator f151691q;

    /* renamed from: r, reason: collision with root package name */
    public ll3.h1 f151692r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f151693s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.mv.ui.view.z2 eventListener;

    /* renamed from: u, reason: collision with root package name */
    public int f151695u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f151696v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.a3 f151697w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f151698x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f151699y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f151700z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvLyricView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f151691q = new android.view.animation.AccelerateDecelerateInterpolator();
        this.f151693s = new java.util.ArrayList();
        this.f151695u = -1;
        this.f151697w = new com.tencent.mm.plugin.mv.ui.view.a3(null, null, null, 7, null);
        this.f151698x = true;
        this.C = true;
        this.firstVisibleItemPos = new int[2];
        this.lastVisibleItemPos = new int[2];
        com.tencent.mm.plugin.mv.ui.view.h3 h3Var = new com.tencent.mm.plugin.mv.ui.view.h3(this);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489321c50, this);
        this.f151684g = inflate;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j7l);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f151690p = (com.tencent.mm.plugin.mv.ui.view.LyricFadeLayout) findViewById2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "prepareViews");
        this.f151682e = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView$prepareViews$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "getItemConvert, type:" + type);
                return new com.tencent.mm.plugin.mv.ui.view.y2(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.this);
            }
        }, arrayList, true);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = inflate != null ? (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.j7r) : null;
        this.lyricRv = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.f151682e);
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false);
        this.f151683f = linearLayoutManager;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.lyricRv;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(linearLayoutManager);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.lyricRv;
        if (wxRecyclerView3 != null) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.lyricRv;
            kotlin.jvm.internal.o.d(wxRecyclerView4);
            wxRecyclerView3.N(new com.tencent.mm.plugin.mv.ui.view.a0(context2, wxRecyclerView4));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView5 = this.lyricRv;
        if (wxRecyclerView5 != null) {
            wxRecyclerView5.i(h3Var);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f151682e;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.mv.ui.view.f3(this);
        }
        if (inflate != null && (findViewById = inflate.findViewById(com.tencent.mm.R.id.aae)) != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.g3(this));
        }
        setTag(this);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ndi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f151685h = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ndp);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f151686i = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.mye);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f151687m = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.cl7);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f151688n = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f486930mx1);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f151689o = (android.widget.FrameLayout) findViewById7;
        this.f151685h.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.q2(this));
        this.f151686i.setTextColor(-1);
        setClickable(true);
    }

    public static final void a(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        musicMvLyricView.f151698x = !musicMvLyricView.f151698x;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("translateViewMode: current view mode is: ");
        sb6.append(musicMvLyricView.f151698x ? "small" : "big");
        sb6.append(" mode");
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", sb6.toString());
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvLyricView.lyricRv;
        if (wxRecyclerView != null) {
            wxRecyclerView.f1();
        }
        if (musicMvLyricView.f151698x) {
            musicMvLyricView.e();
        } else {
            u4.g1.c(u4.j0.b(musicMvLyricView.f151689o, com.tencent.mm.R.layout.c59, musicMvLyricView.getContext()), musicMvLyricView.getTransition());
            com.tencent.mm.plugin.mv.ui.view.z2 z2Var = musicMvLyricView.eventListener;
            if (z2Var != null) {
                ((com.tencent.mm.plugin.mv.ui.uic.j1) z2Var).a(false);
            }
            com.tencent.mm.plugin.mv.ui.view.z2 z2Var2 = musicMvLyricView.eventListener;
            if (z2Var2 != null) {
                com.tencent.mm.plugin.mv.ui.uic.s1.Q6(((com.tencent.mm.plugin.mv.ui.uic.j1) z2Var2).f151214a, 52);
            }
            musicMvLyricView.f();
        }
        musicMvLyricView.C = true;
        musicMvLyricView.b();
    }

    private final androidx.transition.AutoTransition getTransition() {
        androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
        autoTransition.U(com.tencent.mm.R.id.ndi);
        autoTransition.Z(200L);
        autoTransition.a0(this.f151691q);
        return autoTransition;
    }

    public final void b() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ndi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f151685h = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ndp);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f151686i = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mye);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f151687m = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.cl7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f151688n = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById4;
        this.f151685h.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.b3(this));
        android.widget.TextView textView = this.f151686i;
        com.tencent.mm.plugin.mv.ui.view.a3 a3Var = this.f151697w;
        textView.setText(a3Var.f151777a);
        this.f151687m.setText(a3Var.f151778b);
        java.lang.String str = a3Var.f151779c;
        if (!(str == null || str.length() == 0)) {
            yo0.f fVar = new yo0.f();
            java.lang.String _path = ll3.i1.f319182a.b(str);
            kotlin.jvm.internal.o.g(_path, "_path");
            fVar.f464079c = _path;
            fVar.f464078b = true;
            fVar.f464077a = true;
            yo0.i a17 = fVar.a();
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f151688n;
            if (str != null && mMRoundCornerImageView != null) {
                vo0.e.f438468b.h(str, mMRoundCornerImageView, a17, new com.tencent.mm.plugin.mv.ui.view.c3(str, mMRoundCornerImageView));
            }
        }
        if (this.f151698x) {
            return;
        }
        int dimensionPixelOffset = getResources().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz) * 2);
        if (((int) this.f151686i.getPaint().measureText(a3Var.f151777a)) >= dimensionPixelOffset) {
            this.f151686i.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            this.f151686i.setSingleLine(true);
            this.f151686i.setSelected(true);
            this.f151686i.setFocusable(true);
        }
        java.lang.String str2 = a3Var.f151778b;
        if (!(str2 == null || str2.length() == 0) && ((int) this.f151687m.getPaint().measureText(a3Var.f151778b)) >= dimensionPixelOffset) {
            this.f151687m.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            this.f151687m.setSingleLine(true);
            this.f151687m.setSelected(true);
            this.f151687m.setFocusable(true);
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f151688n.getLayoutParams();
        layoutParams.height = dimensionPixelOffset;
        layoutParams.width = dimensionPixelOffset;
        this.f151688n.setLayoutParams(layoutParams);
    }

    public final void c(int i17, int i18) {
        java.util.List data;
        com.tencent.mm.plugin.mv.ui.view.w2 w2Var;
        java.util.List data2;
        com.tencent.mm.plugin.mv.ui.view.w2 w2Var2;
        com.tencent.mm.plugin.mv.ui.view.v2 v2Var = null;
        if (i17 >= 0) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f151682e;
            com.tencent.mm.plugin.mv.ui.view.v2 v2Var2 = (wxRecyclerAdapter == null || (data2 = wxRecyclerAdapter.getData()) == null || (w2Var2 = (com.tencent.mm.plugin.mv.ui.view.w2) data2.get(i17)) == null) ? null : w2Var2.f151979d;
            if (v2Var2 != null) {
                v2Var2.f151969f = false;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f151682e;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyItemChanged(i17);
            }
        }
        if (!this.isShowLyricPrelude) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f151682e;
            if (wxRecyclerAdapter3 != null && (data = wxRecyclerAdapter3.getData()) != null && (w2Var = (com.tencent.mm.plugin.mv.ui.view.w2) data.get(i18)) != null) {
                v2Var = w2Var.f151979d;
            }
            if (v2Var != null) {
                v2Var.f151969f = true;
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = this.f151682e;
        if (wxRecyclerAdapter4 != null) {
            wxRecyclerAdapter4.notifyItemChanged(i18);
        }
    }

    public final void d(android.view.View view, float f17) {
        if (view == null) {
            return;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, f17);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat.addListener(new com.tencent.mm.plugin.mv.ui.view.d3(this, view));
        ofFloat.start();
    }

    public final void e() {
        u4.g1.c(u4.j0.b(this.f151689o, com.tencent.mm.R.layout.c5_, getContext()), getTransition());
        com.tencent.mm.plugin.mv.ui.view.z2 z2Var = this.eventListener;
        if (z2Var != null) {
            ((com.tencent.mm.plugin.mv.ui.uic.j1) z2Var).a(true);
        }
        com.tencent.mm.plugin.mv.ui.view.z2 z2Var2 = this.eventListener;
        if (z2Var2 != null) {
            com.tencent.mm.plugin.mv.ui.uic.s1.Q6(((com.tencent.mm.plugin.mv.ui.uic.j1) z2Var2).f151214a, 53);
        }
        g();
    }

    public final void f() {
        if (this.f151699y) {
            this.f151699y = false;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.lyricRv;
            if (wxRecyclerView != null) {
                wxRecyclerView.setFadingEdgeLength(K);
            }
            this.f151690p.setFade(false);
        }
    }

    public final void g() {
        f();
        java.util.concurrent.Future future = this.D;
        if (future != null) {
            future.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.mv.ui.view.e3 e3Var = new com.tencent.mm.plugin.mv.ui.view.e3(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.D = t0Var.z(e3Var, 2000L, false);
    }

    public final com.tencent.mm.plugin.mv.ui.view.z2 getEventListener() {
        return this.eventListener;
    }

    public final int[] getFirstVisibleItemPos() {
        return this.firstVisibleItemPos;
    }

    public final int[] getLastVisibleItemPos() {
        return this.lastVisibleItemPos;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getLyricRv() {
        return this.lyricRv;
    }

    public final int getShowPreludeLenNum() {
        return this.showPreludeLenNum;
    }

    public final void h(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.lyricRv;
        if (wxRecyclerView != null) {
            wxRecyclerView.f1();
        }
        this.f151696v = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "scrollToCenterAndEnterImmersive :" + i17);
        int[] iArr = new int[2];
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.lyricRv;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.getLocationInWindow(iArr);
        }
        int height = ((int) (getHeight() * L)) - iArr[1];
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f151683f;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView", "scrollToCenterAndEnterImmersive", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView", "scrollToCenterAndEnterImmersive", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        g();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View changedView, int i17) {
        kotlin.jvm.internal.o.g(changedView, "changedView");
        super.onVisibilityChanged(changedView, i17);
        if (kotlin.jvm.internal.o.b(changedView, this) && i17 == 8) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.lyricRv;
            androidx.recyclerview.widget.p2 B0 = wxRecyclerView != null ? wxRecyclerView.B0(0) : null;
            kotlin.jvm.internal.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.view.LyricItemDecoration");
            com.tencent.mm.plugin.mv.ui.view.a0 a0Var = (com.tencent.mm.plugin.mv.ui.view.a0) B0;
            if (a0Var.f151769q) {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.mv.ui.view.a0.f151758x, "stopAnim");
            }
            a0Var.f151769q = false;
            a0Var.f151760e.invalidate();
        }
    }

    public final void setEventListener(com.tencent.mm.plugin.mv.ui.view.z2 z2Var) {
        this.eventListener = z2Var;
    }

    public final void setFirstVisibleItemPos(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<set-?>");
        this.firstVisibleItemPos = iArr;
    }

    public final void setLastVisibleItemPos(int[] iArr) {
        kotlin.jvm.internal.o.g(iArr, "<set-?>");
        this.lastVisibleItemPos = iArr;
    }

    public final void setLyricObj(ll3.h1 h1Var) {
        java.util.List data;
        java.util.List data2;
        this.f151692r = h1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sentenceSize:");
        sb6.append(h1Var != null ? java.lang.Integer.valueOf(h1Var.e()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", sb6.toString());
        ll3.h1 h1Var2 = this.f151692r;
        if (h1Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicMvCommentView", "null == lyricObj, maybe you not setLyricObj, check ！！！");
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f151693s;
        arrayList.clear();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f151682e;
        if (wxRecyclerAdapter != null && (data2 = wxRecyclerAdapter.getData()) != null) {
            data2.clear();
        }
        int e17 = h1Var2.e();
        for (int i17 = 0; i17 < e17; i17++) {
            ll3.f1 d17 = h1Var2.d(i17);
            kotlin.jvm.internal.o.f(d17, "getSentence(...)");
            if (!d17.a()) {
                long j17 = d17.f319167a;
                java.lang.String content = d17.f319168b;
                kotlin.jvm.internal.o.f(content, "content");
                com.tencent.mm.plugin.mv.ui.view.v2 v2Var = new com.tencent.mm.plugin.mv.ui.view.v2(j17, content, false);
                com.tencent.mm.plugin.mv.ui.view.w2 w2Var = new com.tencent.mm.plugin.mv.ui.view.w2(v2Var);
                arrayList.add(v2Var);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f151682e;
                if (wxRecyclerAdapter2 != null && (data = wxRecyclerAdapter2.getData()) != null) {
                    data.add(w2Var);
                }
            }
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f151682e;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyDataSetChanged();
        }
        this.A = 0L;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = this.f151682e;
        kotlin.jvm.internal.o.d(wxRecyclerAdapter4);
        if (wxRecyclerAdapter4.getData().size() > 0) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter5 = this.f151682e;
            kotlin.jvm.internal.o.d(wxRecyclerAdapter5);
            this.A = ((com.tencent.mm.plugin.mv.ui.view.w2) wxRecyclerAdapter5.getData().get(0)).f151979d.f151967d;
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "preludeLen:" + this.A + " ms");
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.lyricRv;
            androidx.recyclerview.widget.p2 B0 = wxRecyclerView != null ? wxRecyclerView.B0(0) : null;
            kotlin.jvm.internal.o.e(B0, "null cannot be cast to non-null type com.tencent.mm.plugin.mv.ui.view.LyricItemDecoration");
            ((com.tencent.mm.plugin.mv.ui.view.a0) B0).g(0L);
        }
    }

    public final void setLyricRv(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.lyricRv = wxRecyclerView;
    }

    public final void setShowLyricPrelude(boolean z17) {
        this.isShowLyricPrelude = z17;
    }

    public final void setShowPreludeLenNum(int i17) {
        this.showPreludeLenNum = i17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 8) {
            this.f151696v = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvLyricView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
