package nt4;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.PayAuthNativeEvent f339854d;

    public x(com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener walletGetA8KeyRedirectListener, com.tencent.mm.autogen.events.PayAuthNativeEvent payAuthNativeEvent) {
        this.f339854d = payAuthNativeEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = this.f339854d.f192364d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
