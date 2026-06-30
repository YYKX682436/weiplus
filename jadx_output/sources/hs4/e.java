package hs4;

/* loaded from: classes9.dex */
public class e implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.ui.WXPayJsApiKindaEntranceUI f284629d;

    public e(com.tencent.mm.plugin.wallet.ui.WXPayJsApiKindaEntranceUI wXPayJsApiKindaEntranceUI) {
        this.f284629d = wXPayJsApiKindaEntranceUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        ((ku5.t0) ku5.t0.f312615d).A("WXPayJsApiKindaEntranceUIObserver");
        java.lang.String string = ((android.os.Bundle) obj).getString("ret", "fail");
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayJsApiKindaEntranceUI", "callback ret is：%s", string);
        if (string.contains("ok")) {
            this.f284629d.setResult(-1);
        } else if (string.contains("cancel")) {
            this.f284629d.setResult(0);
        } else {
            this.f284629d.setResult(-1000);
        }
        this.f284629d.finish();
    }
}
