package so2;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a */
    public static final so2.e2 f410328a = new so2.e2();

    public static void a(so2.e2 e2Var, r45.qt2 contextObj, long j17, java.lang.String str, java.lang.String objectNonceId, com.tencent.mm.plugin.finder.storage.yj0 comment, boolean z17, int i17, boolean z18, com.tencent.mm.protobuf.g gVar, int i18, java.lang.String str2, nv2.i1 i1Var, int i19, java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar2 = (i19 & 256) != 0 ? null : gVar;
        int i27 = (i19 & 512) != 0 ? 0 : i18;
        java.lang.String str3 = (i19 & 1024) != 0 ? null : str2;
        nv2.i1 i1Var2 = (i19 & 2048) != 0 ? null : i1Var;
        e2Var.getClass();
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(comment, "comment");
        if (hz2.d.f286313a.a("like")) {
            return;
        }
        int i28 = (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.j().r()).intValue() == 1 || com.tencent.mm.plugin.finder.storage.t70.M != 1) ? i17 : 1;
        com.tencent.mars.xlog.Log.i("Finder.FinderLikeLogic", "likeComment scene: " + i28 + ", scene1:" + i17);
        jx3.f.INSTANCE.idkeyStat(1278L, z17 ? 2L : 3L, 1L, false);
        int i29 = z17 ? 2 : 1;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).zj(contextObj, j17, str, 4, i29, 1, comment.Z0(), i28, (r29 & 256) != 0 ? false : false, (r29 & 512) != 0 ? false : false, (r29 & 1024) != 0 ? 0 : 0);
        nv2.n1.f340551h.e(j17, str, objectNonceId, comment, z17 ? nv2.x1.f340626d : nv2.x1.f340627e, i28, i1Var2, contextObj, z18, gVar2, i27, str3);
    }

    public final void b(r45.qt2 contextObj, int i17, com.tencent.mm.plugin.finder.storage.FinderItem finderObject, boolean z17, boolean z18, int i18, boolean z19, boolean z27, boolean z28, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        if (hz2.d.f286313a.a("like")) {
            return;
        }
        jx3.f.INSTANCE.idkeyStat(1278L, z17 ? 0L : 1L, 1L, false);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).zj(contextObj, finderObject.getId(), finderObject.getDupFlag(), (z18 || z27) ? 6 : 1, z17 ? 2 : 1, i17, "", i18, z19, z28, (z28 || z18 || z27 || cu2.f0.f222391a.e(finderObject.getFeedObject().getObjectType()) == null) ? 0 : 1);
        int i19 = (i17 == 1 || i17 != 2) ? 0 : 1;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.m2().r()).booleanValue()) {
            nv2.d1 d1Var = nv2.d1.f340475b;
            nv2.d1.b(nv2.d1.f340475b, finderObject, z17, z18, i18, i19, contextObj, null, bc1Var, 64, null);
        } else {
            nv2.h1 h1Var = nv2.n1.f340550g;
            nv2.n1.c(nv2.n1.f340551h, finderObject, z17, z18, i18, i19, null, contextObj, null, null, com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, null);
        }
    }
}
