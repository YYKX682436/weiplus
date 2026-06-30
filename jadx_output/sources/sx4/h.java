package sx4;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.plugin.wepkg.event.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx4.q f413610a;

    public h(sx4.q qVar) {
        this.f413610a = qVar;
    }

    @Override // com.tencent.mm.plugin.wepkg.event.d
    public void c() {
        sx4.q qVar = this.f413610a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameFloatWebView", "float page, reload url:%s from net", qVar.f413646j);
        com.tencent.mm.ui.widget.MMWebView mMWebView = qVar.f413639c;
        if (mMWebView == null || mMWebView.getParent() == null || qVar.f413645i == null || com.tencent.mm.sdk.platformtools.t8.K0(qVar.f413646j)) {
            return;
        }
        qVar.f413639c.stopLoading();
        qVar.f413639c.loadUrl(qVar.f413645i.f187570w);
    }
}
