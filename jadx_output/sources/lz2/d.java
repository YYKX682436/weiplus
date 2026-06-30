package lz2;

/* loaded from: classes9.dex */
public class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI f322333d;

    public d(com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI walletFaceIdAuthUI) {
        this.f322333d = walletFaceIdAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.wallet_core.a.c(this.f322333d, new android.os.Bundle(), 2000);
        return false;
    }
}
