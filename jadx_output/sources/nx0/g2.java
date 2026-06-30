package nx0;

/* loaded from: classes5.dex */
public final class g2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341118d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f341119e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f341120f;

    public g2(java.util.List itemDataList) {
        kotlin.jvm.internal.o.g(itemDataList, "itemDataList");
        this.f341118d = itemDataList;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f341119e = fVar.a();
        this.f341120f = nx0.f2.f341106d;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f341118d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        nx0.d2 holder = (nx0.d2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        nx0.i2 i2Var = (nx0.i2) this.f341118d.get(i17);
        boolean a17 = i2Var.a();
        java.lang.String str = i2Var.f341133b;
        java.lang.String string = a17 ? holder.itemView.getResources().getString(com.tencent.mm.R.string.mcn) : str;
        kotlin.jvm.internal.o.d(string);
        android.view.View view = holder.itemView;
        if (i2Var.f341135d) {
            string = view.getResources().getString(com.tencent.mm.R.string.mck, string);
        }
        view.setContentDescription(string);
        holder.f341092d.setBackground(i2Var.f341135d ? k.a.a(holder.itemView.getContext(), com.tencent.mm.R.drawable.ckg) : null);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = holder.f341093e;
        if (a17) {
            mMRoundCornerImageView.setImageResource(com.tencent.mm.R.drawable.cl8);
        } else {
            vo0.e.f438468b.c(i2Var.f341134c, mMRoundCornerImageView, this.f341119e);
        }
        holder.f341094f.setText(str);
        holder.itemView.setOnClickListener(new nx0.e2(this, i17, i2Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dwn, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new nx0.d2(this, inflate);
    }
}
