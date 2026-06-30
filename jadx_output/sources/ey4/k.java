package ey4;

/* loaded from: classes4.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f257622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter f257623e;

    public k(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter, android.view.View view) {
        this.f257623e = webViewRedesignInputFooter;
        this.f257622d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f257622d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "keyboard hide inputShadowView");
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257623e;
        webViewRedesignInputFooter.b();
        webViewRedesignInputFooter.f187300o.clearComposingText();
        webViewRedesignInputFooter.f187300o.setText("");
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
