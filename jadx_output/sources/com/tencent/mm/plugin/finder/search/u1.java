package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        super(2);
        this.f125874d = finderFeedSearchUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125874d;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = finderFeedSearchUI.C;
        int size = dataBuffer2 != null ? dataBuffer2.size() : 0;
        if (intValue2 >= size) {
            intValue2 = size - 1;
        } else if (intValue2 < intValue) {
            intValue2 = intValue;
        }
        if (intValue < 0 || (dataBuffer = finderFeedSearchUI.C) == null) {
            return null;
        }
        return new java.util.LinkedList(kz5.n0.C0(dataBuffer, new e06.k(intValue, intValue2)));
    }
}
