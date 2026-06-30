package nh1;

/* loaded from: classes7.dex */
public final class j extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f337095d;

    /* renamed from: e, reason: collision with root package name */
    public final nh1.g f337096e;

    public j(java.util.List list, nh1.g gVar) {
        this.f337095d = new java.util.ArrayList(list);
        this.f337096e = gVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f337095d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        nh1.i iVar = (nh1.i) k3Var;
        iVar.f337094d.setText((java.lang.CharSequence) ((java.util.ArrayList) this.f337095d).get(i17));
        iVar.f337094d.setOnClickListener(new nh1.h(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488090gy, viewGroup, false);
        nh1.i iVar = new nh1.i(this, inflate);
        iVar.f337094d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        return iVar;
    }
}
