package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class u extends com.tencent.mm.xcompat.recyclerview.widget.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 f214784e;

    public u(com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2) {
        this.f214784e = viewPager2;
    }

    @Override // com.tencent.mm.xcompat.recyclerview.widget.d2
    public android.view.View b(com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var) {
        if (!this.f214784e.f214745t.f214757a.f214773m) {
            if (g1Var.c()) {
                return e(g1Var, g(g1Var));
            }
            if (g1Var.b()) {
                return e(g1Var, f(g1Var));
            }
        }
        return null;
    }
}
