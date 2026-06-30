package lx4;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView f322156d;

    public q(com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView) {
        this.f322156d = browserSettingDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ActivityInfo activityInfo2;
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$initConfirmButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView = this.f322156d;
        ix4.b bVar = browserSettingDialogView.f184017m;
        if (bVar != null) {
            lx4.a aVar = browserSettingDialogView.f184016i;
            hx4.g gVar = (hx4.g) bVar;
            java.lang.Object[] objArr = new java.lang.Object[2];
            hx4.x xVar = gVar.f285669a;
            java.lang.String str = null;
            int i17 = 0;
            objArr[0] = (xVar == null || (resolveInfo = xVar.f285701b) == null || (activityInfo3 = resolveInfo.activityInfo) == null) ? null : activityInfo3.packageName;
            objArr[1] = xVar != null ? java.lang.Integer.valueOf(xVar.f285700a) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "BrowserSettingDialog onConfirmClick selected: %s, itemType: %s", objArr);
            hx4.x xVar2 = gVar.f285669a;
            if (xVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooseController", "BrowserSettingDialog selectedInfo is null");
            } else {
                kx4.a aVar2 = kx4.a.f313282a;
                int i18 = xVar2.f285700a;
                if (i18 == 1) {
                    android.content.pm.ResolveInfo resolveInfo2 = xVar2.f285701b;
                    java.lang.String str2 = (resolveInfo2 == null || (activityInfo2 = resolveInfo2.activityInfo) == null) ? null : activityInfo2.packageName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar2.a(str2);
                } else if (i18 == 2) {
                    aVar2.a("");
                }
                hx4.p pVar = gVar.f285671c;
                if (aVar != null) {
                    aVar.setOnDismissListener(new hx4.f(pVar, gVar));
                }
                if (aVar != null) {
                    aVar.dismiss();
                }
                long j17 = pVar.f285683b;
                hx4.x xVar3 = gVar.f285669a;
                int i19 = pVar.f285685d;
                int i27 = gVar.f285670b;
                if (xVar3 != null) {
                    int i28 = xVar3.f285700a;
                    if (i28 == 1) {
                        i17 = 1;
                    } else if (i28 == 2) {
                        i17 = 2;
                    }
                    android.content.pm.ResolveInfo resolveInfo3 = xVar3.f285701b;
                    if (resolveInfo3 != null && (activityInfo = resolveInfo3.activityInfo) != null) {
                        str = activityInfo.packageName;
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21458, 2, java.lang.Integer.valueOf(i17), str == null ? "" : str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j17));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$initConfirmButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
