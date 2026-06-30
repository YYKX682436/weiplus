package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.l8 f196293a;

    public w(com.tencent.mm.storage.l8 l8Var) {
        r01.q3.rj();
        this.f196293a = l8Var;
    }

    public void a(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l8 l8Var) {
        boolean z17;
        if (l4Var == null || l8Var == null || !c01.e2.G(l4Var.h1()) || com.tencent.mm.sdk.platformtools.t8.K0(l4Var.W0()) || com.tencent.mm.storage.z3.k4(l4Var.W0()) || com.tencent.mm.storage.z3.B4(l4Var.W0())) {
            return;
        }
        java.lang.String W0 = l4Var.W0();
        boolean z18 = false;
        if ((W0 != null && W0.equalsIgnoreCase("photoaccounts")) || com.tencent.mm.storage.z3.X3(l4Var.W0())) {
            return;
        }
        com.tencent.mm.storage.m4 m4Var = (com.tencent.mm.storage.m4) l8Var;
        com.tencent.mm.storage.l4 p17 = m4Var.p(l4Var.W0());
        boolean z19 = (l4Var.W0().equals("officialaccounts") || l4Var.W0().equals("service_officialaccounts")) ? false : true;
        if (p17 == null) {
            p17 = new com.tencent.mm.storage.l4(l4Var.W0());
            if (z19) {
                p17.c2(2097152);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z19 && p17.u0() == 0) {
            p17.c2(2097152);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "enterprise cvs count is %d", java.lang.Integer.valueOf(p17.d1()));
        java.lang.String y17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().y(l4Var.W0());
        com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(y17);
        if (q57 == null || q57.getMsgId() <= 0) {
            p17.f2();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "lastOfMsg is null or MsgId <= 0, lastConvBiz is %s", y17);
        } else {
            p17.h2(q57);
            p17.l1(q57.Q0() + ":" + q57.j());
            p17.S1(java.lang.Integer.toString(q57.getType()));
            if (m4Var.w() != null) {
                com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
                com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
                com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                q57.u1(l4Var.W0());
                q57.d1(p17.j());
                qm.a0.d(q57, pString, pString2, pInt, true);
                p17.o1(pString.value);
                p17.p1(pString2.value);
                p17.K1(pInt.value);
            }
        }
        if (z19 && m4Var.u(p17.h1()) <= 0) {
            z18 = true;
        }
        if (z18) {
            m4Var.k(p17.h1());
        } else if (z17) {
            m4Var.G(p17);
        } else {
            m4Var.W(p17, p17.h1());
        }
    }

    public void b(java.lang.String str) {
        if (str != null && c01.e2.G(str) && r01.z.j(str)) {
            com.tencent.mm.storage.l8 l8Var = this.f196293a;
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) l8Var).p(str);
            if (p17 == null) {
                return;
            }
            com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().y(str));
            if (q57 == null || q57.getMsgId() <= 0) {
                return;
            }
            p17.h2(q57);
            p17.l1(q57.Q0() + ":" + q57.j());
            p17.S1(java.lang.Integer.toString(q57.getType()));
            if (((com.tencent.mm.storage.m4) l8Var).w() != null) {
                com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
                com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
                com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                q57.u1(str);
                q57.d1(p17.j());
                qm.a0.d(q57, pString, pString2, pInt, true);
                p17.o1(pString.value);
                p17.p1(pString2.value);
                p17.K1(pInt.value);
            } else {
                p17.f2();
            }
            ((com.tencent.mm.storage.m4) l8Var).W(p17, p17.h1());
        }
    }
}
