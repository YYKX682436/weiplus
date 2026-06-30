package jz3;

/* loaded from: classes12.dex */
public class x implements e04.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct f302806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f302807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationEvent f302808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f302810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f302811g;

    public x(jz3.y yVar, java.lang.String str, com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct, long j17, com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent, java.lang.String str2, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        this.f302805a = str;
        this.f302806b = oCRTranslateReportStruct;
        this.f302807c = j17;
        this.f302808d = scanTranslationEvent;
        this.f302809e = str2;
        this.f302810f = hashMap;
        this.f302811g = hashMap2;
    }

    @Override // e04.q2
    public void a(java.lang.String str, e04.r2 r2Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.f302805a)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f302807c;
        long j18 = currentTimeMillis - j17;
        com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = this.f302806b;
        oCRTranslateReportStruct.f59748g = j18;
        com.tencent.mars.xlog.Log.i("ScanTranslationListener", "upload img cost %d", java.lang.Long.valueOf(j18));
        oCRTranslateReportStruct.f59754m = oCRTranslateReportStruct.b("FileID", r2Var.f246080b, true);
        oCRTranslateReportStruct.f59755n = oCRTranslateReportStruct.b("AesKey", r2Var.f246081c, true);
        int i17 = r2Var.f246079a;
        java.util.HashMap hashMap = this.f302811g;
        java.util.HashMap hashMap2 = this.f302810f;
        com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = this.f302808d;
        if (i17 != 0) {
            oCRTranslateReportStruct.f59747f = 3L;
            oCRTranslateReportStruct.f59750i = java.lang.System.currentTimeMillis() - j17;
            oCRTranslateReportStruct.k();
            hashMap2.remove(java.lang.Integer.valueOf(scanTranslationEvent.f54738g.f6283b));
            am.bt btVar = scanTranslationEvent.f54738g;
            hashMap.remove(java.lang.Integer.valueOf(btVar.f6283b));
            com.tencent.mars.xlog.Log.i("ScanTranslationListener", "translationReports size %d, translationUpload size %d, errCode: %s", java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap.size()), java.lang.Integer.valueOf(r2Var.f246079a));
            ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).fj(btVar.f6283b);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.N0(r2Var.f246080b, r2Var.f246081c)) {
            com.tencent.mars.xlog.Log.i("ScanTranslationListener", "upload img success, fileId %s", r2Var.f246080b);
            am.bt btVar2 = scanTranslationEvent.f54738g;
            gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.e0(btVar2.f6282a, btVar2.f6283b, (int) com.tencent.mm.vfs.w6.k(this.f302809e), r2Var.f246080b, r2Var.f246081c, 1, 2));
            return;
        }
        oCRTranslateReportStruct.f59747f = 3L;
        oCRTranslateReportStruct.f59750i = java.lang.System.currentTimeMillis() - j17;
        oCRTranslateReportStruct.k();
        hashMap2.remove(java.lang.Integer.valueOf(scanTranslationEvent.f54738g.f6283b));
        am.bt btVar3 = scanTranslationEvent.f54738g;
        hashMap.remove(java.lang.Integer.valueOf(btVar3.f6283b));
        com.tencent.mars.xlog.Log.i("ScanTranslationListener", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap.size()));
        ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).fj(btVar3.f6283b);
    }
}
