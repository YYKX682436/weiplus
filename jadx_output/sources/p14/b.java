package p14;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI f351211d;

    public b(com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI getQRCodeInfoUI) {
        this.f351211d = getQRCodeInfoUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f351211d.finish();
    }
}
