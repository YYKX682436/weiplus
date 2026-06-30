package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class to extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(boolean z17) {
        if (P6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do DefaultRedPacketSkinCgi");
            Q6(5, z17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do config");
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
            ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity).c7(z17);
        }
    }

    public final boolean P6() {
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (!com.tencent.mm.plugin.luckymoney.model.m5.s()) {
            return com.tencent.mm.plugin.luckymoney.model.m.f145434e.d();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [jz5.f0] */
    public final void Q6(int i17, boolean z17) {
        com.tencent.mm.plugin.luckymoney.model.k0 c17;
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] show loading: " + z17);
        com.tencent.mm.protobuf.g gVar2 = null;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] need show loading");
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity : null;
            if (luckyMoneyPrepareUI != null) {
                luckyMoneyPrepareUI.Z6();
            }
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity2 : null;
            if (luckyMoneyPrepareUI2 != null) {
                luckyMoneyPrepareUI2.f146573s = com.tencent.mm.plugin.luckymoney.model.m5.F(getActivity(), true);
            }
        }
        if (P6() && (c17 = com.tencent.mm.plugin.luckymoney.model.m.f145434e.c()) != null) {
            com.tencent.mm.plugin.luckymoney.model.p0 p0Var = c17.f145364d;
            if (p0Var != null) {
                int i18 = p0Var.f145536s;
                if (i18 <= 0 || i18 <= com.tencent.mm.plugin.luckymoney.model.m5.h() / 1000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] local cache expired");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] has local cache");
                    gVar2 = com.tencent.mm.protobuf.g.b(pm0.v.D(c17));
                }
                gVar = gVar2;
                gVar2 = jz5.f0.f302826a;
            } else {
                gVar = null;
            }
            if (gVar2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] respCache.showSource is null");
            }
            gVar2 = gVar;
        }
        if (i17 == 0) {
            java.lang.String stringExtra = getActivity().getIntent().getStringExtra("key_username");
            java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
            if (c01.e2.S(stringExtra)) {
                i17 = 4;
            } else {
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
                if (((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity3).f146557l1 == 3) {
                    i17 = 3;
                } else {
                    ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                    i17 = com.tencent.mm.plugin.luckymoney.model.m5.s() ? 0 : 2;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] do get cgi, scene: " + i17 + " （0：unknown、 1：h5、 2：normal、 3：Live、 4: union、 5：refresh）");
        pq5.g l17 = new com.tencent.mm.plugin.luckymoney.model.e(gVar2, i17).l();
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI");
        l17.f((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI) activity4);
        l17.K(new com.tencent.mm.plugin.luckymoney.ui.so(z17, this));
    }
}
