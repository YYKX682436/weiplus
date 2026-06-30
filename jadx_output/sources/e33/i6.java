package e33;

/* loaded from: classes10.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f247289d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247290e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247291f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f247292g;

    public i6(androidx.recyclerview.widget.RecyclerView recyclerView, e33.g6 g6Var) {
        this.f247290e = new java.lang.ref.WeakReference(recyclerView);
        this.f247291f = new java.lang.ref.WeakReference(g6Var);
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.ref.WeakReference weakReference;
        e33.g6 g6Var;
        java.lang.ref.WeakReference weakReference2 = this.f247290e;
        if (weakReference2 == null || (weakReference = this.f247291f) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SmartGalleryUI", "update search ui, ref is null, return.");
            return;
        }
        java.util.List list = this.f247289d;
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SmartGalleryUI", "update search ui, data is null.");
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference2.get();
        if (recyclerView == null || (g6Var = (e33.g6) weakReference.get()) == null) {
            return;
        }
        recyclerView.setAdapter(g6Var);
        g6Var.f247240g = this.f247292g;
        java.util.ArrayList arrayList = (java.util.ArrayList) g6Var.f247238e;
        arrayList.clear();
        arrayList.addAll(list);
        g6Var.notifyDataSetChanged();
    }
}
