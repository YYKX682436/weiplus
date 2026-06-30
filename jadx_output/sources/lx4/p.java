package lx4;

/* loaded from: classes8.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView f322155d;

    public p(com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView) {
        this.f322155d = browserSettingDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView = this.f322155d;
        ix4.b bVar = browserSettingDialogView.f184017m;
        if (bVar != null) {
            lx4.a aVar = browserSettingDialogView.f184016i;
            hx4.g gVar = (hx4.g) bVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "BrowserSettingDialog onCancelClick");
            if (aVar != null) {
                aVar.setOnDismissListener(new hx4.e(gVar.f285671c));
            }
            if (aVar != null) {
                aVar.dismiss();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
