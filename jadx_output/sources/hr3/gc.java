package hr3;

/* loaded from: classes11.dex */
public class gc implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 f283586a;

    public gc(com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2) {
        this.f283586a = permissionSettingUI2;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        gr3.g gVar;
        com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
        am.jw jwVar = snsPermissionNotifyEvent.f54827g;
        jwVar.getClass();
        jwVar.f7102a = true;
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI2 permissionSettingUI2 = this.f283586a;
        java.lang.String str = permissionSettingUI2.f153767o;
        jwVar.f7103b = str;
        boolean U6 = permissionSettingUI2.U6(str, 5L);
        jwVar.f7104c = U6;
        java.lang.String str2 = permissionSettingUI2.f153767o;
        int i17 = U6 ? 2 : 1;
        permissionSettingUI2.getClass();
        if (i17 == 1) {
            permissionSettingUI2.f153769q = true;
            permissionSettingUI2.f153770r = false;
        } else {
            permissionSettingUI2.f153769q = false;
            permissionSettingUI2.f153770r = false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent();
        am.oo ooVar = postSnsTagMemberOptionEvent.f54621g;
        ooVar.f7570e = linkedList;
        ooVar.f7566a = i17;
        ooVar.f7567b = 5L;
        ooVar.f7568c = permissionSettingUI2.f153772t;
        postSnsTagMemberOptionEvent.e();
        permissionSettingUI2.f153766n = db5.e1.Q(permissionSettingUI2, permissionSettingUI2.getString(com.tencent.mm.R.string.f490573yv), permissionSettingUI2.getString(com.tencent.mm.R.string.f490960bd4), true, true, null);
        snsPermissionNotifyEvent.e();
        com.tencent.mm.plugin.profile.p2.Bi(permissionSettingUI2.getIntent(), 22, U6 ? 2 : 3, permissionSettingUI2.f153767o);
        boolean z18 = !U6;
        com.tencent.mm.storage.z3 z3Var = permissionSettingUI2.f153768p;
        if (z3Var == null || (gVar = permissionSettingUI2.f153774v) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method reportWithModifySnsBlackPermission");
            return;
        }
        gVar.f274864e = z18 ? gr3.j.f274884i : gr3.j.f274886n;
        gVar.f274865f = z3Var.y2();
        permissionSettingUI2.f153774v.f274866g = permissionSettingUI2.f153768p.x2();
        gr3.g gVar2 = permissionSettingUI2.f153774v;
        gVar2.f274867h = z18;
        gVar2.c();
    }
}
