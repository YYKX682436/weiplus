package p14;

/* loaded from: classes4.dex */
public class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI f351236d;

    public m0(com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI) {
        this.f351236d = showQRCodeStep1UI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI = this.f351236d;
        db5.e1.h(showQRCodeStep1UI, "", new java.lang.String[]{showQRCodeStep1UI.getString(com.tencent.mm.R.string.f492966ih2), showQRCodeStep1UI.getString(com.tencent.mm.R.string.f492969ih5)}, "", false, new p14.o0(showQRCodeStep1UI));
        return true;
    }
}
