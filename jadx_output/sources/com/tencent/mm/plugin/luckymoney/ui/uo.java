package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class uo implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.vo f147518a;

    public uo(com.tencent.mm.plugin.luckymoney.ui.vo voVar) {
        this.f147518a = voVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[startRequestRedDotInfoCgi] respone : " + fVar);
        if (fVar.f70618d != null && fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[startRequestRedDotInfoCgi] resp.effectiveEndTime: " + ((r45.wd3) fVar.f70618d).f389077e);
            if (((r45.wd3) fVar.f70618d).f389077e > 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_EFFECTIVEENDTIME_INT_SYNC, java.lang.Integer.valueOf(((r45.wd3) fVar.f70618d).f389077e));
            }
            r45.p90 p90Var = ((r45.wd3) fVar.f70618d).f389076d;
            if (p90Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[startRequestRedDotInfoCgi] resp type : " + p90Var.f382871h + ", is_show：" + p90Var.f382867d + "、version: " + p90Var.f382870g);
                boolean z17 = p90Var.f382867d;
                com.tencent.mm.plugin.luckymoney.ui.vo voVar = this.f147518a;
                if (z17) {
                    com.tencent.mm.protobuf.f resp = fVar.f70618d;
                    kotlin.jvm.internal.o.f(resp, "resp");
                    com.tencent.mm.plugin.luckymoney.ui.vo.O6(voVar, (r45.wd3) resp);
                } else {
                    androidx.appcompat.app.AppCompatActivity activity = voVar.getActivity();
                    kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
                    r45.lm5 h76 = ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity).h7();
                    if (h76 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h76.f379623e) && !com.tencent.mm.sdk.platformtools.t8.K0(p90Var.f382870g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[startRequestRedDotInfoCgi] is_show: false， local version: " + h76.f379623e);
                        if (r26.i0.q(h76.f379623e, p90Var.f382870g, false, 2, null)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotUIC-PrepareUI", "[startRequestRedDotInfoCgi] is_show: false, version equal to local reddot, handle it");
                            com.tencent.mm.protobuf.f resp2 = fVar.f70618d;
                            kotlin.jvm.internal.o.f(resp2, "resp");
                            com.tencent.mm.plugin.luckymoney.ui.vo.O6(voVar, (r45.wd3) resp2);
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.RedDotUIC-PrepareUI", "[startRequestRedDotInfoCgi] svr reddot info is null");
            }
        }
        return null;
    }
}
