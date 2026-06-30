package lx4;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.x f322121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView f322122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f322123f;

    public d(hx4.x xVar, com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView, int i17) {
        this.f322121d = xVar;
        this.f322122e = browserChooseDialogView;
        this.f322123f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserChooseDialogView browserChooseDialogView;
        ix4.a aVar;
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ActivityInfo activityInfo2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$BrowserItemAdapter$updateDisplayIcon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hx4.x xVar = this.f322121d;
        if (xVar.f285701b != null && (aVar = (browserChooseDialogView = this.f322122e).f184008n) != null) {
            lx4.a aVar2 = browserChooseDialogView.f184007m;
            hx4.d dVar = (hx4.d) aVar;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(aVar2 != null ? aVar2.hashCode() : 0);
            android.content.pm.ResolveInfo resolveInfo = xVar.f285701b;
            objArr[1] = (resolveInfo == null || (activityInfo2 = resolveInfo.activityInfo) == null) ? null : activityInfo2.packageName;
            objArr[2] = (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) ? null : activityInfo.name;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "BrowserDialog onBrowserItemClick dialog: %s, packageName: %s, targetActivity: %s", objArr);
            hx4.p pVar = dVar.f285665a;
            if (aVar2 != null) {
                aVar2.setOnDismissListener(new hx4.a(pVar));
            }
            if (aVar2 != null) {
                aVar2.dismiss();
            }
            hx4.r.e(((com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI) pVar.f285682a).getContext(), (android.content.Intent) ((com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI) pVar.f285682a).getIntent().getParcelableExtra("targetintent"), xVar.f285701b);
            long j17 = pVar.f285683b;
            int i17 = pVar.f285685d;
            android.content.pm.ResolveInfo resolveInfo2 = xVar.f285701b;
            if (resolveInfo2 != null) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr2 = new java.lang.Object[6];
                objArr2[0] = 2;
                objArr2[1] = java.lang.Integer.valueOf(this.f322123f);
                objArr2[2] = 0;
                android.content.pm.ActivityInfo activityInfo3 = resolveInfo2.activityInfo;
                java.lang.String str = activityInfo3 != null ? activityInfo3.packageName : null;
                if (str == null) {
                    str = "";
                }
                objArr2[3] = str;
                objArr2[4] = java.lang.Integer.valueOf(i17);
                objArr2[5] = java.lang.Long.valueOf(j17);
                g0Var.d(21454, objArr2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserChooseDialogView$BrowserItemAdapter$updateDisplayIcon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
