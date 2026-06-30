package rn1;

/* loaded from: classes12.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397630d;

    public v(rn1.a0 a0Var) {
        this.f397630d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "onUpdateUIProgress user click start merge.");
        if (qn1.c.i().k().g() || qn1.c.i().k().g()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13735, 27, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
            qn1.c.i().k().j();
            yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            qn1.c.i().e().f309609a = -22;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f397630d.a(-22);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 64L, 1L, false);
            yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
