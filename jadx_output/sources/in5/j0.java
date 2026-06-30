package in5;

/* loaded from: classes10.dex */
public final class j0 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f293077b;

    public j0(in5.n0 n0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f293076a = n0Var;
        this.f293077b = recyclerView;
        new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        in5.n0 n0Var = this.f293076a;
        if (n0Var.f293097d) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f293077b;
            if (recyclerView.E0()) {
                com.tencent.mars.xlog.Log.w("RecyclerViewAdapterEx", "[onChanged] Cannot call this method while RecyclerView is computing a layout or scrolling");
                recyclerView.post(new in5.d0(n0Var));
                return;
            }
        }
        java.util.Iterator it = n0Var.f293101h.iterator();
        while (it.hasNext()) {
            ((androidx.recyclerview.widget.h2) it.next()).b();
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        in5.n0 n0Var = this.f293076a;
        if (n0Var.f293097d) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f293077b;
            if (recyclerView.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeChanged] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(' ');
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.w("RecyclerViewAdapterEx", sb6.toString());
                recyclerView.post(new in5.e0(this, i18, n0Var, i17));
                return;
            }
        }
        java.util.Iterator it = n0Var.f293101h.iterator();
        while (it.hasNext()) {
            ((androidx.recyclerview.widget.h2) it.next()).c(i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        in5.n0 n0Var = this.f293076a;
        if (n0Var.f293097d) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f293077b;
            if (recyclerView.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeChanged] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(" payload=");
                sb6.append(obj);
                sb6.append(' ');
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.w("RecyclerViewAdapterEx", sb6.toString());
                recyclerView.post(new in5.f0(this, i18, this.f293076a, i17, obj));
                return;
            }
        }
        java.util.Iterator it = n0Var.f293101h.iterator();
        while (it.hasNext()) {
            ((androidx.recyclerview.widget.h2) it.next()).d(i17, i18, obj);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        in5.n0 n0Var = this.f293076a;
        if (n0Var.f293097d) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f293077b;
            if (recyclerView.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeInserted] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(' ');
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.w("RecyclerViewAdapterEx", sb6.toString());
                recyclerView.post(new in5.g0(this, i18, n0Var, i17));
                return;
            }
        }
        java.util.Iterator it = n0Var.f293101h.iterator();
        while (it.hasNext()) {
            ((androidx.recyclerview.widget.h2) it.next()).e(i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        in5.n0 n0Var = this.f293076a;
        if (n0Var.f293097d) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f293077b;
            if (recyclerView.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeMoved] Cannot call this method while RecyclerView is computing a layout or scrolling, fromPosition=");
                sb6.append(i17);
                sb6.append(" toPosition=");
                sb6.append(i18);
                sb6.append(" itemCount=");
                sb6.append(i19);
                sb6.append(' ');
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.w("RecyclerViewAdapterEx", sb6.toString());
                recyclerView.post(new in5.h0(this, i19, this.f293076a, i17, i18));
                return;
            }
        }
        java.util.Iterator it = n0Var.f293101h.iterator();
        while (it.hasNext()) {
            ((androidx.recyclerview.widget.h2) it.next()).f(i17, i18, i19);
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        in5.n0 n0Var = this.f293076a;
        if (n0Var.f293097d) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f293077b;
            if (recyclerView.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeRemoved] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(' ');
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.w("RecyclerViewAdapterEx", sb6.toString());
                recyclerView.post(new in5.i0(this, i18, n0Var, i17));
                return;
            }
        }
        java.util.Iterator it = n0Var.f293101h.iterator();
        while (it.hasNext()) {
            ((androidx.recyclerview.widget.h2) it.next()).g(i17, i18);
        }
    }

    public final boolean h(int i17) {
        return i17 == this.f293076a.getItemCount();
    }
}
