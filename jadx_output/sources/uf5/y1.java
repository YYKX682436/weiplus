package uf5;

/* loaded from: classes10.dex */
public class y1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SportBlackListUI f427329d;

    public y1(com.tencent.mm.ui.contact.privacy.SportBlackListUI sportBlackListUI) {
        this.f427329d = sportBlackListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f427329d.finish();
        return false;
    }
}
