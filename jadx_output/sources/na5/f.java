package na5;

/* loaded from: classes5.dex */
public class f extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f335998d;

    /* renamed from: e, reason: collision with root package name */
    public final int f335999e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f336000f;

    public f(java.util.List dataList, int i17, java.util.List list) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f335998d = dataList;
        this.f335999e = i17;
        this.f336000f = list;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f335998d;
        int size = list.size();
        int i17 = this.f335999e;
        return size > i17 ? i17 : list.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        na5.i holder = (na5.i) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        int intValue = ((java.lang.Number) this.f335998d.get(i17)).intValue();
        android.widget.ImageView imageView = holder.f336007d;
        imageView.setImageResource(intValue);
        wa5.k.a(imageView, "soontest" + i17, java.lang.Integer.valueOf(i17));
        java.util.List list = this.f336000f;
        if (list != null) {
            android.util.Pair create = android.util.Pair.create(imageView, imageView.getTransitionName());
            kotlin.jvm.internal.o.f(create, "create(...)");
            list.add(create);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public na5.i onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f487944c7, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new na5.i(inflate);
    }
}
