package mo1;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f330321e;

    public p0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, qo1.f0 f0Var) {
        this.f330320d = roamLiteTaskDetailUI;
        this.f330321e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateErrorState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "restart task, pkgId=" + this.f330320d.f92713d);
        this.f330321e.start();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateErrorState$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
