package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ni extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI f129557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI finderShareFeedDetailUI) {
        super(2);
        this.f129557d = finderShareFeedDetailUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.ui.tl tlVar = this.f129557d.f128761v;
        if (tlVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        so2.j5 Q = tlVar.Q();
        if (Q == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(Q);
        return linkedList;
    }
}
