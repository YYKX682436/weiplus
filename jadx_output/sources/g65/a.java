package g65;

/* loaded from: classes4.dex */
public interface a extends i95.m {
    static void hg(g65.a aVar, int i17, int i18, java.lang.String str, int i19, int i27, int i28, long j17, long j18, long j19, long j27, int i29, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3, int i37, java.lang.Object obj) {
        int i38;
        java.lang.String bVar;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportWorkStatus");
        }
        java.lang.String workId = (i37 & 4) != 0 ? "" : str;
        int i39 = (i37 & 8) != 0 ? 0 : i19;
        int i47 = (i37 & 16) != 0 ? 0 : i27;
        int i48 = (i37 & 32) != 0 ? -1 : i28;
        long j28 = (i37 & 64) != 0 ? 0L : j17;
        long j29 = (i37 & 128) != 0 ? 0L : j18;
        long j37 = (i37 & 256) != 0 ? 0L : j19;
        long j38 = (i37 & 512) != 0 ? 0L : j27;
        int i49 = (i37 & 1024) != 0 ? 0 : i29;
        java.lang.String encodeConfig = (i37 & 2048) != 0 ? "" : str2;
        java.lang.Boolean bool3 = (i37 & 4096) != 0 ? null : bool;
        long j39 = j38;
        java.lang.Boolean bool4 = (i37 & 8192) != 0 ? null : bool2;
        java.lang.String outputVideoPath = (i37 & 16384) != 0 ? "" : str3;
        ((yp4.a) aVar).getClass();
        java.lang.Boolean bool5 = bool3;
        kotlin.jvm.internal.o.g(workId, "workId");
        kotlin.jvm.internal.o.g(encodeConfig, "encodeConfig");
        kotlin.jvm.internal.o.g(outputVideoPath, "outputVideoPath");
        java.lang.String str4 = encodeConfig;
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkStatus >> " + i18 + ", " + i47 + ", " + i48 + ", " + j29);
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.f60551d = i18;
        snsFakeVideoLogStruct.p(workId);
        snsFakeVideoLogStruct.f60554g = i39;
        snsFakeVideoLogStruct.f60553f = i48;
        snsFakeVideoLogStruct.f60556i = j37;
        snsFakeVideoLogStruct.f60557j = j39;
        snsFakeVideoLogStruct.f60558k = j28;
        snsFakeVideoLogStruct.f60559l = j29;
        snsFakeVideoLogStruct.f60555h = i47;
        java.lang.Boolean bool6 = java.lang.Boolean.TRUE;
        snsFakeVideoLogStruct.f60562o = kotlin.jvm.internal.o.b(bool4, bool6) ? 1 : kotlin.jvm.internal.o.b(bool4, java.lang.Boolean.FALSE) ? 2 : 0;
        snsFakeVideoLogStruct.f60564q = i49;
        snsFakeVideoLogStruct.f60565r = i17;
        if (i18 == 3 && i47 == 4007 && !com.tencent.mm.sdk.platformtools.t8.K0(outputVideoPath)) {
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(outputVideoPath, true);
            snsFakeVideoLogStruct.f60563p = snsFakeVideoLogStruct.b("MixVideoInfo", (d17 == null || (bVar = d17.toString()) == null) ? "" : r26.i0.t(bVar, ",", ";", false), true);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            i38 = 0;
        } else {
            i38 = 0;
            snsFakeVideoLogStruct.f60561n = snsFakeVideoLogStruct.b("EncodeConfig", r26.i0.t(str4, ",", ";", false), true);
        }
        snsFakeVideoLogStruct.f60560m = kotlin.jvm.internal.o.b(bool5, bool6) ? 1 : kotlin.jvm.internal.o.b(bool5, java.lang.Boolean.FALSE) ? 2 : i38;
        snsFakeVideoLogStruct.k();
    }
}
