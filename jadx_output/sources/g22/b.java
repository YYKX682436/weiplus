package g22;

/* loaded from: classes12.dex */
public final class b extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final g22.a f267795d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f267796e = new java.util.LinkedList();

    public b(g22.a aVar) {
        this.f267795d = aVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f267796e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        g22.e holder = (g22.e) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f267796e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.ri0 ri0Var = (r45.ri0) obj;
        holder.f267805g = ri0Var;
        zq.h hVar = zq.h.f474972a;
        com.tencent.mm.storage.emotion.EmojiInfo i18 = n22.m.i(ri0Var);
        android.widget.ImageView imageView = holder.f267804f;
        kotlin.jvm.internal.o.d(imageView);
        hVar.d(i18, imageView, null);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a6k, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new g22.e(inflate, this.f267795d);
    }
}
