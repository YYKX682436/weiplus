package uf5;

/* loaded from: classes10.dex */
public class v1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SnsTagDetailUI f427311d;

    public v1(com.tencent.mm.ui.contact.privacy.SnsTagDetailUI snsTagDetailUI) {
        this.f427311d = snsTagDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f427311d.finish();
        return false;
    }
}
