package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class v2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.x2 f147522d;

    public v2(com.tencent.mm.plugin.luckymoney.ui.x2 x2Var) {
        this.f147522d = x2Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        r45.yv3 yv3Var;
        com.tencent.mm.plugin.luckymoney.model.q6 a17;
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
        com.tencent.mm.plugin.luckymoney.ui.x2 x2Var = this.f147522d;
        g4Var.f(0, x2Var.f147663d.getString(com.tencent.mm.R.string.gjn));
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = x2Var.f147663d;
        androidx.appcompat.app.AppCompatActivity activity = luckyMoneyDetailUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        int intExtra = ((com.tencent.mm.plugin.luckymoney.ui.d4) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.d4.class)).getIntent().getIntExtra("key_receive_envelope_widget_status_flag", 0);
        boolean z17 = (intExtra & 32) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[needShowUpRightCornerLiteApp] needShow ：" + z17 + " , statusFlag ：" + intExtra);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            g4Var.f(1, luckyMoneyDetailUI.getString(com.tencent.mm.R.string.o7x));
        }
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = luckyMoneyDetailUI.U2;
        java.util.ArrayList arrayList2 = (e1Var == null || (a17 = com.tencent.mm.plugin.luckymoney.model.q6.a(e1Var.T)) == null || (arrayList = a17.f145566c) == null || arrayList.size() <= 0) ? null : a17.f145566c;
        if (arrayList2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "ComplaintEntrance is false || mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        int i17 = 2;
        while (it.hasNext()) {
            r45.aw3 aw3Var = (r45.aw3) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aw3Var.f370293d) && (yv3Var = aw3Var.f370294e) != null && yv3Var.f391400d != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "add option：%s, index：%s", aw3Var.f370293d, java.lang.Integer.valueOf(i17));
                g4Var.f(i17, aw3Var.f370293d);
            }
            i17++;
        }
    }
}
