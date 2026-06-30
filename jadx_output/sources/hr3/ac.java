package hr3;

/* loaded from: classes11.dex */
public class ac implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f283396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.PermissionSettingUI f283397b;

    public ac(com.tencent.mm.plugin.profile.ui.PermissionSettingUI permissionSettingUI, boolean z17) {
        this.f283397b = permissionSettingUI;
        this.f283396a = z17;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        android.content.res.Resources resources;
        int i17;
        gr3.g gVar;
        com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = new com.tencent.mm.autogen.events.SnsPermissionNotifyEvent();
        am.jw jwVar = snsPermissionNotifyEvent.f54827g;
        jwVar.getClass();
        jwVar.f7102a = true;
        com.tencent.mm.plugin.profile.ui.PermissionSettingUI activity = this.f283397b;
        java.lang.String str = activity.f153749n;
        jwVar.f7103b = str;
        boolean U6 = activity.U6(str, 5L);
        jwVar.f7104c = U6;
        java.lang.String str2 = activity.f153749n;
        int i18 = U6 ? 2 : 1;
        activity.getClass();
        if (i18 == 1) {
            activity.f153751p = true;
            activity.f153752q = false;
        } else {
            activity.f153751p = false;
            activity.f153752q = false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent();
        am.oo ooVar = postSnsTagMemberOptionEvent.f54621g;
        ooVar.f7570e = linkedList;
        ooVar.f7566a = i18;
        ooVar.f7567b = 5L;
        ooVar.f7568c = activity.f153754s;
        postSnsTagMemberOptionEvent.e();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = activity.f153748m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activity.f153748m = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), activity.getString(com.tencent.mm.R.string.f490960bd4), true, true, null);
        snsPermissionNotifyEvent.e();
        com.tencent.mm.plugin.profile.p2.Bi(activity.getIntent(), this.f283396a ? 13 : 22, U6 ? 2 : 3, activity.f153749n);
        boolean z18 = !U6;
        com.tencent.mm.storage.z3 z3Var = activity.f153750o;
        if (z3Var == null || (gVar = activity.f153756u) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPermissionUI", "ct is null in method reportWithModifySnsBlackPermission");
        } else {
            gVar.f274864e = z18 ? gr3.j.f274884i : gr3.j.f274886n;
            gVar.f274865f = z3Var.y2();
            activity.f153756u.f274866g = activity.f153750o.x2();
            gr3.g gVar2 = activity.f153756u;
            gVar2.f274867h = z18;
            gVar2.c();
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        ir3.e eVar = (ir3.e) pf5.z.f353948a.a(activity).a(ir3.e.class);
        if (z17) {
            resources = activity.getResources();
            i17 = com.tencent.mm.R.string.i8l;
        } else {
            resources = activity.getResources();
            i17 = com.tencent.mm.R.string.i8m;
        }
        eVar.setValue("not_see_sns_permission_tv_key", resources.getString(i17));
    }
}
