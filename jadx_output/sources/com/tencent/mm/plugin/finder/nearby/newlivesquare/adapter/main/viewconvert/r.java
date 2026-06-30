package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r f121907d = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r();

    public r() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList product_item = ((r45.ue1) obj).f387293f;
        kotlin.jvm.internal.o.f(product_item, "product_item");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(product_item, 10));
        java.util.Iterator it = product_item.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((r45.te1) it.next()).f386349i));
        }
        return kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
    }
}
