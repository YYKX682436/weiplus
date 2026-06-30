package in5;

/* loaded from: classes.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f293080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f293081e;

    public k0(in5.n0 n0Var, androidx.recyclerview.widget.k3 k3Var) {
        this.f293080d = n0Var;
        this.f293081e = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.n0 n0Var = this.f293080d;
        androidx.recyclerview.widget.k3 m07 = n0Var.b0().m0(view);
        int adapterPosition = m07 != null ? m07.getAdapterPosition() : -1;
        in5.x xVar = n0Var.f293105o;
        if (xVar != null) {
            xVar.s2(n0Var, view, adapterPosition, this.f293081e);
        }
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
