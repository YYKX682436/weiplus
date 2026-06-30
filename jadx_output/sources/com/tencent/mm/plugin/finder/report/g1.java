package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f125042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.l1 f125043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, com.tencent.mm.plugin.finder.report.l1 l1Var) {
        super(0);
        this.f125042d = mMFragmentActivity;
        this.f125043e = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.MMFragmentActivity activity = this.f125042d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(((java.lang.Number) ((jz5.n) this.f125043e.F).getValue()).intValue());
    }
}
