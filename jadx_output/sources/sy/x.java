package sy;

@j95.b
/* loaded from: classes8.dex */
public class x extends i95.w implements ty.i0, ty.m0, ty.n0 {
    public void Ai(int i17, int i18, java.lang.String otherInfo, java.lang.String fileExt) {
        kotlin.jvm.internal.o.g(otherInfo, "otherInfo");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        com.tencent.mm.autogen.mmdata.rpt.XFileOtherAppActionStruct xFileOtherAppActionStruct = new com.tencent.mm.autogen.mmdata.rpt.XFileOtherAppActionStruct();
        xFileOtherAppActionStruct.f63075d = i17;
        xFileOtherAppActionStruct.f63078g = xFileOtherAppActionStruct.b("FileFormat", fileExt, true);
        xFileOtherAppActionStruct.f63076e = i18;
        xFileOtherAppActionStruct.f63077f = xFileOtherAppActionStruct.b("OtherInfo", otherInfo, true);
        xFileOtherAppActionStruct.k();
        java.lang.String n17 = xFileOtherAppActionStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("QQBrowseEntranceReporterReporter", "report%s %s", 27653, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }

    public void wi(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4, ty.l0 l0Var) {
        com.tencent.mm.pluginsdk.model.r3.a(str, str2, str3, j17, l0Var == null ? 0 : l0Var.a());
    }
}
