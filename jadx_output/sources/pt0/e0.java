package pt0;

/* loaded from: classes12.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pt0.e0 f358193a = new pt0.e0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f358194b = jz5.h.b(pt0.d0.f358192d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f358195c = jz5.h.b(pt0.r.f358220d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f358196d = jz5.h.b(pt0.q.f358219d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f358197e = jz5.h.b(pt0.s.f358221d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f358198f = jz5.h.b(pt0.x.f358226d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f358199g = jz5.h.b(pt0.y.f358227d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f358200h = jz5.h.b(pt0.w.f358225d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f358201i = jz5.h.b(pt0.b0.f358188d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f358202j = jz5.h.b(pt0.c0.f358189d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f358203k = jz5.h.b(pt0.a0.f358186d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f358204l = jz5.h.b(pt0.u.f358223d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f358205m = jz5.h.b(pt0.v.f358224d);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f358206n = jz5.h.b(pt0.t.f358222d);

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f358207o = jz5.h.b(pt0.z.f358228d);

    public final boolean a(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        ez.k1 k1Var = (ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class));
        k1Var.getClass();
        com.tencent.mm.storage.f9 Y5 = pt0.f0.Y5(k1Var, talker, j17, null, 4, null);
        if (!(kotlin.jvm.internal.o.b(Y5.Q0(), talker) && Y5.getMsgId() == j17)) {
            Y5 = null;
        }
        return Y5 != null;
    }

    public final int b(java.lang.String str, long j17) {
        int delete;
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        boolean d17 = pt0.f0.f358209b1.d();
        cj6.getClass();
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        java.lang.String Q0 = Li.Q0();
        if (d17 && !android.text.TextUtils.equals(str, Q0)) {
            java.lang.Throwable th6 = new java.lang.Throwable();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.z3.c(th6);
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorage", "found different talker[%s -> %s], stack: %s", Q0, str, c17);
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 3011L;
            errorMsgInfoStruct.r(c17);
            errorMsgInfoStruct.k();
        }
        cj6.f193990s.a((int) (com.tencent.mm.sdk.platformtools.t8.i1() / 86400), Li.I0(), Li.getCreateTime() / 1000, true);
        if (cj6.Pb(cj6.X8(str))) {
            l75.k0 db6 = cj6.f193989r;
            java.lang.String tableName = cj6.P8(j17, str);
            kotlin.jvm.internal.o.g(db6, "db");
            kotlin.jvm.internal.o.g(tableName, "tableName");
            try {
                com.tencent.wcdb.core.Table table = ot0.d3.a(db6).getTable(tableName, up5.i.f429970b);
                kotlin.jvm.internal.o.f(table, "getTable(...)");
                table.deleteObjects(up5.i.f429971c.eq(j17));
                delete = 1;
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MessageDBProvider", "deleteByMsgId failed: " + th7.getMessage());
                delete = 0;
            }
        } else {
            delete = cj6.f193989r.delete(cj6.P8(j17, str), "msgId=?", new java.lang.String[]{"" + j17});
        }
        com.tencent.mm.plugin.fts.logic.r3 r3Var = (com.tencent.mm.plugin.fts.logic.r3) ((c01.j8) i95.n0.c(c01.j8.class));
        r3Var.getClass();
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        try {
            com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
            if (oVar != null) {
                oVar.g(j17);
            } else {
                ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137379d.b(65536, new com.tencent.mm.plugin.fts.logic.p3(r3Var, j17));
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteSingleMsg post task to fts task daemon %d", java.lang.Long.valueOf(j17));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSDeleteMsgLogic", e17, "syncDeleteSingleMsg", new java.lang.Object[0]);
        }
        if (delete != 0) {
            cj6.doNotify("delete_id " + j17);
            xg3.l0 l0Var = new xg3.l0(Q0, "delete", Li, 0, 1);
            l0Var.f454416g = j17;
            l0Var.f454417h = Li.t0();
            cj6.m0(l0Var);
        } else {
            jx3.f.INSTANCE.idkeyStat(111L, 245L, 1L, false);
        }
        return delete;
    }

    public final boolean c(bm5.v businessType) {
        kotlin.jvm.internal.o.g(businessType, "businessType");
        return businessType == bm5.v.f22746i && ((java.lang.Boolean) ((jz5.n) f358206n).getValue()).booleanValue();
    }

    public final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) f358197e).getValue()).booleanValue();
    }

    public final boolean e() {
        return ((java.lang.Boolean) ((jz5.n) f358204l).getValue()).booleanValue();
    }

    public final boolean f() {
        return ((java.lang.Boolean) ((jz5.n) f358200h).getValue()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) ((jz5.n) f358198f).getValue()).booleanValue();
    }

    public final boolean h() {
        return ((java.lang.Boolean) ((jz5.n) f358199g).getValue()).booleanValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) ((jz5.n) f358201i).getValue()).booleanValue();
    }

    public final boolean j() {
        return ((java.lang.Boolean) ((jz5.n) f358202j).getValue()).booleanValue();
    }

    public final com.tencent.mm.storage.f9 k(java.lang.String str, long j17) {
        i95.m c17 = i95.n0.c(pt0.f0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.storage.f9 Y5 = pt0.f0.Y5((pt0.f0) c17, str, j17, null, 4, null);
        if (Y5 != null) {
            if (Y5.getMsgId() == j17 && kotlin.jvm.internal.o.b(Y5.Q0(), str) && Y5.getMsgId() != 0) {
                return Y5;
            }
        }
        return null;
    }

    public final com.tencent.mm.storage.f9 l(java.lang.String str, long j17) {
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, j17);
        if (o27 != null) {
            if (o27.I0() == j17 && kotlin.jvm.internal.o.b(o27.Q0(), str) && o27.getMsgId() != 0) {
                return o27;
            }
        }
        return null;
    }

    public final com.tencent.mm.storage.f9 m(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        i95.m c17 = i95.n0.c(pt0.f0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return pt0.f0.Y5((pt0.f0) c17, msgIdTalker.a(), msgIdTalker.f149480d, null, 4, null);
    }

    public final com.tencent.mm.storage.f9 n(java.lang.String str, long j17) {
        i95.m c17 = i95.n0.c(pt0.f0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return pt0.f0.Y5((pt0.f0) c17, str, j17, null, 4, null);
    }

    public final com.tencent.mm.storage.f9 o(java.lang.String str, long j17, boolean z17) {
        return ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).wi(str, j17, java.lang.Boolean.valueOf(z17));
    }

    public final java.lang.String p(java.lang.Throwable throwable) {
        kotlin.jvm.internal.o.g(throwable, "throwable");
        return r26.p0.E0(jz5.a.b(throwable), 1000);
    }

    public final long q(java.lang.String str, long j17) {
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        android.database.Cursor D = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f193989r.D(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(j17, str), new java.lang.String[]{"msgSvrId"}, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        long j18 = D.moveToFirst() ? D.getLong(0) : 0L;
        D.close();
        return j18;
    }

    public final long r(oi3.g simpleMsgInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        int i17 = simpleMsgInfo.f345617d;
        f9Var.setMsgId(simpleMsgInfo.getLong(i17 + 0));
        f9Var.o1(simpleMsgInfo.getLong(i17 + 1));
        f9Var.u1(simpleMsgInfo.getString(i17 + 3));
        f9Var.e1(simpleMsgInfo.getLong(i17 + 2));
        f9Var.j1(simpleMsgInfo.getInteger(i17 + 9));
        f9Var.u3(simpleMsgInfo.getString(i17 + 12));
        f9Var.setType(simpleMsgInfo.getInteger(i17 + 4));
        f9Var.r1(simpleMsgInfo.getInteger(i17 + 7));
        f9Var.f1(simpleMsgInfo.getInteger(i17 + 10));
        int i18 = i17 + 11;
        if (r26.n0.N(simpleMsgInfo.getString(i18))) {
            str = simpleMsgInfo.getString(i17 + 13);
        } else {
            str = simpleMsgInfo.getString(i18) + ":\n" + simpleMsgInfo.getString(i17 + 13);
        }
        f9Var.d1(str);
        if (simpleMsgInfo instanceof oi3.i) {
            f9Var.i1(((oi3.i) simpleMsgInfo).j());
        }
        if (simpleMsgInfo instanceof oi3.h) {
            f9Var.i1(((oi3.h) simpleMsgInfo).j());
        }
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    public final int s(java.lang.String str, long j17, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        ((ez.k1) ((pt0.f0) i95.n0.c(pt0.f0.class))).getClass();
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, msgInfo, true);
    }
}
