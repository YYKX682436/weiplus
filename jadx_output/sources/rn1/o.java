package rn1;

/* loaded from: classes12.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397623d;

    public o(rn1.a0 a0Var) {
        this.f397623d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn1.c.i().j().e(2);
        qn1.c.i().e().f309609a = 12;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        rn1.a0 a0Var = this.f397623d;
        a0Var.a(12);
        a0Var.f397612a.c7();
        qn1.c.i().m().d();
        qn1.c.i().m().e();
        qn1.c.i().m().c(true);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(400L, 7L, 1L, false);
        g0Var.d(13735, 9, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
