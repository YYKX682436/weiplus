package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class af extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.e6 f123538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f123539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, db2.e6 e6Var, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse) {
        super(0);
        this.f123537d = finderProfileTabUIC;
        this.f123538e = e6Var;
        this.f123539f = iResponse;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123537d;
        if (!finderProfileTabUIC.y7(7)) {
            finderProfileTabUIC.I7(7, new com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioFragment(this.f123538e, this.f123539f));
        }
        return jz5.f0.f302826a;
    }
}
