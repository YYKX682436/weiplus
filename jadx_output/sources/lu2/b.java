package lu2;

/* loaded from: classes3.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f321363d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f321364e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface f321365f;

    public b(java.util.List dataList, android.content.DialogInterface.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f321363d = dataList;
        this.f321364e = onClickListener;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f321363d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        lu2.c holder = (lu2.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = holder.f321366d;
        if (textView != null) {
            textView.setText((java.lang.CharSequence) this.f321363d.get(i17));
        }
        holder.itemView.setOnClickListener(new lu2.a(this, holder, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a3m, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new lu2.c(inflate);
    }
}
