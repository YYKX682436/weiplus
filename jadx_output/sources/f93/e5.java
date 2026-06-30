package f93;

/* loaded from: classes3.dex */
public final class e5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f260330d;

    public e5(f93.p5 p5Var) {
        this.f260330d = p5Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f260330d.A.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        f93.p5 p5Var = this.f260330d;
        ((f93.u0) holder).i((com.tencent.mm.storage.z3) p5Var.A.get(i17));
        if (i17 == 0 && i17 == getItemCount() - 1) {
            holder.itemView.setBackground(i65.a.i(p5Var.getContext(), com.tencent.mm.R.drawable.f482122b21));
            return;
        }
        if (i17 == 0) {
            holder.itemView.setBackground(i65.a.i(p5Var.getContext(), com.tencent.mm.R.drawable.f482121b20));
        } else if (i17 == getItemCount() - 1) {
            holder.itemView.setBackground(i65.a.i(p5Var.getContext(), com.tencent.mm.R.drawable.b1y));
        } else {
            holder.itemView.setBackground(i65.a.i(p5Var.getContext(), com.tencent.mm.R.drawable.b1z));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        f93.p5 p5Var = this.f260330d;
        android.view.View inflate = com.tencent.mm.ui.id.b(p5Var.getContext()).inflate(com.tencent.mm.R.layout.crz, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new f93.u0(inflate, p5Var.f260426r, null);
    }
}
