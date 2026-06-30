package hs4;

/* loaded from: classes9.dex */
public class f implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.ui.WXPayJsApiKindaEntranceUI f284630d;

    public f(com.tencent.mm.plugin.wallet.ui.WXPayJsApiKindaEntranceUI wXPayJsApiKindaEntranceUI) {
        this.f284630d = wXPayJsApiKindaEntranceUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        ((ku5.t0) ku5.t0.f312615d).A("WXPayJsApiKindaEntranceUIObserver");
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayJsApiKindaEntranceUI", "callback ret is：%s", bundle.getString("ret", "fail"));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        this.f284630d.setResult(-1, intent);
        this.f284630d.finish();
    }
}
