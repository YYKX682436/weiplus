package mo1;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final mo1.v f330338d = new mo1.v();

    public v() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.wechat.aff.affroam.g pkg = (com.tencent.wechat.aff.affroam.g) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(pkg, "pkg");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.class);
        intent.addFlags(268435456);
        intent.putExtra("packageId", pkg.f215829d);
        intent.putExtra("dummyAsRestore", !booleanValue);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLitePackageListUI$FillRootView$1$2$2", "invoke", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/backup/roambackup/roamlite/RoamLitePackageListUI$FillRootView$1$2$2", "invoke", "(Lcom/tencent/wechat/aff/affroam/AffRoamBackupPackage;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
