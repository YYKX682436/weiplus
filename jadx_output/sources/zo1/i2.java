package zo1;

/* loaded from: classes5.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI f474642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f474643e;

    public i2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f474642d = packageDeleteConfirmUI;
        this.f474643e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeleteBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("PackageDeleteConfirmUI", "[showDeleteBottomSheet] on cancel button clicked");
        this.f474642d.f92836n++;
        this.f474643e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeleteBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
