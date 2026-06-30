package in5;

/* loaded from: classes10.dex */
public abstract class q0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f293117f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f293115d = "ScopeRecyclerAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f293116e = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final in5.p0 f293118g = new in5.p0(this);

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(in5.r0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i(this.f293115d, "rvnotify-test-onViewRecycled, " + holder.getAdapterPosition());
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        if (y0Var != null) {
            this.f293116e.remove(y0Var);
        }
        kotlinx.coroutines.y0 y0Var2 = holder.f293120d;
        if (y0Var2 != null) {
            kotlinx.coroutines.z0.c(y0Var2, null);
        }
        holder.f293120d = null;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onAttachedToRecyclerView ");
        sb6.append(j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1);
        com.tencent.mars.xlog.Log.i(this.f293115d, sb6.toString());
        if (j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1) {
            recyclerView.addOnAttachStateChangeListener(this.f293118g);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        in5.r0 holder = (in5.r0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        x(holder, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        in5.r0 z17 = z(parent, i17);
        kotlinx.coroutines.y0 y0Var = z17.f293120d;
        java.util.HashSet hashSet = this.f293116e;
        if (y0Var != null) {
            hashSet.remove(y0Var);
        }
        z17.i();
        kotlinx.coroutines.y0 y0Var2 = z17.f293120d;
        if (y0Var2 != null) {
            hashSet.add(y0Var2);
        }
        return z17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        com.tencent.mars.xlog.Log.i(this.f293115d, "rvnotify-test-onDetachedFromRecyclerView");
        recyclerView.removeOnAttachStateChangeListener(this.f293118g);
        java.util.HashSet hashSet = this.f293116e;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.z0.e((kotlinx.coroutines.y0) it.next(), null, 1, null);
        }
        hashSet.clear();
    }

    public abstract void x(in5.r0 r0Var, int i17);

    public abstract void y(in5.r0 r0Var, int i17, java.util.List list);

    public abstract in5.r0 z(android.view.ViewGroup viewGroup, int i17);

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in5.r0 holder = (in5.r0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        boolean isEmpty = payloads.isEmpty();
        java.util.HashSet hashSet = this.f293116e;
        if (isEmpty) {
            kotlinx.coroutines.y0 y0Var = holder.f293120d;
            if (y0Var != null) {
                hashSet.remove(y0Var);
            }
            holder.i();
            kotlinx.coroutines.y0 y0Var2 = holder.f293120d;
            if (y0Var2 != null) {
                hashSet.add(y0Var2);
            }
            super.onBindViewHolder(holder, i17, payloads);
            return;
        }
        holder.j();
        kotlinx.coroutines.y0 y0Var3 = holder.f293120d;
        if (y0Var3 != null) {
            hashSet.add(y0Var3);
        }
        y(holder, i17, payloads);
    }
}
