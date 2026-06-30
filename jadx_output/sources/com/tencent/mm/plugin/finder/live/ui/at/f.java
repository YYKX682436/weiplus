package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ui.at.g f115408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.live.ui.at.g gVar) {
        super(0);
        this.f115408d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.ui.at.g gVar = this.f115408d;
        com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource finderLiveAtGroupSearchDataSource = new com.tencent.mm.plugin.finder.live.ui.at.FinderLiveAtGroupSearchDataSource(gVar.D);
        gVar.mo133getLifecycle().a(finderLiveAtGroupSearchDataSource);
        return finderLiveAtGroupSearchDataSource;
    }
}
