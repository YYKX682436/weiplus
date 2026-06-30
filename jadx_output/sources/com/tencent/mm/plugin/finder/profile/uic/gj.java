package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class gj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f123747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        super(0);
        this.f123747d = dkVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final int i17 = 0;
        final com.tencent.mm.plugin.finder.feed.model.internal.m0 m0Var = com.tencent.mm.plugin.finder.feed.model.internal.m0.f108024q;
        com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f123747d;
        final java.lang.String username = dkVar.getUsername();
        kotlin.jvm.internal.o.d(username);
        final r45.qt2 contextObj = dkVar.getContextObj();
        final com.tencent.mm.plugin.finder.profile.uic.dk dkVar2 = this.f123747d;
        return new com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader(i17, m0Var, username, contextObj) { // from class: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUnlimitedFlowUIC$feedLoader$2$1
            {
                boolean z17 = false;
                boolean z18 = false;
                yz5.a aVar = null;
                boolean z19 = false;
                long j17 = 0;
                java.lang.String str = null;
                int i18 = 0;
                java.lang.String str2 = null;
                r45.a34 a34Var = null;
                int i19 = 8152;
                kotlin.jvm.internal.i iVar = null;
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
            public boolean isObservePostEvent() {
                return false;
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
            public int remove(long j17, boolean z17) {
                kz5.h0.B(getDataList(), new com.tencent.mm.plugin.finder.profile.uic.cj(j17));
                com.tencent.mm.plugin.finder.profile.uic.dk dkVar3 = dkVar2;
                kz5.h0.B(dkVar3.O6(), new com.tencent.mm.plugin.finder.profile.uic.dj(j17));
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.yj(dkVar3));
                return -1;
            }

            @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
            public int removeByLocalId(long j17, boolean z17) {
                kz5.h0.B(getDataList(), new com.tencent.mm.plugin.finder.profile.uic.ej(j17));
                com.tencent.mm.plugin.finder.profile.uic.dk dkVar3 = dkVar2;
                kz5.h0.B(dkVar3.O6(), new com.tencent.mm.plugin.finder.profile.uic.fj(j17));
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.yj(dkVar3));
                return -1;
            }
        };
    }
}
