package ey4;

/* loaded from: classes8.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter f257625d;

    public n(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f257625d = webViewRedesignInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257625d;
        if (webViewRedesignInputFooter.f187295g == 0) {
            webViewRedesignInputFooter.f187295g = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "setGeneralViewComponent, hideVKB");
            webViewRedesignInputFooter.f187307v.hideVKB();
            if (!webViewRedesignInputFooter.f187308w) {
                webViewRedesignInputFooter.f187300o.requestFocus();
            }
            webViewRedesignInputFooter.j();
        } else {
            webViewRedesignInputFooter.f187295g = 0;
            webViewRedesignInputFooter.f187300o.requestFocus();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "setGeneralViewComponent, showVKB");
            webViewRedesignInputFooter.i();
            webViewRedesignInputFooter.c(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
