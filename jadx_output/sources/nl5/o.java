package nl5;

/* loaded from: classes15.dex */
public class o extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f338331d;

    /* renamed from: e, reason: collision with root package name */
    public final nl5.b0 f338332e;

    /* renamed from: f, reason: collision with root package name */
    public final nl5.a0 f338333f;

    public o(java.util.List list, nl5.a0 a0Var, nl5.b0 b0Var) {
        this.f338331d = list;
        this.f338333f = a0Var;
        this.f338332e = b0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f338331d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        nl5.n nVar = (nl5.n) k3Var;
        nl5.z zVar = (nl5.z) this.f338331d.get(i17);
        nVar.f338329d.setText(zVar.f338397a);
        nVar.f338329d.setTag(zVar);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.boo, viewGroup, false);
        nl5.n nVar = new nl5.n(this, inflate);
        inflate.setOnClickListener(new nl5.m(this));
        return nVar;
    }
}
