package e33;

/* loaded from: classes10.dex */
public class w5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f247527d;

    /* renamed from: f, reason: collision with root package name */
    public e33.z5 f247529f;

    /* renamed from: g, reason: collision with root package name */
    public final int f247530g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f247531h = new e33.t5(this);

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f247532i = new e33.u5(this);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f247528e = new java.util.ArrayList();

    public w5(android.content.Context context) {
        this.f247527d = context;
        this.f247530g = (((context.getResources().getDisplayMetrics().widthPixels - com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479688cn)) - (com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479738dv) * 4)) / 9) * 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f247528e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        e33.v5 v5Var = (e33.v5) k3Var;
        t23.f2 f2Var = (t23.f2) ((java.util.ArrayList) this.f247528e).get(i17);
        v5Var.itemView.setTag(f2Var);
        v5Var.itemView.setOnClickListener(this.f247531h);
        t23.g2 g2Var = f2Var.f415153h;
        int i18 = (g2Var == null || !g2Var.f415156c) ? 1 : 2;
        java.lang.String str = f2Var.f415152g;
        e33.m6.c(v5Var.f247518d, i18, str, str, f2Var.f415151f, -1, null, g2Var == null ? null : g2Var.f415155b, 0L);
        v5Var.f247519e.setText(f2Var.f415149d);
        v5Var.f247520f.setText(java.lang.String.valueOf(f2Var.f415150e));
        v5Var.itemView.setOnLongClickListener(this.f247532i);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new e33.v5(android.view.LayoutInflater.from(this.f247527d).inflate(com.tencent.mm.R.layout.f489475co2, viewGroup, false), this.f247530g);
    }
}
