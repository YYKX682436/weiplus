package ub3;

/* loaded from: classes14.dex */
public class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426094d;

    public c(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426094d = luckyMoneyF2FQRCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f426094d.finish();
        return true;
    }
}
