package wo1;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f447903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f447904g;

    public b0(qo1.f0 f0Var, wo1.a1 a1Var, com.tencent.wechat.aff.affroam.g gVar, po1.d dVar) {
        this.f447901d = f0Var;
        this.f447902e = a1Var;
        this.f447903f = gVar;
        this.f447904g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f447901d.o()) {
            qo1.f0 f0Var = this.f447901d;
            synchronized (f0Var) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "clearConsecutiveFailure, pkgId=" + f0Var.f365483i);
                com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().l(f0Var.f365483i, 0L);
            }
        }
        this.f447902e.p(this.f447903f, this.f447901d, this.f447904g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
