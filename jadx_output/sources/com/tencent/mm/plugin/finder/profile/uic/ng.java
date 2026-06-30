package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ng extends ym5.u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f124015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC, com.tencent.mm.view.RefreshLoadMoreLayout rlLayout) {
        super(rlLayout);
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        this.f124015e = finderProfileTemplateUIC;
    }

    @Override // ym5.u
    public void a() {
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.profile.uic.mg(this.f124015e, this));
    }
}
