package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class r7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147371d;

    public r7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147371d = luckyMoneyNewDetailUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147371d;
        if (itemId == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(luckyMoneyNewDetailUI.Q1 == 2 ? 13 : 7), 0, 0, 0, 4);
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(luckyMoneyNewDetailUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
            intent.putExtra("key_type", 2);
            intent.putExtra("key_username", luckyMoneyNewDetailUI.L1);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI2 = this.f147371d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(luckyMoneyNewDetailUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$addOptionsMenuIfNeed$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyNewDetailUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(luckyMoneyNewDetailUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$addOptionsMenuIfNeed$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (menuItem.getItemId() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewDetailUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.luckymoney.ui.fa faVar = (com.tencent.mm.plugin.luckymoney.ui.fa) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.luckymoney.ui.fa.class);
            androidx.appcompat.app.AppCompatActivity activity = faVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI3 = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI) activity : null;
            if (luckyMoneyNewDetailUI3 == null || (str = luckyMoneyNewDetailUI3.T2) == null) {
                str = "";
            }
            int intExtra = faVar.getIntent().getIntExtra("key_packet_source", 0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scene=103");
            sb6.append("&packet_id=".concat(str));
            sb6.append("&packet_source=" + intExtra);
            bundle.putString("query", sb6.toString());
            bundle.putString("minVersion", "2.0.0");
            bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477876e0);
            bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] packetID ：" + str + " ，packetSource ：" + intExtra + " \n query: " + ((java.lang.Object) sb6));
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            sVar.f144167d = com.tencent.mm.plugin.luckymoney.ui.ea.f146868a;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(faVar.getActivity(), bundle, true, true, sVar, new com.tencent.mm.plugin.luckymoney.ui.da(faVar));
            return;
        }
        java.util.ArrayList X6 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.X6(luckyMoneyNewDetailUI);
        if (X6 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        if (menuItem.getItemId() - 2 > X6.size() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(X6.size()));
            return;
        }
        java.lang.Object obj = X6.get(menuItem.getItemId() - 2);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.aw3 aw3Var = (r45.aw3) obj;
        if (aw3Var.f370294e == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(menuItem.getItemId());
        objArr[1] = aw3Var.f370293d;
        r45.yv3 yv3Var = aw3Var.f370294e;
        objArr[2] = yv3Var != null ? java.lang.Integer.valueOf(yv3Var.f391400d) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_PAY_OPTIONAL_URL，index: %s, word: %s，type: %s", objArr);
        r45.yv3 yv3Var2 = aw3Var.f370294e;
        java.lang.Integer valueOf = yv3Var2 != null ? java.lang.Integer.valueOf(yv3Var2.f391400d) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r45.yv3 yv3Var3 = aw3Var.f370294e;
            objArr2[0] = yv3Var3 != null ? yv3Var3.f391401e : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "textInfo.jumpInfo.url ：%s", objArr2);
            androidx.appcompat.app.AppCompatActivity context2 = luckyMoneyNewDetailUI.getContext();
            r45.yv3 yv3Var4 = aw3Var.f370294e;
            com.tencent.mm.wallet_core.ui.r1.V(context2, yv3Var4 != null ? yv3Var4.f391401e : null, false);
            return;
        }
        if (valueOf == null || valueOf.intValue() != 2) {
            if (valueOf != null && valueOf.intValue() == 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "unknow text info type");
                return;
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        r45.yv3 yv3Var5 = aw3Var.f370294e;
        objArr3[0] = yv3Var5 != null ? yv3Var5.f391402f : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "textInfo.jumpInfo.username ：%s", objArr3);
        r45.yv3 yv3Var6 = aw3Var.f370294e;
        com.tencent.mm.wallet_core.ui.r1.b0(yv3Var6 != null ? yv3Var6.f391402f : null, yv3Var6 != null ? yv3Var6.f391403g : null, 0, 1000);
    }
}
