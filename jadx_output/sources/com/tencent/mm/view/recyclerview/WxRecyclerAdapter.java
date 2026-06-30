package com.tencent.mm.view.recyclerview;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\tR&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lin5/c;", "D", "Lin5/n0;", "Lin5/s0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljava/util/ArrayList;", "in5/b1", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class WxRecyclerAdapter<D extends in5.c> extends in5.n0 {
    public boolean A;
    public in5.u B;
    public final android.util.LongSparseArray C;
    public final android.util.LongSparseArray D;
    public final android.util.LongSparseArray E;
    public in5.y0 F;
    public in5.b1 G;
    public androidx.recyclerview.widget.h2 H;
    private java.util.ArrayList<D> data;

    /* renamed from: t, reason: collision with root package name */
    public final in5.s f213715t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f213716u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f213717v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f213718w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f213719x;

    /* renamed from: y, reason: collision with root package name */
    public final in5.d1 f213720y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.LongSparseArray f213721z;

    public /* synthetic */ WxRecyclerAdapter(in5.s sVar, java.util.ArrayList arrayList, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(sVar, arrayList, (i17 & 4) != 0 ? false : z17);
    }

    public final void A0() {
        b0().post(new in5.k1(this));
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(in5.s0 holder) {
        in5.c cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || (cVar = (in5.c) holder.f293125i) == null) {
            return;
        }
        boolean z17 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams;
        android.util.LongSparseArray longSparseArray = this.f213721z;
        if (z17) {
            in5.v0 v0Var = new in5.v0(((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).e(), holder.itemView.getMeasuredWidth(), holder.itemView.getMeasuredHeight());
            if (v0Var.f293144b == 0 || v0Var.f293145c == 0) {
                holder.itemView.post(new in5.l1(v0Var, holder));
            }
            longSparseArray.put(cVar.getItemId(), v0Var);
            return;
        }
        in5.v0 v0Var2 = new in5.v0(0, holder.itemView.getMeasuredWidth(), holder.itemView.getMeasuredHeight());
        if (v0Var2.f293144b == 0 || v0Var2.f293145c == 0) {
            holder.itemView.post(new in5.m1(v0Var2, holder));
        }
        longSparseArray.put(cVar.getItemId(), v0Var2);
    }

    @Override // in5.n0, androidx.recyclerview.widget.f2
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        in5.r rVar = (in5.r) this.f213717v.get(java.lang.Integer.valueOf(holder.getItemViewType()));
        if (rVar != null) {
            rVar.k(holder);
        }
        super.onViewDetachedFromWindow(holder);
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(in5.s0 holder) {
        in5.r rVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "rvnotify-test-onViewRecycled viewType=" + holder.getItemViewType() + " hashCode=" + holder.itemView.hashCode());
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        if (y0Var != null) {
            this.f213718w.remove(y0Var);
        }
        kotlinx.coroutines.y0 y0Var2 = holder.f293120d;
        if (y0Var2 != null) {
            kotlinx.coroutines.z0.c(y0Var2, null);
        }
        holder.f293120d = null;
        if (holder.getAdapterPosition() >= 0 && (rVar = (in5.r) this.f213717v.get(java.lang.Integer.valueOf(holder.getItemViewType()))) != null) {
            rVar.l(holder);
        }
        super.onViewRecycled(holder);
    }

    public final void E0(java.util.ArrayList newData) {
        kotlin.jvm.internal.o.g(newData, "newData");
        this.data = newData;
    }

    @Override // in5.n0
    public androidx.recyclerview.widget.k3 K(android.view.ViewGroup parent, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(info, "info");
        in5.r u07 = u0(i17);
        android.os.SystemClock.uptimeMillis();
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(u07.e(), parent, false);
        android.os.SystemClock.uptimeMillis();
        in5.s0 s0Var = new in5.s0(inflate);
        s0Var.f293126m = b0();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) parent;
        u07.i(recyclerView, s0Var, i17);
        s0Var.f293122f = recyclerView.getAdapter();
        return s0Var;
    }

    @Override // in5.n0
    public androidx.recyclerview.widget.k3 L(android.view.ViewGroup parent, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(info, "info");
        in5.r v07 = v0(i17);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(v07.e(), parent, false);
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "CreateView Cost=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms viewType=" + i17);
        in5.s0 s0Var = new in5.s0(inflate);
        s0Var.f293126m = b0();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) parent;
        v07.i(recyclerView, s0Var, i17);
        s0Var.f293122f = recyclerView.getAdapter();
        return s0Var;
    }

    @Override // in5.n0
    public void V(androidx.recyclerview.widget.k3 k3Var, boolean z17) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213718w;
        if (z17) {
            holder.j();
            kotlinx.coroutines.y0 y0Var = holder.f293120d;
            if (y0Var != null) {
                concurrentHashMap.put(y0Var, new java.lang.Object());
                return;
            }
            return;
        }
        kotlinx.coroutines.y0 y0Var2 = holder.f293120d;
        if (y0Var2 != null) {
            concurrentHashMap.remove(y0Var2);
        }
        holder.i();
        kotlinx.coroutines.y0 y0Var3 = holder.f293120d;
        if (y0Var3 != null) {
            concurrentHashMap.put(y0Var3, new java.lang.Object());
        }
    }

    @Override // in5.n0
    public void X(androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213718w;
        if (y0Var != null) {
            concurrentHashMap.remove(y0Var);
        }
        holder.i();
        kotlinx.coroutines.y0 y0Var2 = holder.f293120d;
        if (y0Var2 != null) {
            concurrentHashMap.put(y0Var2, new java.lang.Object());
        }
    }

    public final java.util.List getData() {
        return this.data;
    }

    @Override // in5.n0
    public androidx.recyclerview.widget.k3 m0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view.getParent() != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", java.lang.String.valueOf(new com.tencent.mm.sdk.platformtools.z3()));
        }
        return new in5.s0(view);
    }

    @Override // in5.n0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void B(in5.s0 holder, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        super.B(holder, i17, info);
        int itemViewType = getItemViewType(i17);
        holder.f293126m = b0();
        holder.f293125i = info;
        u0(itemViewType).h(holder, info, i17, itemViewType, false, null);
    }

    @Override // in5.n0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void E(in5.s0 holder, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        super.E(holder, i17, info);
        int itemViewType = getItemViewType(i17);
        holder.f293126m = b0();
        holder.f293125i = info;
        v0(itemViewType).h(holder, info, i17, itemViewType, false, null);
    }

    @Override // in5.n0, androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onAttachedToRecyclerView ");
        sb6.append(j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1);
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", sb6.toString());
        if (j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1) {
            recyclerView.addOnAttachStateChangeListener(this.f213720y);
        }
        java.util.Iterator it = this.f213717v.entrySet().iterator();
        while (it.hasNext()) {
            in5.r rVar = (in5.r) ((java.util.Map.Entry) it.next()).getValue();
            if (!rVar.f()) {
                rVar.g(recyclerView, this);
            }
        }
        if (this.f213716u) {
            in5.b1 b1Var = new in5.b1(this);
            recyclerView.i(b1Var);
            this.G = b1Var;
            in5.i1 i1Var = new in5.i1(recyclerView, this);
            registerAdapterDataObserver(i1Var);
            this.H = i1Var;
        }
    }

    @Override // in5.n0, androidx.recyclerview.widget.f2
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "rvnotify-test-onDetachedFromRecyclerView");
        recyclerView.removeOnAttachStateChangeListener(this.f213720y);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213718w;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.z0.e((kotlinx.coroutines.y0) ((java.util.Map.Entry) it.next()).getKey(), null, 1, null);
        }
        concurrentHashMap.clear();
        java.util.Iterator it6 = this.f213717v.entrySet().iterator();
        while (it6.hasNext()) {
            in5.r rVar = (in5.r) ((java.util.Map.Entry) it6.next()).getValue();
            if (rVar.f()) {
                rVar.j(recyclerView);
            }
        }
        androidx.recyclerview.widget.h2 h2Var = this.H;
        if (h2Var != null) {
            unregisterAdapterDataObserver(h2Var);
        }
    }

    @Override // in5.n0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void I(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        int itemViewType = getItemViewType(a0() + i17);
        D d17 = this.data.get(i17);
        kotlin.jvm.internal.o.f(d17, "get(...)");
        D d18 = d17;
        holder.f293125i = d18;
        holder.f293126m = b0();
        w0(itemViewType).h(holder, d18, i17, itemViewType, false, null);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        t0(itemView, d18, i17);
        if (this.A) {
            this.A = false;
            b0().post(new in5.c1(this));
        }
    }

    @Override // in5.n0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        int itemViewType = getItemViewType(a0() + i17);
        D d17 = this.data.get(i17);
        kotlin.jvm.internal.o.f(d17, "get(...)");
        D d18 = d17;
        holder.f293126m = b0();
        holder.f293125i = d18;
        w0(itemViewType).h(holder, d18, i17, itemViewType, true, payloads);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        t0(itemView, d18, i17);
    }

    @Override // in5.n0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public in5.s0 M(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        in5.r w07 = w0(i17);
        android.view.View c17 = w07.c(b0());
        if (c17 == null) {
            c17 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(w07.e(), parent, false);
        }
        androidx.recyclerview.widget.RecyclerView b07 = b0();
        kotlin.jvm.internal.o.d(c17);
        in5.s0 d17 = w07.d(b07, c17);
        if (d17 == null) {
            d17 = new in5.s0(c17);
        }
        d17.f293126m = b0();
        w07.i(b0(), d17, i17);
        d17.f293122f = b0().getAdapter();
        return d17;
    }

    public final void t0(android.view.View view, in5.c cVar, int i17) {
        if (x0()) {
            view.setOnTouchListener(new in5.e1(this, i17, view, cVar));
            view.setOnClickListener(new in5.f1(this, i17, view, cVar));
            view.setOnLongClickListener(new in5.g1(this, i17, view, cVar));
        }
    }

    public final in5.r u0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213717v;
        in5.r rVar = (in5.r) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (rVar == null) {
            rVar = this.f213715t.getItemConvert(i17);
            kotlin.jvm.internal.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.ItemConvert<com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx.FixedViewInfo>");
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), rVar);
            if (!rVar.f()) {
                rVar.g(b0(), this);
            }
        }
        return rVar;
    }

    public final in5.r v0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213717v;
        in5.r rVar = (in5.r) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (rVar == null) {
            rVar = this.f213715t.getItemConvert(i17);
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), rVar);
            if (!rVar.f()) {
                rVar.g(b0(), this);
            }
        }
        return rVar;
    }

    public final in5.r w0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213717v;
        in5.r rVar = (in5.r) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (rVar == null) {
            rVar = this.f213715t.getItemConvert(i17);
            kotlin.jvm.internal.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.ItemConvert<D of com.tencent.mm.view.recyclerview.WxRecyclerAdapter>");
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), rVar);
            if (!rVar.f()) {
                rVar.g(b0(), this);
            }
        }
        return rVar;
    }

    @Override // in5.n0
    public int x() {
        return this.data.size();
    }

    public boolean x0() {
        return this instanceof f41.v;
    }

    @Override // in5.n0
    public long y(int i17) {
        return this.data.get(i17).getItemId();
    }

    public void y0(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        in5.b1 b1Var = this.G;
        if (b1Var != null) {
            b1Var.onScrollStateChanged(recyclerView, 5);
        }
    }

    @Override // in5.n0
    public int z(int i17) {
        return this.data.get(i17).h();
    }

    public final void z0() {
        b0().post(new in5.j1(this));
    }

    public WxRecyclerAdapter(in5.s itemConvertFactory, java.util.ArrayList data, boolean z17) {
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(data, "data");
        this.f213715t = itemConvertFactory;
        this.data = data;
        this.f213716u = z17;
        this.f213717v = new java.util.concurrent.ConcurrentHashMap();
        this.f213718w = new java.util.concurrent.ConcurrentHashMap();
        this.f213720y = new in5.d1(this);
        this.f213721z = new android.util.LongSparseArray();
        this.A = true;
        this.C = new android.util.LongSparseArray();
        this.D = new android.util.LongSparseArray();
        this.E = new android.util.LongSparseArray();
    }
}
