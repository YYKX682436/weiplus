package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class gg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI f129300d;

    public gg(com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI) {
        this.f129300d = finderSelfQRCodeUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI = this.f129300d;
        android.view.View view2 = finderSelfQRCodeUI.A;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("qrcodeContainer");
            throw null;
        }
        android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(view2);
        if (b07 != null) {
            com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
            java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102143l + java.lang.System.nanoTime() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            com.tencent.mm.sdk.platformtools.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(finderSelfQRCodeUI, str, new com.tencent.mm.plugin.finder.ui.ag(finderSelfQRCodeUI));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1278L, 7L, 1L, false);
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            java.lang.String username = finderSelfQRCodeUI.f128701t;
            o3Var.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            java.lang.String str2 = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + username;
            com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "18973 " + str2);
            fVar.kvStat(18973, str2);
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(finderSelfQRCodeUI);
            e4Var.f211776c = finderSelfQRCodeUI.getString(com.tencent.mm.R.string.f492036h93);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
