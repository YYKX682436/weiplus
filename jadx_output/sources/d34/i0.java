package d34;

/* loaded from: classes11.dex */
public class i0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        ((c34.h0) i95.n0.c(c34.h0.class)).getClass();
        gm0.j1.b().c();
        ((c34.h0) i95.n0.c(c34.h0.class)).getClass();
        gm0.j1.b().c();
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.shake.$type"), 0) != 1) {
            return;
        }
        c34.t tVar = new c34.t();
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.shake.shaketv.msgtype"), 0);
        if (P != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMsgMgr", "Unknown subType:" + P);
            return;
        }
        tVar.field_type = 1;
        tVar.field_subtype = P;
        tVar.field_svrid = p0Var.f70726a.f377568r;
        tVar.field_createtime = com.tencent.mm.sdk.platformtools.t8.i1();
        tVar.field_tag = (java.lang.String) d17.get(".sysmsg.shake.shaketv.jumpurl");
        tVar.field_status = 0;
        tVar.field_title = (java.lang.String) d17.get(".sysmsg.shake.shaketv.title");
        tVar.field_thumburl = (java.lang.String) d17.get(".sysmsg.shake.shaketv.iconurl");
        tVar.field_desc = (java.lang.String) d17.get(".sysmsg.shake.shaketv.desc");
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.shake.shaketv.pid");
        if (str == null) {
            str = "";
        }
        tVar.field_reserved1 = str;
        c34.h0.Ri().insert(tVar);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
