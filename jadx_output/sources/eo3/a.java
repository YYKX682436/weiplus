package eo3;

/* loaded from: classes8.dex */
public class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI f255589d;

    public a(com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI nfcWebViewUI) {
        this.f255589d = nfcWebViewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI nfcWebViewUI = this.f255589d;
        if (nfcWebViewUI.B3) {
            nfcWebViewUI.o9();
            return true;
        }
        nfcWebViewUI.finish();
        return true;
    }
}
