package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class nf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f124013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.go2 f124014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, java.util.List list, r45.go2 go2Var) {
        super(0);
        this.f124012d = finderProfileTabUIC;
        this.f124013e = list;
        this.f124014f = go2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.FinderProfilePaidCollectionFragment finderProfilePaidCollectionFragment = new com.tencent.mm.plugin.finder.profile.FinderProfilePaidCollectionFragment();
        finderProfilePaidCollectionFragment.f123288t = this.f124013e;
        finderProfilePaidCollectionFragment.f123289u = this.f124014f.getByteString(4);
        this.f124012d.I7(15, finderProfilePaidCollectionFragment);
        return jz5.f0.f302826a;
    }
}
