package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ed extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f123667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(androidx.fragment.app.Fragment fragment) {
        super(0);
        this.f123667d = fragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.fragment.app.Fragment fragment = this.f123667d;
        com.tencent.mm.plugin.finder.profile.FinderProfileProductFragment finderProfileProductFragment = fragment instanceof com.tencent.mm.plugin.finder.profile.FinderProfileProductFragment ? (com.tencent.mm.plugin.finder.profile.FinderProfileProductFragment) fragment : null;
        java.lang.String str = finderProfileProductFragment != null ? finderProfileProductFragment.f123294t : null;
        if (str == null) {
            str = "";
        }
        return new com.tencent.mm.plugin.finder.profile.widget.b(str);
    }
}
