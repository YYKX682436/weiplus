package nx0;

/* loaded from: classes5.dex */
public final class a3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341066d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f341067e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f341068f;

    public a3(java.util.List itemDataList) {
        kotlin.jvm.internal.o.g(itemDataList, "itemDataList");
        this.f341066d = itemDataList;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f341067e = fVar.a();
        this.f341068f = nx0.z2.f341274d;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f341066d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        nx0.x2 holder = (nx0.x2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        nx0.b3 b3Var = (nx0.b3) this.f341066d.get(i17);
        b3Var.getClass();
        boolean z17 = b3Var == nx0.b3.f341074g;
        java.lang.String str = b3Var.f341076b;
        java.lang.String string = z17 ? holder.itemView.getResources().getString(com.tencent.mm.R.string.n1v) : str;
        kotlin.jvm.internal.o.d(string);
        android.view.View view = holder.itemView;
        if (b3Var.f341078d) {
            string = view.getResources().getString(com.tencent.mm.R.string.mck, string);
        }
        view.setContentDescription(string);
        holder.f341260d.setBackground(b3Var.f341078d ? k.a.a(holder.itemView.getContext(), com.tencent.mm.R.drawable.ckg) : null);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = holder.f341261e;
        if (z17) {
            mMRoundCornerImageView.setImageResource(com.tencent.mm.R.drawable.cl8);
        } else {
            vo0.e.f438468b.c(b3Var.f341077c, mMRoundCornerImageView, this.f341067e);
        }
        holder.f341262f.setText(str);
        holder.f341263g.setVisibility(b3Var.f341079e ? 0 : 8);
        holder.itemView.setOnClickListener(new nx0.y2(this, i17, b3Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dwp, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new nx0.x2(this, inflate);
    }
}
