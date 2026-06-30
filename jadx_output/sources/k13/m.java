package k13;

/* loaded from: classes8.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld f303249a;

    public m(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld) {
        this.f303249a = forceNotifyAcceptUIOld;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUIOld forceNotifyAcceptUIOld = this.f303249a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i(forceNotifyAcceptUIOld.f137332d, "get accept info successfully");
            r45.k43 k43Var = ((r45.su5) fVar.f70618d).f385976d;
            i13.j jVar = new i13.j();
            jVar.field_UserName = k43Var.f378361i;
            jVar.field_ExpiredTime = k43Var.f378358f * 1000;
            jVar.field_CreateTime = k43Var.f378357e * 1000;
            jVar.field_Status = !((c01.id.c() > jVar.field_ExpiredTime ? 1 : (c01.id.c() == jVar.field_ExpiredTime ? 0 : -1)) >= 0) ? 1 : 0;
            jVar.field_ExtInfo = k43Var.f378362m;
            jVar.field_Description = k43Var.f378359g;
            jVar.field_UserIcon = k43Var.f378360h;
            jVar.field_ForcePushId = k43Var.f378356d;
            com.tencent.mars.xlog.Log.i(forceNotifyAcceptUIOld.f137332d, " item:%s", jVar);
            android.widget.TextView textView = (android.widget.TextView) forceNotifyAcceptUIOld.findViewById(com.tencent.mm.R.id.f484050cu2);
            java.lang.String str = jVar.field_Description;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        } else {
            dp.a.makeText(forceNotifyAcceptUIOld, fVar.f70617c, 0).show();
            forceNotifyAcceptUIOld.finish();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = forceNotifyAcceptUIOld.f137334f;
        if (u3Var == null) {
            return null;
        }
        u3Var.dismiss();
        return jz5.f0.f302826a;
    }
}
