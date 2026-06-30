package ky2;

/* loaded from: classes.dex */
public final class c0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f313518d = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f313518d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ky2.a0 holder = (ky2.a0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f313518d;
        holder.f313507d.setText(((ky2.b0) arrayList.get(i17)).f313511a);
        holder.f313508e.setText(holder.itemView.getContext().getResources().getString(com.tencent.mm.R.string.ej6, java.lang.String.valueOf(((ky2.b0) arrayList.get(i17)).f313512b)));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b1p, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new ky2.a0(this, inflate);
    }
}
