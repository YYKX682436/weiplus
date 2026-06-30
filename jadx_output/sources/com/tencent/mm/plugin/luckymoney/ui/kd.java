package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class kd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ld f147103a;

    public kd(com.tencent.mm.plugin.luckymoney.ui.ld ldVar) {
        this.f147103a = ldVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] respone : " + fVar);
        if (fVar.f70618d != null && fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] resp.effectiveEndTime: " + ((r45.wd3) fVar.f70618d).f389077e);
            if (((r45.wd3) fVar.f70618d).f389077e > 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_EFFECTIVEENDTIME_INT_SYNC, java.lang.Integer.valueOf(((r45.wd3) fVar.f70618d).f389077e));
            }
            r45.p90 p90Var = ((r45.wd3) fVar.f70618d).f389076d;
            if (p90Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] resp type : " + p90Var.f382871h + ", is_show：" + p90Var.f382867d + "、version: " + p90Var.f382870g);
                boolean z17 = p90Var.f382867d;
                com.tencent.mm.plugin.luckymoney.ui.ld ldVar = this.f147103a;
                if (z17) {
                    com.tencent.mm.protobuf.f resp = fVar.f70618d;
                    kotlin.jvm.internal.o.f(resp, "resp");
                    com.tencent.mm.plugin.luckymoney.ui.ld.O6(ldVar, (r45.wd3) resp);
                } else {
                    androidx.appcompat.app.AppCompatActivity activity = ldVar.getActivity();
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
                    r45.lm5 g76 = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.g7() : null;
                    if (g76 != null && !com.tencent.mm.sdk.platformtools.t8.K0(g76.f379623e) && !com.tencent.mm.sdk.platformtools.t8.K0(p90Var.f382870g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] is_show: false， local version: " + g76.f379623e);
                        if (r26.i0.q(g76.f379623e, p90Var.f382870g, false, 2, null)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] is_show: false, version equal to local reddot, handle it");
                            com.tencent.mm.protobuf.f resp2 = fVar.f70618d;
                            kotlin.jvm.internal.o.f(resp2, "resp");
                            com.tencent.mm.plugin.luckymoney.ui.ld.O6(ldVar, (r45.wd3) resp2);
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewPrepareUIRedDotUIC", "[startRequestRedDotInfoCgi] svr reddot info is null");
            }
        }
        return null;
    }
}
