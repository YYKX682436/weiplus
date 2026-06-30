package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        super(1);
        this.f125854d = finderFeedSearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0) {
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125854d;
            if (intValue < finderFeedSearchUI.C.size()) {
                so2.j5 j5Var = (so2.j5) finderFeedSearchUI.C.get(intValue);
                if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                }
            }
        }
        return null;
    }
}
