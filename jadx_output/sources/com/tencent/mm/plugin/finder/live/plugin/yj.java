package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yj extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f115204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(2);
        this.f115204d = hmVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.ViewGroup view = (android.view.ViewGroup) obj;
        ce2.i gift = (ce2.i) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(gift, "gift");
        boolean T0 = gift.T0();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f115204d;
        if (T0) {
            com.tencent.mm.plugin.finder.live.plugin.hm.t1(hmVar, gift);
        } else {
            java.lang.String str = com.tencent.mm.plugin.finder.live.plugin.hm.T1;
            vg2.r1.j((vg2.r1) ((jz5.n) hmVar.f112844z1).getValue(), view, gift, true, false, 8, null);
        }
        return jz5.f0.f302826a;
    }
}
