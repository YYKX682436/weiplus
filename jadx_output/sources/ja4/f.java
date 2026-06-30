package ja4;

/* loaded from: classes.dex */
public class f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI f298625d;

    public f(com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI snsLuckyMoneyDetailUI) {
        this.f298625d = snsLuckyMoneyDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f298625d.finish();
        return true;
    }
}
