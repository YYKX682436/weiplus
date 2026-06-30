package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f184849d;

    public j0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        this.f184849d = openFileChooserUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f184849d;
        androidx.appcompat.app.AppCompatActivity context = openFileChooserUI.getContext();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFileChooserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), openFileChooserUI.getContext());
        if (a17) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            androidx.appcompat.app.AppCompatActivity context2 = openFileChooserUI.getContext();
            int i18 = com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.f183623x;
            java.lang.String Y6 = openFileChooserUI.Y6();
            java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.l(context2, Y6, str, 2);
        }
    }
}
