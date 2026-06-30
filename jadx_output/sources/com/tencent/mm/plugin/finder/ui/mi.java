package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class mi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI f129525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI finderShareFeedDetailUI) {
        super(1);
        this.f129525d = finderShareFeedDetailUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Number) obj).intValue() != 0) {
            return null;
        }
        com.tencent.mm.plugin.finder.ui.tl tlVar = this.f129525d.f128761v;
        if (tlVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        so2.j5 Q = tlVar.Q();
        if (Q instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) Q;
        }
        return null;
    }
}
