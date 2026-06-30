package v73;

/* loaded from: classes9.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI f433670d;

    public a(com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI honeyPayBaseUI) {
        this.f433670d = honeyPayBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI honeyPayBaseUI = this.f433670d;
        honeyPayBaseUI.hideVKB();
        honeyPayBaseUI.hideTenpayKB();
        honeyPayBaseUI.finish();
        return false;
    }
}
