package we4;

/* loaded from: classes11.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sport.ui.SportBlackListUI f445286d;

    public a(com.tencent.mm.plugin.sport.ui.SportBlackListUI sportBlackListUI) {
        this.f445286d = sportBlackListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f445286d.finish();
        return false;
    }
}
