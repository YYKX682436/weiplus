package ub3;

/* loaded from: classes15.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426097d;

    public d(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426097d = luckyMoneyF2FQRCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426097d;
        luckyMoneyF2FQRCodeUI.B = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyF2FQRCodeUI, 1, false);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = luckyMoneyF2FQRCodeUI.B;
        k0Var.f211872n = luckyMoneyF2FQRCodeUI.X;
        k0Var.f211881s = luckyMoneyF2FQRCodeUI.Y;
        k0Var.v();
        return true;
    }
}
