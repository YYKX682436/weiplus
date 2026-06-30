package ey4;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter f257616d;

    public e(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter) {
        this.f257616d = webViewInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = this.f257616d;
        ck5.f b17 = ck5.f.b(webViewInputFooter.f187285o);
        int i17 = webViewInputFooter.f187290t;
        b17.f42561f = 0;
        b17.f42560e = i17;
        b17.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        b17.f42556a = true;
        b17.d(new ey4.d(this));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
