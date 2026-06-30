package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        super(0);
        this.f117130d = b8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        int a17 = (k0Var == null || (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) == null || (viewGroup = o9Var.f365323d) == null) ? 0 : com.tencent.mm.ui.kk.a(viewGroup);
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117130d;
        android.view.View view = b8Var.f116941i;
        if (view != null) {
            com.tencent.mm.ui.kk.f(view, 0);
            int height = view.getHeight() + com.tencent.mm.ui.kk.a(view) + com.tencent.mm.ui.kk.b(view) + view.getPaddingBottom() + view.getPaddingTop() + b8Var.f116955z;
            int i17 = a17 - height;
            int f17 = (i17 >= 0 ? i17 : 0) + i65.a.f(b8Var.getContext(), com.tencent.mm.R.dimen.f479688cn);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "[adjustPostBottomMargin] navigationBarHeight:" + b8Var.f116955z + ", postHeight:" + height + ", targetMargin:" + f17);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = f17;
                marginLayoutParams = marginLayoutParams2;
            }
            view.setLayoutParams(marginLayoutParams);
        }
        return jz5.f0.f302826a;
    }
}
