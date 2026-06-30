package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ui.at.o f115417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.live.ui.at.o oVar) {
        super(0);
        this.f115417d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneSearchDataSource finderLiveAtSomeoneSearchDataSource = new com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtSomeoneSearchDataSource();
        this.f115417d.mo133getLifecycle().a(finderLiveAtSomeoneSearchDataSource);
        return finderLiveAtSomeoneSearchDataSource;
    }
}
