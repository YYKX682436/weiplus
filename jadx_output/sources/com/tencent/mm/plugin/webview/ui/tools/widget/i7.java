package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class i7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter f187276d;

    public i7(com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter) {
        this.f187276d = webViewSearchContentInputFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f187276d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
