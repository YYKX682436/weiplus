package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class r3 {
    public static final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        long j18 = com.tencent.mm.pluginsdk.model.t3.q(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 1L : 2L;
        com.tencent.mm.autogen.mmdata.rpt.XFilesActionNewStruct xFilesActionNewStruct = new com.tencent.mm.autogen.mmdata.rpt.XFilesActionNewStruct();
        xFilesActionNewStruct.f63082g = j17;
        xFilesActionNewStruct.f63079d = xFilesActionNewStruct.b("ContextId", str, true);
        if (str2 == null) {
            str2 = "";
        }
        xFilesActionNewStruct.f63081f = xFilesActionNewStruct.b("FileFormat", str2, true);
        if (str3 == null) {
            str3 = "";
        }
        xFilesActionNewStruct.f63080e = xFilesActionNewStruct.b("FileId", str3, true);
        xFilesActionNewStruct.f63083h = j18;
        xFilesActionNewStruct.f63084i = i17;
        xFilesActionNewStruct.k();
        java.lang.String n17 = xFilesActionNewStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("QQBrowseEntranceReporterReporter", "report%s %s", 25696, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        a(str, str2, str3, j17, context instanceof com.tencent.mm.pluginsdk.ui.tools.w3 ? ((com.tencent.mm.pluginsdk.ui.tools.w3) context).i5().a() : 0);
    }
}
