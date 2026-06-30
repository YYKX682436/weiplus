package mz3;

/* loaded from: classes12.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(oz3.e ocrReportRequest, fk0.a aVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(ocrReportRequest, "ocrReportRequest");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/scan_qrcode_event_report_cgi";
        lVar.f70667d = 8887;
        lVar.f70665b = new r45.yu5();
        r45.xu5 xu5Var = new r45.xu5();
        xu5Var.f390427e = ocrReportRequest.f350257a;
        xu5Var.f390430h = ocrReportRequest.f350259c;
        xu5Var.f390426d = ocrReportRequest.f350260d;
        xu5Var.f390431i = (aVar == null || (str = aVar.f263259a) == null) ? "" : str;
        xu5Var.f390432m = aVar != null ? aVar.f263260b : -1;
        xu5Var.f390433n = (aVar != null ? java.lang.Float.valueOf(aVar.f263261c) : 0).toString();
        xu5Var.f390434o = aVar != null ? aVar.f263262d : -1;
        xu5Var.f390435p = (aVar != null ? java.lang.Float.valueOf(aVar.f263263e) : 0).toString();
        java.lang.String str2 = ocrReportRequest.f350262f;
        xu5Var.f390429g = str2 != null ? str2 : "";
        xu5Var.f390428f = ocrReportRequest.f350258b;
        lVar.f70664a = xu5Var;
        p(lVar.a());
    }
}
