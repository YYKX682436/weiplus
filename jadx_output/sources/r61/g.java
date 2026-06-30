package r61;

/* loaded from: classes9.dex */
public class g extends c01.l implements com.tencent.mm.modelbase.i1 {
    @Override // c01.l
    public com.tencent.mm.storage.f9 b(com.tencent.mm.modelbase.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (g17 == null || g17.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardMsgExtension", "possible friend msg : content is null");
            return null;
        }
        com.tencent.mm.storage.y8 i17 = com.tencent.mm.storage.y8.i(g17);
        if (j4Var.f377560g == 66) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).cj(i17.A);
        }
        java.lang.String str4 = i17.f196358a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str4 == null) {
            str4 = "";
        }
        if (str4.length() > 0) {
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            r0Var.f70529a = i17.f196358a;
            r0Var.f70530b = 3;
            r0Var.f70534f = 1;
            r0Var.f70533e = i17.f196379v;
            r0Var.f70532d = i17.f196380w;
            r0Var.f70537i = -1;
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        }
        return super.b(p0Var, str, str2, str3);
    }
}
