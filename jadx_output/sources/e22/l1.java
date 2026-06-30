package e22;

/* loaded from: classes10.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment f246681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment) {
        super(2);
        this.f246681d = multiSelectFinderTabFragment;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment = this.f246681d;
        e22.d1 d1Var = multiSelectFinderTabFragment.f98160i;
        if (d1Var != null) {
            e22.a1.d(d1Var, new e22.i1(multiSelectFinderTabFragment), new e22.j1(multiSelectFinderTabFragment), new e22.k1(multiSelectFinderTabFragment), oVar, 8, 0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("findersFeedViewModel");
        throw null;
    }
}
