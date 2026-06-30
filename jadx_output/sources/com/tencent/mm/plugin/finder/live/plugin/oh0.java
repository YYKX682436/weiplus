package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class oh0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.th0 f113755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(com.tencent.mm.plugin.finder.live.plugin.th0 th0Var) {
        super(3);
        this.f113755d = th0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.finder.live.plugin.eh0 fromScene = (com.tencent.mm.plugin.finder.live.plugin.eh0) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String giftId = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mm.plugin.finder.live.plugin.th0 th0Var = this.f113755d;
        if (booleanValue && !kz5.z.G(new com.tencent.mm.plugin.finder.live.plugin.eh0[]{com.tencent.mm.plugin.finder.live.plugin.eh0.f112418h, com.tencent.mm.plugin.finder.live.plugin.eh0.f112420m}, fromScene)) {
            th0Var.x1();
            com.tencent.mm.plugin.finder.live.widget.aj ajVar = th0Var.f114405s;
            if (ajVar != null) {
                ajVar.c(true);
            }
        }
        if (booleanValue) {
            qo0.c cVar = th0Var.f113325g;
            qo0.b bVar = qo0.b.f365329a5;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_FAN_CLUB_JOIN_GIFT_ID", giftId);
            cVar.statusChange(bVar, bundle);
        } else {
            qo0.c.a(th0Var.f113325g, qo0.b.f365333b5, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
