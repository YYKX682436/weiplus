package hl5;

/* loaded from: classes15.dex */
public class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f282123d;

    /* renamed from: e, reason: collision with root package name */
    public final nl5.a0 f282124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hl5.g f282125f;

    public f(hl5.g gVar, java.util.List list, nl5.a0 a0Var) {
        this.f282125f = gVar;
        this.f282123d = list;
        this.f282124e = a0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f282123d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        hl5.e eVar = (hl5.e) k3Var;
        nl5.z zVar = (nl5.z) this.f282123d.get(i17);
        eVar.f282122d.setText(zVar.f338397a);
        eVar.f282122d.setTag(zVar);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.boo, viewGroup, false);
        hl5.e eVar = new hl5.e(this, inflate);
        inflate.setOnClickListener(new hl5.d(this));
        return eVar;
    }
}
