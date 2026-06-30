package of2;

/* loaded from: classes5.dex */
public final class g extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f345083d;

    /* renamed from: e, reason: collision with root package name */
    public final nf2.a[] f345084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of2.m f345085f;

    public g(of2.m mVar, yz5.l onItemClick) {
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f345085f = mVar;
        this.f345083d = onItemClick;
        this.f345084e = nf2.a.values();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f345084e.length;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        float f17;
        of2.e holder = (of2.e) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        nf2.a aVar = this.f345084e[i17];
        of2.m mVar = this.f345085f;
        boolean z17 = aVar == mVar.f345091J;
        aVar.getClass();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f345079e;
        weImageView.setImageResource(com.tencent.mm.R.raw.finder_live_lyrics_layout_horizontal);
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            f17 = 0.0f;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            f17 = -90.0f;
        }
        weImageView.setRotation(f17);
        android.content.Context context = mVar.f118183e;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(aVar.f336651d);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        holder.f345080f.setText(string);
        holder.f345078d.setBackgroundResource(z17 ? com.tencent.mm.R.drawable.d2z : com.tencent.mm.R.drawable.d2y);
        holder.itemView.setOnClickListener(new of2.f(this, aVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f345085f.f118183e).inflate(com.tencent.mm.R.layout.f488924ea5, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new of2.e(this, inflate);
    }
}
