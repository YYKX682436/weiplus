package ga3;

/* loaded from: classes15.dex */
public class c implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ga3.e f269843a;

    public c(ga3.e eVar) {
        this.f269843a = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecorder", "LiteApp state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ga3.d dVar = this.f269843a.f269849f;
        if (dVar != null) {
            ga3.m mVar = (ga3.m) dVar;
            mVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "LiteApp onRecError state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            ga3.v vVar = mVar.f269860a;
            vVar.b();
            vVar.h(1);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        ga3.v vVar;
        kh1.e eVar;
        ga3.e eVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecorder", "LiteApp onRecPcmDataReady()");
        ga3.d dVar = this.f269843a.f269849f;
        if (dVar == null || (eVar = (vVar = ((ga3.m) dVar).f269860a).f269880f) == null || (eVar2 = vVar.f269875a) == null) {
            return;
        }
        tl.w wVar = eVar2.f269844a;
        vVar.f269883i += wVar != null ? wVar.f420155h : 20;
        try {
            if (!eVar.d(vVar.f269882h, bArr, i17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "LiteApp encode pcm fail!");
            }
            if (vVar.f269886l > 0) {
                if (vVar.f269878d.f85836e == 16000) {
                    int i18 = i17 % 4;
                    if (i18 != 0) {
                        i17 -= i18;
                    }
                    if (i17 <= 0) {
                        bArr = null;
                    } else {
                        int i19 = i17 / 2;
                        byte[] bArr2 = new byte[i19];
                        for (int i27 = 0; i27 < i19; i27 += 2) {
                            int i28 = i27 * 2;
                            bArr2[i27] = bArr[i28];
                            bArr2[i27 + 1] = bArr[i28 + 1];
                        }
                        bArr = bArr2;
                    }
                    i17 = bArr.length;
                }
                double d17 = 0.0d;
                for (int i29 = 0; i29 < i17 / 2; i29++) {
                    int i37 = i29 * 2;
                    short s17 = (short) ((bArr[i37 + 1] << 8) | (bArr[i37] & 255));
                    d17 += s17 * s17;
                }
                double log10 = java.lang.Math.log10(d17 / i17) * 10.0d;
                if (java.lang.Double.isNaN(log10) || java.lang.Double.isInfinite(log10)) {
                    return;
                }
                int i38 = vVar.f269888n;
                if (i38 <= 1) {
                    vVar.f269887m = (int) log10;
                } else {
                    vVar.f269887m = (int) (((vVar.f269887m * (i38 - 1)) + log10) / i38);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppRecordMgr", e17, "onRecPcmDataReady", new java.lang.Object[0]);
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = vVar.f269878d;
            if (recordParam != null && "mp3".equalsIgnoreCase(recordParam.f85839h)) {
                com.tencent.mm.plugin.appbrand.media.record.o0.a(19);
                return;
            }
            com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam2 = vVar.f269878d;
            if (recordParam2 == null || !"aac".equalsIgnoreCase(recordParam2.f85839h)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.media.record.o0.a(23);
        }
    }
}
