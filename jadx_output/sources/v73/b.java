package v73;

/* loaded from: classes9.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI f433672d;

    public b(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI honeyPayCardBackUI) {
        this.f433672d = honeyPayCardBackUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI honeyPayCardBackUI = this.f433672d;
        honeyPayCardBackUI.hideVKB();
        honeyPayCardBackUI.hideTenpayKB();
        honeyPayCardBackUI.finish();
        return false;
    }
}
