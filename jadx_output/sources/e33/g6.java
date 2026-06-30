package e33;

/* loaded from: classes10.dex */
public class g6 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f247237d;

    /* renamed from: f, reason: collision with root package name */
    public e33.z5 f247239f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f247240g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f247241h = new e33.c6(this);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f247238e = new java.util.ArrayList();

    public g6(android.content.Context context) {
        this.f247237d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f247238e;
        if (((java.util.ArrayList) list).size() == 0) {
            ((java.util.ArrayList) list).add(new t23.k2());
        }
        return ((java.util.ArrayList) list).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((t23.m2) ((java.util.ArrayList) this.f247238e).get(i17)).f415206a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        boolean z17 = k3Var instanceof e33.e6;
        java.util.List list = this.f247238e;
        if (z17) {
            ((e33.e6) k3Var).f247213d.setText(((t23.i2) ((java.util.ArrayList) list).get(i17)).f415185c);
            return;
        }
        if (!(k3Var instanceof e33.d6)) {
            if (k3Var instanceof e33.f6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "no search result.");
                return;
            }
            return;
        }
        t23.f2 f2Var = (t23.f2) ((java.util.ArrayList) list).get(i17);
        k3Var.itemView.setOnClickListener(this.f247241h);
        k3Var.itemView.setTag(f2Var);
        t23.g2 g2Var = f2Var.f415153h;
        int i18 = (g2Var == null || !g2Var.f415156c) ? 1 : 2;
        e33.d6 d6Var = (e33.d6) k3Var;
        android.widget.ImageView imageView = d6Var.f247202d;
        java.lang.String str = f2Var.f415152g;
        e33.m6.c(imageView, i18, str, str, f2Var.f415151f, -1, null, g2Var == null ? null : g2Var.f415155b, 0L);
        d6Var.f247203e.setText(o13.q.c(this.f247237d, f2Var.f415149d, this.f247240g));
        d6Var.f247204f.setText(java.lang.String.valueOf(f2Var.f415150e));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.content.Context context = this.f247237d;
        return i17 == 0 ? new e33.e6(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.co6, viewGroup, false)) : 1 == i17 ? new e33.d6(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489478co5, viewGroup, false)) : new e33.f6(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.co7, viewGroup, false));
    }
}
