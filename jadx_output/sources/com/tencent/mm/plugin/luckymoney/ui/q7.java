package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class q7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147340d;

    public q7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147340d = luckyMoneyNewDetailUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        r45.yv3 yv3Var;
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147340d;
        menu.f(0, luckyMoneyNewDetailUI.getString(com.tencent.mm.R.string.gjn));
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewDetailUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int intExtra = ((com.tencent.mm.plugin.luckymoney.ui.fa) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.fa.class)).getIntent().getIntExtra("key_receive_envelope_widget_status_flag", 0);
        boolean z17 = (intExtra & 32) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[needShowUpRightCornerLiteApp] needShow ：" + z17 + " , statusFlag ：" + intExtra);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            menu.f(1, luckyMoneyNewDetailUI.getString(com.tencent.mm.R.string.o7x));
        }
        java.util.ArrayList X6 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.X6(luckyMoneyNewDetailUI);
        if (X6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "ComplaintEntrance is false || mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        java.util.Iterator it = X6.iterator();
        int i17 = 2;
        while (it.hasNext()) {
            r45.aw3 aw3Var = (r45.aw3) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aw3Var.f370293d) && (yv3Var = aw3Var.f370294e) != null) {
                if (!(yv3Var != null && yv3Var.f391400d == 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "add option：%s, index：%s", aw3Var.f370293d, java.lang.Integer.valueOf(i17));
                    menu.f(i17, aw3Var.f370293d);
                }
            }
            i17++;
        }
    }
}
