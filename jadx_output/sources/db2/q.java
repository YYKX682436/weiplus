package db2;

/* loaded from: classes2.dex */
public final class q extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public boolean f228122t;

    /* renamed from: u, reason: collision with root package name */
    public final int f228123u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String req_username, long j17, java.lang.String encryptedFeedId, long j18, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(req_username, "req_username");
        kotlin.jvm.internal.o.g(encryptedFeedId, "encryptedFeedId");
        this.f228122t = true;
        ya2.b2 b17 = ya2.h.f460484a.b(req_username);
        java.lang.String str = b17 != null ? b17.field_firstPageMD5 : null;
        str = str == null ? "" : str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderaduserpage";
        lVar.f70667d = 6692;
        r45.zt0 zt0Var = new r45.zt0();
        zt0Var.set(1, req_username);
        zt0Var.set(2, java.lang.Long.valueOf(j18));
        zt0Var.set(3, str);
        db2.t4 t4Var = db2.t4.f228171a;
        zt0Var.set(9, t4Var.n());
        zt0Var.set(4, xy2.c.f(qt2Var));
        zt0Var.set(6, t4Var.b(6692, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) zt0Var.getCustom(6);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0));
        }
        if (r26.i0.q(zt0Var.getString(1), zt0Var.getString(4), false, 2, null)) {
            zt0Var.set(5, 1);
        }
        r45.kv0 kv0Var2 = (r45.kv0) zt0Var.getCustom(6);
        r45.kv0 kv0Var3 = (r45.kv0) zt0Var.getCustom(6);
        db2.t4.i(t4Var, kv0Var2, kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(kv0Var3 != null ? kv0Var3.getInteger(1) : 0), java.lang.Long.valueOf(j17))), null, 4, null);
        zt0Var.set(10, java.lang.Long.valueOf(j17));
        zt0Var.set(11, encryptedFeedId);
        zt0Var.set(7, gVar);
        r45.au0 au0Var = new r45.au0();
        lVar.f70664a = zt0Var;
        lVar.f70665b = au0Var;
        p(lVar.a());
        this.f228123u = i17;
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAdFeedList", "CgiFinderAdFeedList init maxId " + j18 + " username " + req_username + " pullType " + i17 + " fpMD5 " + str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.au0 resp = (r45.au0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderAdFeedList", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            this.f228122t = resp.getInteger(6) == 1;
        }
    }
}
