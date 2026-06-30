package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class q implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191845d;

    public q(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191845d = appChooserUI;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 f2Var, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191845d;
        final com.tencent.mm.pluginsdk.ui.otherway.x xVar = (com.tencent.mm.pluginsdk.ui.otherway.x) appChooserUI.C.get(i17);
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).Ai(2, appChooserUI.f191352z, xVar.f191029e.toString(), appChooserUI.G);
        if (!xVar.f191033i || xVar.f191028d == null) {
            if (xVar == appChooserUI.B) {
                if (!xVar.f191035n || xVar.f191034m) {
                    com.tencent.mm.pluginsdk.model.t3.r(appChooserUI.getContext(), null, null, null, java.lang.Integer.toString(hashCode()), "OTHER_APP_OPEN", null);
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(appChooserUI);
        u1Var.g(appChooserUI.getString(com.tencent.mm.R.string.g_6));
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.f490002i4);
        u1Var.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: com.tencent.mm.pluginsdk.ui.tools.q$$a
            @Override // com.tencent.mm.ui.widget.dialog.w1
            public final void a(boolean z17, java.lang.String str) {
                com.tencent.mm.pluginsdk.ui.tools.q qVar = com.tencent.mm.pluginsdk.ui.tools.q.this;
                qVar.getClass();
                if (z17) {
                    java.lang.String str2 = xVar.f191028d.activityInfo.packageName;
                    int i18 = com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.f191330x0;
                    qVar.f191845d.X6(-1, str2, false);
                }
            }
        });
        u1Var.i(new com.tencent.mm.plugin.fav.ui.gallery.u0$$a());
        u1Var.q(false);
    }
}
