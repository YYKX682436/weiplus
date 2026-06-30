package mo1;

/* loaded from: classes5.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI f330267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f330268e;

    public a1(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI, com.tencent.wechat.aff.affroam.n0 n0Var) {
        this.f330267d = roamLiteTaskDetailUI;
        this.f330268e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "Remove task and close activity. pkgId=" + this.f330267d.f92713d + ", state=" + this.f330268e);
        this.f330267d.V6();
        ((ku5.t0) ku5.t0.f312615d).k(new mo1.z0(this.f330267d), 150L);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI$updateStatus$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
