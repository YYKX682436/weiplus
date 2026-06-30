package mo1;

/* loaded from: classes5.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f330349e;

    public y0(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, com.tencent.wechat.aff.affroam.n0 n0Var) {
        this.f330348d = roamLiteTaskDetailUI;
        this.f330349e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "Remove task and close activity. pkgId=" + this.f330348d.f92713d + ", state=" + this.f330349e);
        this.f330348d.V6();
        ((ku5.t0) ku5.t0.f312615d).k(new mo1.x0(this.f330348d), 150L);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
