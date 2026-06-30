package db2;

/* loaded from: classes2.dex */
public final class z3 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228258t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String username, int i17, java.lang.String str, int i18, long j17, int i19, kotlin.jvm.internal.i iVar) {
        super(null, null, 2, null);
        str = (i19 & 4) != 0 ? null : str;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        j17 = (i19 & 16) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(username, "username");
        this.f228258t = "Finder.CgiFinderUserPage";
        r45.z13 z13Var = new r45.z13();
        z13Var.set(1, username);
        z13Var.set(8, java.lang.Integer.valueOf(i17));
        z13Var.set(3, "");
        z13Var.set(4, xy2.c.f(this.f16135n));
        db2.t4 t4Var = db2.t4.f228171a;
        z13Var.set(6, t4Var.b(3736, null));
        r45.kv0 kv0Var = (r45.kv0) z13Var.getCustom(6);
        if (kv0Var != null) {
            kv0Var.set(1, 0);
        }
        z13Var.set(9, t4Var.n());
        z13Var.set(23, str);
        z13Var.set(16, java.lang.Integer.valueOf(i18));
        z13Var.set(17, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = z13Var;
        com.tencent.mm.protocal.protobuf.FinderUserPageResponse finderUserPageResponse = new com.tencent.mm.protocal.protobuf.FinderUserPageResponse();
        finderUserPageResponse.setBaseResponse(new r45.ie());
        r45.ie baseResponse = finderUserPageResponse.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = finderUserPageResponse;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderuserpage";
        lVar.f70667d = 3736;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderUserPage", "init username:" + username + ", enterType:" + i17);
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protocal.protobuf.FinderUserPageResponse resp = (com.tencent.mm.protocal.protobuf.FinderUserPageResponse) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.tencent.mars.xlog.Log.i(this.f228258t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.protocal.protobuf.FinderUserPageResponse resp = (com.tencent.mm.protocal.protobuf.FinderUserPageResponse) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> object = resp.getObject();
        kotlin.jvm.internal.o.f(object, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(object, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : object) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.z13) fVar).getCustom(6);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String username, long j17, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var, long j18, java.lang.String biz_username, long j19, boolean z17, java.lang.String str) {
        super(null, null, 2, null);
        r45.kv0 kv0Var;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(biz_username, "biz_username");
        this.f228258t = "Finder.CgiFinderUserPage";
        new r45.z13();
        ya2.b2 b17 = ya2.h.f460484a.b(username);
        java.lang.String str2 = b17 != null ? b17.field_firstPageMD5 : null;
        str2 = str2 == null ? "" : str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderuserpage";
        lVar.f70667d = 3736;
        r45.z13 z13Var = new r45.z13();
        z13Var.set(1, username);
        z13Var.set(2, java.lang.Long.valueOf(j17));
        z13Var.set(3, str2);
        z13Var.set(4, xy2.c.f(qt2Var));
        z13Var.set(11, 0);
        z13Var.set(10, java.lang.Long.valueOf(j18));
        db2.t4 t4Var = db2.t4.f228171a;
        z13Var.set(6, t4Var.b(3736, qt2Var));
        r45.kv0 kv0Var2 = (r45.kv0) z13Var.getCustom(6);
        if (kv0Var2 != null) {
            kv0Var2.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0));
        }
        if (z17 && (kv0Var = (r45.kv0) z13Var.getCustom(6)) != null) {
            kv0Var.set(3, java.lang.Integer.valueOf(kv0Var.getInteger(3) | 524288));
        }
        z13Var.set(5, java.lang.Integer.valueOf((r26.i0.q(z13Var.getString(1), z13Var.getString(4), false, 2, null) || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.F1().r()).booleanValue()) ? 1 : 0));
        z13Var.set(7, gVar);
        z13Var.set(9, t4Var.n());
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        z13Var.set(14, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        z13Var.set(15, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        z13Var.set(12, java.lang.Long.valueOf(j19));
        if (biz_username.length() > 0) {
            z13Var.set(8, java.lang.Integer.valueOf(j19 != 0 ? 23 : 24));
            z13Var.set(13, biz_username);
        }
        long j27 = (!t4Var.q() || j19 == 0 || j19 == -1) ? j18 : j19;
        r45.kv0 kv0Var3 = (r45.kv0) z13Var.getCustom(6);
        r45.kv0 kv0Var4 = (r45.kv0) z13Var.getCustom(6);
        t4Var.h(kv0Var3, null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var4 != null ? kv0Var4.getInteger(1) : 0), java.lang.Long.valueOf(j27), str)));
        com.tencent.mm.protocal.protobuf.FinderUserPageResponse finderUserPageResponse = new com.tencent.mm.protocal.protobuf.FinderUserPageResponse();
        lVar.f70664a = z13Var;
        lVar.f70665b = finderUserPageResponse;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderUserPageCGI", "NetSceneFinderUserPage init maxId " + j17 + " username " + username + " pullType " + i17 + " fpMD5 " + str2);
    }
}
