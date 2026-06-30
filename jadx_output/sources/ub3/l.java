package ub3;

/* loaded from: classes9.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426117d;

    public l(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426117d = luckyMoneyF2FQRCodeUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426117d;
        if (itemId == 1) {
            if (luckyMoneyF2FQRCodeUI.f145069J > 0) {
                luckyMoneyF2FQRCodeUI.doSceneProgress(new tb3.a(luckyMoneyF2FQRCodeUI.F), false);
                return;
            } else {
                db5.e1.T(luckyMoneyF2FQRCodeUI, luckyMoneyF2FQRCodeUI.getString(com.tencent.mm.R.string.gks));
                return;
            }
        }
        if (itemId != 2) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(luckyMoneyF2FQRCodeUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
        intent.putExtra("key_type", 2);
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = this.f426117d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyF2FQRCodeUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyF2FQRCodeUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyF2FQRCodeUI2, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
