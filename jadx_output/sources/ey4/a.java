package ey4;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter f257605d;

    public a(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter) {
        this.f257605d = webViewInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = this.f257605d;
        if (webViewInputFooter.f187280g == 0) {
            webViewInputFooter.f187288r.hideVKB();
            if (!webViewInputFooter.f187289s) {
                webViewInputFooter.f187285o.requestFocus();
            }
            webViewInputFooter.c();
            webViewInputFooter.f187286p.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
            webViewInputFooter.f187280g = 1;
            webViewInputFooter.f187291u = false;
        } else {
            webViewInputFooter.f187291u = false;
            webViewInputFooter.f187285o.requestFocus();
            webViewInputFooter.f187288r.showVKB();
            webViewInputFooter.b();
            webViewInputFooter.f187280g = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
