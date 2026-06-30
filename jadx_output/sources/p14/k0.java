package p14;

/* loaded from: classes.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI f351231d;

    public k0(com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI) {
        this.f351231d = shareToQQUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI = this.f351231d;
        android.content.Intent intent = new android.content.Intent(shareToQQUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMFBAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        shareToQQUI.getContext().startActivityForResult(intent, 8);
    }
}
