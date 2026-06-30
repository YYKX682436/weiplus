package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ut f135834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(com.tencent.mm.plugin.finder.viewmodel.component.ut utVar) {
        super(0);
        this.f135834d = utVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int d17;
        com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = this.f135834d;
        if (utVar.isBelongFragment()) {
            androidx.fragment.app.Fragment fragment = utVar.getFragment();
            com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment mMFinderFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment ? (com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment) fragment : null;
            if (mMFinderFragment != null) {
                d17 = mMFinderFragment.getB();
            }
            d17 = 0;
        } else {
            android.app.Activity context = utVar.getContext();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
            if (mMFinderUI != null) {
                d17 = mMFinderUI.getD();
            }
            d17 = 0;
        }
        return java.lang.Integer.valueOf(d17);
    }
}
