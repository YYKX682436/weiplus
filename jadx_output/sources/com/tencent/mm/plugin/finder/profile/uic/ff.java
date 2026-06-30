package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ff extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f123715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yz0 f123717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(java.util.List list, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, r45.yz0 yz0Var) {
        super(0);
        this.f123715d = list;
        this.f123716e = finderProfileTabUIC;
        this.f123717f = yz0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list = this.f123715d;
        boolean z17 = !list.isEmpty();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123716e;
        if (z17) {
            com.tencent.mm.plugin.finder.profile.FinderProfileCourseFragment finderProfileCourseFragment = new com.tencent.mm.plugin.finder.profile.FinderProfileCourseFragment();
            finderProfileCourseFragment.f123283t = list;
            finderProfileCourseFragment.f123284u = this.f123717f.getString(4);
            finderProfileTabUIC.I7(14, finderProfileCourseFragment);
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.p7(finderProfileTabUIC, 14, 0, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
