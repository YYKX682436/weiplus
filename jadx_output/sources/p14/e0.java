package p14;

/* loaded from: classes.dex */
public class e0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI f351220d;

    public e0(com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI) {
        this.f351220d = shareToQQUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI = this.f351220d;
        shareToQQUI.hideVKB();
        shareToQQUI.finish();
        return true;
    }
}
