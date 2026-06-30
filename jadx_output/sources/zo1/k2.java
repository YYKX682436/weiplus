package zo1;

/* loaded from: classes5.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI f474665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f474666e;

    public k2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageDeleteConfirmUI packageDeleteConfirmUI, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f474665d = packageDeleteConfirmUI;
        this.f474666e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeletePackageOnlySheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("PackageDeleteConfirmUI", "[showDeletePackageOnlySheet] hide confirm view");
        this.f474665d.f92836n++;
        this.f474666e.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageDeleteConfirmUI$showDeletePackageOnlySheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
