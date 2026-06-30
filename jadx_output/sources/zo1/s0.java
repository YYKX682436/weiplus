package zo1;

/* loaded from: classes5.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f474763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474764e;

    public s0(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        this.f474763d = z2Var;
        this.f474764e = checkPackageContentUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f474763d.B();
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474764e;
        zo1.w wVar = checkPackageContentUI.f92807p;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.x()) {
            com.tencent.mars.xlog.Log.i(checkPackageContentUI.f92799e, "Before deleteBackupDataAsync, delete all conversation");
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.d(checkPackageContentUI.f92800f, new java.util.ArrayList(), true);
        } else {
            java.util.ArrayList<zo1.s> arrayList2 = checkPackageContentUI.f92812u;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (zo1.s sVar : arrayList2) {
                java.lang.String str = sVar.f474762c ? sVar.f474760a : null;
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            com.tencent.mars.xlog.Log.i(checkPackageContentUI.f92799e, "Before deleteBackupDataAsync, selectedList.size=" + arrayList3.size());
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.d(checkPackageContentUI.f92800f, arrayList3, false);
        }
        android.content.Intent intent = new android.content.Intent(checkPackageContentUI, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI.class);
        intent.putExtra("expandCard", true);
        intent.putExtra("packageId", checkPackageContentUI.f92800f);
        intent.addFlags(67108864);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI2 = this.f474764e;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(intent);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(checkPackageContentUI2, arrayList4.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        checkPackageContentUI2.startActivity((android.content.Intent) arrayList4.get(0));
        yj0.a.f(checkPackageContentUI2, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        checkPackageContentUI.b7();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$showDeleteBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
