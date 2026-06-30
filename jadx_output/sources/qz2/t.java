package qz2;

/* loaded from: classes9.dex */
public class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI f367911d;

    public t(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI fingerPrintAuthUI) {
        this.f367911d = fingerPrintAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.wallet_core.a.c(this.f367911d, new android.os.Bundle(), 2000);
        return false;
    }
}
