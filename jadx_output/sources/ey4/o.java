package ey4;

/* loaded from: classes8.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter f257626d;

    public o(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f257626d = webViewRedesignInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257626d;
        ck5.f b17 = ck5.f.b(webViewRedesignInputFooter.f187300o);
        int i17 = webViewRedesignInputFooter.f187310y;
        if (i17 <= 0) {
            i17 = Integer.MAX_VALUE;
        }
        b17.f42561f = 0;
        b17.f42560e = i17;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_3;
        b17.f42556a = true;
        b17.d(new ey4.j(webViewRedesignInputFooter));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
