package hr3;

/* loaded from: classes11.dex */
public class zb implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f284240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI f284241b;

    public zb(com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI, boolean z17) {
        this.f284241b = permissionSettingUI;
        this.f284240a = z17;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        android.content.res.Resources resources;
        int i17;
        com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
        am.jw jwVar = snsPermissionNotifyEvent.f54827g;
        jwVar.getClass();
        jwVar.f7102a = false;
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI = this.f284241b;
        jwVar.f7103b = permissionSettingUI.f153749n;
        snsPermissionNotifyEvent.e();
        boolean x27 = permissionSettingUI.f153750o.x2();
        boolean z18 = this.f284240a;
        if (x27) {
            c01.e2.x0(permissionSettingUI.f153750o, false, true);
            com.tencent.mm.plugin.profile.p2.Bi(permissionSettingUI.getIntent(), z18 ? 12 : 21, 2, permissionSettingUI.f153749n);
            permissionSettingUI.V6(false);
        } else {
            com.tencent.mm.plugin.profile.p2.Bi(permissionSettingUI.getIntent(), z18 ? 12 : 21, 3, permissionSettingUI.f153749n);
            c01.e2.x0(permissionSettingUI.f153750o, true, true);
            permissionSettingUI.V6(true);
        }
        permissionSettingUI.W6();
        ir3.e eVar = (ir3.e) pf5.z.f353948a.a(permissionSettingUI).a(ir3.e.class);
        if (z17) {
            resources = permissionSettingUI.getResources();
            i17 = com.tencent.mm.R.string.i8l;
        } else {
            resources = permissionSettingUI.getResources();
            i17 = com.tencent.mm.R.string.i8m;
        }
        eVar.setValue("not_allow_see_sns_permission_cb_key", resources.getString(i17));
    }
}
