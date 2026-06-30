package p61;

/* loaded from: classes3.dex */
public class f implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI f352243d;

    public f(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI bindGoogleContactIntroUI) {
        this.f352243d = bindGoogleContactIntroUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f352243d.finish();
        return true;
    }
}
