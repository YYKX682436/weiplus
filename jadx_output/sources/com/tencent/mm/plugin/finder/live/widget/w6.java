package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w6 implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d7 f120148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout f120149b;

    public w6(com.tencent.mm.plugin.finder.live.widget.d7 d7Var, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        this.f120148a = d7Var;
        this.f120149b = appBarLayout;
    }

    @Override // com.google.android.material.appbar.e
    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        int height = appBarLayout.getHeight() * (-1);
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var = this.f120148a;
        if (i17 == height && d7Var.X != 1) {
            d7Var.W = false;
            d7Var.X = 0;
            android.view.View view = d7Var.R;
            if (view == null) {
                return;
            }
            view.setBackground(null);
            return;
        }
        if (i17 != 0 || d7Var.X == 2) {
            return;
        }
        d7Var.W = true;
        d7Var.X = 0;
        android.view.View view2 = d7Var.R;
        if (view2 == null) {
            return;
        }
        view2.setBackground(this.f120149b.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481775a80));
    }
}
