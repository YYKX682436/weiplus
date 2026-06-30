package mo1;

/* loaded from: classes5.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f330324e;

    public q0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, qo1.f0 f0Var) {
        this.f330323d = roamLiteTaskDetailUI;
        this.f330324e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateErrorState$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop task, pkgId=");
        com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI = this.f330323d;
        sb6.append(roamLiteTaskDetailUI.f92713d);
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", sb6.toString());
        qo1.j1.f365523a.i(roamLiteTaskDetailUI.f92713d);
        this.f330324e.q(2);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateErrorState$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
