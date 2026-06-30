package gr2;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f274794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gr2.p0 f274795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlin.jvm.internal.f0 f0Var, gr2.p0 p0Var) {
        super(0);
        this.f274794d = f0Var;
        this.f274795e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addThemeFragment defaultIndex ");
        kotlin.jvm.internal.f0 f0Var = this.f274794d;
        sb6.append(f0Var.f310116d);
        com.tencent.mars.xlog.Log.i("Finder.ThemeLivingViewPagerConvert", sb6.toString());
        this.f274795e.f274814j.onPageSelected(f0Var.f310116d);
        return jz5.f0.f302826a;
    }
}
