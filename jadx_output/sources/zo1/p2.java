package zo1;

/* loaded from: classes5.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMClearEditText f474732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f474734f;

    public p2(com.tencent.mm.ui.base.MMClearEditText mMClearEditText, com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI, wo1.i1 i1Var) {
        this.f474732d = mMClearEditText;
        this.f474733e = packageManagerUI;
        this.f474734f = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$changePackageName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj = this.f474732d.getText().toString();
        if ((obj.length() > 0) && obj.length() <= 16) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Try to change name from");
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI = this.f474733e;
            com.tencent.wechat.aff.affroam.g gVar = packageManagerUI.f92839e;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            sb6.append(gVar.f215831f);
            sb6.append(" to ");
            sb6.append(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.PackageManagerUI", sb6.toString());
            com.tencent.wechat.aff.affroam.g gVar2 = packageManagerUI.f92839e;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            boolean b17 = kotlin.jvm.internal.o.b(gVar2.f215831f, obj);
            wo1.i1 i1Var = this.f474734f;
            if (b17) {
                i1Var.hide();
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$changePackageName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String string = packageManagerUI.getString(com.tencent.mm.R.string.mvy);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(packageManagerUI, string, false, 3, null);
            com.tencent.wechat.aff.affroam.g gVar3 = packageManagerUI.f92839e;
            if (gVar3 == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            zo1.o2 o2Var = new zo1.o2(f17, packageManagerUI, obj, i1Var);
            com.tencent.wechat.aff.affroam.g gVar4 = new com.tencent.wechat.aff.affroam.g();
            gVar4.parseFrom(gVar3.getData());
            gVar4.f215831f = obj;
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.s(gVar4, o2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$changePackageName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
