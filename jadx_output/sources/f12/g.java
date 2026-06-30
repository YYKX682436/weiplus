package f12;

/* loaded from: classes4.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258605d;

    public g(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258605d = springLuckyEggActivity;
    }

    @Override // androidx.lifecycle.k0
    public final void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258605d;
        int V6 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.V6(springLuckyEggActivity, (java.lang.String) obj, com.tencent.mm.R.color.a6x);
        f12.c0 c0Var = springLuckyEggActivity.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258572a.setBackgroundColor(V6);
        springLuckyEggActivity.setActionbarColor(V6);
        springLuckyEggActivity.getWindow().setStatusBarColor(0);
        springLuckyEggActivity.getWindow().setNavigationBarColor(0);
    }
}
