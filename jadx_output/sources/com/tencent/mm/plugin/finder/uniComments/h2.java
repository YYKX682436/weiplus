package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class h2 {
    public h2(kotlin.jvm.internal.i iVar) {
    }

    public final void a(r45.hf2 hf2Var, long j17, long j18) {
        java.lang.String string;
        java.lang.String string2;
        com.tencent.mm.autogen.mmdata.rpt.UniLikeReportStruct uniLikeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.UniLikeReportStruct();
        uniLikeReportStruct.f61369d = uniLikeReportStruct.b("ContextId", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
        long j19 = b21.m.a().f17338b;
        uniLikeReportStruct.f61379n = j19;
        uniLikeReportStruct.f61380o = j19;
        java.lang.String str = null;
        uniLikeReportStruct.f61370e = uniLikeReportStruct.b("SongName", (hf2Var == null || (string2 = hf2Var.getString(0)) == null) ? null : r26.i0.t(string2, ",", " ", false), true);
        uniLikeReportStruct.f61371f = uniLikeReportStruct.b("SongId", hf2Var != null ? hf2Var.getString(5) : null, true);
        uniLikeReportStruct.f61372g = uniLikeReportStruct.b("WebUrl", hf2Var != null ? hf2Var.getString(4) : null, true);
        uniLikeReportStruct.f61373h = uniLikeReportStruct.b("DataUrl", hf2Var != null ? hf2Var.getString(2) : null, true);
        if (hf2Var != null && (string = hf2Var.getString(1)) != null) {
            str = r26.i0.t(string, ",", " ", false);
        }
        uniLikeReportStruct.f61384s = uniLikeReportStruct.b("Singer", str, true);
        uniLikeReportStruct.f61378m = hf2Var != null ? hf2Var.getInteger(14) / 1000 : 0L;
        uniLikeReportStruct.f61374i = j17;
        uniLikeReportStruct.f61385t = j18;
        uniLikeReportStruct.k();
    }
}
