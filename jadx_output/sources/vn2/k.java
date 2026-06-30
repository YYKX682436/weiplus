package vn2;

/* loaded from: classes2.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public static java.lang.Object b(vn2.k kVar, java.lang.String str, r45.l03 l03Var, im5.c cVar, long j17, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        long j18 = (i17 & 8) != 0 ? 0L : j17;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = (i17 & 16) != 0 ? null : jbVar;
        kVar.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        vn2.u0 u0Var = vn2.u0.f438387a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchImpl （lifeCycleKeeper=");
        sb6.append(cVar);
        sb6.append(") id=");
        r45.kv0 kv0Var = (r45.kv0) l03Var.getCustom(1);
        sb6.append(kv0Var != null ? new java.lang.Long(kv0Var.getLong(5)) : null);
        sb6.append(",tabTYpe=");
        sb6.append(l03Var.getInteger(10));
        sb6.append(", pullType=");
        sb6.append(l03Var.getInteger(5));
        sb6.append(",reddot objectId=");
        sb6.append(pm0.v.u(l03Var.getLong(7)));
        sb6.append("(bypass null=");
        sb6.append(l03Var.getByteString(8) == null);
        sb6.append("),delayLoading=");
        sb6.append(j18);
        u0Var.m(str, sb6.toString());
        az2.j jVar = (az2.j) l03Var.d();
        if (j18 > 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            az2.j.u(jVar, context, null, j18, 2, null);
        }
        pq5.g l17 = jVar.l();
        if (cVar != null) {
            l17.f(cVar);
        }
        l17.K(new vn2.j(str, l03Var, nVar, jbVar2));
        java.lang.Object j19 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j19;
    }

    public static /* synthetic */ r45.l03 d(vn2.k kVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, int i17, int i18, r45.hn6 hn6Var, int i19, java.lang.Object obj) {
        if ((i19 & 32) != 0) {
            hn6Var = null;
        }
        return kVar.c(jbVar, qt2Var, gVar, i17, i18, hn6Var);
    }

    public final int a(int i17) {
        if (i17 == 0) {
            return 0;
        }
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 9;
                if (i17 != 9) {
                    return i17;
                }
            }
        }
        return i18;
    }

    public final r45.l03 c(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, int i17, int i18, r45.hn6 hn6Var) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        com.tencent.mm.protobuf.g gVar2 = null;
        if (i17 != 28) {
            boolean z17 = false;
            if (!(jbVar != null && jbVar.getType() == 400000) || i17 != 23) {
                if (jbVar != null && jbVar.getType() == 400001) {
                    z17 = true;
                }
                if (!z17 || i17 != 24) {
                    jbVar = null;
                }
            }
        }
        r45.l03 l03Var = new r45.l03();
        db2.t4 t4Var = db2.t4.f228171a;
        l03Var.set(1, t4Var.b(7017, qt2Var));
        l03Var.set(2, gVar);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        l03Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        l03Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        l03Var.set(5, java.lang.Integer.valueOf(i18));
        l03Var.set(6, t4Var.n());
        l03Var.set(7, java.lang.Long.valueOf((jbVar == null || (xs2Var2 = jbVar.N) == null) ? 0L : xs2Var2.getLong(3)));
        if (jbVar != null && (xs2Var = jbVar.N) != null) {
            gVar2 = xs2Var.getByteString(7);
        }
        l03Var.set(8, gVar2);
        l03Var.set(9, java.lang.Long.valueOf(c01.id.c()));
        l03Var.set(10, java.lang.Integer.valueOf(i17));
        l03Var.set(11, hn6Var);
        return l03Var;
    }
}
