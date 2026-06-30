package wq1;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wq1.c f448501d;

    public b(wq1.c cVar) {
        this.f448501d = cVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.BoxHomeUI", "dismiss dialog");
        wq1.c cVar = this.f448501d;
        xq1.b bVar = cVar.f448506m;
        if (bVar != null) {
            if (bVar.f456024e != null) {
                gm0.j1.d().d(bVar.f456024e);
            }
            gm0.j1.d().q(1869, bVar);
        }
        com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = cVar.f448505i;
        if (boxWebView != null) {
            boxWebView.removeJavascriptInterface("boxJSApi");
            cVar.f448505i.destroy();
            cVar.f448505i = null;
        }
    }
}
