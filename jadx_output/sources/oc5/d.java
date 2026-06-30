package oc5;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct f344394a;

    /* renamed from: b, reason: collision with root package name */
    public oc5.a f344395b;

    /* renamed from: c, reason: collision with root package name */
    public oc5.b f344396c;

    public final void a(int i17) {
        oc5.a aVar = this.f344395b;
        if (aVar != null) {
            aVar.f344375b = i17;
        }
        if (aVar != null) {
            aVar.f344379f = java.lang.System.currentTimeMillis();
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        oc5.a aVar2 = this.f344395b;
        objArr[1] = aVar2 != null ? java.lang.Long.valueOf(aVar2.f344379f) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanButtonReporter", "clickFinish clickResult: %d, %s", objArr);
        oc5.a aVar3 = this.f344395b;
        if (aVar3 != null && aVar3.f344381h) {
            return;
        }
        if (aVar3 != null) {
            aVar3.f344381h = true;
        }
        if (!(aVar3 != null && aVar3.f344375b == 1) && aVar3 != null) {
            aVar3.f344375b = 2;
        }
        if (aVar3 != null) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[9];
            objArr2[0] = aVar3.f344374a;
            objArr2[1] = java.lang.Integer.valueOf(aVar3.f344375b);
            objArr2[2] = java.lang.Integer.valueOf(aVar3.f344377d);
            objArr2[3] = java.lang.Long.valueOf(aVar3.f344378e);
            objArr2[4] = java.lang.Long.valueOf(aVar3.f344379f);
            com.tencent.mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct imageFastEntryDetectStruct = this.f344394a;
            objArr2[5] = imageFastEntryDetectStruct != null ? imageFastEntryDetectStruct.f58460i : null;
            objArr2[6] = imageFastEntryDetectStruct != null ? imageFastEntryDetectStruct.f58461j : null;
            objArr2[7] = java.lang.Integer.valueOf(aVar3.f344376c);
            objArr2[8] = java.lang.Long.valueOf(aVar3.f344380g);
            g0Var.d(19778, objArr2);
        }
    }

    public final void b(int i17, int i18, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanButtonReporter", "clickScanButton entryType: " + i17 + ", iconType: %d, codeSessionId: " + j17, java.lang.Integer.valueOf(i18));
        oc5.a aVar = new oc5.a();
        this.f344395b = aVar;
        aVar.f344374a = "";
        aVar.f344375b = 0;
        aVar.f344376c = 0;
        aVar.f344377d = 0;
        aVar.f344378e = 0L;
        aVar.f344379f = 0L;
        aVar.f344381h = false;
        com.tencent.mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct imageFastEntryDetectStruct = this.f344394a;
        kotlin.jvm.internal.o.d(imageFastEntryDetectStruct);
        java.lang.String str = imageFastEntryDetectStruct.f58457f;
        kotlin.jvm.internal.o.f(str, "getSessionId(...)");
        aVar.f344374a = str;
        aVar.f344376c = i17;
        aVar.f344377d = i18;
        aVar.f344378e = java.lang.System.currentTimeMillis();
        if (i18 == 2) {
            aVar.f344380g = j17;
        } else {
            aVar.f344380g = 0L;
        }
    }

    public final void c(int i17, m11.b0 b0Var) {
        com.tencent.mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct imageFastEntryDetectStruct = new com.tencent.mm.autogen.mmdata.rpt.ImageFastEntryDetectStruct();
        this.f344394a = imageFastEntryDetectStruct;
        imageFastEntryDetectStruct.f58459h = 1L;
        imageFastEntryDetectStruct.f58458g = 1L;
        imageFastEntryDetectStruct.f58455d = java.lang.System.currentTimeMillis();
        imageFastEntryDetectStruct.f58456e = i17;
        imageFastEntryDetectStruct.f58457f = imageFastEntryDetectStruct.b("SessionId", c01.z1.r() + '_' + imageFastEntryDetectStruct.f58455d, true);
        imageFastEntryDetectStruct.f58460i = imageFastEntryDetectStruct.b("FileID", b0Var != null ? b0Var.f() : null, true);
        imageFastEntryDetectStruct.f58461j = imageFastEntryDetectStruct.b("AesKey", b0Var != null ? b0Var.d() : null, true);
        kotlin.jvm.internal.o.f(imageFastEntryDetectStruct.f58457f, "getSessionId(...)");
        oc5.b bVar = new oc5.b();
        java.lang.System.currentTimeMillis();
        this.f344396c = bVar;
    }
}
