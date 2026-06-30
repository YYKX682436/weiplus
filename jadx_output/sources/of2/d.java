package of2;

/* loaded from: classes8.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f345070d;

    /* renamed from: e, reason: collision with root package name */
    public final nf2.l1[] f345071e;

    /* renamed from: f, reason: collision with root package name */
    public final int f345072f;

    /* renamed from: g, reason: collision with root package name */
    public final int f345073g;

    /* renamed from: h, reason: collision with root package name */
    public final int f345074h;

    /* renamed from: i, reason: collision with root package name */
    public final int f345075i;

    /* renamed from: m, reason: collision with root package name */
    public final int f345076m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ of2.m f345077n;

    public d(of2.m mVar, yz5.l onItemClick) {
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f345077n = mVar;
        this.f345070d = onItemClick;
        this.f345071e = nf2.l1.values();
        this.f345072f = ym5.x.a(mVar.f118183e, 2.0f);
        this.f345073g = ym5.x.a(mVar.f118183e, 3.0f);
        this.f345074h = mVar.f118183e.getResources().getColor(com.tencent.mm.R.color.Brand_100);
        this.f345075i = mVar.f118183e.getResources().getColor(com.tencent.mm.R.color.adh);
        this.f345076m = mVar.f118183e.getResources().getColor(com.tencent.mm.R.color.f478489a);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f345071e.length;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        of2.b holder = (of2.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        nf2.l1 l1Var = this.f345071e[i17];
        of2.m mVar = this.f345077n;
        boolean z17 = l1Var == mVar.K;
        l1Var.getClass();
        android.content.Context context = mVar.f118183e;
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(0);
        of2.d dVar = holder.f345067f;
        if (z17) {
            gradientDrawable.setStroke(dVar.f345073g, dVar.f345074h);
        } else {
            gradientDrawable.setStroke(0, dVar.f345074h);
        }
        holder.f345065d.setBackground(gradientDrawable);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(l1Var.f336775d);
        gradientDrawable2.setStroke(dVar.f345072f, z17 ? dVar.f345076m : dVar.f345075i);
        holder.f345066e.setBackground(gradientDrawable2);
        holder.itemView.setOnClickListener(new of2.c(this, l1Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f345077n.f118183e).inflate(com.tencent.mm.R.layout.f488923ea4, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new of2.b(this, inflate);
    }
}
