package nx2;

/* loaded from: classes2.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f341340d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f341341e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f341340d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        nx2.f holder = (nx2.f) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.setOnClickListener(new nx2.d(this, holder, i17));
        int i18 = this.f341341e;
        android.widget.ImageView imageView = holder.f341342d;
        if (i18 == i17) {
            if (imageView != null) {
                imageView.setBackgroundResource(com.tencent.mm.R.drawable.ayt);
            }
        } else if (imageView != null) {
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.afl);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bl7, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new nx2.f(inflate);
    }
}
