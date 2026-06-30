package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x3 implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c4 f115022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f115023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f115024c;

    public x3(com.tencent.mm.plugin.finder.live.plugin.c4 c4Var, android.view.ViewGroup viewGroup, int i17) {
        this.f115022a = c4Var;
        this.f115023b = viewGroup;
        this.f115024c = i17;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = this.f115022a;
        if (!c4Var.x0()) {
            if (!(sn0.b.f409964e2 != null) && !((mm2.c1) c4Var.P0(mm2.c1.class)).O7()) {
                android.view.ViewGroup viewGroup = this.f115023b;
                int c17 = com.tencent.mm.ui.bl.c(viewGroup.getContext());
                android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f115024c + c17;
                com.tencent.mars.xlog.Log.i(c4Var.f112103w, "onApplyWindowInsets navigationHeight: " + c17);
            }
        }
        return n3.l1.i(v17, insets);
    }
}
