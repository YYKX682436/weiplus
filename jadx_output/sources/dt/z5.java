package dt;

/* loaded from: classes9.dex */
public class z5 extends com.tencent.mm.sdk.event.n {
    public z5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.app.w7 w7Var = com.tencent.mm.app.w7.f53896f;
        am.tx txVar = ((com.tencent.mm.autogen.events.StartWebViewEvent) iEvent).f54863g;
        android.content.Context context = txVar.f8040b;
        java.lang.String str = txVar.f8039a;
        if (context == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return false;
    }
}
