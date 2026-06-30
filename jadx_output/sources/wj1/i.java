package wj1;

/* loaded from: classes8.dex */
public class i extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f446592d;

    public i(java.util.List list) {
        this.f446592d = list;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f446592d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        wj1.h hVar = (wj1.h) k3Var;
        r45.hc hcVar = (r45.hc) this.f446592d.get(i17);
        if (hcVar == null) {
            return;
        }
        hVar.f446589d.setText(hcVar.f376032d);
        hVar.f446590e.setText(hcVar.f376033e);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new wj1.h(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488045fb, viewGroup, false));
    }
}
