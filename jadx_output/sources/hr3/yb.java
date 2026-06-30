package hr3;

/* loaded from: classes4.dex */
public class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI f284210d;

    public yb(com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI) {
        this.f284210d = permissionSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI activity = this.f284210d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((bs3.h) pf5.z.f353948a.a(activity).a(bs3.h.class)).O6(false);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
