package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class jd extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.luckymoney.ui.bd f147056d = new com.tencent.mm.plugin.luckymoney.ui.bd(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6(boolean z17) {
        if (P6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do DefaultRedPacketSkinCgi");
            Q6(5, z17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[doRefreshSourceMac] do config");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        if (luckyMoneyNewPrepareUI != null) {
            luckyMoneyNewPrepareUI.c7(z17);
        }
    }

    public final boolean P6() {
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (!com.tencent.mm.plugin.luckymoney.model.m5.s()) {
            return com.tencent.mm.plugin.luckymoney.model.m.f145434e.d();
        }
        return false;
    }

    public final void Q6(int i17, boolean z17) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.plugin.luckymoney.model.k0 c17;
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] show loading: " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] need show loading");
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
            if (luckyMoneyNewPrepareUI != null) {
                luckyMoneyNewPrepareUI.Z6();
            }
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
            if (luckyMoneyNewPrepareUI2 != null) {
                luckyMoneyNewPrepareUI2.f146275s = com.tencent.mm.plugin.luckymoney.model.m5.F(getActivity(), true);
            }
        }
        if (!P6() || (c17 = com.tencent.mm.plugin.luckymoney.model.m.f145434e.c()) == null) {
            gVar = null;
        } else {
            com.tencent.mm.plugin.luckymoney.model.p0 p0Var = c17.f145364d;
            if (p0Var != null) {
                int i18 = p0Var.f145536s;
                if (i18 <= 0 || i18 <= com.tencent.mm.plugin.luckymoney.model.m5.h() / 1000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] local cache expired");
                    gVar = null;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] has local cache");
                    gVar = com.tencent.mm.protobuf.g.b(pm0.v.D(c17));
                }
                f0Var = jz5.f0.f302826a;
            } else {
                gVar = null;
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefualtRedPacketSkinCgi] respCache.showSource is null");
            }
        }
        if (i17 == 0) {
            java.lang.String stringExtra = getActivity().getIntent().getStringExtra("key_username");
            java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
            if (c01.e2.S(stringExtra)) {
                i17 = 4;
            } else {
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity3 : null;
                if (luckyMoneyNewPrepareUI3 != null && luckyMoneyNewPrepareUI3.Y == 3) {
                    i17 = 3;
                } else {
                    ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
                    i17 = com.tencent.mm.plugin.luckymoney.model.m5.s() ? 0 : 2;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[startGetDefaultRedPacketSkinCgi] do get cgi, scene: " + i17 + " （0：unknown、 1：h5、 2：normal、 3：Live、 4: union、 5：refresh）");
        pq5.g l17 = new com.tencent.mm.plugin.luckymoney.model.e(gVar, i17).l();
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        l17.f(activity4 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity4 : null);
        l17.K(new com.tencent.mm.plugin.luckymoney.ui.id(z17, this));
    }
}
