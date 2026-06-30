package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f123552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, java.lang.Long l17) {
        super(0);
        this.f123551d = f4Var;
        this.f123552e = l17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f123551d;
        f4Var.Q6();
        androidx.appcompat.app.AppCompatActivity activity = f4Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.google.android.material.appbar.AppBarLayout X6 = ((com.tencent.mm.plugin.finder.profile.uic.o0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.o0.class)).X6();
        kotlin.jvm.internal.o.f(X6, "<get-appBarLayout>(...)");
        android.view.ViewGroup.LayoutParams layoutParams = X6.getLayoutParams();
        androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
        java.lang.Object obj = cVar != null ? cVar.f11006a : null;
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = obj instanceof com.google.android.material.appbar.AppBarLayout.Behavior ? (com.google.android.material.appbar.AppBarLayout.Behavior) obj : null;
        if (behavior != null) {
            behavior.B(X6.getHeight() * (-1));
        }
        f4Var.d7();
        f4Var.Z6().postDelayed(new com.tencent.mm.plugin.finder.profile.uic.a4(f4Var), 200L);
        if (this.f123552e == null) {
            f4Var.b7("channel_profile_recentviewed", 1, 1);
        } else {
            f4Var.c7("view_clk");
        }
        return jz5.f0.f302826a;
    }
}
