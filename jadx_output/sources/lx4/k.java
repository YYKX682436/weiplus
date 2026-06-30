package lx4;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView f322141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx4.n f322142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx4.m f322143f;

    public k(com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView, lx4.n nVar, lx4.m mVar) {
        this.f322141d = browserSettingDialogView;
        this.f322142e = nVar;
        this.f322143f = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo;
        android.content.pm.ResolveInfo resolveInfo2;
        android.content.pm.ActivityInfo activityInfo2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$BrowserItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f322142e.getAdapterPosition();
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView = this.f322141d;
        browserSettingDialogView.f184019o = adapterPosition;
        ix4.b bVar = browserSettingDialogView.f184017m;
        lx4.m mVar = this.f322143f;
        if (bVar != null) {
            lx4.a aVar = browserSettingDialogView.f184016i;
            hx4.x xVar = (hx4.x) kz5.n0.a0(mVar.f322148e, adapterPosition);
            hx4.g gVar = (hx4.g) bVar;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(aVar != null ? aVar.hashCode() : 0);
            java.lang.String str = null;
            objArr[1] = xVar != null ? java.lang.Integer.valueOf(xVar.f285700a) : null;
            objArr[2] = (xVar == null || (resolveInfo2 = xVar.f285701b) == null || (activityInfo2 = resolveInfo2.activityInfo) == null) ? null : activityInfo2.packageName;
            if (xVar != null && (resolveInfo = xVar.f285701b) != null && (activityInfo = resolveInfo.activityInfo) != null) {
                str = activityInfo.name;
            }
            objArr[3] = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "BrowserSettingDialog onBrowserItemClick dialog: %s, itemType: %s, packageName: %s, targetActivity: %s", objArr);
            gVar.f285669a = xVar;
            gVar.f285670b = adapterPosition;
        }
        mVar.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$BrowserItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
