package uo1;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f429548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f429549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f429550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f429551g;

    public d(kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.g0 g0Var, long j17, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f429548d = f0Var;
        this.f429549e = g0Var;
        this.f429550f = j17;
        this.f429551g = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showAutoBackupBottomDialog$3$1$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f429548d.f310116d |= 1;
        kotlin.jvm.internal.g0 g0Var = this.f429549e;
        if (g0Var.f310121d > 0) {
            com.tencent.mars.xlog.Log.i("BackupUIUtils", "[111] clear pause time. restartTime=" + g0Var.f310121d);
            eo1.a aVar = eo1.a.f255545a;
            long j17 = this.f429550f;
            aVar.b(j17, 0L);
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.q(j17);
            g0Var.f310121d = 0L;
        }
        this.f429551g.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showAutoBackupBottomDialog$3$1$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
