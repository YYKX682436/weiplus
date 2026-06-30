package wo1;

/* loaded from: classes5.dex */
public final class u extends wo1.l {

    /* renamed from: f, reason: collision with root package name */
    public boolean f448032f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo1.v f448033g;

    public u(wo1.v vVar) {
        this.f448033g = vVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return wo1.v.access$getSelectedUsers$p(this.f448033g).size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 == 0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
        android.widget.ImageView imageView = (android.widget.ImageView) view;
        if (i17 == 0) {
            if (this.f448032f) {
                imageView.setImageResource(com.tencent.mm.R.drawable.ctw);
                return;
            } else {
                imageView.setImageResource(com.tencent.mm.R.drawable.cw9);
                return;
            }
        }
        wo1.v vVar = this.f448033g;
        java.lang.Object obj = wo1.v.access$getSelectedUsers$p(vVar).get(i17 - 1);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        imageView.setOnClickListener(new wo1.s(vVar, str));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dus, parent, false);
        if (i17 == 1) {
            int dimension = (int) parent.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
            inflate.setPadding(dimension, dimension, dimension, dimension);
            inflate.setOnClickListener(new wo1.t(this));
        }
        kotlin.jvm.internal.o.d(inflate);
        wo1.r rVar = new wo1.r(this, inflate);
        inflate.setTag(rVar);
        return rVar;
    }
}
