package hr3;

/* loaded from: classes11.dex */
public class fc implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 f283551a;

    public fc(com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2) {
        this.f283551a = permissionSettingUI2;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
        am.jw jwVar = snsPermissionNotifyEvent.f54827g;
        jwVar.getClass();
        jwVar.f7102a = false;
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2 = this.f283551a;
        jwVar.f7103b = permissionSettingUI2.f153767o;
        snsPermissionNotifyEvent.e();
        if (permissionSettingUI2.f153768p.x2()) {
            c01.e2.x0(permissionSettingUI2.f153768p, false, true);
            com.tencent.mm.plugin.profile.p2.Bi(permissionSettingUI2.getIntent(), 21, 2, permissionSettingUI2.f153767o);
            permissionSettingUI2.V6(false);
        } else {
            com.tencent.mm.plugin.profile.p2.Bi(permissionSettingUI2.getIntent(), 21, 3, permissionSettingUI2.f153767o);
            c01.e2.x0(permissionSettingUI2.f153768p, true, true);
            permissionSettingUI2.V6(true);
        }
        permissionSettingUI2.X6();
    }
}
