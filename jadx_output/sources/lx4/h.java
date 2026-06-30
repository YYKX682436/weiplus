package lx4;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView f322133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f322134e;

    public h(com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView, android.view.View view) {
        this.f322133d = browserChooseDialogView;
        this.f322134e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView = this.f322133d;
        ix4.a aVar = browserChooseDialogView.f184008n;
        if (aVar != null) {
            lx4.a aVar2 = browserChooseDialogView.f184007m;
            hx4.d dVar = (hx4.d) aVar;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(aVar2 != null ? aVar2.hashCode() : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "BrowserDialog onCloseClick dialog: %s", objArr);
            if (aVar2 != null) {
                aVar2.setOnDismissListener(new hx4.b(dVar.f285665a));
            }
            if (aVar2 != null) {
                aVar2.dismiss();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
