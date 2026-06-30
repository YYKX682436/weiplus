package oj5;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.r f345842d;

    public f(oj5.r rVar) {
        this.f345842d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj5.r rVar = this.f345842d;
        androidx.recyclerview.widget.RecyclerView recyclerView = rVar.f345878a;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean b17 = n3.x0.b(recyclerView);
        java.lang.String str = rVar.f345879b;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = rVar.f345878a;
        if (b17) {
            com.tencent.mars.xlog.Log.i(str, "[doOnAttach] " + recyclerView2.getContext());
            recyclerView2.setRecycledViewPool(rVar.f345883f);
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.setItemPrefetchEnabled(false);
            }
        } else {
            recyclerView.addOnAttachStateChangeListener(new oj5.d(recyclerView, rVar));
        }
        if (n3.x0.b(recyclerView2)) {
            recyclerView2.addOnAttachStateChangeListener(new oj5.e(recyclerView2, rVar));
            return;
        }
        java.util.Iterator it = oj5.x.b(recyclerView2).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            android.view.View itemView = k3Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            oj5.r.a(rVar, itemView);
            android.view.View itemView2 = k3Var.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            rVar.c(itemView2, true);
        }
        rVar.f345882e.clear();
        int[] b18 = rVar.b();
        int i17 = b18[0];
        com.tencent.mars.xlog.Log.i(str, "[doOnDetach] " + kz5.z.x0(b18) + " hitRate=" + a06.d.b((i17 * 100.0f) / (1 < i17 + b18[1] ? r1 : 1)) + '%');
        java.util.HashMap hashMap = oj5.r.f345877h;
        androidx.recyclerview.widget.f2 adapter = recyclerView2.getAdapter();
        hashMap.remove(java.lang.Integer.valueOf(adapter != null ? adapter.hashCode() : 0));
    }
}
