package m22;

/* loaded from: classes12.dex */
public final class q extends in5.n0 {

    /* renamed from: t, reason: collision with root package name */
    public final m22.y f323062t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f323063u;

    public q(m22.y clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        this.f323062t = clickListener;
        this.f323063u = new java.util.LinkedList();
        this.f293107q = true;
    }

    @Override // in5.n0
    public void I(androidx.recyclerview.widget.k3 k3Var, int i17) {
        m22.g holder = (m22.g) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f323063u.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.i((m22.i) obj);
    }

    @Override // in5.n0
    public void J(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        m22.g holder = (m22.g) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        java.lang.Object obj = this.f323063u.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.i((m22.i) obj);
    }

    @Override // in5.n0
    public androidx.recyclerview.widget.k3 M(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new m22.o(parent, this.f323062t);
    }

    @Override // in5.n0
    public androidx.recyclerview.widget.k3 m0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return new m22.r(view);
    }

    @Override // in5.n0
    public int x() {
        return this.f323063u.size();
    }
}
