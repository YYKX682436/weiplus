package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class w2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.x2 f147630d;

    public w2(com.tencent.mm.plugin.luckymoney.ui.x2 x2Var) {
        this.f147630d = x2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.luckymoney.model.q6 a17;
        java.util.ArrayList arrayList;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.x2 x2Var = this.f147630d;
        if (itemId == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(x2Var.f147663d.Q1 == 2 ? 13 : 7), 0, 0, 0, 4);
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = x2Var.f147663d;
            intent.setClass(luckyMoneyDetailUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
            intent.putExtra("key_type", 2);
            intent.putExtra("key_username", luckyMoneyDetailUI.L1);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI2 = x2Var.f147663d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(luckyMoneyDetailUI2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$41$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyDetailUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(luckyMoneyDetailUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$41$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        java.util.ArrayList arrayList3 = null;
        arrayList3 = null;
        arrayList3 = null;
        arrayList3 = null;
        if (menuItem.getItemId() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            androidx.appcompat.app.AppCompatActivity activity = x2Var.f147663d.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.luckymoney.ui.d4 d4Var = (com.tencent.mm.plugin.luckymoney.ui.d4) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.luckymoney.ui.d4.class);
            androidx.appcompat.app.AppCompatActivity activity2 = d4Var.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI3 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI) activity2 : null;
            java.lang.String str = luckyMoneyDetailUI3 != null ? luckyMoneyDetailUI3.T2 : null;
            if (str == null) {
                str = "";
            }
            int intExtra = d4Var.getIntent().getIntExtra("key_packet_source", 0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scene=103");
            sb6.append("&packet_id=".concat(str));
            sb6.append("&packet_source=" + intExtra);
            bundle.putString("query", sb6.toString());
            bundle.putString("minVersion", "2.0.0");
            bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477876e0);
            bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] packetID ：" + str + " ，packetSource ：" + intExtra + " \n query: " + ((java.lang.Object) sb6));
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.f144167d = com.tencent.mm.plugin.luckymoney.ui.c4.f146775a;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(d4Var.getActivity(), bundle, true, true, sVar, new com.tencent.mm.plugin.luckymoney.ui.b4(d4Var));
            return;
        }
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = x2Var.f147663d.U2;
        if (e1Var != null && (a17 = com.tencent.mm.plugin.luckymoney.model.q6.a(e1Var.T)) != null && (arrayList = a17.f145566c) != null && arrayList.size() > 0) {
            arrayList3 = a17.f145566c;
        }
        if (arrayList3 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        if (menuItem.getItemId() - 2 > arrayList3.size() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(arrayList3.size()));
            return;
        }
        r45.aw3 aw3Var = (r45.aw3) arrayList3.get(menuItem.getItemId() - 2);
        if (aw3Var == null || aw3Var.f370294e == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_PAY_OPTIONAL_URL，index: %s, word: %s，type: %s", java.lang.Integer.valueOf(menuItem.getItemId()), aw3Var.f370293d, java.lang.Integer.valueOf(aw3Var.f370294e.f391400d));
        r45.yv3 yv3Var = aw3Var.f370294e;
        int i18 = yv3Var.f391400d;
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "textInfo.jumpInfo.url ：%s", yv3Var.f391401e);
            com.tencent.mm.wallet_core.ui.r1.V(x2Var.f147663d.getContext(), aw3Var.f370294e.f391401e, false);
        } else if (i18 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "textInfo.jumpInfo.username ：%s", yv3Var.f391402f);
            r45.yv3 yv3Var2 = aw3Var.f370294e;
            com.tencent.mm.wallet_core.ui.r1.b0(yv3Var2.f391402f, yv3Var2.f391403g, 0, 1000);
        } else if (i18 != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUI", "unknow text info type");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
    }
}
