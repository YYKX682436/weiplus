package rn1;

/* loaded from: classes12.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397628d;

    public t(rn1.a0 a0Var) {
        this.f397628d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn1.c.i().h().e();
        qn1.c.i().l().d(true);
        qn1.c.i().e().f309609a = -100;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI = this.f397628d.f397612a;
        boolean z18 = com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.f92529o;
        backupPcUI.W6(1);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
