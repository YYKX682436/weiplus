package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191779d;

    public n(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191779d = appChooserUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191779d;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = appChooserUI.A;
        if (xVar == null || xVar.f191028d == null) {
            return;
        }
        gm0.j1.u().c().w(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.U6(274528, appChooserUI.G, appChooserUI.f191346t), appChooserUI.A.f191028d.activityInfo.packageName);
        com.tencent.mm.pluginsdk.ui.tools.f.h(appChooserUI.G, appChooserUI.f191346t);
        appChooserUI.X6(-1, appChooserUI.A.f191028d.activityInfo.packageName, true);
    }
}
