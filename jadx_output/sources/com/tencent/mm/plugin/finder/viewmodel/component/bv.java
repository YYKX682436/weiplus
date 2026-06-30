package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC f133931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC) {
        super(1);
        this.f133931d = finderProfileDrawerUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gx2.q it = (gx2.q) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = this.f133931d;
        java.util.Iterator it6 = finderProfileDrawerUIC.f133629q.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it6.next()).b();
        }
        finderProfileDrawerUIC.f133629q.clear();
        return jz5.f0.f302826a;
    }
}
