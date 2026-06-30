package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191820d;

    public p(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191820d = appChooserUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.pm.ResolveInfo resolveInfo;
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191820d;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = appChooserUI.A;
        if (xVar == null || (resolveInfo = xVar.f191028d) == null) {
            return;
        }
        appChooserUI.X6(-1, resolveInfo.activityInfo.packageName, false);
    }
}
