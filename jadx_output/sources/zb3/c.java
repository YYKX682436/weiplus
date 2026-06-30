package zb3;

/* loaded from: classes9.dex */
public class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting f471266d;

    public c(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting snsLuckyMoneyFreePwdSetting) {
        this.f471266d = snsLuckyMoneyFreePwdSetting;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f471266d.finish();
        return false;
    }
}
