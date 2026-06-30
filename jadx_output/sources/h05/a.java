package h05;

/* loaded from: classes4.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI f277925d;

    public a(com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI) {
        this.f277925d = wxGamePushSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f277925d.finish();
        return true;
    }
}
