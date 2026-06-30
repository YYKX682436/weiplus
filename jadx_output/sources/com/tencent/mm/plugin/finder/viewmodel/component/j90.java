package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j90 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.k90 f134837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var) {
        super(0);
        this.f134837d = k90Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f134837d.getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        return java.lang.Integer.valueOf(finderHomeTabFragment != null ? finderHomeTabFragment.f129265p : 0);
    }
}
