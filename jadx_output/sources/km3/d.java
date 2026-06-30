package km3;

/* loaded from: classes10.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final km3.c f309239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f309240e;

    public d(km3.c itemClickListener) {
        kotlin.jvm.internal.o.g(itemClickListener, "itemClickListener");
        this.f309239d = itemClickListener;
        this.f309240e = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f309240e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        km3.b holder = (km3.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f309240e;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(i17);
        android.widget.TextView textView = holder.f309238d;
        textView.setText(charSequence);
        textView.setContentDescription((java.lang.CharSequence) arrayList.get(i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.c4h, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new km3.b(this, inflate);
    }

    public final void x(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ArrayList arrayList = this.f309240e;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }
}
