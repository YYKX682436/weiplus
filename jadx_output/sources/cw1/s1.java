package cw1;

/* loaded from: classes7.dex */
public final class s1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f223302d = kz5.p0.f313996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f223303e = new boolean[0];

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI f223304f;

    public s1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI cleanCacheSubListUI) {
        this.f223304f = cleanCacheSubListUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f223302d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        cw1.t1 holder = (cw1.t1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.f223328d = i17;
        holder.f223329e.setChecked(this.f223303e[i17]);
        com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var = (com.tencent.mm.plugin.appbrand.appstorage.m0) this.f223302d.get(i17);
        holder.f223330f.setText(m0Var.f76267c);
        holder.f223331g.setText(fp.n0.a(m0Var.f76268d));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.e2i, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new cw1.t1(this.f223304f, inflate);
    }
}
