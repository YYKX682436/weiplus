package yh4;

/* loaded from: classes8.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f462411d;

    public b(java.util.ArrayList list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f462411d = list;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f462411d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 _holder, int i17) {
        kotlin.jvm.internal.o.g(_holder, "_holder");
        yh4.c cVar = (yh4.c) _holder;
        java.lang.Object obj = this.f462411d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        yh4.a aVar = (yh4.a) obj;
        cVar.f462414f.setText(aVar.f462407a);
        android.widget.ImageView imageView = cVar.f462413e;
        java.lang.Integer num = aVar.f462408b;
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        android.graphics.drawable.Drawable drawable = aVar.f462409c;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        cVar.f462412d.setOnClickListener(aVar.f462410d);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.clk, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new yh4.c(inflate);
    }
}
