package gr1;

/* loaded from: classes11.dex */
public final class h implements rk.e {
    public void b(int i17) {
        java.lang.String c17;
        com.tencent.wechat.iam.biz.l0 l0Var = com.tencent.wechat.iam.biz.l0.f217758c;
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        l0Var.a(c17, 4, gr1.a.f274720a);
    }

    public void c(java.lang.String openid, int i17) {
        java.lang.String c17;
        kotlin.jvm.internal.o.g(openid, "openid");
        if (openid.length() == 0) {
            return;
        }
        r45.ij5 ij5Var = new r45.ij5();
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        ij5Var.f377100d = c17;
        ij5Var.f377101e = i17 == 5 ? r26.n0.Z(openid, "@picfansmsg") : r26.n0.Z(openid, "@bizfansmsg");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 25841;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mp/readfansmsg";
        lVar.f70664a = ij5Var;
        lVar.f70665b = new r45.jj5();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), gr1.b.f274721a);
    }
}
