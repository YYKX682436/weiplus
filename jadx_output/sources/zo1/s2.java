package zo1;

/* loaded from: classes5.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474766d;

    public s2(com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI) {
        this.f474766d = packageManagerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.tencent.mm.plugin.backup.roambackup.y1.L);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 8L;
        roamBackupRecoverReport28098Struct.f60067e = 2L;
        roamBackupRecoverReport28098Struct.k();
        int i17 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI.f92837m;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI = this.f474766d;
        packageManagerUI.getClass();
        wo1.i1 i1Var = new wo1.i1(packageManagerUI);
        android.view.View inflate = android.view.LayoutInflater.from(packageManagerUI.getContext()).inflate(com.tencent.mm.R.layout.f488709dq0, (android.view.ViewGroup) null);
        com.tencent.mm.plugin.backup.roambackup.ui.component.DialogActionBar dialogActionBar = (com.tencent.mm.plugin.backup.roambackup.ui.component.DialogActionBar) inflate.findViewById(com.tencent.mm.R.id.rie);
        dialogActionBar.setTitle(com.tencent.mm.R.string.f492865my2);
        dialogActionBar.setCancelClose(new zo1.m2(i1Var));
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) inflate.findViewById(com.tencent.mm.R.id.f483603rf2);
        go1.d dVar = go1.d.f273944a;
        com.tencent.wechat.aff.affroam.g gVar = packageManagerUI.f92839e;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        java.lang.String a17 = dVar.a(gVar);
        mMClearEditText.setHint(a17);
        com.tencent.wechat.aff.affroam.g gVar2 = packageManagerUI.f92839e;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        java.lang.String str = gVar2.f215831f;
        kotlin.jvm.internal.o.f(str, "getPackageName(...)");
        if (!r26.i0.y(str, "WXGBACKUPPACKAGEPREFIX_", false)) {
            char[] charArray = a17.toCharArray();
            kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
            mMClearEditText.setText(charArray, 0, charArray.length);
        }
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f483602rf1)).setOnClickListener(new zo1.p2(mMClearEditText, packageManagerUI, i1Var));
        i1Var.setContentView(inflate);
        android.view.Window window = i1Var.getWindow();
        kotlin.jvm.internal.o.d(window);
        window.setSoftInputMode(52);
        i1Var.show();
        mMClearEditText.requestFocus();
        mMClearEditText.setSelection(mMClearEditText.getText().length());
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
