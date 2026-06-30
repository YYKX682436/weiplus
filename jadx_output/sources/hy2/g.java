package hy2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final hy2.g f286058a = new hy2.g();

    public final int a() {
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderAntiAddictDarkEndTime", 6);
    }

    public final int b() {
        if (d()) {
            return 0;
        }
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderAntiAddictDarkStartTime", 22);
    }

    public final int c() {
        if (d()) {
            return 10;
        }
        com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = (com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) pf5.u.f353936a.e(zy2.b6.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class);
        if ((finderTeenModeLimitVM != null ? finderTeenModeLimitVM.P6() : 10) < 16) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.G6).getValue()).r()).intValue();
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H6).getValue()).r()).intValue();
    }

    public final boolean d() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V7).getValue()).r()).intValue() == 1;
    }
}
