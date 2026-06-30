package in5;

/* loaded from: classes10.dex */
public abstract class n0 extends com.tencent.mm.ui.recyclerview.SynchronizedAdapter {

    /* renamed from: e */
    public androidx.recyclerview.widget.RecyclerView f293098e;

    /* renamed from: f */
    public android.database.Observable f293099f;

    /* renamed from: n */
    public in5.y f293104n;

    /* renamed from: o */
    public in5.x f293105o;

    /* renamed from: p */
    public in5.z f293106p;

    /* renamed from: q */
    public boolean f293107q;

    /* renamed from: r */
    public boolean f293108r;

    /* renamed from: s */
    public boolean f293109s;

    /* renamed from: d */
    public boolean f293097d = true;

    /* renamed from: g */
    public final jz5.g f293100g = jz5.h.b(new in5.c0(this));

    /* renamed from: h */
    public final java.util.concurrent.ConcurrentLinkedQueue f293101h = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: i */
    public final java.util.ArrayList f293102i = new java.util.ArrayList();

    /* renamed from: m */
    public final java.util.ArrayList f293103m = new java.util.ArrayList();

    public static void N(in5.n0 n0Var, in5.w info, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooter");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.getClass();
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = n0Var.f293103m;
        if (arrayList.contains(info)) {
            return;
        }
        arrayList.add(info);
        if (z17) {
            n0Var.notifyItemInserted(n0Var.getItemCount() - 1);
        } else {
            n0Var.notifyDataSetChanged();
        }
    }

    public static /* synthetic */ in5.w P(in5.n0 n0Var, android.view.View view, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        return n0Var.O(view, i17, z17);
    }

    public static /* synthetic */ void S(in5.n0 n0Var, in5.w wVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeader");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.Q(wVar, z17);
    }

    public static /* synthetic */ in5.w U(in5.n0 n0Var, android.view.View view, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        return n0Var.T(view, i17, z17);
    }

    public static androidx.recyclerview.widget.k3 Y(in5.n0 n0Var, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findViewHolderByItemId");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        n0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            int childCount = n0Var.b0().getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = n0Var.b0().getChildAt(i18);
                if (childAt == null) {
                    return null;
                }
                androidx.recyclerview.widget.k3 m07 = n0Var.b0().m0(childAt);
                if (m07 != null && m07.getAdapterPosition() != -1) {
                    long itemId = n0Var.getItemId(m07.getAdapterPosition());
                    if (z17) {
                        sb6.append("adapterPosition=" + m07.getAdapterPosition() + " itemId=" + itemId + '\n');
                    }
                    if (j17 == itemId) {
                        return m07;
                    }
                }
            }
            if (!z17) {
                return null;
            }
            com.tencent.mars.xlog.Log.w("RecyclerViewAdapterEx", "[findViewHolderByItemId] " + ((java.lang.Object) sb6));
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", "findViewHolderByItemId failed, error=" + th6);
            return null;
        }
    }

    public static /* synthetic */ void h0(in5.n0 n0Var, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFooter");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.g0(j17, z17);
    }

    public static /* synthetic */ void j0(in5.n0 n0Var, long j17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeHeader");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        n0Var.i0(j17, z17);
    }

    public void B(androidx.recyclerview.widget.k3 holder, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void E(androidx.recyclerview.widget.k3 holder, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
    }

    public abstract void I(androidx.recyclerview.widget.k3 k3Var, int i17);

    public abstract void J(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list);

    public androidx.recyclerview.widget.k3 K(android.view.ViewGroup parent, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(info, "info");
        return null;
    }

    public androidx.recyclerview.widget.k3 L(android.view.ViewGroup parent, int i17, in5.w info) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(info, "info");
        return null;
    }

    public abstract androidx.recyclerview.widget.k3 M(android.view.ViewGroup viewGroup, int i17);

    public final in5.w O(android.view.View resource, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(resource, "resource");
        in5.a0 a0Var = new in5.a0(resource, i17);
        java.util.ArrayList arrayList = this.f293103m;
        if (!arrayList.contains(a0Var)) {
            arrayList.add(a0Var);
            if (z17) {
                notifyItemInserted(getItemCount() - 1);
            } else {
                com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[addFooterView] notifyDataSetChanged");
                notifyDataSetChanged();
            }
        }
        return a0Var;
    }

    public final void Q(in5.w info, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = this.f293102i;
        if (arrayList.contains(info)) {
            return;
        }
        arrayList.add(info);
        if (z17) {
            notifyItemInserted(arrayList.size() - 1);
        } else {
            com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[addHeader] notifyDataSetChanged");
            notifyDataSetChanged();
        }
    }

    public final void R(in5.w info, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = this.f293102i;
        if (arrayList.contains(info)) {
            return;
        }
        arrayList.add(i17, info);
        if (z17) {
            notifyItemInserted(i17);
        } else {
            com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[addHeader] notifyDataSetChanged");
            notifyDataSetChanged();
        }
    }

    public final in5.w T(android.view.View resource, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(resource, "resource");
        in5.b0 b0Var = new in5.b0(resource, i17);
        java.util.ArrayList arrayList = this.f293102i;
        if (!arrayList.contains(b0Var)) {
            arrayList.add(b0Var);
            com.tencent.mars.xlog.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "headerInfoList.add : " + b0Var.getItemId());
            if (z17) {
                notifyItemInserted(arrayList.size() - 1);
            } else {
                com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[addHeaderView] notifyDataSetChanged");
                notifyDataSetChanged();
            }
        }
        return b0Var;
    }

    public void V(androidx.recyclerview.widget.k3 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final boolean W(in5.w info) {
        kotlin.jvm.internal.o.g(info, "info");
        return this.f293102i.contains(info);
    }

    public void X(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final int Z() {
        return this.f293103m.size();
    }

    public final int a0() {
        return this.f293102i.size();
    }

    public final androidx.recyclerview.widget.RecyclerView b0() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f293098e;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final void c0(long j17) {
        androidx.recyclerview.widget.k3 Y = Y(this, j17, false, 2, null);
        if (Y != null) {
            notifyItemChanged(Y.getAdapterPosition());
        }
    }

    public final void d0(long j17, java.lang.Object obj) {
        androidx.recyclerview.widget.k3 Y = Y(this, j17, false, 2, null);
        if (Y != null) {
            notifyItemChanged(Y.getAdapterPosition(), obj);
        }
    }

    public final void e0(long j17) {
        androidx.recyclerview.widget.k3 Y = Y(this, j17, false, 2, null);
        if (Y != null) {
            notifyItemRemoved(Y.getAdapterPosition());
        }
    }

    public final void f0(android.view.View view) {
        if (!this.f293108r && (view instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().cancel();
                    childAt.hasTransientState();
                    f0(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    public final void g0(long j17, boolean z17) {
        java.util.Iterator it = this.f293103m.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        boolean z18 = false;
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (((in5.w) next).getItemId() == j17) {
                it.remove();
                if (z17) {
                    notifyItemRemoved(a0() + x() + i17);
                }
                z18 = true;
            }
            i17++;
        }
        if (!z18 || z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[removeFooter] notifyDataSetChanged");
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public final int getItemCount() {
        return this.f293102i.size() + x() + this.f293103m.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public final long getItemId(int i17) {
        if (getItemCount() > i17 && i17 >= 0) {
            java.util.ArrayList arrayList = this.f293102i;
            if (i17 < arrayList.size()) {
                return ((in5.w) arrayList.get(i17)).getItemId();
            }
            if (i17 < x() + arrayList.size()) {
                return y(i17 - a0());
            }
            return ((in5.w) this.f293103m.get(i17 - (arrayList.size() + x()))).getItemId();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getItemId] position=");
        sb6.append(i17);
        sb6.append(" itemCount=");
        sb6.append(getItemCount());
        sb6.append(" headerCount=");
        sb6.append(a0());
        sb6.append(" footerCount=");
        sb6.append(Z());
        sb6.append(' ');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.e("RecyclerViewAdapterEx", sb7);
        jx3.f.INSTANCE.d(20251, 3, sb7);
        return 0L;
    }

    @Override // androidx.recyclerview.widget.f2
    public final int getItemViewType(int i17) {
        java.util.ArrayList arrayList = this.f293102i;
        if (i17 < arrayList.size()) {
            return ((in5.w) arrayList.get(i17)).h();
        }
        if (i17 < x() + arrayList.size()) {
            return z(i17 - a0());
        }
        return ((in5.w) this.f293103m.get(i17 - (arrayList.size() + x()))).h();
    }

    public final void i0(long j17, boolean z17) {
        java.util.Iterator it = this.f293102i.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        boolean z18 = false;
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            if (((in5.w) next).getItemId() == j17) {
                it.remove();
                if (z17) {
                    notifyItemRemoved(i17);
                }
                z18 = true;
            }
            i17++;
        }
        if (!z18 || z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[removeHeader] notifyDataSetChanged");
        notifyDataSetChanged();
    }

    public java.lang.String k0(java.lang.Exception e17, androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(e17, "e");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        return "";
    }

    public java.lang.String l0(java.lang.Exception e17, int i17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return "viewType=" + i17;
    }

    public abstract androidx.recyclerview.widget.k3 m0(android.view.View view);

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        android.database.Observable observable;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f293098e = recyclerView;
        this.f293109s = true;
        if (!((java.lang.Boolean) ((jz5.n) this.f293100g).getValue()).booleanValue() || (observable = this.f293099f) == null) {
            return;
        }
        observable.registerObserver(new in5.j0(this, recyclerView));
    }

    @Override // androidx.recyclerview.widget.f2
    public final void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.ArrayList arrayList = this.f293102i;
        if (i17 < arrayList.size()) {
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            in5.w wVar = (in5.w) obj;
            if (!wVar.c()) {
                E(holder, i17, wVar);
            }
        } else if (i17 >= x() + arrayList.size()) {
            java.lang.Object obj2 = this.f293103m.get(i17 - (arrayList.size() + x()));
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            in5.w wVar2 = (in5.w) obj2;
            if (!wVar2.c()) {
                B(holder, i17, wVar2);
            }
        } else {
            I(holder, i17 - arrayList.size());
        }
        long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
        if (uptimeMillis2 > 17) {
            try {
                com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[onBindViewHolder] pos:" + i17 + ", itemId=" + getItemId(i17) + " itemType=" + getItemViewType(i17) + " cost=" + uptimeMillis2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", "[onBindViewHolder] pos:" + i17 + ",cost=" + uptimeMillis2 + ",errMsg=" + e17.getMessage());
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public final androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        int i18;
        androidx.recyclerview.widget.k3 M;
        androidx.recyclerview.widget.k3 K;
        kotlin.jvm.internal.o.g(parent, "parent");
        java.util.ArrayList arrayList = this.f293102i;
        try {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                i18 = -1;
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((in5.w) it.next()).h() == i17) {
                    break;
                }
                i19++;
            }
            java.util.ArrayList arrayList2 = this.f293103m;
            java.util.Iterator it6 = arrayList2.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((in5.w) it6.next()).h() == i17) {
                    i18 = i27;
                    break;
                }
                i27++;
            }
            if (i19 >= 0) {
                java.lang.Object obj = arrayList.get(i19);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                in5.w wVar = (in5.w) obj;
                if (wVar.c()) {
                    android.view.View b17 = wVar.b();
                    if (b17 == null || (M = m0(b17)) == null) {
                        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(wVar.a(), parent, false);
                        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                        M = m0(inflate);
                    }
                } else {
                    M = L(parent, i17, wVar);
                    kotlin.jvm.internal.o.d(M);
                }
            } else if (i18 >= 0) {
                java.lang.Object obj2 = arrayList2.get(i18);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                in5.w wVar2 = (in5.w) obj2;
                if (wVar2.c()) {
                    android.view.View b18 = wVar2.b();
                    if (b18 == null || (M = m0(b18)) == null) {
                        android.view.View inflate2 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(wVar2.a(), parent, false);
                        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
                        K = m0(inflate2);
                    }
                } else {
                    java.lang.Object obj3 = arrayList2.get(i18);
                    kotlin.jvm.internal.o.f(obj3, "get(...)");
                    K = K(parent, i17, (in5.w) obj3);
                    kotlin.jvm.internal.o.d(K);
                }
                M = K;
            } else {
                M = M(parent, i17);
            }
            android.view.View itemView = M.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            if (!itemView.hasOnClickListeners() && !this.f293107q) {
                itemView.setOnClickListener(new in5.k0(this, M));
                itemView.setOnLongClickListener(new in5.l0(this, M));
                itemView.setOnTouchListener(new in5.m0(this, M));
            }
            X(M);
            return M;
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17.getMessage() + '\n' + (l0(e17, i17) + " crashActivity=" + parent.getContext().getClass().getName()), e17);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f293109s = false;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        f0(itemView);
    }

    @Override // androidx.recyclerview.widget.f2
    public void registerAdapterDataObserver(androidx.recyclerview.widget.h2 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        if (((java.lang.Boolean) ((jz5.n) this.f293100g).getValue()).booleanValue()) {
            this.f293101h.add(observer);
        } else {
            super.registerAdapterDataObserver(observer);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void unregisterAdapterDataObserver(androidx.recyclerview.widget.h2 observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        if (((java.lang.Boolean) ((jz5.n) this.f293100g).getValue()).booleanValue()) {
            this.f293101h.remove(observer);
        } else {
            super.unregisterAdapterDataObserver(observer);
        }
    }

    public abstract int x();

    public long y(int i17) {
        return 0L;
    }

    public int z(int i17) {
        return 0;
    }

    @Override // com.tencent.mm.ui.recyclerview.SynchronizedAdapter, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        try {
            if (payloads.isEmpty()) {
                V(holder, false);
                super.onBindViewHolder(holder, i17, payloads);
                return;
            }
            V(holder, true);
            java.util.ArrayList arrayList = this.f293102i;
            if (i17 < arrayList.size()) {
                java.lang.Object obj = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                E(holder, i17, (in5.w) obj);
            } else {
                if (i17 >= x() + arrayList.size()) {
                    java.lang.Object obj2 = this.f293103m.get(i17 - (arrayList.size() + x()));
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    B(holder, i17, (in5.w) obj2);
                    return;
                }
                J(holder, i17 - arrayList.size(), payloads);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("RecyclerViewAdapterEx", e17, "[RecyclerViewAdapterEx.onBindViewHolder]raw exception", new java.lang.Object[0]);
            throw new java.lang.RuntimeException(e17.getMessage() + '\n' + (k0(e17, holder, i17, payloads) + " crashActivity=" + holder.itemView.getContext().getClass().getName()), e17);
        }
    }
}
