package qb2;

/* loaded from: classes5.dex */
public final class v1 implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        java.lang.Object obj = addMsgInfo.f70732g;
        if ((obj instanceof r45.w3) && addMsgInfo.f70733h == 1) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddBypMsg");
            java.lang.String str2 = ((r45.w3) obj).f388827e;
            com.tencent.mars.xlog.Log.i("FinderPrivateSysMsgConsumer", java.lang.String.valueOf(str));
            r45.j4 j4Var = addMsgInfo.f70726a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(j4Var != null ? j4Var.f377561h : null))) {
                com.tencent.mars.xlog.Log.w("FinderPrivateSysMsgConsumer", "msg content is null");
                return null;
            }
            java.lang.String g17 = x51.j1.g(j4Var != null ? j4Var.f377558e : null);
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j4Var != null ? j4Var.f377568r : 0L);
            o27.o1(j4Var != null ? j4Var.f377568r : 0L);
            o27.e1(c01.w9.m(g17, j4Var != null ? j4Var.f377565o : 0L));
            o27.setType(10000);
            o27.d1((java.lang.String) values.get(".sysmsg.SysMsgContent"));
            o27.j1(0);
            o27.u1(str2);
            o27.u3(j4Var != null ? j4Var.f377566p : null);
            o27.l1(o27.F & (-129));
            c01.w9.x(o27);
        }
        return null;
    }
}
