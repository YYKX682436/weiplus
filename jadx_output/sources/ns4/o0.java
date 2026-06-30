package ns4;

/* loaded from: classes8.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f339603d;

    public o0(ns4.p0 p0Var) {
        this.f339603d = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f339603d.f339613f;
        if (walletFormView != null) {
            walletFormView.p();
        } else {
            kotlin.jvm.internal.o.o("inputArea");
            throw null;
        }
    }
}
