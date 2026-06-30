package re5;

/* loaded from: classes11.dex */
public abstract class f0 {
    public static final void a(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct fileVideoPlayerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct();
        re5.d[] dVarArr = re5.d.f394562d;
        fileVideoPlayerReportStruct.f56392d = fileVideoPlayerReportStruct.b("EventId", "tp_pre_start", true);
        re5.e[] eVarArr = re5.e.f394569d;
        jz5.l lVar = new jz5.l("file_ext", com.tencent.mm.vfs.w6.n(filePath));
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        fileVideoPlayerReportStruct.f56393e = fileVideoPlayerReportStruct.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(kz5.c1.l(lVar, new jz5.l("file_path_md5", com.tencent.mm.sdk.platformtools.w2.b(filePath.getBytes())), new jz5.l("file_size", java.lang.String.valueOf(com.tencent.mm.vfs.w6.k(filePath)))))), ",", ";", false), true);
        fileVideoPlayerReportStruct.k();
    }
}
