package p14;

/* loaded from: classes9.dex */
public class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI f351216d;

    public d0(com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI shareMicroMsgChoiceUI) {
        this.f351216d = shareMicroMsgChoiceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.qrcode.ShareMicroMsgChoiceUI shareMicroMsgChoiceUI = this.f351216d;
        shareMicroMsgChoiceUI.hideVKB();
        shareMicroMsgChoiceUI.finish();
        return true;
    }
}
