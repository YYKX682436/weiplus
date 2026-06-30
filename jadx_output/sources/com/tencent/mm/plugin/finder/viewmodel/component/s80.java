package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t80 f135875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var) {
        super(0);
        this.f135875d = t80Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f135875d.getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        return java.lang.Integer.valueOf(finderHomeTabFragment != null ? finderHomeTabFragment.f129265p : 0);
    }
}
