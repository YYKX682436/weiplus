package nt4;

/* loaded from: classes9.dex */
public class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener f339853d;

    public w(com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener walletGetA8KeyRedirectListener) {
        this.f339853d = walletGetA8KeyRedirectListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f339853d.f181059f;
        java.lang.Runnable runnable = getA8KeyRedirectEvent.f192364d;
        if (runnable != null) {
            getA8KeyRedirectEvent.f54377h.f6554a = 1;
            runnable.run();
        }
    }
}
