package i13;

/* loaded from: classes8.dex */
public final class f extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f287280m = "MicroMsg.CgiGetForceNotifyInfoList";

    public f() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bg3();
        lVar.f70665b = new r45.cg3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getforcepush";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.pay.p1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.cg3 resp = (r45.cg3) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        boolean a17 = gm0.j1.a();
        java.lang.String str2 = this.f287280m;
        if (!a17) {
            com.tencent.mars.xlog.Log.e(str2, "account nor ready");
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, "CgiGetForceNotifyInfoList errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e(str2, "report fail");
            return;
        }
        java.util.LinkedList linkedList = resp.f371540d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.k43 k43Var = (r45.k43) it.next();
                i13.j jVar = new i13.j();
                jVar.field_UserName = k43Var.f378361i;
                jVar.field_ExpiredTime = k43Var.f378358f * 1000;
                jVar.field_CreateTime = k43Var.f378357e * 1000;
                int i19 = 0;
                if (!(c01.id.c() >= jVar.field_ExpiredTime)) {
                    i19 = 1;
                }
                jVar.field_Status = i19;
                jVar.field_ExtInfo = k43Var.f378362m;
                jVar.field_Description = k43Var.f378359g;
                jVar.field_UserIcon = k43Var.f378360h;
                jVar.field_ForcePushId = k43Var.f378356d;
                com.tencent.mars.xlog.Log.i(str2, "ret:%s item:%s", java.lang.Boolean.valueOf(j13.a.f297177d.replace(jVar)), jVar);
            }
        }
    }
}
