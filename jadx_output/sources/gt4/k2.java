package gt4;

/* loaded from: classes9.dex */
public class k2 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275465a;

    public k2(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275465a = walletSuccPageAwardWidget;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget;
        a36.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "load background_img_whole finish, url: %s, bitmap: %s", str, bitmap);
        if (bitmap == null || (cVar = (walletSuccPageAwardWidget = this.f275465a).f180741p) == null || com.tencent.mm.sdk.platformtools.t8.K0(cVar.f1113p) || !walletSuccPageAwardWidget.f180741p.f1113p.equals(str)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new gt4.j2(this, bitmap));
    }
}
