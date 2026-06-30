package yw3;

/* loaded from: classes11.dex */
public final class d5 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.mm6 f466719b;

    public d5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI, r45.mm6 mm6Var) {
        this.f466718a = repairerPatchDemoUI;
        this.f466719b = mm6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f466718a;
        com.tencent.mars.xlog.Log.i(repairerPatchDemoUI.d, "onDialogClick %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            int i17 = this.f466719b.f380680s;
            repairerPatchDemoUI.getClass();
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493422k42, com.tencent.mm.sdk.platformtools.m2.d(), java.lang.Integer.valueOf(i17), 1);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1429L, 28L, 1L, false);
        }
    }
}
