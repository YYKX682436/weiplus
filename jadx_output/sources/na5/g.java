package na5;

/* loaded from: classes.dex */
public final class g extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f336002d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnClickListener f336003e;

    public g(java.util.List dataList, android.view.View.OnClickListener clickListener) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        this.f336002d = dataList;
        this.f336003e = clickListener;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f336002d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        na5.h holder = (na5.h) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String valueOf = java.lang.String.valueOf(((java.lang.Number) this.f336002d.get(i17)).intValue());
        android.widget.Button button = holder.f336005d;
        button.setText(valueOf);
        button.setOnClickListener(this.f336003e);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f487942c5, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new na5.h(inflate);
    }
}
