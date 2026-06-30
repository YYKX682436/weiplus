package xo1;

/* loaded from: classes.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI f455761d;

    public m(com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI) {
        this.f455761d = newPcDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f455761d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/device/NewPcDeviceUI$updateView$delay$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
