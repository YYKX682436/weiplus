package cw1;

/* loaded from: classes.dex */
public final class p7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI f223253d;

    public p7(com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI) {
        this.f223253d = storageDisableAlertUI;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI = this.f223253d;
        intent.setClassName(storageDisableAlertUI, "com.tencent.mm.plugin.repairer.ui.RepairerMainUI");
        com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI storageDisableAlertUI2 = this.f223253d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(storageDisableAlertUI2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        storageDisableAlertUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(storageDisableAlertUI2, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        storageDisableAlertUI.finish();
        yj0.a.i(false, this, "com/tencent/mm/plugin/clean/ui/fileindexui/StorageDisableAlertUI$showDialogView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
