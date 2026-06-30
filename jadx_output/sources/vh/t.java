package vh;

/* loaded from: classes12.dex */
public class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f436819d = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f436819d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((vh.h) ((java.util.ArrayList) this.f436819d).get(i17)).a();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ((vh.s) k3Var).i((vh.h) ((java.util.ArrayList) this.f436819d).get(i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        switch (i17) {
            case 0:
                return new vh.q(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cvr, viewGroup, false));
            case 1:
                return new vh.m(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cvl, viewGroup, false));
            case 2:
                return new vh.n(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cvi, viewGroup, false));
            case 3:
                return new vh.o(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cvj, viewGroup, false));
            case 4:
                return new vh.r(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cvs, viewGroup, false));
            case 5:
                return new vh.p(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cvq, viewGroup, false));
            case 6:
                return new vh.j(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.cvk, viewGroup, false));
            default:
                throw new java.lang.IllegalStateException("Unknown view type: " + i17);
        }
    }
}
