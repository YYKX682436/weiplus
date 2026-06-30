package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class yp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zp f136602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(com.tencent.mm.plugin.finder.viewmodel.component.zp zpVar) {
        super(0);
        this.f136602d = zpVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f136602d.getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        return java.lang.Integer.valueOf(finderHomeTabFragment != null ? finderHomeTabFragment.f129265p : 39);
    }
}
