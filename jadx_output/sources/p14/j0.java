package p14;

/* loaded from: classes11.dex */
public class j0 extends v61.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI f351229d;

    public j0(com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI) {
        this.f351229d = shareToQQUI;
    }

    @Override // v61.r0, v61.p0
    public void a(int i17, java.lang.String str) {
        super.a(i17, str);
        if (i17 == 3) {
            int i18 = com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.f160114i;
            com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI = this.f351229d;
            shareToQQUI.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareToQQUI", "dealWithRefreshTokenFail");
            if (shareToQQUI.f160119h) {
                return;
            }
            java.lang.String string = shareToQQUI.getContext().getString(com.tencent.mm.R.string.f490573yv);
            db5.e1.u(shareToQQUI.getContext(), shareToQQUI.getContext().getString(com.tencent.mm.R.string.c8h), string, new p14.k0(shareToQQUI), null);
        }
    }

    @Override // v61.r0, v61.p0
    public void b(android.os.Bundle bundle) {
        super.b(bundle);
    }
}
