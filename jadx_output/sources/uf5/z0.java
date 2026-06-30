package uf5;

/* loaded from: classes10.dex */
public class z0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.FinderBlockListUI f427331d;

    public z0(com.tencent.mm.ui.contact.privacy.FinderBlockListUI finderBlockListUI) {
        this.f427331d = finderBlockListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f427331d.finish();
        return false;
    }
}
