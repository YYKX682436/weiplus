package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class v5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        super(1);
        this.f129942d = finderFansListUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129942d;
        com.tencent.mm.protobuf.g gVar = finderFansListUI.f128572z;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList != null) {
            java.util.ArrayList arrayList = finderFansListUI.f128569w;
            if (arrayList.isEmpty()) {
                arrayList.addAll(linkedList);
                com.tencent.mm.plugin.finder.ui.e eVar = finderFansListUI.f128568v;
                eVar.c(arrayList);
                eVar.notifyDataSetChanged();
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        return f0Var;
    }
}
