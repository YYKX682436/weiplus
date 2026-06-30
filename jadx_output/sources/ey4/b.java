package ey4;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter f257607d;

    public b(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter) {
        this.f257607d = webViewInputFooter;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = this.f257607d;
        webViewInputFooter.f187291u = false;
        webViewInputFooter.f187281h.setVisibility(8);
        webViewInputFooter.f187281h.getClass();
        webViewInputFooter.f187286p.setImageResource(com.tencent.mm.R.drawable.f481235o1);
        webViewInputFooter.f187280g = 0;
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
