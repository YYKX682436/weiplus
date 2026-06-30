package hr3;

/* loaded from: classes4.dex */
public class oi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI f283868d;

    public oi(com.tencent.mm.plugin.profile.ui.WxaBindBizInfoUI wxaBindBizInfoUI) {
        this.f283868d = wxaBindBizInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f283868d.finish();
        return false;
    }
}
