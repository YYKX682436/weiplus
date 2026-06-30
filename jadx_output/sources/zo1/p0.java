package zo1;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI f474727d;

    public p0(com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI) {
        this.f474727d = checkPackageContentUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.W);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 9L;
        roamBackupRecoverReport28098Struct.f60067e = 5L;
        roamBackupRecoverReport28098Struct.k();
        int i17 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.f92798w;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = this.f474727d;
        checkPackageContentUI.getClass();
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(checkPackageContentUI, 0, 0, false);
        android.view.View inflate = android.view.LayoutInflater.from(checkPackageContentUI).inflate(com.tencent.mm.R.layout.f488710dq1, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.riu);
        zo1.w wVar = checkPackageContentUI.f92807p;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.x()) {
            textView.setText(com.tencent.mm.R.string.mfg);
        } else {
            textView.setText(com.tencent.mm.R.string.mfi);
        }
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.ris)).setOnClickListener(new zo1.r0(z2Var));
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.rit)).setOnClickListener(new zo1.s0(z2Var, checkPackageContentUI));
        z2Var.k(inflate, 0, 0);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
