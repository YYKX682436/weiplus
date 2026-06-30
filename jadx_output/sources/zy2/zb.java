package zy2;

/* loaded from: classes2.dex */
public interface zb extends i95.m {
    static /* synthetic */ void E9(zy2.zb zbVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, ml2.x1 x1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnExpose");
        }
        if ((i18 & 8) != 0) {
            str2 = "";
        }
        java.lang.String str4 = str2;
        if ((i18 & 16) != 0) {
            str3 = null;
        }
        java.lang.String str5 = str3;
        if ((i18 & 32) != 0) {
            i17 = 0;
        }
        ((ml2.j0) zbVar).wj(baseFinderFeed, x1Var, str, str4, str5, i17);
    }

    static void I8(zy2.zb zbVar, ml2.u1 elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementExpose");
        }
        if ((i17 & 2) != 0) {
            eidUdfKVMap = new java.util.LinkedHashMap();
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        if ((i17 & 16) != 0) {
            str3 = null;
        }
        if ((i17 & 32) != 0) {
            str4 = null;
        }
        if ((i17 & 64) != 0) {
            z17 = true;
        }
        ml2.j0 j0Var = (ml2.j0) zbVar;
        j0Var.getClass();
        kotlin.jvm.internal.o.g(elementId, "elementId");
        kotlin.jvm.internal.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidExposeStruct.f56537d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = ml2.j0.f327583i.C;
        }
        finderBroadcastEidExposeStruct.u(str4);
        finderBroadcastEidExposeStruct.p("");
        finderBroadcastEidExposeStruct.A("");
        finderBroadcastEidExposeStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidExposeStruct.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        finderBroadcastEidExposeStruct.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f1584l;
        }
        finderBroadcastEidExposeStruct.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderBroadcastEidExposeStruct.f56545l = finderBroadcastEidExposeStruct.b("TabContextID", c17, true);
        finderBroadcastEidExposeStruct.x("");
        finderBroadcastEidExposeStruct.v("");
        finderBroadcastEidExposeStruct.f56548o = finderBroadcastEidExposeStruct.b("ref_commentscene", "", true);
        finderBroadcastEidExposeStruct.s(elementId.f328108d);
        finderBroadcastEidExposeStruct.t(j0Var.Bi(eidUdfKVMap, z17));
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidExposeStruct.f56552s = finderBroadcastEidExposeStruct.b("session_buffer", str3, true);
        finderBroadcastEidExposeStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidExposeStruct.k();
    }

    static /* synthetic */ void Kh(zy2.zb zbVar, androidx.recyclerview.widget.RecyclerView recyclerView, ml2.x1 x1Var, java.lang.String str, ml2.y yVar, int i17, long j17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053");
        }
        ((ml2.j0) zbVar).oj(recyclerView, x1Var, str, yVar, (i19 & 16) != 0 ? 0 : i17, (i19 & 32) != 0 ? -1L : j17, (i19 & 64) != 0 ? 0 : i18);
    }

    static /* synthetic */ void Ng(zy2.zb zbVar, long j17, long j18, java.lang.String str, java.lang.String str2, long j19, long j27, ml2.x1 x1Var, java.lang.String str3, java.lang.String str4, int i17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnClick");
        }
        ((ml2.j0) zbVar).pj(j17, j18, (i18 & 4) != 0 ? null : str, str2, j19, j27, x1Var, str3, (i18 & 256) != 0 ? "" : str4, (i18 & 512) != 0 ? 0 : i17, finderObject);
    }

    static void T8(zy2.zb zbVar, ml2.t1 elementId, java.util.Map eidUdfKVMap, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementClick");
        }
        if ((i17 & 2) != 0) {
            eidUdfKVMap = new java.util.LinkedHashMap();
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            str2 = null;
        }
        if ((i17 & 16) != 0) {
            str3 = null;
        }
        if ((i17 & 32) != 0) {
            str4 = null;
        }
        if ((i17 & 64) != 0) {
            z17 = true;
        }
        ml2.j0 j0Var = (ml2.j0) zbVar;
        j0Var.getClass();
        kotlin.jvm.internal.o.g(elementId, "elementId");
        kotlin.jvm.internal.o.g(eidUdfKVMap, "eidUdfKVMap");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
        if (str4 == null || str4.length() == 0) {
            str4 = ml2.j0.f327583i.C;
        }
        finderBroadcastEidClickStruct.u(str4);
        finderBroadcastEidClickStruct.p("");
        finderBroadcastEidClickStruct.B("");
        finderBroadcastEidClickStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidClickStruct.w(Ri);
        if (str == null) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.b();
            if (str == null) {
                str = "";
            }
        }
        finderBroadcastEidClickStruct.r(str);
        if (str2 == null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            str2 = a52.a.f1584l;
        }
        finderBroadcastEidClickStruct.q(str2);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderBroadcastEidClickStruct.A(c17);
        finderBroadcastEidClickStruct.x("");
        finderBroadcastEidClickStruct.v("");
        finderBroadcastEidClickStruct.s(elementId.f328013d);
        finderBroadcastEidClickStruct.t(j0Var.Bi(eidUdfKVMap, z17));
        finderBroadcastEidClickStruct.f56536r = finderBroadcastEidClickStruct.b("session_buffer", str3, true);
        finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidClickStruct.k();
    }

    static void f5(zy2.zb zbVar, ml2.z4 actionType, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21054AssistantEnable");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ml2.j0 j0Var = (ml2.j0) zbVar;
        j0Var.getClass();
        kotlin.jvm.internal.o.g(actionType, "actionType");
        if (!zl2.r4.f473950a.w1()) {
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            if ((c1Var == null || c1Var.T) ? false : true) {
                return;
            }
        }
        j0Var.Ej(actionType, str, str2);
    }

    static /* synthetic */ void j5(zy2.zb zbVar, long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ((ml2.j0) zbVar).hj(j17, str, str2);
    }

    static /* synthetic */ void qd(zy2.zb zbVar, int i17, int i18, long j17, java.util.Map map, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017ForAnchorLivePath");
        }
        if ((i19 & 8) != 0) {
            map = kz5.q0.f314001d;
        }
        ((ml2.j0) zbVar).ij(i17, i18, j17, map);
    }

    static /* synthetic */ void qg(zy2.zb zbVar, ml2.y2 y2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21106");
        }
        if ((i17 & 4) != 0) {
            str2 = "";
        }
        if ((i17 & 8) != 0) {
            str3 = "";
        }
        ((ml2.j0) zbVar).Ij(y2Var, str, str2, str3);
    }

    static /* synthetic */ void s3(zy2.zb zbVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, long j17, ml2.x1 x1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnClick");
        }
        ((ml2.j0) zbVar).qj(baseFinderFeed, j17, x1Var, str, (i17 & 16) != 0 ? "" : str2, (i17 & 32) != 0 ? null : str3);
    }

    static /* synthetic */ void y6(zy2.zb zbVar, ml2.z4 z4Var, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21054");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ((ml2.j0) zbVar).yj(z4Var, str, str2);
    }
}
