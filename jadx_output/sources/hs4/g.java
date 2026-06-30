package hs4;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.h f284631d;

    public g(hs4.h hVar) {
        this.f284631d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hs4.h hVar = this.f284631d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayJsApiKindaEntranceUI", "execute finish logic if in font page：%s", java.lang.Boolean.valueOf(hVar.f284632d.f179129d));
        com.tencent.mm.plugin.wallet.ui.WXPayJsApiKindaEntranceUI wXPayJsApiKindaEntranceUI = hVar.f284632d;
        if (!wXPayJsApiKindaEntranceUI.f179129d || wXPayJsApiKindaEntranceUI.isFinishing() || hVar.f284632d.isDestroyed()) {
            return;
        }
        hVar.f284632d.setResult(0);
        hVar.f284632d.finish();
    }
}
