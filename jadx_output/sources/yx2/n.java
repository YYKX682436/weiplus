package yx2;

/* loaded from: classes2.dex */
public final class n extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView f467867g;

    public n(com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView) {
        this.f467867g = snsFinderImageBackView;
    }

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cr8, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // eb5.d, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        eb5.e holder = (eb5.e) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onBindViewHolder(holder, i17);
        r45.mb4 mb4Var = (r45.mb4) x(i17);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.lii);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.agl);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(holder.f293121e.getResources().getDisplayMetrics().widthPixels, -2);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        imageView.post(new yx2.l(mb4Var, imageView));
        imageView2.post(new yx2.m(mb4Var, imageView2, this.f467867g));
    }
}
