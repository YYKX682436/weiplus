package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class f4 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.q f121670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 f121671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ up2.n f121672c;

    public f4(vp2.q qVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var, up2.n nVar) {
        this.f121670a = qVar;
        this.f121671b = p4Var;
        this.f121672c = nVar;
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        kotlin.jvm.internal.o.g(cards, "cards");
        vp2.q qVar = this.f121670a;
        if (i17 != qVar.f438950d.f374125d || cards.isEmpty()) {
            return;
        }
        qVar.f438950d.f374129h.addAll(0, cards);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(cards, 10));
        java.util.Iterator it = cards.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.ea2) it.next()).getCustom(2);
            arrayList.add(finderObject != null ? new vp2.p((com.tencent.mm.plugin.finder.storage.FinderItem) kz5.n0.X(cu2.u.f222441a.j(kz5.b0.c(finderObject), hc2.d0.d(0), this.f121671b.f121886i)), qVar.f438950d) : null);
        }
        if (!arrayList.isEmpty()) {
            qVar.f438951e.addAll(0, arrayList);
            this.f121672c.notifyItemRangeInserted(0, arrayList.size());
        }
    }
}
