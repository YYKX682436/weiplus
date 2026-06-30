package p14;

/* loaded from: classes5.dex */
public class l0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI f351233d;

    public l0(com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI) {
        this.f351233d = showQRCodeStep1UI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI = this.f351233d;
        showQRCodeStep1UI.hideVKB();
        showQRCodeStep1UI.finish();
        return true;
    }
}
