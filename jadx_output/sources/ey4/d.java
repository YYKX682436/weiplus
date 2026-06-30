package ey4;

/* loaded from: classes8.dex */
public class d implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey4.e f257615d;

    public d(ey4.e eVar) {
        this.f257615d = eVar;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        ey4.e eVar = this.f257615d;
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = eVar.f257616d;
        ey4.i iVar = webViewInputFooter.f187277d;
        if (iVar != null) {
            webViewInputFooter.f187285o.getText().toString();
            com.tencent.mm.plugin.webview.luggage.e0 e0Var = ((com.tencent.mm.plugin.webview.luggage.f0) iVar).f182207a;
            e0Var.getClass();
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter2 = e0Var.f182188v;
            if (webViewInputFooter2 != null) {
                webViewInputFooter2.a();
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter3 = eVar.f257616d;
        webViewInputFooter3.f187285o.clearComposingText();
        webViewInputFooter3.f187285o.setText("");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.ui.MMActivity mMActivity = this.f257615d.f257616d.f187288r;
        if (mMActivity != null) {
            dp.a.makeText(mMActivity, "exceed max-length", 0).show();
        }
    }
}
