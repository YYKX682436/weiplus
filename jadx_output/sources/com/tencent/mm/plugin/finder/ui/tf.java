package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class tf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f129878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(r45.mb4 mb4Var, com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        super(1);
        this.f129878d = mb4Var;
        this.f129879e = finderSelectCoverUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).longValue();
        if (hc2.l0.c(this.f129878d)) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.ui.sf(this.f129879e, this.f129878d));
        }
        return jz5.f0.f302826a;
    }
}
