package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s0 extends com.tencent.mm.plugin.finder.viewmodel.component.p0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t0 f135847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135848g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.t0 t0Var, in5.s0 s0Var) {
        super(baseFinderFeed);
        this.f135846e = baseFinderFeed;
        this.f135847f = t0Var;
        this.f135848g = s0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135846e;
        this.f135847f.O6(this.f135848g, baseFinderFeed, (r45.ib) obj);
    }
}
