package p14;

/* loaded from: classes8.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI f351213d;

    public c(com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI getQRCodeInfoUI) {
        this.f351213d = getQRCodeInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f351213d.finish();
    }
}
