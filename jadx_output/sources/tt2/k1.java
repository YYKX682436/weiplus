package tt2;

/* loaded from: classes3.dex */
public final class k1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f421950d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public r45.p45 f421951e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f421950d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        tt2.j1 holder = (tt2.j1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f421950d;
        r45.o45 o45Var = (r45.o45) kz5.n0.a0(list, i17);
        if (o45Var != null) {
            r45.p45 p45Var = this.f421951e;
            int size = ((java.util.ArrayList) list).size();
            android.view.View view = holder.itemView;
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView finderLiveProductPairingView = view instanceof com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView ? (com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView) view : null;
            if (finderLiveProductPairingView != null) {
                boolean z17 = i17 == 0;
                android.widget.ImageView imageView = finderLiveProductPairingView.f126292d;
                if (z17) {
                    imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                } else {
                    imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i17 + 1);
                sb6.append('/');
                sb6.append(size);
                finderLiveProductPairingView.f126294f.setText(sb6.toString());
                mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
                java.lang.String string = o45Var.getString(0);
                if (string == null) {
                    string = "";
                }
                ((wo0.b) d1Var.a(((c61.i8) i5Var).Ai(string, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
                finderLiveProductPairingView.post(new xt2.v(finderLiveProductPairingView, o45Var, p45Var));
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView finderLiveProductPairingView = new com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductPairingView(context);
        finderLiveProductPairingView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        return new tt2.j1(this, finderLiveProductPairingView);
    }
}
