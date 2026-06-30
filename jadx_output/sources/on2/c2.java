package on2;

/* loaded from: classes3.dex */
public final class c2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f346858d = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f346858d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        on2.b2 holder = (on2.b2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        rn2.y2 giftItem = (rn2.y2) ((java.util.ArrayList) this.f346858d).get(i17);
        kotlin.jvm.internal.o.g(giftItem, "giftItem");
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(giftItem.f397929d.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        android.widget.ImageView giftIcon = holder.f346849d;
        kotlin.jvm.internal.o.f(giftIcon, "giftIcon");
        e17.c(q3Var, giftIcon, g1Var.h(mn2.f1.f329965s));
        holder.f346850e.setText("X" + giftItem.f397928c.getInteger(1) + ' ');
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.des, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.d(inflate);
        return new on2.b2(inflate);
    }
}
