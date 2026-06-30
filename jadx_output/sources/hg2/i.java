package hg2;

/* loaded from: classes3.dex */
public final class i extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.l33 l33Var;
        r45.hg1 hg1Var;
        r45.l33 l33Var2;
        r45.lq1 lq1Var;
        hg2.h hVar;
        r45.eu0 eu0Var = null;
        if (hc1Var != null && (l33Var2 = (r45.l33) hc1Var.getCustom(66)) != null && (lq1Var = (r45.lq1) l33Var2.getCustom(0)) != null) {
            dk2.vf vfVar = new dk2.vf(lq1Var);
            ((mm2.f6) business(mm2.f6.class)).X6(vfVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("join live set flash sale info, cancel = ");
            int i17 = vfVar.f234252c;
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("FlashSaleDataController", sb6.toString());
            if (i17 != 0) {
                hg2.h hVar2 = (hg2.h) controller(hg2.h.class);
                if (hVar2 != null) {
                    pm0.v.X(new hg2.b(hVar2));
                }
            } else {
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var != null && (hVar = (hg2.h) k0Var.getController(hg2.h.class)) != null) {
                    hVar.Z6();
                }
                android.content.Context O6 = O6();
                com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
                hg2.s.b(vfVar, O6, ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null);
            }
        }
        if (hc1Var == null || (l33Var = (r45.l33) hc1Var.getCustom(66)) == null || (hg1Var = (r45.hg1) l33Var.getCustom(1)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FlashSaleDataController", "join live set flash sale config");
        r45.eu0 eu0Var2 = new r45.eu0();
        com.tencent.mm.protobuf.g byteString = hg1Var.getByteString(0);
        byte[] g17 = byteString != null ? byteString.g() : null;
        if (g17 != null) {
            try {
                eu0Var2.parseFrom(g17);
                eu0Var = eu0Var2;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        ((mm2.f6) business(mm2.f6.class)).W6(eu0Var);
    }
}
