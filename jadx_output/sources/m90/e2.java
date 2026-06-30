package m90;

/* loaded from: classes5.dex */
public class e2 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        r45.j4 j4Var;
        ih3.e eVar = (ih3.e) i95.n0.c(ih3.e.class);
        eVar.getClass();
        if (p0Var == null || (j4Var = p0Var.f70726a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SysMsgTemplateImp", "hy: addMsgInfo or addMsgInfo.addMsg is null! should not happen");
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        java.lang.String g18 = x51.j1.g(j4Var.f377558e);
        java.lang.String g19 = x51.j1.g(j4Var.f377559f);
        java.lang.String r17 = c01.z1.r();
        if (r17 == null || !r17.equals(g18)) {
            g19 = g18;
        }
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g18, j4Var.f377568r);
        boolean z17 = o27.getMsgId() > 0;
        o27.o1(j4Var.f377568r);
        if (!p0Var.f70727b || !p0Var.f70729d) {
            o27.e1(c01.w9.m(g18, j4Var.f377565o));
        }
        o27.setType(570425393);
        o27.d1(g17);
        o27.j1(0);
        o27.u1(g19);
        o27.u3(j4Var.f377566p);
        c01.w9.n(o27, p0Var);
        if (z17) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j4Var.f377568r, o27);
        } else {
            c01.w9.x(o27);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new ih3.h(eVar, str, map, p0Var));
    }
}
