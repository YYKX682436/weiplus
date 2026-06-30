package xt2;

/* loaded from: classes3.dex */
public final class l5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r5 f456873d;

    public l5(xt2.r5 r5Var) {
        this.f456873d = r5Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f456873d.f456996o).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        xt2.k5 holder = (xt2.k5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        xt2.r5 r5Var = this.f456873d;
        cm2.m0 m0Var = r5Var.f456997p;
        cm2.m0 productInfo = (cm2.m0) ((java.util.ArrayList) r5Var.f456996o).get(i17);
        kotlin.jvm.internal.o.g(productInfo, "productInfo");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f486441l74);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.l7a);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.rfn);
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.l58);
        android.widget.TextView textView4 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.l7n);
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        java.util.LinkedList linkedList = productInfo.f43371y;
        kotlin.jvm.internal.o.f(linkedList, "<get-img_urls>(...)");
        wo0.c a17 = d1Var.a(((c61.i8) i5Var).Ai((java.lang.String) kz5.n0.Z(linkedList), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        kotlin.jvm.internal.o.d(imageView);
        ((wo0.b) a17).c(imageView);
        textView.setText(productInfo.f43370x);
        kotlin.jvm.internal.o.d(textView3);
        hc2.o.b(textView3);
        textView3.setText(st2.w1.a(productInfo.f43368v));
        textView2.setVisibility(m0Var != null && (productInfo.f43369w > m0Var.f43369w ? 1 : (productInfo.f43369w == m0Var.f43369w ? 0 : -1)) == 0 ? 0 : 8);
        textView4.setText(java.lang.String.valueOf(productInfo.I));
        holder.itemView.setOnClickListener(new xt2.j5(holder.f456852d.f456873d, productInfo));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488986dt3, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new xt2.k5(this, inflate);
    }
}
