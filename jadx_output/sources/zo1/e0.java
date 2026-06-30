package zo1;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474588d;

    public e0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        this.f474588d = checkPackageContentUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$loadConvDataAndSetupView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.post(new zo1.d0(this.f474588d));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$loadConvDataAndSetupView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
