package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        super(2);
        this.f120717d = t0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String giftId = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120717d;
        t0Var.w();
        java.util.LinkedHashMap linkedHashMap = t0Var.f120785v;
        ln2.f fVar = (ln2.f) linkedHashMap.get(giftId);
        if (fVar != null) {
            fVar.f319891b = longValue;
        }
        com.tencent.mm.plugin.finder.live.wish.widget.y yVar = (com.tencent.mm.plugin.finder.live.wish.widget.y) t0Var.f120786w.get(giftId);
        if (yVar != null) {
            yVar.a((ln2.f) linkedHashMap.get(giftId));
        }
        t0Var.B();
        return jz5.f0.f302826a;
    }
}
