package r21;

/* loaded from: classes11.dex */
public class t extends c01.l implements com.tencent.mm.modelbase.i1 {
    @Override // c01.l
    public com.tencent.mm.storage.f9 b(com.tencent.mm.modelbase.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (g17 == null || g17.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageExtension", "possible friend msg : content is null");
            return null;
        }
        com.tencent.mm.storage.y8 i18 = com.tencent.mm.storage.y8.i(g17);
        if ((i18.f196365h != null || i18.f196366i != null) && ((i17 = i18.f196364g) == 10 || i17 == 11)) {
            com.tencent.mm.autogen.events.FMessageMobileFilterEvent fMessageMobileFilterEvent = new com.tencent.mm.autogen.events.FMessageMobileFilterEvent();
            java.lang.String str4 = i18.f196365h;
            am.j9 j9Var = fMessageMobileFilterEvent.f54227g;
            j9Var.f7016a = str4;
            j9Var.f7017b = i18.f196366i;
            fMessageMobileFilterEvent.e();
            if (fMessageMobileFilterEvent.f54228h.f7136a) {
                return null;
            }
        }
        if (i18.f196367j > 0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i18.f196367j, i18.f196363f);
        }
        java.lang.String str5 = i18.f196358a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str5 == null) {
            str5 = "";
        }
        if (str5.length() > 0) {
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            r0Var.f70529a = i18.f196358a;
            r0Var.f70530b = 3;
            r0Var.f70534f = 1;
            r0Var.f70533e = i18.f196379v;
            r0Var.f70532d = i18.f196380w;
            r0Var.f70537i = -1;
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        }
        com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
        p7Var.field_createTime = r21.v.b(str, j4Var.f377565o);
        p7Var.field_isSend = 0;
        p7Var.field_msgContent = x51.j1.g(j4Var.f377561h);
        p7Var.field_svrId = j4Var.f377568r;
        p7Var.field_talker = i18.f196358a;
        p7Var.field_type = 0;
        com.tencent.mm.storage.m7 L0 = r21.w.wi().L0(p7Var.field_talker);
        if (L0 != null) {
            java.lang.String str6 = p7Var.field_talker;
            java.lang.String str7 = L0.field_talker;
            p7Var.field_encryptTalker = str6;
            p7Var.field_talker = str7;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(p7Var.field_talker, true);
        if (n17 != null && n17.r2() && n17.E2 > 0) {
            return null;
        }
        r21.w.Ai().insert(p7Var);
        return null;
    }
}
