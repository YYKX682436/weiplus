package rk2;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final tk2.a f396470a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView f396471b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f396472c;

    /* renamed from: d, reason: collision with root package name */
    public final rk2.b f396473d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1 f396474e;

    /* renamed from: f, reason: collision with root package name */
    public int f396475f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396476g;

    /* renamed from: h, reason: collision with root package name */
    public int f396477h;

    /* renamed from: i, reason: collision with root package name */
    public int f396478i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f396479j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f396480k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f396481l;

    /* renamed from: m, reason: collision with root package name */
    public int f396482m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396483n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396484o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager, com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1, androidx.recyclerview.widget.LinearLayoutManager] */
    public q(android.view.ViewGroup root, tk2.a service) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(service, "service");
        this.f396470a = service;
        com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiStreamRecyclerView = (com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView) root.findViewById(com.tencent.mm.R.id.ig6);
        this.f396471b = multiStreamRecyclerView;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f396472c = linkedList;
        rk2.b bVar = new rk2.b(linkedList, service);
        this.f396473d = bVar;
        ?? r66 = new com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager(root.getContext()) { // from class: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamWidget$liveLayoutManager$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(r2, 0, false);
                kotlin.jvm.internal.o.d(r2);
            }

            @Override // com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            /* renamed from: canScrollHorizontally */
            public boolean getF98486n() {
                rk2.q qVar = rk2.q.this;
                if (!qVar.f396480k) {
                    return false;
                }
                com.tencent.mm.plugin.finder.live.plugin.zz zzVar = (com.tencent.mm.plugin.finder.live.plugin.zz) qVar.f396470a;
                return !((mm2.w) zzVar.P0(mm2.w.class)).O6() && !((mm2.c1) zzVar.P0(mm2.c1.class)).f8();
            }
        };
        this.f396474e = r66;
        jz5.g b17 = jz5.h.b(rk2.p.f396469d);
        this.f396475f = -1;
        this.f396477h = -1;
        this.f396478i = -1;
        this.f396481l = "";
        this.f396483n = true;
        multiStreamRecyclerView.setLayoutManager(r66);
        r66.f115992z = new rk2.k(this);
        r66.A = new rk2.l(this);
        ((com.tencent.mm.plugin.finder.ui.o6) ((jz5.n) b17).getValue()).b(multiStreamRecyclerView);
        multiStreamRecyclerView.setHasFixedSize(true);
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(multiStreamRecyclerView, r66, null, 2, null);
        multiStreamRecyclerView.setPageChangeListener(new rk2.m(this));
        multiStreamRecyclerView.setRecyclerClick(new rk2.n(this));
        multiStreamRecyclerView.setRecyclerDoubleClick(new rk2.o(this));
        multiStreamRecyclerView.setAdapter(bVar);
    }

    public static final void a(rk2.q qVar, int i17) {
        int c17 = qVar.c(i17);
        android.view.View findViewByPosition = qVar.f396474e.findViewByPosition(i17);
        if (findViewByPosition == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout = findViewByPosition instanceof com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout ? (com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout) findViewByPosition : null;
        if (finderLiveMultiStreamViewLayout != null) {
            com.tencent.mars.xlog.Log.i(finderLiveMultiStreamViewLayout.f111745d, "startPreload " + finderLiveMultiStreamViewLayout.f111748g + " lastPlayer: " + finderLiveMultiStreamViewLayout.f111750i);
            finderLiveMultiStreamViewLayout.d(true);
            mn0.b0 b0Var = finderLiveMultiStreamViewLayout.f111750i;
            if (b0Var != null) {
                mn0.b0.C(b0Var, true, false, false, 6, null);
            }
            finderLiveMultiStreamViewLayout.e();
            mn0.b0 b0Var2 = finderLiveMultiStreamViewLayout.f111750i;
            if (b0Var2 != null) {
                ((mn0.y) b0Var2).G(true);
            }
        }
        qVar.f396476g = true;
        com.tencent.mars.xlog.Log.i("MultiStreamWidget", "pre startPlay pos = " + c17);
    }

    public static final void b(rk2.q qVar, int i17) {
        int c17 = qVar.c(i17);
        uk2.b x17 = qVar.f396473d.x(c17);
        if (x17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MultiStreamWidget", "pre stopPlay pos = " + c17 + " position: " + i17);
        java.util.HashMap hashMap = rk2.d.f396450a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlayer: ");
        sb6.append(x17);
        com.tencent.mars.xlog.Log.i("MultiStreamPlayerManager", sb6.toString());
        mn0.b0 b0Var = (mn0.b0) rk2.d.f396450a.get(x17.a());
        if (b0Var != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
        }
    }

    public final int c(int i17) {
        int size = this.f396472c.size();
        if (size == 0) {
            return i17;
        }
        int i18 = i17 % size;
        if (i18 >= size) {
            return size - 1;
        }
        if (i18 < 0) {
            return 0;
        }
        return i18;
    }
}
