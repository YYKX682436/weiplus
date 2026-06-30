package cw1;

/* loaded from: classes.dex */
public final class o7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI f223209d;

    public o7(com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI) {
        this.f223209d = storageDisableAlertUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlertUI", "Go to CleanNewUI");
        java.lang.String n07 = com.tencent.mm.sdk.platformtools.t8.n0(com.tencent.mm.sdk.platformtools.x2.f193071a);
        jx3.f fVar = jx3.f.INSTANCE;
        com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI = this.f223209d;
        fVar.d(25984, 203, storageDisableAlertUI.f95802f, n07, "", java.lang.Double.valueOf(storageDisableAlertUI.f95800d));
        android.content.Intent putExtra = new android.content.Intent(storageDisableAlertUI, (java.lang.Class<?>) com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.class).putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI2 = this.f223209d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(putExtra);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(storageDisableAlertUI2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        storageDisableAlertUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(storageDisableAlertUI2, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        storageDisableAlertUI.overridePendingTransition(0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
