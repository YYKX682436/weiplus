package hr3;

/* loaded from: classes11.dex */
public class ec implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 f283521d;

    public ec(com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2) {
        this.f283521d = permissionSettingUI2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2 = this.f283521d;
        if (permissionSettingUI2.f153768p.y2()) {
            com.tencent.mm.storage.z3 z3Var = permissionSettingUI2.f153768p;
            z3Var.setType(z3Var.getType() & (-8388609));
            c01.e2.j0(permissionSettingUI2.f153768p);
            permissionSettingUI2.X6();
            com.tencent.mm.plugin.profile.p2.Bi(permissionSettingUI2.getIntent(), 20, 2, permissionSettingUI2.f153767o);
            permissionSettingUI2.W6(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
