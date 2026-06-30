package p14;

/* loaded from: classes8.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI f351215d;

    public d(com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI getQRCodeInfoUI) {
        this.f351215d = getQRCodeInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f351215d.finish();
    }
}
