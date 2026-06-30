package yw3;

/* loaded from: classes.dex */
public final class s extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f466871d;

    public s(java.util.List datas) {
        kotlin.jvm.internal.o.g(datas, "datas");
        this.f466871d = datas;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f466871d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        yw3.r holder = (yw3.r) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.lxr);
        java.util.List list = this.f466871d;
        textView.setText(((yw3.t) list.get(i17)).f466886a);
        holder.itemView.setTag(com.tencent.mm.R.id.nwn, ((yw3.t) list.get(i17)).f466886a);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cex, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new yw3.r(inflate);
    }
}
