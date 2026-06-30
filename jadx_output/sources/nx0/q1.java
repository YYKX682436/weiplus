package nx0;

/* loaded from: classes5.dex */
public final class q1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341202d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f341203e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f341204f;

    public q1(java.util.List itemDataList) {
        kotlin.jvm.internal.o.g(itemDataList, "itemDataList");
        this.f341202d = itemDataList;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f341203e = fVar.a();
        this.f341204f = nx0.p1.f341198d;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f341202d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        nx0.n1 holder = (nx0.n1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        nx0.r1 r1Var = (nx0.r1) this.f341202d.get(i17);
        r1Var.getClass();
        boolean z17 = r1Var == nx0.r1.f341209g;
        java.lang.String str = r1Var.f341211b;
        java.lang.String string = z17 ? holder.itemView.getResources().getString(com.tencent.mm.R.string.n1u) : str;
        kotlin.jvm.internal.o.d(string);
        android.view.View view = holder.itemView;
        if (r1Var.f341213d) {
            string = view.getResources().getString(com.tencent.mm.R.string.mck, string);
        }
        view.setContentDescription(string);
        holder.f341176d.setBackground(r1Var.f341213d ? k.a.a(holder.itemView.getContext(), com.tencent.mm.R.drawable.ckg) : null);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = holder.f341177e;
        if (z17) {
            mMRoundCornerImageView.setImageResource(com.tencent.mm.R.drawable.cl8);
        } else {
            vo0.e.f438468b.c(r1Var.f341212c, mMRoundCornerImageView, this.f341203e);
        }
        holder.f341178f.setText(str);
        holder.f341179g.setVisibility(r1Var.f341214e ? 0 : 8);
        holder.itemView.setOnClickListener(new nx0.o1(this, i17, r1Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dwl, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new nx0.n1(this, inflate);
    }
}
