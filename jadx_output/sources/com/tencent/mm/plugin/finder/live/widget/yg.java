package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f120445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f120446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(com.tencent.mm.plugin.finder.live.widget.bh bhVar, com.tencent.mm.modelbase.f fVar) {
        super(0);
        this.f120445d = bhVar;
        this.f120446e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f120445d;
        bhVar.T = false;
        com.tencent.mm.modelbase.f fVar = this.f120446e;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            bhVar.setResp((r45.js1) fVar.f70618d);
            java.util.LinkedList list = ((r45.js1) fVar.f70618d).getList(4);
            kotlin.jvm.internal.o.f(list, "getMembers(...)");
            bm2.v2 v2Var = bhVar.Q;
            v2Var.getClass();
            java.util.ArrayList arrayList = v2Var.f22375d;
            int size = arrayList.size();
            if (!list.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new bm2.t2((r45.fq1) it.next(), 1));
                }
                arrayList.addAll(arrayList2);
                v2Var.notifyItemRangeChanged(size, list.size());
            }
        }
        return jz5.f0.f302826a;
    }
}
