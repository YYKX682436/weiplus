package iv0;

/* loaded from: classes5.dex */
public final class w extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {
    public int A;
    public final jz5.g B;

    /* renamed from: n, reason: collision with root package name */
    public final uv0.a f295090n;

    /* renamed from: o, reason: collision with root package name */
    public mv0.b f295091o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f295092p;

    /* renamed from: q, reason: collision with root package name */
    public final iv0.b f295093q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f295094r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f295095s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f295096t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f295097u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f295098v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f295099w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f295100x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f295101y;

    /* renamed from: z, reason: collision with root package name */
    public yw0.g f295102z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295090n = new uv0.a(j65.q.a(getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), j65.q.a(getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn));
        this.f295093q = new iv0.b(new iv0.d(this));
        this.f295094r = jz5.h.b(new iv0.s(this));
        this.f295095s = jz5.h.b(new iv0.e(this));
        this.f295096t = jz5.h.b(new iv0.m(this));
        this.f295097u = jz5.h.b(new iv0.h(this));
        this.f295098v = jz5.h.b(new iv0.r(this));
        this.f295099w = jz5.h.b(new iv0.u(this));
        this.f295100x = jz5.h.b(new iv0.v(this));
        this.f295101y = jz5.h.b(new iv0.t(this));
        this.B = jz5.h.b(new iv0.g(this));
    }

    public static final com.tencent.maas.moviecomposing.segments.ClipSegment k7(iv0.w wVar) {
        ex0.c g76 = wVar.p7().g7(wVar.n7().h7());
        com.tencent.maas.moviecomposing.segments.Segment segment = g76 != null ? g76.f257167a : null;
        if (segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment) {
            return (com.tencent.maas.moviecomposing.segments.ClipSegment) segment;
        }
        return null;
    }

    public static final android.view.ViewGroup l7(iv0.w wVar) {
        return (android.view.ViewGroup) ((jz5.n) wVar.f295100x).getValue();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new iv0.c(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        java.util.List list;
        iv0.c panel = (iv0.c) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        androidx.recyclerview.widget.RecyclerView o76 = o7();
        iv0.b bVar = this.f295093q;
        o76.setAdapter(bVar);
        androidx.recyclerview.widget.n2 itemAnimator = o7().getItemAnimator();
        androidx.recyclerview.widget.o3 o3Var = itemAnimator instanceof androidx.recyclerview.widget.o3 ? (androidx.recyclerview.widget.o3) itemAnimator : null;
        if (o3Var != null) {
            o3Var.f12182g = false;
        }
        o7().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        androidx.recyclerview.widget.RecyclerView o77 = o7();
        uv0.a aVar = this.f295090n;
        o77.S0(aVar);
        o7().N(aVar);
        jz5.g gVar = this.f295095s;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.b(panel, (android.view.View) value, null);
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setOnClickListener(new iv0.l(this));
        m7().u7().setText(j65.q.a(getContext()).getString(com.tencent.mm.R.string.mtn));
        m7().u7().setVisibility(0);
        ex0.a0 a0Var = p7().f276642r;
        this.f295091o = a0Var != null ? a0Var.f257103m : null;
        ex0.a0 a0Var2 = p7().f276642r;
        if (a0Var2 == null) {
            list = kz5.p0.f313996d;
        } else {
            mv0.b bVar2 = a0Var2.f257103m;
            java.util.List<mv0.a> i17 = kz5.c0.i(new mv0.a(a0Var2.f257095e, com.tencent.mm.R.drawable.cwg, false, 4, null), new mv0.a(new mv0.b(com.tencent.maas.moviecomposing.c.ASPECT_RATIO_9x16, false), com.tencent.mm.R.drawable.icon_mc_aspect_ratio_9_16, false), new mv0.a(new mv0.b(com.tencent.maas.moviecomposing.c.ASPECT_RATIO_16x9, false), com.tencent.mm.R.drawable.icon_mc_aspect_ratio_16_9, false), new mv0.a(new mv0.b(com.tencent.maas.moviecomposing.c.ASPECT_RATIO_1x1, false), com.tencent.mm.R.drawable.icon_mc_aspect_ratio_1_1, false), new mv0.a(new mv0.b(com.tencent.maas.moviecomposing.c.ASPECT_RATIO_3x4, false), com.tencent.mm.R.drawable.icon_mc_aspect_ratio_3_4, false), new mv0.a(new mv0.b(com.tencent.maas.moviecomposing.c.ASPECT_RATIO_4x3, false), com.tencent.mm.R.drawable.icon_mc_aspect_ratio_4_3, false));
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
            for (mv0.a aVar2 : i17) {
                arrayList.add(mv0.a.a(aVar2, null, 0, kotlin.jvm.internal.o.b(aVar2.f331527a, bVar2), 3, null));
            }
            list = arrayList;
        }
        bVar.y(list);
        n7().A.observe(W6(), new iv0.i(this));
        yw0.g gVar2 = (yw0.g) m7().f2().b(yw0.q.f466584g);
        this.f295102z = gVar2;
        gVar2.f466544e = true;
        ((yw0.l) gVar2.f466587a).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, r2 != null ? r2.f257103m : null) == false) goto L13;
     */
    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b7() {
        /*
            r4 = this;
            yw0.g r0 = r4.f295102z
            if (r0 == 0) goto Le
            r1 = 0
            r0.f466544e = r1
            yw0.r r0 = r0.f466587a
            yw0.l r0 = (yw0.l) r0
            r0.a()
        Le:
            boolean r0 = r4.f295092p
            r1 = 0
            if (r0 != 0) goto L27
            mv0.b r0 = r4.f295091o
            gx0.kh r2 = r4.p7()
            ex0.a0 r2 = r2.f276642r
            if (r2 == 0) goto L20
            mv0.b r2 = r2.f257103m
            goto L21
        L20:
            r2 = r1
        L21:
            boolean r0 = kotlin.jvm.internal.o.b(r0, r2)
            if (r0 != 0) goto L42
        L27:
            gx0.kh r0 = r4.p7()
            android.app.Activity r2 = r4.getContext()
            android.content.res.Resources r2 = j65.q.a(r2)
            r3 = 2131771452(0x7f10403c, float:1.9174236E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "getString(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            r0.r7(r2, r1)
        L42:
            gx0.w8 r0 = r4.m7()
            yw0.n r0 = r0.f2()
            yw0.q r1 = yw0.q.f466585h
            r0.e(r1)
            gx0.w8 r0 = r4.m7()
            android.widget.TextView r0 = r0.u7()
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iv0.w.b7():void");
    }

    public final gx0.w8 m7() {
        return (gx0.w8) ((jz5.n) this.f295096t).getValue();
    }

    public final gx0.bf n7() {
        return (gx0.bf) ((jz5.n) this.f295098v).getValue();
    }

    public final androidx.recyclerview.widget.RecyclerView o7() {
        java.lang.Object value = ((jz5.n) this.f295094r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final gx0.kh p7() {
        return (gx0.kh) ((jz5.n) this.f295099w).getValue();
    }
}
