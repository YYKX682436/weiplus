package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class c0 extends eo2.j {
    public android.widget.TextView A;
    public final java.util.HashMap A1;
    public androidx.recyclerview.widget.RecyclerView B;
    public android.view.View C;
    public android.view.View D;
    public android.widget.ImageView E;
    public android.widget.TextView F;
    public android.widget.TextView G;
    public android.view.ViewGroup H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ProgressBar f121177J;
    public android.view.View K;
    public com.tencent.mm.plugin.finder.profile.widget.s1 L;
    public com.tencent.mm.plugin.finder.profile.widget.s4 M;
    public android.view.View N;
    public final java.util.ArrayList P;
    public final java.util.ArrayList Q;
    public final java.util.ArrayList R;
    public final java.util.ArrayList S;
    public final java.util.ArrayList T;
    public java.lang.String U;
    public int V;
    public android.widget.ImageView W;
    public final com.tencent.mm.plugin.finder.storage.ga0 X;
    public final com.tencent.mm.plugin.finder.storage.ga0 Y;
    public com.tencent.mm.plugin.finder.storage.z90 Z;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f121178e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f121179f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f121180g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f121181h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f121182i;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f121183l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f121184m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f121185n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f121186o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f121187p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.member.convert.c f121188p0;

    /* renamed from: p1, reason: collision with root package name */
    public final kk.l f121189p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f121190q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f121191r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f121192s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f121193t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f121194u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f121195v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f121196w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f121197x;

    /* renamed from: x0, reason: collision with root package name */
    public int f121198x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f121199x1;

    /* renamed from: y, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f121200y;

    /* renamed from: y0, reason: collision with root package name */
    public int f121201y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f121202y1;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f121203z;

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashMap f121204z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.P = new java.util.ArrayList();
        this.Q = new java.util.ArrayList();
        this.R = new java.util.ArrayList();
        this.S = new java.util.ArrayList();
        this.T = new java.util.ArrayList();
        this.U = "";
        this.X = new com.tencent.mm.plugin.finder.storage.ga0(false, 206);
        this.Y = new com.tencent.mm.plugin.finder.storage.ga0(true, 206);
        this.f121183l1 = jz5.h.b(new com.tencent.mm.plugin.finder.member.preview.l(activity));
        this.f121189p1 = new kk.l(1);
        this.f121202y1 = "";
        this.f121204z1 = new java.util.HashMap();
        this.A1 = new java.util.HashMap();
    }

    public static final int V6(com.tencent.mm.plugin.finder.member.preview.c0 c0Var) {
        int i17;
        int h17 = com.tencent.mm.ui.bl.h(c0Var.getActivity());
        android.content.Context context = c0Var.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        int i27 = i17 - h17;
        android.app.Activity context2 = c0Var.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        android.view.View view = ((com.tencent.mm.plugin.finder.member.preview.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.member.preview.b.class)).f255572g;
        int height = (view != null ? view.getHeight() : 0) - h17;
        int i28 = height >= 0 ? height : 0;
        android.widget.TextView textView = c0Var.f121179f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("previewTitle");
            throw null;
        }
        int height2 = textView.getHeight();
        android.widget.TextView textView2 = c0Var.f121181h;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("previewIntroTitle");
            throw null;
        }
        int height3 = textView2.getHeight();
        android.widget.TextView textView3 = c0Var.f121184m;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("previewIntroExpend");
            throw null;
        }
        int height4 = textView3.getHeight();
        float dimension = c0Var.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
        float f17 = 0.0f;
        if (true ^ c0Var.P.isEmpty()) {
            if (c0Var.f121186o == null) {
                kotlin.jvm.internal.o.o("statRecycleView");
                throw null;
            }
            f17 = r5.getHeight() + 0.0f + dimension;
        }
        float f18 = (((((((i27 * 3) / 4) - i28) - height2) - height3) - f17) - height4) - dimension;
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberPreviewHeaderUIC", "updateIntroHeight: max " + ym5.x.b(c0Var.getContext(), f18) + " screenHeight " + ym5.x.b(c0Var.getContext(), i27) + " statHeight " + ym5.x.b(c0Var.getContext(), f17) + " barHeight " + ym5.x.b(c0Var.getContext(), i28) + " titleHeight " + ym5.x.b(c0Var.getContext(), height2) + " introTitleHeight " + ym5.x.b(c0Var.getContext(), height3));
        return (int) f18;
    }

    @Override // eo2.j
    public void O6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.U = stringExtra;
        this.V = getIntent().getIntExtra("key_member_preview_mode", 0);
    }

    @Override // eo2.j
    public void P6() {
        this.Z = new com.tencent.mm.plugin.finder.storage.z90(206, this.U);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.l3x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f121178e = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l3p);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f121179f = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 1.0f);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f486413qw5);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f121186o = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486411l46);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
        this.f121181h = textView2;
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f486408l45);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
        this.f121182i = textView3;
        textView3.setLineSpacing(0.0f, 1.4f);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f486410qw3);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f121180g = (android.view.ViewGroup) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f486409qw2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f121184m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.rww);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f121185n = (android.view.ViewGroup) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.l4x);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f121187p = findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.l4z);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById10;
        this.f121190q = textView4;
        com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.l4y);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f121191r = (androidx.recyclerview.widget.RecyclerView) findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.qgb);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f121192s = findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.qgd);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById13;
        this.f121193t = textView5;
        com.tencent.mm.ui.bk.r0(textView5.getPaint(), 0.8f);
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.qgc);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f121194u = (androidx.recyclerview.widget.RecyclerView) findViewById14;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.m7u);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f121195v = findViewById15;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.l4l);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.f121196w = findViewById16;
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.l4n);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        android.widget.TextView textView6 = (android.widget.TextView) findViewById17;
        this.f121197x = textView6;
        com.tencent.mm.ui.bk.r0(textView6.getPaint(), 0.8f);
        android.view.View findViewById18 = findViewById(com.tencent.mm.R.id.l4m);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.f121200y = (androidx.recyclerview.widget.RecyclerView) findViewById18;
        this.f121188p0 = new com.tencent.mm.plugin.finder.member.convert.c(null, getActivity(), this.U, true, 0);
        android.view.View findViewById19 = findViewById(com.tencent.mm.R.id.f486400q02);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.f121203z = findViewById19;
        android.view.View findViewById20 = findViewById(com.tencent.mm.R.id.f486402q04);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        android.widget.TextView textView7 = (android.widget.TextView) findViewById20;
        this.A = textView7;
        com.tencent.mm.ui.bk.r0(textView7.getPaint(), 0.8f);
        android.view.View findViewById21 = findViewById(com.tencent.mm.R.id.f486401q03);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.B = (androidx.recyclerview.widget.RecyclerView) findViewById21;
        android.view.View findViewById22 = findViewById(com.tencent.mm.R.id.l4d);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.C = findViewById22;
        android.view.View findViewById23 = findViewById(com.tencent.mm.R.id.l4e);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById23).getPaint(), 0.8f);
        android.view.View findViewById24 = findViewById(com.tencent.mm.R.id.f486396l40);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        this.D = findViewById24;
        android.view.View view = this.C;
        if (view == null) {
            kotlin.jvm.internal.o.o("liveLayout");
            throw null;
        }
        android.view.View findViewById25 = view.findViewById(com.tencent.mm.R.id.i6m);
        kotlin.jvm.internal.o.f(findViewById25, "findViewById(...)");
        this.E = (android.widget.ImageView) findViewById25;
        android.view.View view2 = this.C;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("liveLayout");
            throw null;
        }
        android.view.View findViewById26 = view2.findViewById(com.tencent.mm.R.id.cnv);
        kotlin.jvm.internal.o.f(findViewById26, "findViewById(...)");
        this.F = (android.widget.TextView) findViewById26;
        android.view.View view3 = this.C;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("liveLayout");
            throw null;
        }
        android.view.View findViewById27 = view3.findViewById(com.tencent.mm.R.id.cnw);
        kotlin.jvm.internal.o.f(findViewById27, "findViewById(...)");
        this.G = (android.widget.TextView) findViewById27;
        android.view.View view4 = this.D;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        android.view.View findViewById28 = view4.findViewById(com.tencent.mm.R.id.cnt);
        kotlin.jvm.internal.o.f(findViewById28, "findViewById(...)");
        this.W = (android.widget.ImageView) findViewById28;
        android.view.View findViewById29 = findViewById(com.tencent.mm.R.id.f484229dg3);
        kotlin.jvm.internal.o.f(findViewById29, "findViewById(...)");
        this.H = (android.view.ViewGroup) findViewById29;
        android.view.View findViewById30 = findViewById(com.tencent.mm.R.id.m2g);
        kotlin.jvm.internal.o.f(findViewById30, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById30;
        android.view.View findViewById31 = findViewById(com.tencent.mm.R.id.lbi);
        kotlin.jvm.internal.o.f(findViewById31, "findViewById(...)");
        this.f121177J = (android.widget.ProgressBar) findViewById31;
        android.view.View findViewById32 = findViewById(com.tencent.mm.R.id.f486403l42);
        kotlin.jvm.internal.o.f(findViewById32, "findViewById(...)");
        this.N = findViewById32;
        android.view.View findViewById33 = findViewById(com.tencent.mm.R.id.l_a);
        kotlin.jvm.internal.o.f(findViewById33, "findViewById(...)");
        this.K = findViewById33;
        jz5.g gVar = this.f121183l1;
        kk.l lVar = this.f121189p1;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = new com.tencent.mm.plugin.finder.profile.widget.s4(this.U, getActivity(), false, (r45.qt2) ((jz5.n) gVar).getValue(), 101, true, true, lVar, "204", null, 512, null);
        this.M = s4Var;
        s4Var.f124770x = new com.tencent.mm.plugin.finder.member.preview.n(this);
        android.view.View view5 = this.K;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("noticeLayout");
            throw null;
        }
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = new com.tencent.mm.plugin.finder.profile.widget.s1(view5, getActivity(), (r45.qt2) ((jz5.n) gVar).getValue(), true, lVar, "206", null, 64, null);
        this.L = s1Var;
        s1Var.f124724h = new com.tencent.mm.plugin.finder.member.preview.o(this);
        s1Var.D = true;
        s1Var.k(this.U);
        com.tencent.mm.ui.bk.t0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.feo)).getPaint());
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f121186o;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("statRecycleView");
            throw null;
        }
        final android.app.Activity context = getContext();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context) { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewHeaderUIC$initStatList$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF123307r() {
                return false;
            }
        });
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f121186o;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("statRecycleView");
            throw null;
        }
        recyclerView2.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewHeaderUIC$initStatList$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.oo();
            }
        }, this.P, false));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f121191r;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("videoRecycleView");
            throw null;
        }
        recyclerView3.setLayoutManager(this.X.d(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f121191r;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("videoRecycleView");
            throw null;
        }
        recyclerView4.N(new com.tencent.mm.plugin.finder.storage.ca0());
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f121191r;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("videoRecycleView");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewHeaderUIC$initVideoList$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return com.tencent.mm.plugin.finder.member.preview.c0.this.X.b(null).getItemConvert(type);
            }
        }, this.Q, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.member.preview.q(this);
        recyclerView5.setAdapter(wxRecyclerAdapter);
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f121194u;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("collectionRecycleView");
            throw null;
        }
        com.tencent.mm.plugin.finder.storage.z90 z90Var = this.Z;
        if (z90Var == null) {
            kotlin.jvm.internal.o.o("collectionConfig");
            throw null;
        }
        recyclerView6.setLayoutManager(z90Var.d(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView7 = this.f121194u;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("collectionRecycleView");
            throw null;
        }
        recyclerView7.N(new com.tencent.mm.plugin.finder.member.preview.a(getContext(), -1, 0, false, 8, null));
        androidx.recyclerview.widget.RecyclerView recyclerView8 = this.f121194u;
        if (recyclerView8 == null) {
            kotlin.jvm.internal.o.o("collectionRecycleView");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewHeaderUIC$initCollectionList$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.storage.z90 z90Var2 = com.tencent.mm.plugin.finder.member.preview.c0.this.Z;
                if (z90Var2 != null) {
                    return z90Var2.b(null).getItemConvert(type);
                }
                kotlin.jvm.internal.o.o("collectionConfig");
                throw null;
            }
        }, this.R, false);
        wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.member.preview.m(this);
        recyclerView8.setAdapter(wxRecyclerAdapter2);
        androidx.recyclerview.widget.RecyclerView recyclerView9 = this.f121200y;
        if (recyclerView9 == null) {
            kotlin.jvm.internal.o.o("replayRecycleView");
            throw null;
        }
        recyclerView9.setLayoutManager(this.Y.d(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView10 = this.f121200y;
        if (recyclerView10 == null) {
            kotlin.jvm.internal.o.o("replayRecycleView");
            throw null;
        }
        recyclerView10.N(new com.tencent.mm.plugin.finder.storage.ca0());
        androidx.recyclerview.widget.RecyclerView recyclerView11 = this.f121200y;
        if (recyclerView11 == null) {
            kotlin.jvm.internal.o.o("replayRecycleView");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewHeaderUIC$initReplayList$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return com.tencent.mm.plugin.finder.member.preview.c0.this.Y.b(null).getItemConvert(type);
            }
        }, this.S, false);
        wxRecyclerAdapter3.f293105o = new com.tencent.mm.plugin.finder.member.preview.p(this);
        recyclerView11.setAdapter(wxRecyclerAdapter3);
        androidx.recyclerview.widget.RecyclerView recyclerView12 = this.B;
        if (recyclerView12 == null) {
            kotlin.jvm.internal.o.o("dynamicRecycleView");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.convert.c cVar = this.f121188p0;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("dynamicConfig");
            throw null;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) cVar.d(getContext());
        linearLayoutManager.setAutoMeasureEnabled(true);
        recyclerView12.setLayoutManager(linearLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView13 = this.B;
        if (recyclerView13 == null) {
            kotlin.jvm.internal.o.o("dynamicRecycleView");
            throw null;
        }
        com.tencent.mm.plugin.finder.member.convert.c cVar2 = this.f121188p0;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("dynamicConfig");
            throw null;
        }
        recyclerView13.N(cVar2.c());
        androidx.recyclerview.widget.RecyclerView recyclerView14 = this.B;
        if (recyclerView14 == null) {
            kotlin.jvm.internal.o.o("dynamicRecycleView");
            throw null;
        }
        recyclerView14.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewHeaderUIC$initDynamicList$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.finder.member.convert.c cVar3 = com.tencent.mm.plugin.finder.member.preview.c0.this.f121188p0;
                if (cVar3 != null) {
                    return cVar3.b(null).getItemConvert(type);
                }
                kotlin.jvm.internal.o.o("dynamicConfig");
                throw null;
            }
        }, this.T, false));
        android.view.View findViewById34 = getActivity().findViewById(com.tencent.mm.R.id.f484746fe4);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById34, "exclusive_live");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById34, 40, 25496);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        pf5.u uVar = pf5.u.f353936a;
        eo2.b bVar = (eo2.b) uVar.b(getContext()).e(eo2.b.class);
        lVarArr[0] = new jz5.l("member_inlet_source", bVar != null ? java.lang.Integer.valueOf(bVar.f255558d) : null);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(getContext());
        lVarArr[1] = new jz5.l("comment_scene", e17 != null ? java.lang.Integer.valueOf(e17.f135380n) : null);
        lVarArr[2] = new jz5.l("finder_username", this.U);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(getContext());
        lVarArr[3] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(getContext());
        lVarArr[4] = new jz5.l("finder_context_id", e19 != null ? e19.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(getContext());
        lVarArr[5] = new jz5.l("behaviour_session_id", e27 != null ? e27.f135385q : null);
        ((cy1.a) rVar).gk(findViewById34, kz5.c1.k(lVarArr));
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view6 = this.D;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        ((cy1.a) rVar2).pk(view6, "exclusive_live");
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view7 = this.D;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        ((cy1.a) rVar3).ik(view7, 40, 25496);
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view8 = this.D;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        jz5.l[] lVarArr2 = new jz5.l[6];
        eo2.b bVar2 = (eo2.b) uVar.b(getContext()).e(eo2.b.class);
        lVarArr2[0] = new jz5.l("member_inlet_source", bVar2 != null ? java.lang.Integer.valueOf(bVar2.f255558d) : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(getContext());
        lVarArr2[1] = new jz5.l("comment_scene", e28 != null ? java.lang.Integer.valueOf(e28.f135380n) : null);
        lVarArr2[2] = new jz5.l("finder_username", this.U);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e29 = iyVar.e(getContext());
        lVarArr2[3] = new jz5.l("finder_tab_context_id", e29 != null ? e29.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e37 = iyVar.e(getContext());
        lVarArr2[4] = new jz5.l("finder_context_id", e37 != null ? e37.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e38 = iyVar.e(getContext());
        lVarArr2[5] = new jz5.l("behaviour_session_id", e38 != null ? e38.f135385q : null);
        ((cy1.a) rVar4).gk(view8, kz5.c1.k(lVarArr2));
        dy1.r rVar5 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view9 = this.f121192s;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("collectionListLayout");
            throw null;
        }
        ((cy1.a) rVar5).pk(view9, "member_zone_collection_module");
        dy1.r rVar6 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view10 = this.f121192s;
        if (view10 == null) {
            kotlin.jvm.internal.o.o("collectionListLayout");
            throw null;
        }
        ((cy1.a) rVar6).ik(view10, 32, 25496);
        dy1.r rVar7 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view11 = this.f121192s;
        if (view11 == null) {
            kotlin.jvm.internal.o.o("collectionListLayout");
            throw null;
        }
        jz5.l[] lVarArr3 = new jz5.l[6];
        eo2.b bVar3 = (eo2.b) uVar.b(getContext()).e(eo2.b.class);
        lVarArr3[0] = new jz5.l("member_inlet_source", bVar3 != null ? java.lang.Integer.valueOf(bVar3.f255558d) : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e39 = iyVar.e(getContext());
        lVarArr3[1] = new jz5.l("comment_scene", e39 != null ? java.lang.Integer.valueOf(e39.f135380n) : null);
        lVarArr3[2] = new jz5.l("author_finder_username", this.U);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e47 = iyVar.e(getContext());
        lVarArr3[3] = new jz5.l("finder_tab_context_id", e47 != null ? e47.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e48 = iyVar.e(getContext());
        lVarArr3[4] = new jz5.l("finder_context_id", e48 != null ? e48.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e49 = iyVar.e(getContext());
        lVarArr3[5] = new jz5.l("behaviour_session_id", e49 != null ? e49.f135385q : null);
        ((cy1.a) rVar7).gk(view11, kz5.c1.k(lVarArr3));
        dy1.r rVar8 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view12 = this.f121195v;
        if (view12 == null) {
            kotlin.jvm.internal.o.o("collectionAllText");
            throw null;
        }
        ((cy1.a) rVar8).pk(view12, "member_zone_collection_more");
        dy1.r rVar9 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view13 = this.f121195v;
        if (view13 == null) {
            kotlin.jvm.internal.o.o("collectionAllText");
            throw null;
        }
        ((cy1.a) rVar9).ik(view13, 8, 25496);
        dy1.r rVar10 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view14 = this.f121195v;
        if (view14 == null) {
            kotlin.jvm.internal.o.o("collectionAllText");
            throw null;
        }
        jz5.l[] lVarArr4 = new jz5.l[6];
        eo2.b bVar4 = (eo2.b) uVar.b(getContext()).e(eo2.b.class);
        lVarArr4[0] = new jz5.l("member_inlet_source", bVar4 != null ? java.lang.Integer.valueOf(bVar4.f255558d) : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e57 = iyVar.e(getContext());
        lVarArr4[1] = new jz5.l("comment_scene", e57 != null ? java.lang.Integer.valueOf(e57.f135380n) : null);
        lVarArr4[2] = new jz5.l("author_finder_username", this.U);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e58 = iyVar.e(getContext());
        lVarArr4[3] = new jz5.l("finder_tab_context_id", e58 != null ? e58.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e59 = iyVar.e(getContext());
        lVarArr4[4] = new jz5.l("finder_context_id", e59 != null ? e59.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e66 = iyVar.e(getContext());
        lVarArr4[5] = new jz5.l("behaviour_session_id", e66 != null ? e66.f135385q : null);
        ((cy1.a) rVar10).gk(view14, kz5.c1.k(lVarArr4));
        java.util.HashMap hashMap = this.f121204z1;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.A1;
        hashMap2.clear();
        androidx.recyclerview.widget.RecyclerView recyclerView15 = this.f121200y;
        if (recyclerView15 == null) {
            kotlin.jvm.internal.o.o("replayRecycleView");
            throw null;
        }
        ym5.a1.h(recyclerView15, new com.tencent.mm.plugin.finder.member.preview.t());
        ym5.a1.g(recyclerView15, new com.tencent.mm.plugin.finder.member.preview.u(this, hashMap2, 1));
        androidx.recyclerview.widget.RecyclerView recyclerView16 = this.f121191r;
        if (recyclerView16 == null) {
            kotlin.jvm.internal.o.o("videoRecycleView");
            throw null;
        }
        ym5.a1.h(recyclerView16, new com.tencent.mm.plugin.finder.member.preview.t());
        ym5.a1.g(recyclerView16, new com.tencent.mm.plugin.finder.member.preview.u(this, hashMap, 0));
    }

    @Override // eo2.j
    public void Q6(int i17, java.lang.String str) {
        android.view.ViewGroup viewGroup = this.H;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.widget.TextView textView = this.I;
        if (textView == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        textView.setVisibility(0);
        android.widget.ProgressBar progressBar = this.f121177J;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("progressView");
            throw null;
        }
        progressBar.setVisibility(8);
        android.view.ViewGroup viewGroup2 = this.H;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new com.tencent.mm.plugin.finder.member.preview.r(this));
        } else {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
    }

    @Override // eo2.j
    public void R6(com.tencent.mm.protobuf.f fVar) {
        super.R6((r45.tr0) fVar);
        android.view.ViewGroup viewGroup = this.f121178e;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("previewContainer");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.view.ViewGroup viewGroup2 = this.H;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
    }

    @Override // eo2.j
    public void S6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        java.lang.String str = this.U;
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f121202y1 = stringExtra;
        km5.d T = pm0.v.T(new ho2.b(V6, str, this.f121202y1, this.V).l(), new com.tencent.mm.plugin.finder.member.preview.s(this, V6));
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        T.f((com.tencent.mm.ui.MMActivity) context2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0061  */
    @Override // eo2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U6() {
        /*
            Method dump skipped, instructions count: 2933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.member.preview.c0.U6():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(java.util.ArrayList r42, so2.j5 r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.member.preview.c0.W6(java.util.ArrayList, so2.j5, int, int):void");
    }

    public final void X6(java.lang.String userName, r45.h32 liveNoticeInfo, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(liveNoticeInfo, "liveNoticeInfo");
        tx2.i0 i0Var = new tx2.i0(getActivity(), null, 0, 6, null);
        if (zl2.t.d(liveNoticeInfo, userName)) {
            i0Var.z(userName, liveNoticeInfo, new com.tencent.mm.plugin.finder.member.preview.w(i0Var, this, userName, liveNoticeInfo));
        } else {
            i0Var.z(userName, liveNoticeInfo, null);
        }
        i0Var.w();
    }

    public final void Y6(com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        if (finderObject == null) {
            return;
        }
        android.view.View view = this.C;
        if (view == null) {
            kotlin.jvm.internal.o.o("liveLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.D;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a18 = g1Var.a();
        mn2.n nVar = new mn2.n(a17.getAvatarUrl(), null, 2, null);
        android.widget.ImageView imageView = this.E;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("curLiveAvatar");
            throw null;
        }
        a18.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
        android.view.View view3 = this.D;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        view3.setOnClickListener(new com.tencent.mm.plugin.finder.member.preview.y(this, a17, i17));
        android.text.SpannableString descriptionSpan = a17.getDescriptionSpan();
        if (descriptionSpan == null || descriptionSpan.length() == 0) {
            android.widget.TextView textView = this.F;
            if (textView == null) {
                kotlin.jvm.internal.o.o("curLiveDesc");
                throw null;
            }
            textView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = this.F;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("curLiveDesc");
                throw null;
            }
            textView2.setText(a17.getDescriptionSpan());
            android.widget.TextView textView3 = this.G;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("curLiveTime");
                throw null;
            }
            textView3.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
        android.widget.TextView textView4 = this.G;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("curLiveTime");
            throw null;
        }
        textView4.setText(getContext().getString(com.tencent.mm.R.string.elx, zl2.q4.r(zl2.q4.f473933a, a17.getCreateTime() * 1000, java.lang.Boolean.FALSE, false, false, 12, null)));
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.L;
        if (s1Var != null) {
            s1Var.j(this.U);
        } else {
            kotlin.jvm.internal.o.o("headerLiveWidget");
            throw null;
        }
    }

    public final void Z6(int i17) {
        android.widget.TextView textView = this.f121182i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("previewIntro");
            throw null;
        }
        android.view.ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.member.preview.z(i17, this, textView));
        }
        android.view.ViewGroup viewGroup = this.f121180g;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.member.preview.a0(this));
        } else {
            kotlin.jvm.internal.o.o("previewIntroLayout");
            throw null;
        }
    }

    public final void a7(java.util.LinkedList linkedList, int i17) {
        java.util.ArrayList arrayList = this.T;
        arrayList.clear();
        if (!(linkedList == null || linkedList.isEmpty())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 256)));
            }
            arrayList.addAll(arrayList2);
            if (i17 != 0) {
                arrayList.add(new jo2.g(i17, true, this.U, null, 0L));
            }
        }
        if (arrayList.isEmpty()) {
            android.view.View view = this.f121203z;
            if (view == null) {
                kotlin.jvm.internal.o.o("dynamicListLayout");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updatePreviewDynamic", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updatePreviewDynamic", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f121203z;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("dynamicListLayout");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updatePreviewDynamic", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC", "updatePreviewDynamic", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.A;
        if (textView == null) {
            kotlin.jvm.internal.o.o("dynamicListTitle");
            throw null;
        }
        textView.setText(getContext().getString(com.tencent.mm.R.string.leo, java.lang.Integer.valueOf(i17)));
        androidx.recyclerview.widget.RecyclerView recyclerView = this.B;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("dynamicRecycleView");
            throw null;
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b2x;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.L;
        if (s1Var != null) {
            gm0.j1.d().q(6276, s1Var.f124716J);
        } else {
            kotlin.jvm.internal.o.o("headerLiveWidget");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if ((r0 != null && r0.f()) == false) goto L17;
     */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r5 = this;
            int r0 = r5.V
            if (r0 != 0) goto L85
            android.app.Activity r0 = r5.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r0, r1)
            pf5.z r1 = pf5.z.f353948a
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto L79
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r1.a(r0)
            java.lang.Class<go2.a1> r1 = go2.a1.class
            pf5.b0 r0 = r0.e(r1)
            go2.a1 r0 = (go2.a1) r0
            r1 = 0
            if (r0 == 0) goto L35
            com.tencent.mm.ui.widget.dialog.y1 r0 = r0.f273953m
            r2 = 1
            if (r0 == 0) goto L31
            boolean r0 = r0.f()
            if (r0 != r2) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 != 0) goto L35
            goto L36
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L85
            eo2.f r0 = eo2.f.f255565a
            java.lang.String r2 = r5.U
            eo2.d r2 = r0.c(r2)
            if (r2 == 0) goto L85
            int r2 = r2.f255561c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L85
            java.lang.String r0 = "Finder.FinderMemberPreviewHeaderUIC"
            java.lang.String r2 = "#onResume maybe auto close because become to member"
            com.tencent.mars.xlog.Log.i(r0, r2)
            java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> r0 = com.tencent.mm.plugin.finder.assist.i0.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.plugin.finder.assist.i0 r0 = (com.tencent.mm.plugin.finder.assist.i0) r0
            android.app.Activity r2 = r5.getContext()
            android.content.Intent r3 = r5.getIntent()
            java.lang.String r4 = r5.U
            r0.Gk(r2, r3, r4)
            android.app.Activity r0 = r5.getContext()
            r0.finish()
            android.app.Activity r0 = r5.getContext()
            r0.overridePendingTransition(r1, r1)
            return
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.member.preview.c0.onResume():void");
    }
}
