package zb3;

/* loaded from: classes9.dex */
public class q implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471287d;

    public q(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        this.f471287d = snsLuckyMoneyPrepareUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f471287d.finish();
        return true;
    }
}
