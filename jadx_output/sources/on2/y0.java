package on2;

/* loaded from: classes3.dex */
public final class y0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f347073d = new java.util.LinkedList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f347073d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ato, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new on2.x0(this, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(on2.x0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f347073d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        on2.w0 w0Var = (on2.w0) obj;
        holder.f347064d.setText(w0Var.f347054a);
        holder.f347065e.setText(w0Var.f347055b);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        on2.x0 holder = (on2.x0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        onBindViewHolder(holder, i17);
    }
}
