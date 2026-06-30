package or3;

/* loaded from: classes11.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView f347686d;

    public a(com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView permissionView) {
        this.f347686d = permissionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.mod.permission_view.PermissionView permissionView = this.f347686d;
        if ((permissionView.permission & 8) != 0) {
            permissionView.setTalkOnly(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/permission_view/PermissionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
