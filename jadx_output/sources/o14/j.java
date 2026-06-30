package o14;

/* loaded from: classes.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f342280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f342281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI f342282f;

    public j(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI) {
        this.f342280d = u3Var;
        this.f342281e = z17;
        this.f342282f = fixToolsFileListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f342280d.dismiss();
        if (this.f342281e) {
            com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI fixToolsFileListUI = this.f342282f;
            android.view.View findViewById = fixToolsFileListUI.findViewById(com.tencent.mm.R.id.ngx);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = fixToolsFileListUI.findViewById(com.tencent.mm.R.id.d2d);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$startScan$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
