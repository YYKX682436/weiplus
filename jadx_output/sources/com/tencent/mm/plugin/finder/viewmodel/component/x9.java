package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC f136425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.g9 f136426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC, com.tencent.mm.plugin.finder.viewmodel.component.g9 g9Var) {
        super(0);
        this.f136423d = s0Var;
        this.f136424e = baseFinderFeed;
        this.f136425f = finderDescPanelUIC;
        this.f136426g = g9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f136423d;
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed != null && baseFinderFeed.getItemId() == this.f136424e.getItemId()) {
            this.f136425f.g7(this.f136426g, s0Var, true);
        }
        return jz5.f0.f302826a;
    }
}
