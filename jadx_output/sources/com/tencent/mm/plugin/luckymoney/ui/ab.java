package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ab implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146705d;

    public ab(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f146705d = luckyMoneyNewPrepareUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        int i17;
        kotlin.jvm.internal.o.g(menu, "menu");
        gb3.p.f270042a.a(11);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146705d;
        menu.f(1, luckyMoneyNewPrepareUI.getString(com.tencent.mm.R.string.glr));
        menu.f(2, luckyMoneyNewPrepareUI.getString(com.tencent.mm.R.string.gls));
        boolean z17 = false;
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_exclusive_lucky_money, 0);
        int intExtra = luckyMoneyNewPrepareUI.getIntent().getIntExtra("key_chatroom_num", 0);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "%s: isOpenImIncludeAssociateRoom:%s", luckyMoneyNewPrepareUI.getIntent().getStringExtra("key_username"), java.lang.Boolean.valueOf(c01.e2.R(luckyMoneyNewPrepareUI.getIntent().getStringExtra("key_username"))));
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = luckyMoneyNewPrepareUI.Z;
        if (c1Var != null && c1Var.f145197v) {
            z17 = true;
        }
        if (!z17 || luckyMoneyNewPrepareUI.f146269p1 != 1 || c01.e2.R(luckyMoneyNewPrepareUI.getIntent().getStringExtra("key_username")) || (i17 = luckyMoneyNewPrepareUI.Y) == 2 || i17 == 3 || intExtra <= 1) {
            return;
        }
        menu.f(3, luckyMoneyNewPrepareUI.getString(com.tencent.mm.R.string.glp));
    }
}
