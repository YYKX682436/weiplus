package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class b0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120691a;

    public b0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120691a = t0Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        dk2.xf j17;
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120691a;
        t0Var.getClass();
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            int i17 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q;
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "optGiftWall anchorStatusFlag: " + i17 + " enable:" + z17);
            if (z17) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                c1Var.p8((-4194305) & i17);
            } else {
                mm2.c1 c1Var2 = (mm2.c1) eVar.a(mm2.c1.class);
                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                c1Var2.p8(i17 | 4194304);
            }
            gk2.e eVar2 = dk2.ef.I;
            if (eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).a8()) {
                gk2.e eVar3 = dk2.ef.I;
                if (!((eVar3 == null || ((mm2.c1) eVar3.a(mm2.c1.class)).U7()) ? false : true) || (j17 = efVar.j(t0Var.f120779p)) == null) {
                    return;
                }
                dk2.xf.h(j17, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.c1) eVar.a(mm2.c1.class)).f328866q, 4194304, 0, new com.tencent.mm.plugin.finder.live.wish.widget.l0(eVar, 4194304, z17, i17, t0Var), 16, null);
            }
        }
    }
}
