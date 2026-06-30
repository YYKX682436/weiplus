package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a70 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f111819d = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.plugin.c70 holder = (com.tencent.mm.plugin.finder.live.plugin.c70) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f111819d;
        com.tencent.mm.plugin.finder.live.plugin.b70 b70Var = (com.tencent.mm.plugin.finder.live.plugin.b70) arrayList.get(i17 % arrayList.size());
        java.lang.String str = b70Var.f111983b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (str != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(str, null, 2, null);
            android.view.View view = holder.itemView;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
            a17.c(nVar, (android.widget.ImageView) view, g1Var.h(mn2.f1.f329957h));
        } else {
            android.graphics.Bitmap bitmap = b70Var.f111982a;
            if (bitmap != null) {
                android.view.View view2 = holder.itemView;
                kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.widget.ImageView");
                ((android.widget.ImageView) view2).setImageBitmap(bitmap);
            } else {
                f0Var = null;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onBindViewHolder: empty data:" + b70Var + " for position:" + (i17 % arrayList.size()));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        int i18 = (int) com.tencent.mm.plugin.finder.live.plugin.v70.W;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i18, i18);
        marginLayoutParams.setMarginStart((int) parent.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479706d1));
        marginLayoutParams.setMarginEnd((int) parent.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479706d1));
        imageView.setLayoutParams(marginLayoutParams);
        return new com.tencent.mm.plugin.finder.live.plugin.c70(imageView);
    }
}
