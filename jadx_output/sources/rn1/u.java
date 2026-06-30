package rn1;

/* loaded from: classes12.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397629d;

    public u(rn1.a0 a0Var) {
        this.f397629d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(13735, 23, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
        qn1.c.i().j().e(4);
        qn1.c.i().e().f309609a = 22;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f397629d.a(22);
        g0Var.idkeyStat(400L, 16L, 1L, false);
        xn1.b.f455454a.a(6, 1, qn1.c.o().f364969i);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
