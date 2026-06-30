package f65;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.q f259959a = new f65.q();

    public static /* synthetic */ void b(f65.q qVar, java.lang.String str, int i17, long j17, java.lang.String str2, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i18 & 8) != 0) {
            str2 = "";
        }
        qVar.a(str, i17, j18, str2);
    }

    public final void a(java.lang.String funcName, int i17, long j17, java.lang.String extras) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(extras, "extras");
        com.tencent.mm.autogen.mmdata.rpt.LivePhotoTecReportStruct livePhotoTecReportStruct = new com.tencent.mm.autogen.mmdata.rpt.LivePhotoTecReportStruct();
        livePhotoTecReportStruct.f58619d = livePhotoTecReportStruct.b("FunName", funcName, true);
        livePhotoTecReportStruct.f58620e = i17;
        livePhotoTecReportStruct.f58621f = j17;
        livePhotoTecReportStruct.f58622g = livePhotoTecReportStruct.b("Extras", r26.i0.t(extras, ",", ";", false), true);
        qp.b.f365674a.getClass();
        livePhotoTecReportStruct.f58623h = qp.b.f365676c;
        livePhotoTecReportStruct.f58624i = livePhotoTecReportStruct.b("SysVersion", qp.b.f365677d, true);
        livePhotoTecReportStruct.k();
    }
}
