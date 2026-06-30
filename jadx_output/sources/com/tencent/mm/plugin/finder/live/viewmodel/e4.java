package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class e4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f117076d = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f117076d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.viewmodel.d4 holder = (com.tencent.mm.plugin.finder.live.viewmodel.d4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.viewmodel.c4 data = (com.tencent.mm.plugin.finder.live.viewmodel.c4) this.f117076d.get(i17);
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.live.plugin.no0 no0Var = data.f116970b;
        android.view.View view = no0Var.f113668d;
        if (!kotlin.jvm.internal.o.b(view.getParent(), holder.itemView)) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            android.view.View view2 = holder.itemView;
            kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) view2).addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        no0Var.b(data);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = new com.tencent.mm.ui.widget.RoundCornerRelativeLayout(context);
        roundCornerRelativeLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        roundCornerRelativeLayout.setRadius(i65.a.a(parent.getContext(), 12.0f));
        return new com.tencent.mm.plugin.finder.live.viewmodel.d4(roundCornerRelativeLayout);
    }
}
