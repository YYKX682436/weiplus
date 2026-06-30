package i22;

/* loaded from: classes15.dex */
public final class g0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f287966d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f287967e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f287968f;

    /* renamed from: g, reason: collision with root package name */
    public i22.o0 f287969g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f287970h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f287971i;

    /* renamed from: m, reason: collision with root package name */
    public int f287972m;

    /* renamed from: n, reason: collision with root package name */
    public int f287973n;

    /* renamed from: o, reason: collision with root package name */
    public final i22.x0 f287974o;

    /* renamed from: p, reason: collision with root package name */
    public int f287975p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f287976q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f287977r;

    public g0(android.content.Context context, java.util.List itemListData) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemListData, "itemListData");
        this.f287966d = context;
        this.f287967e = itemListData;
        this.f287968f = "MicroMsg.EmojiStoreV3SingleProductAdapter";
        java.lang.String string = context.getString(com.tencent.mm.R.string.byv);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f287974o = new i22.x0(string);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f287967e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        i22.n0 n0Var = (i22.n0) kz5.n0.a0(this.f287967e, i17);
        if (n0Var != null) {
            return n0Var.getType();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.i(new i22.f0(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        yz5.a aVar;
        i22.m holder = (i22.m) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.i((i22.n0) this.f287967e.get(i17), new java.util.ArrayList());
        if (this.f287970h != null) {
            int itemCount = (getItemCount() - 1) - this.f287972m;
            if (itemCount < 0) {
                itemCount = 0;
            }
            if (i17 != itemCount || this.f287973n == 0 || (aVar = this.f287970h) == null) {
                return;
            }
            aVar.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 4) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.a8q, parent, false);
            android.content.Context context = this.f287966d;
            kotlin.jvm.internal.o.d(inflate);
            return new i22.e0(context, inflate, this.f287969g, null, 8, null);
        }
        if (i17 == 8) {
            android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.a8m, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new i22.d0(inflate2);
        }
        android.view.View inflate3 = from.inflate(com.tencent.mm.R.layout.a8p, parent, false);
        this.f287975p++;
        kotlin.jvm.internal.o.d(inflate3);
        return new i22.c0(inflate3);
    }

    public final void x(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        yz5.l lVar;
        if (layoutManager == null) {
            com.tencent.mars.xlog.Log.i(this.f287968f, "reportExposeData failed, recyclerview layoutManager null");
            return;
        }
        if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            if (y17 - w17 <= 0) {
                return;
            }
            e06.k kVar = new e06.k(w17, y17);
            int i17 = this.f287975p;
            j22.l lVar2 = new j22.l(0L, null, 0, 0, null, null, 63, null);
            java.lang.StringBuilder sb6 = lVar2.f297266d;
            java.lang.StringBuilder sb7 = lVar2.f297265c;
            int i18 = kVar.f246210e;
            if (w17 <= i18) {
                boolean z17 = true;
                while (true) {
                    i22.n0 n0Var = (i22.n0) this.f287967e.get(w17);
                    if (n0Var instanceof i22.c1) {
                        if (!z17) {
                            sb7.append("#");
                            sb6.append("#");
                        }
                        r45.ri0 ri0Var = ((i22.c1) n0Var).f287952a;
                        sb7.append(ri0Var != null ? ri0Var.f384886d : null);
                        sb6.append((w17 + 1) - i17);
                        z17 = false;
                    }
                    if (w17 == i18) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
            if ((com.tencent.mm.sdk.platformtools.t8.K0(sb7.toString()) && com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString())) || (lVar = this.f287976q) == null) {
                return;
            }
            lVar.invoke(lVar2);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        i22.m holder = (i22.m) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (!payloads.isEmpty()) {
            holder.i((i22.n0) this.f287967e.get(i17), payloads);
        } else {
            super.onBindViewHolder(holder, i17, payloads);
        }
    }
}
