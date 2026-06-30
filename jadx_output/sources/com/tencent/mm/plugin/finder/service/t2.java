package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class t2 implements c01.p8 {
    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, o8Var);
        }
    }

    @Override // c01.p8
    public void d() {
    }

    @Override // c01.p8
    public void e(java.lang.String str) {
    }

    @Override // c01.p8
    public void f(java.lang.String str) {
    }

    @Override // c01.p8
    public void g(java.lang.String str, java.lang.String str2, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, o8Var);
        }
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
    }

    public final void i(java.lang.String str, c01.o8 o8Var) {
        java.lang.String str2;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = str;
        if (com.tencent.mm.storage.z3.V3(str)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            h0Var.f310123d = com.tencent.mm.plugin.finder.service.m4.f126148a.h(str);
            str2 = str;
        } else {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("Finder.GetContactInterceptor", "[getContact] sessionId=" + str2 + " talker=" + ((java.lang.String) h0Var.f310123d));
        if (com.tencent.mm.storage.z3.S3((java.lang.String) h0Var.f310123d)) {
            ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ri((java.lang.String) h0Var.f310123d, new com.tencent.mm.plugin.finder.service.o2(str, h0Var, o8Var));
            return;
        }
        if (com.tencent.mm.storage.z3.U3((java.lang.String) h0Var.f310123d)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).cj((java.lang.String) h0Var.f310123d, com.tencent.mm.plugin.finder.service.m4.f126148a.c(str, 3), new com.tencent.mm.plugin.finder.service.q2(str, h0Var, o8Var));
            return;
        }
        if (com.tencent.mm.storage.z3.T3((java.lang.String) h0Var.f310123d)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String c17 = com.tencent.mm.plugin.finder.service.m4.f126148a.c(str, 2);
            zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
            java.lang.String str3 = (java.lang.String) h0Var.f310123d;
            com.tencent.mm.plugin.finder.service.s2 s2Var = new com.tencent.mm.plugin.finder.service.s2(str, h0Var, o8Var);
            com.tencent.mm.plugin.finder.service.s1 s1Var = (com.tencent.mm.plugin.finder.service.s1) e6Var;
            s1Var.getClass();
            if (str3 == null || str3.length() == 0) {
                com.tencent.mars.xlog.Log.e("Finder.ContactService", "username is null.");
                s2Var.a(new ya2.b2());
                return;
            }
            if (c17.length() == 0) {
                com.tencent.mars.xlog.Log.e("Finder.ContactService", "sessionId is null.");
                s2Var.a(new ya2.b2());
                return;
            }
            ya2.b2 y07 = ((com.tencent.mm.plugin.finder.storage.ma0) ((jz5.n) s1Var.f126198f).getValue()).y0(str3);
            if (y07 != null) {
                if (!(y07.w0().length() == 0) && !com.tencent.mm.plugin.finder.service.s1.pj(s1Var, y07, false, 0L, 6, null)) {
                    com.tencent.mars.xlog.Log.i("Finder.ContactService", "[getFinderMsgAliasContact] local completed! result=" + y07.D0() + '=' + y07.w0());
                    s2Var.a(y07);
                    return;
                }
            }
            if (!s1Var.qj(y07) || com.tencent.mm.plugin.finder.service.s1.pj(s1Var, y07, false, 0L, 6, null)) {
                s1Var.Zi().e(new com.tencent.mm.plugin.finder.service.j1(s2Var));
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderMsgAliasContact] isContactRetryLimited contact=");
            sb6.append(y07 != null ? y07.D0() : null);
            com.tencent.mars.xlog.Log.e("Finder.ContactService", sb6.toString());
            if (y07 == null) {
                y07 = new ya2.b2(str3);
            }
            s2Var.a(y07);
        }
    }
}
