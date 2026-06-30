package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class gc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f129295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI) {
        super(1);
        this.f129295d = finderPostAtUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f129295d;
        com.tencent.mm.protobuf.g gVar = finderPostAtUI.f128647w;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList == null) {
            return null;
        }
        java.util.ArrayList arrayList = finderPostAtUI.f128644t;
        if (arrayList.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ya2.d.h((com.tencent.mm.protocal.protobuf.FinderContact) it.next(), null, false, 3, null));
            }
            arrayList.addAll(arrayList2);
        }
        return jz5.f0.f302826a;
    }
}
