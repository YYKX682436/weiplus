package p61;

/* loaded from: classes3.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352277d;

    public h(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI) {
        this.f352277d = bindGoogleContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f352277d.finish();
        return true;
    }
}
