package in5;

/* loaded from: classes.dex */
public final class l0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f293087e;

    public l0(in5.n0 n0Var, androidx.recyclerview.widget.k3 k3Var) {
        this.f293086d = n0Var;
        this.f293087e = k3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.n0 n0Var = this.f293086d;
        androidx.recyclerview.widget.k3 m07 = n0Var.b0().m0(view);
        int adapterPosition = m07 != null ? m07.getAdapterPosition() : -1;
        in5.y yVar = n0Var.f293104n;
        boolean c17 = yVar != null ? yVar.c(n0Var, view, adapterPosition, this.f293087e) : false;
        yj0.a.i(c17, this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return c17;
    }
}
